package com.lost.listener;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.lost.action.ApplicationContext;



public class InitListener implements ServletContextListener {

	
	@Override
	public void contextInitialized(ServletContextEvent ctxEvent) {
		Map<String, Object> applicationContext = ApplicationContext.getApplicationContext();
		
		ServletContext ctx = ctxEvent.getServletContext();
		
		// 1. Container init
		Enumeration<String> paramNames = ctx.getInitParameterNames();
		
		while (paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			String classType = ctx.getInitParameter(paramName);
			try {
				Class<?> cls = Class.forName(classType);

				Object targetObj = cls.newInstance();
				
				System.out.println(paramName+":"+targetObj);
				applicationContext.put(paramName, targetObj);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		paramNames = ctx.getInitParameterNames();
		while (paramNames.hasMoreElements()) {
			String paramName = paramNames.nextElement();
			String classType = ctx.getInitParameter(paramName);
			
			try {
				Class<?> cls = Class.forName(classType);

				Method[] methods = cls.getMethods();

				for (Method method : methods) {
					// 의존성 여부 확인
					if (method.getName().contains("set")) {
						
						
						String setInstanceName = ((method.getName().replace("set", "")).charAt(0) + "").toLowerCase()
								+ method.getName().substring(4);
						
						method.invoke(applicationContext.get(paramName), applicationContext.get(setInstanceName));
						
						System.out.println(method.getName());
						
						//applicationContext.get(paramName).method(pplicationContext.get(setInstanceName)
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent ctxEvent) {}


}









