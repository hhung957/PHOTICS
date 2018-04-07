package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/newlogin.css\">\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/forget.js\"></script>  \n");
      out.write("    <script type=\"text/javascript\" src=\"js/login.js\"></script>  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"search\">\n");
      out.write("        <input type=\"text\" id= \"search_text\" name=\"search\" placeholder=\"Find friends or images\">\n");
      out.write("        <input type=\"button\" name = \"search_button\" id =\"search_button\">\n");
      out.write("    </div>\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"new-home.jsp\"><img src=\"css/images/home-icon.png\"></a></li>\n");
      out.write("            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            <li><a href=\"explore.jsp\">Explore</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <main>\n");
      out.write("        <form action=\"Login\" method=\"post\">                       \n");
      out.write("            <table>\n");
      out.write("                <tr>  \n");
      out.write("                    <td><h3>Login to your Photics account</h3></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"Email\" id=\"email\" required>\n");
      out.write("                    </td>   \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"password\" name=\"password\" placeholder=\"Password\" id=\"password\" required>\n");
      out.write("                    </td>   \n");
      out.write("                </tr>                       \n");
      out.write("                <tr>  \n");
      out.write("                    <td>\n");
      out.write("                        <input name=\"submit\" type=\"submit\" value =\"Login\" class=\"submit-button\">\n");
      out.write("                    </td>  \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div class=\"note\">\n");
      out.write("            <a class=\"forget-password\"> Forget your password?</a>\n");
      out.write("            <div class=\"forget-menu\">\n");
      out.write("                <div class=\"forget-menu-content\">\n");
      out.write("                    <span class=\"close1\">&times;</span>\n");
      out.write("                    <h1>Just one step to get your password!</h1>\n");
      out.write("                    <h4>We will send you your password via your email</h4>\n");
      out.write("                    <h3>Enter your email:</h3>\n");
      out.write("                    <form action=\"Forgot\" method=\"POST\">\n");
      out.write("                        <input type=\"email\" placeholder=\"Your Photics email\" name=\"email\">\n");
      out.write("                        <input type=\"submit\" value=\"Submit\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>       \n");
      out.write("</body>\n");
      out.write("\n");
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
