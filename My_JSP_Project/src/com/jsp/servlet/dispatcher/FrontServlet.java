package com.jsp.servlet.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.action.Action;

public class FrontServlet extends HttpServlet {

	private HandlerMapper handlerMapper;

	@Override
	public void init(ServletConfig config) throws ServletException {
		String handlerMapperType = config.getInitParameter("handlerMapper");

		try {
			this.handlerMapper = (HandlerMapper) injectionBean(handlerMapperType);
			System.out.println("[FrontServlet] handlerMapper 가 준비되었습니다.");
		} catch (Exception e) {
			System.out.println("[FrontServlet] handlerMapper 가 준비되지 않았습니다.");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		requestPro(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		requestPro(req, resp);
	}

	private void requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 사용자 URI 검출
		String command = request.getRequestURI(); // contextPath 포함.

		if (command.indexOf(request.getContextPath()) == 0) { // contextPath 삭제
			command = command.substring(request.getContextPath().length());
		}

		// Action 실행 (HandlerMapper 의뢰 action 할당받음)
		Action act = null;
		String view = null;

		if (handlerMapper != null){
			act = handlerMapper.getAction(command);
			if (act == null) {
				System.out.println("!! not found : " + command);
			} else {
				view = act.execute(request, response);
			}
		}

		// 화면 전환
		if (view==null) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('해당 서비스는 현재 사용이 불가합니다.');");
			out.println("history.go(-1);");
			out.println("if(window.opener) window.close();");
			out.println("</script>");
			out.close();
			return;
		}

		if (view != null && !view.isEmpty()) {
			ViewResolver.view(request, response, view);
		}
	}

	private Object injectionBean(String classType) throws Exception {
		Class<?> cls = Class.forName(classType);
		return cls.newInstance();
	}
}
