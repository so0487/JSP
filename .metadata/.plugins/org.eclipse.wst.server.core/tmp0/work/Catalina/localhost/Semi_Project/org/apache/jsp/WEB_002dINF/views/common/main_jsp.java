/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-10-12 15:12:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/include/footer_js.jsp", Long.valueOf(1601339508000L));
    _jspx_dependants.put("/WEB-INF/views/include/open_footer.jsp", Long.valueOf(1601367508000L));
    _jspx_dependants.put("/WEB-INF/views/include/open_header.jsp", Long.valueOf(1601367450000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    \t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>eCommerce HTML-5 Template </title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"manifest\" href=\"site.webmanifest\">\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- CSS here -->\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/bootstrap.min.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/owl.carousel.min.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/flaticon.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/slicknav.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/animate.min.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/magnific-popup.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/fontawesome-all.min.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/themify-icons.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/slick.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/nice-select.css\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- summernote -->\r\n");
      out.write("\t\t\t<link href=\"");
      out.print(request.getContextPath());
      out.write("/resources/summernote/summernote.min.css\" rel=\"stylesheet\">\r\n");
      out.write("   </head>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.latest-product-area{padding-bottom:0px;}\r\n");
      out.write("\t\tfooter{border-top:solid 1px black;}\r\n");
      out.write("\t</style>\r\n");
      out.write("   <body>\r\n");
      out.write("  \r\n");
      out.write("<main>\r\n");
      out.write("    <!-- slider Area Start -->\r\n");
      out.write("    <div class=\"slider-area \">\r\n");
      out.write("        <!-- Mobile Menu -->\r\n");
      out.write("        <div class=\"slider-active\">\r\n");
      out.write("            <div class=\"single-slider slider-height\" data-background=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/hero/h1_hero.jpg\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row d-flex align-items-center justify-content-between\">\r\n");
      out.write("                        <div class=\"col-xl-6 col-lg-6 col-md-6 col-sm-6 d-none d-md-block\">\r\n");
      out.write("                            <div class=\"hero__img\" data-animation=\"bounceIn\" data-delay=\".4s\">\r\n");
      out.write("                                <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/hero/hero_man.png\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xl-5 col-lg-5 col-md-5 col-sm-8\">\r\n");
      out.write("                            <div class=\"hero__caption\">\r\n");
      out.write("                                <span data-animation=\"fadeInRight\" data-delay=\".4s\">60% 세일!</span>\r\n");
      out.write("                                <h1 data-animation=\"fadeInRight\" data-delay=\".6s\">겨울 <br> 컬렉션</h1>\r\n");
      out.write("                                <p data-animation=\"fadeInRight\" data-delay=\".8s\">2020년 최고의 상품!</p>\r\n");
      out.write("                                <!-- Hero-btn -->\r\n");
      out.write("                                <div class=\"hero__btn\" data-animation=\"fadeInRight\" data-delay=\"1s\">\r\n");
      out.write("                                    <a href=\"javascript:parent.goPage('/product/hat.do','M010000')\" class=\"btn hero-btn\">보러가기</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- slider Area End-->\r\n");
      out.write("<div class=\"asdfasf\"><br><br></div>\r\n");
      out.write("      <!-- Latest Products Start -->\r\n");
      out.write("    <section class=\"latest-product-area padding-bottom\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row product-btn d-flex justify-content-end align-items-end\">\r\n");
      out.write("                <!-- Section Tittle -->\r\n");
      out.write("                <div class=\"col-xl-4 col-lg-5 col-md-5\">\r\n");
      out.write("                    <div class=\"section-tittle mb-30\">\r\n");
      out.write("                        <h2>Latest Products</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xl-8 col-lg-7 col-md-7\">\r\n");
      out.write("                    <div class=\"properties__button f-right\">\r\n");
      out.write("                        <!--Nav Button  -->\r\n");
      out.write("                        <nav>                                                                                                \r\n");
      out.write("                            <div class=\"nav nav-tabs\" id=\"nav-tab\" role=\"tablist\">\r\n");
      out.write("                                <a class=\"nav-item nav-link active\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-home\" role=\"tab\" aria-controls=\"nav-home\" aria-selected=\"true\">All</a>\r\n");
      out.write("                                <a class=\"nav-item nav-link\" id=\"nav-profile-tab\" data-toggle=\"tab\" href=\"#nav-profile\" role=\"tab\" aria-controls=\"nav-profile\" aria-selected=\"false\">New</a>\r\n");
      out.write("                                <a class=\"nav-item nav-link\" id=\"nav-contact-tab\" data-toggle=\"tab\" href=\"#nav-contact\" role=\"tab\" aria-controls=\"nav-contact\" aria-selected=\"false\">Featured</a>\r\n");
      out.write("                                <a class=\"nav-item nav-link\" id=\"nav-last-tab\" data-toggle=\"tab\" href=\"#nav-last\" role=\"tab\" aria-controls=\"nav-contact\" aria-selected=\"false\">Offer</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </nav>\r\n");
      out.write("                        <!--End Nav Button  -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Nav Card -->\r\n");
      out.write("            <div class=\"tab-content\" id=\"nav-tabContent\">\r\n");
      out.write("                <!-- card one -->\r\n");
      out.write("                <div class=\"tab-pane fade show active\" id=\"nav-home\" role=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-4 col-lg-4 col-md-6\">\r\n");
      out.write("                            <div class=\"single-product mb-60\">\r\n");
      out.write("                                <div class=\"product-img\">\r\n");
      out.write("                                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/categori/product1.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-caption\">\r\n");
      out.write("                                    <h4><a href=\"#\">Green Dress with details</a></h4>\r\n");
      out.write("                                    <div class=\"price\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>$40.00</li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Card two -->\r\n");
      out.write("                <div class=\"tab-pane fade\" id=\"nav-profile\" role=\"tabpanel\" aria-labelledby=\"nav-profile-tab\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-4 col-lg-4 col-md-6\">\r\n");
      out.write("                            <div class=\"single-product mb-60\">\r\n");
      out.write("                                <div class=\"product-img\">\r\n");
      out.write("                                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/categori/product4.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-caption\">\r\n");
      out.write("                                    <h4><a href=\"#\">Green Dress with details</a></h4>\r\n");
      out.write("                                    <div class=\"price\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>$40.00</li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Card three -->\r\n");
      out.write("                <div class=\"tab-pane fade\" id=\"nav-contact\" role=\"tabpanel\" aria-labelledby=\"nav-contact-tab\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-4 col-lg-4 col-md-6\">\r\n");
      out.write("                            <div class=\"single-product mb-60\">\r\n");
      out.write("                                <div class=\"product-img\">\r\n");
      out.write("                                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/categori/product2.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-caption\">\r\n");
      out.write("                                    <h4><a href=\"#\">Green Dress with details</a></h4>\r\n");
      out.write("                                    <div class=\"price\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>$40.00</li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- card foure -->\r\n");
      out.write("                <div class=\"tab-pane fade\" id=\"nav-last\" role=\"tabpanel\" aria-labelledby=\"nav-last-tab\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xl-4 col-lg-4 col-md-6\">\r\n");
      out.write("                            <div class=\"single-product mb-60\">\r\n");
      out.write("                                <div class=\"product-img\">\r\n");
      out.write("                                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/categori/product1.png\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"product-caption\">\r\n");
      out.write("                                    <h4><a href=\"#\">Green Dress with details</a></h4>\r\n");
      out.write("                                    <div class=\"price\">\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li>$40.00</li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End Nav Card -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- Latest Products End -->\r\n");
      out.write("</main>\r\n");
      out.write("<!-- JS here -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- All JS Custom Plugins Link Here here -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/vendor/modernizr-3.5.0.min.js\"></script>\r\n");
      out.write("\t\t<!-- Jquery, Popper, Bootstrap -->\r\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/vendor/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t    <!-- Jquery Mobile Menu -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.slicknav.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Jquery Slick , Owl-Carousel Plugins -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/slick.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- One Page, Animated-HeadLin -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/wow.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/animated.headline.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Scrollup, nice-select, sticky -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.sticky.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- contact js -->\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/contact.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.form.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.validate.min.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/mail-script.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("\t\t<!-- Jquery Plugins, main Jquery -->\t\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/plugins.js\"></script>\r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/main.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/common.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/summernote/summernote.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- 기본 Jquery삽입 -->\r\n");
      out.write("        ");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/4.7.6/handlebars.min.js\" ></script>\r\n");
      out.write("<script type=\"text/x-handlebars-template\"  id=\"subMenu-list-template\" >\r\n");
      out.write("{{#each .}}\r\n");
      out.write("\t<li class=\"nav-item subMenu\" >\r\n");
      out.write("      \t<a href=\"javascript:goPage('{{murl}}','{{mcode}}')\" class=\"nav-link\">\r\n");
      out.write("          <i class=\"{{micon}}\"></i>\r\n");
      out.write("             <p>{{mname }}</p>\r\n");
      out.write("        </a>\r\n");
      out.write("\t</li>\r\n");
      out.write("{{/each}}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var printData=function(subMenuArr,target,templateObject){\r\n");
      out.write("\tvar template=Handlebars.compile(templateObject.html());\r\n");
      out.write("\tvar html = template(subMenuArr);\t\r\n");
      out.write("\t$('.subMenu').remove();\r\n");
      out.write("\ttarget.append(html);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function goPage(url, mCode){\r\n");
      out.write("\t// HTML5 지원브라우저에서 사용가능\r\n");
      out.write("\tif(typeof(history.pushState)=='function'){\r\n");
      out.write("\t\t// 현재 주소를 가져온다.\r\n");
      out.write("\t\tvar renewURL = location.href;\r\n");
      out.write("\t\t// 현재 주소중 .do 뒤 부분이 있다면 날려버린다.\r\n");
      out.write("\t\trenewURL = renewURL.substring(0, renewURL.indexOf(\".do\")+3);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(mCode != 'M000000'){\r\n");
      out.write("\t\t\trenewURL += \"?mCode=\"+mCode;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\thistory.pushState(mCode,null,renewURL);\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tlocation.hash = \"#\"+mCode;\r\n");
      out.write("\t}\r\n");
      out.write("\t$('#if_list').attr(\"src\",\"");
      out.print(request.getContextPath());
      out.write("\"+url);\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function goPageMain(url){\r\n");
      out.write("\t   // HTML5 지원브라우저에서 사용가능\r\n");
      out.write("\t   if(typeof(history.pushState)=='function'){\r\n");
      out.write("\t      // 현재 주소를 가져온다.\r\n");
      out.write("\t      var renewURL = location.href;\r\n");
      out.write("\t      // 현재 주소중 .do 뒤 부분이 있다면 날려버린다.\r\n");
      out.write("\t      renewURL = renewURL.substring(0, renewURL.indexOf(\".do\")+3);      \r\n");
      out.write("\t      \r\n");
      out.write("\t      \r\n");
      out.write("\t      history.pushState(null, renewURL);\r\n");
      out.write("\t   }\r\n");
      out.write("\t   $('#if_list').attr(\"src\",\"");
      out.print(request.getContextPath());
      out.write("\"+url);\r\n");
      out.write("\t   \r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction calcHeight(){\r\n");
      out.write("\t   //find the height of the internal page\r\n");
      out.write("\t   \r\n");
      out.write("\t   var the_height=\r\n");
      out.write("\t   document.getElementById('if_list').contentWindow.document.body.scrollHeight;\r\n");
      out.write("\t   \r\n");
      out.write("\t   //change the height of the iframe\r\n");
      out.write("\t   $('#if_list_div').css(\"height\",the_height);\r\n");
      out.write("\t   \r\n");
      out.write("\t   //document.getElementById('the_iframe').scrolling = \"no\";\r\n");
      out.write("\t   document.getElementById('if_list').style.overflow = \"hidden\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tgoPage('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.murl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.mcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
