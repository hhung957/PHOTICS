package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Join us now!</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/newregister.css\">\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/register.js\" type=\"text/javascript\"></script>\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
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
      out.write("            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            <li><a href=\"explore.jsp\">Explore</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <main>\n");
      out.write("        <form id=\"register\" action=\"Register\" method=\"post\">         \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>   \n");
      out.write("                        <h3>Create your Photics account</h3>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"firstname\" placeholder=\"First name\" class = \"fname\" id=\"fname\" required>\n");
      out.write("                        <input type=\"text\" name=\"lastname\"  placeholder=\"Last name\" class = \"lname\" id =\"lname\" required>\n");
      out.write("                    </td>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"email\" name=\"email\" placeholder=\"Email\" id=\"email\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input class=\"newpassword\" id=\"newpassword\" type=\"password\" name=\"password\" onkeyup= \"checkPasswordMatch();\" required placeholder=\"Password\">\n");
      out.write("                    </td>   \n");
      out.write("                </tr>\n");
      out.write("                <tr>        \n");
      out.write("                    <td>\n");
      out.write("                        <input  class=\"newconfirmpassword\" id=\"newconfirmpassword\" type=\"password\" name=\"repassword\" onkeyup=\"checkPasswordMatch();\"  required placeholder=\"Re-enter password\">            \n");
      out.write("                        <span id=\"noti\"></span>\n");
      out.write("                    </td>       \n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>  \n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"checkbox\" name=\"accept\" id=\"accept\"><label for=\"test1\"></label>\n");
      out.write("                        I agree to the Photics \n");
      out.write("                        <a href=\"term.html\" id=\"term\">Privacy Policy</a></label>\n");
      out.write("                    </td>   \n");
      out.write("                </tr>\n");
      out.write("                <tr>     \n");
      out.write("                    <td>\n");
      out.write("                        <input name=\"submit\" type=\"submit\"  value=\"Submit\" class=\"submit-button\">\n");
      out.write("                    </td>  \n");
      out.write("                    <td>\n");
      out.write("                        <div class=\"note\">Already have an account?<a href=\"login.jsp\"> Sign in!</a></div>\n");
      out.write("                    </td>                      \n");
      out.write("                </tr>\n");
      out.write("            </table> \n");
      out.write("        </form>\n");
      out.write("    </main>\n");
      out.write("</body>");
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
