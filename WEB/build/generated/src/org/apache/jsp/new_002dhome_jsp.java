package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_002dhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<head>\n");
      out.write("    <title>Join us now!</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/newhome.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"search\">\n");
      out.write("        <form action=\"Search\" method=\"GET\">\n");
      out.write("            <input type=\"text\" id= \"search_text\" name=\"search\" placeholder=\"Search images\">\n");
      out.write("            <input type=\"submit\" value = \"\" id =\"search_button\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"new-home.jsp\"><img src=\"css/images/home-icon.png\"></a></li>\n");
      out.write("                    ");

                        String login = (String) session.getAttribute("login");
                        if (login == "login") {
                    
      out.write("\n");
      out.write("            <li>Hello! <a href=\"user.jsp\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("            <li><a href=\"register.jsp\" style=\"visibility:hidden \">Register</a></li>\n");
      out.write("            <li><a href=\"login.jsp\" style=\"visibility:hidden \">Login</a></li>\n");
      out.write("            <li><a href=\"#top\" style=\"visibility:hidden\">Explore</a></li>\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            <li><a href=\"#top\">Explore</a></li>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <main>\n");
      out.write("        <h1>Photics</h1>\n");
      out.write("    </main>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
