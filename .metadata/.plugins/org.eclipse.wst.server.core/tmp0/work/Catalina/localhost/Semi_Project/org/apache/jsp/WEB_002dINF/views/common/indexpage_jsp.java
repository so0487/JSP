/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-10-12 15:12:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/include/footer_js.jsp", Long.valueOf(1601339508000L));
    _jspx_dependants.put("jar:file:/C:/soo/A_TeachingMaterial/6.JspSpring/workspace/JSP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Semi_Project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/include/footer.jsp", Long.valueOf(1601339508000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1601339508000L));
    _jspx_dependants.put("/WEB-INF/views/include/header.jsp", Long.valueOf(1601339508000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>eCommerce HTML-5 Template </title>\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"manifest\" href=\"site.webmanifest\">\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/favicon.ico\">\r\n");
      out.write("      \t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/vendor/jquery.min.js\"></script>\r\n");
      out.write("      \t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/vendor/jquery.js\"></script>\r\n");
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
      out.write("   </head>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.latest-product-area{padding-bottom:0px;}\r\n");
      out.write("\t\tfooter{border-top:solid 1px black;}\r\n");
      out.write("\t\t.main-header{border-bottom:solid 1px black;}\r\n");
      out.write("\t\t.footer-padding{padding : 70px 0 10px 0;background-color:#C8C8C8;}\r\n");
      out.write("\t</style>\r\n");
      out.write("   <body>\r\n");
      out.write("       \r\n");
      out.write("    <header>\r\n");
      out.write("        <!-- Header Start -->\r\n");
      out.write("       <div class=\"header-area\">\r\n");
      out.write("            <div class=\"main-header \">\r\n");
      out.write("                <div class=\"header-top top-bg d-none d-lg-block\">\r\n");
      out.write("                   <div class=\"container-fluid\">\r\n");
      out.write("                       <div class=\"col-xl-12\">\r\n");
      out.write("                            <div class=\"row d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"header-info-left d-flex\">\r\n");
      out.write("                                    <div class=\"flag\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"select-this\">\r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <ul class=\"contact-now\">     \r\n");
      out.write("                                        \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"header-info-right\">\r\n");
      out.write("                                   <ul>                   \r\n");
      out.write("                                   ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("</ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                       </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               <div class=\"header-bottom  header-sticky\">\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("                        <div class=\"row align-items-center\">\r\n");
      out.write("                            <!-- Logo -->\r\n");
      out.write("                            <div class=\"col-xl-1 col-lg-1 col-md-1 col-sm-3\">\r\n");
      out.write("                                <div class=\"logo\">\r\n");
      out.write("                                  <a href=\"");
      out.print(request.getContextPath());
      out.write("/\"><img style=\"width:150px;\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/logo/LostlogoF.png\" alt=\"\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xl-7 col-lg-8 col-md-7 col-sm-5\">\r\n");
      out.write("                                <!-- Main-menu -->\r\n");
      out.write("                                <div class=\"main-menu f-right d-none d-lg-block\">\r\n");
      out.write("                                    <nav>                                                \r\n");
      out.write("                                        <ul id=\"navigation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</ul>\r\n");
      out.write("                                    </nav>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div> \r\n");
      out.write("<!--                             <div class=\"col-xl-4 col-lg-3 col-md-3 col-sm-3 fix-card\"> -->\r\n");
      out.write("<!--                                 <ul class=\"header-right f-right d-none d-lg-block d-flex justify-content-between\"> -->\r\n");
      out.write("<!--                                     <li> -->\r\n");
      out.write("<!--                                         <div class=\"shopping-card\"> -->\r\n");
      out.write("<!--                                             <a href=\"cart.html\"><i class=\"fas fa-shopping-cart\"></i></a> -->\r\n");
      out.write("<!--                                         </div> -->\r\n");
      out.write("<!--                                     </li> -->\r\n");
      out.write("<!--                                    <li class=\"d-none d-lg-block\"> <a href=\"#\" class=\"btn header-btn\">Log-in</a></li> -->\r\n");
      out.write("<!--                                    <li class=\"d-none d-lg-block\"> <a href=\"#\" class=\"btn header-btn\">Regist</a></li> -->\r\n");
      out.write("<!--                                 </ul> -->\r\n");
      out.write("<!--                             </div> -->\r\n");
      out.write("                            <!-- Mobile Menu -->\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"mobile_menu d-block d-lg-none\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        <!-- Header End -->\r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("         $(document).ready(function(){\r\n");
      out.write("            var logInfo = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("            if(logInfo!=\"\"){\r\n");
      out.write("               $('#loginText').html('<a href=\"");
      out.print(request.getContextPath());
      out.write("/common/logout.do\" style=\"color:yellow\">logout</a>');                         \r\n");
      out.write("            }\r\n");
      out.write("         });\r\n");
      out.write("    </script>\r\n");
      out.write("<div id=\"if_list_div\" style=\"position:relative;padding:0;overflow:hidden;height:800px;\">\r\n");
      out.write("\t<iframe id=\"if_list\" onLoad=\"calcHeight();\" name=\"if_list\" frameborder=\"0\" scrolling=\"no\" \r\n");
      out.write("\tsrc=\"#\" style=\"position:absolute;top:0px;left:0px;bottom:0px;height:100%;width:100%;border:0px;\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <!-- Footer Start-->\r\n");
      out.write("    <div class=\"footer-area footer-padding\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row d-flex justify-content-between\">\r\n");
      out.write("                <div class=\"col-xl-3 col-lg-3 col-md-5 col-sm-6\">\r\n");
      out.write("                   <div class=\"single-footer-caption mb-50\">\r\n");
      out.write("                     <div class=\"single-footer-caption mb-30\">\r\n");
      out.write("                          <!-- logo -->\r\n");
      out.write("                         <div class=\"footer-logo\">\r\n");
      out.write("                             <a href=\"index.html\"><img style=\"width:102px;height:23px;\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/img/logo/LostlogoF.png\" alt=\"\"></a>\r\n");
      out.write("                         </div>\r\n");
      out.write("                         <div class=\"footer-tittle\">\r\n");
      out.write("                             <div class=\"footer-pera\">\r\n");
      out.write("                                 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit sed do eiusmod tempor incididunt ut labore.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                         </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xl-2 col-lg-3 col-md-3 col-sm-5\">\r\n");
      out.write("                    <div class=\"single-footer-caption mb-50\">\r\n");
      out.write("                        <div class=\"footer-tittle\">\r\n");
      out.write("                            <h4>Quick Links</h4>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\">About</a></li>\r\n");
      out.write("                                <li><a href=\"#\"> Offers & Discounts</a></li>\r\n");
      out.write("                                <li><a href=\"#\"> Get Coupon</a></li>\r\n");
      out.write("                                <li><a href=\"#\">  Contact Us</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-7\">\r\n");
      out.write("                    <div class=\"single-footer-caption mb-50\">\r\n");
      out.write("                        <div class=\"footer-tittle\">\r\n");
      out.write("                            <h4>New Products</h4>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\">Woman Cloth</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Fashion Accessories</a></li>\r\n");
      out.write("                                <li><a href=\"#\"> Man Accessories</a></li>\r\n");
      out.write("                                <li><a href=\"#\"> Rubber made Toys</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-xl-3 col-lg-3 col-md-5 col-sm-7\">\r\n");
      out.write("                    <div class=\"single-footer-caption mb-50\">\r\n");
      out.write("                        <div class=\"footer-tittle\">\r\n");
      out.write("                            <h4>Support</h4>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                             <li><a href=\"#\">Frequently Asked Questions</a></li>\r\n");
      out.write("                             <li><a href=\"#\">Terms & Conditions</a></li>\r\n");
      out.write("                             <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                             <li><a href=\"#\">Privacy Policy</a></li>\r\n");
      out.write("                             <li><a href=\"#\">Report a Payment Issue</a></li>\r\n");
      out.write("                         </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Footer bottom -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("             <div class=\"col-xl-12 col-lg-12 col-md-12\">\r\n");
      out.write("                <div class=\"footer-copy-right\" style=\"text-align:center;\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tCopyright &copy; <script>document.write(new Date().getFullYear());</script> This site made by Daeduk\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Footer End-->\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- JS here -->\r\n");
      out.write("\t\r\n");
      out.write("<!-- All JS Custom Plugins Link Here here -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/vendor/modernizr-3.5.0.min.js\"></script>\r\n");
      out.write("<!-- Jquery, Popper, Bootstrap -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/vendor/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/popper.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- Jquery Mobile Menu -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.slicknav.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Jquery Slick , Owl-Carousel Plugins -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/slick.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- One Page, Animated-HeadLin -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/wow.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/animated.headline.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Scrollup, nice-select, sticky -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.sticky.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- contact js -->\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/contact.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.form.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/mail-script.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/jquery.ajaxchimp.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Jquery Plugins, main Jquery -->\t\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/plugins.js\"></script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/assets/js/main.js\"></script>\r\n");
      out.write("        \r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/include/header.jsp(59,35) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id ne 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<li><a href=\"javascript:goPageMain('/member/myPageForm.do')\">My Page </a></li>\r\n");
          out.write("                                       <li><a href=\"javascript:goPageMain('/order/orderedForm.do')\">Ordered</a></li>\r\n");
          out.write("                                       <li><a href=\"javascript:goPageMain('/cart/cartForm.do')\">Cart</a></li>\r\n");
          out.write("                                       <li id=\"loginText\"><a href=\"javascript:goPageMain('/common/loginForm.do')\" style=\"color:yellow\">Login</a></li>\r\n");
          out.write("                                       <li><a href=\"javascript:goPageMain('/common/joinForm.do')\" style=\"color:yellow\">Regist</a></li>\r\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/include/header.jsp(66,35) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.id eq 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<li><a href=\"javascript:goPageMain('/member/memberList.do')\">MemberList</a></li>\r\n");
          out.write("                                       <li><a href=\"javascript:goPageMain('/order/orderedList.do')\">OrderedList</a></li>\r\n");
          out.write("                                       <li><a href=\"javascript:goPageMain('/order/orderedList.do')\">ProductList</a></li>\r\n");
          out.write("                                       <li id=\"loginText\"><a href=\"javascript:goPageMain('/common/loginForm.do')\" style=\"color:yellow\">Login</a></li>\r\n");
          out.write("                                       <li><a href=\"javascript:goPageMain('/common/joinForm.do')\" style=\"color:yellow\">Regist</a></li>\r\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/include/header.jsp(93,11) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/include/header.jsp(93,11) '${menuList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${menuList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/include/header.jsp(93,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("menu");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("<li><a href=\"javascript:goPage('");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.murl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('\'');
            out.write(',');
            out.write('\'');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.mcode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("');\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.mname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</a></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
