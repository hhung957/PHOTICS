package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tesuser_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/test.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/drop-drag.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/dropdown.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lightbox.js\"></script> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lightbox-plus-jquery.js\"></script>     \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("            <nav class=\"tabs\">\r\n");
      out.write("                <div class=\"tab\">\r\n");
      out.write("                    <input type=\"radio\" id=\"tab-1\" name=\"tab-group-1\">\r\n");
      out.write("                    <label for=\"tab-1\"><img src=\"images/icon-menu.png\" width=25px></label>\r\n");
      out.write("                        <div class=\"tab close-tab\">\r\n");
      out.write("                            <input type=\"radio\" id=\"tab-close\" name=\"tab-group-1\">\r\n");
      out.write("                            <label for=\"tab-close\"><img src=\"images/icon-menu.png\" width=25px></label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                         <ul>\r\n");
      out.write("                            <li><a href=\"new-home.jsp\"><img src=\"images/icon-home.png\"><p>Home</p></a></li>\r\n");
      out.write("                            <li><a href=\"\"><img src=\"images/icon-contact.png\"><p>Contact</p></a></li>\r\n");
      out.write("                            <li><a href=\"\"><img src=\"images/icon-photo.png\"><p>Photos  </p></a></li>\r\n");
      out.write("                            <li><a href=\"Login\"><img src=\"images/icon-logout.png\"><p>Logout</p></a></li>\r\n");
      out.write("                         </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"hey\">\r\n");
      out.write("                    \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main\">    \r\n");
      out.write("                \r\n");
      out.write("                    <div class=\"searchbar\">\r\n");
      out.write("                            <input type=\"button\" name = \"search_button\" id =\"search_button\">\r\n");
      out.write("                            <input type=\"text\" id= \"search_text\" name=\"search\" placeholder=\"Find friends or images\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                <div class=\"add\">\r\n");
      out.write("                                <button id=\"myBtn\"></button>         \r\n");
      out.write("                                <label for=\"myBtn\"><img src=\"css/images/icon-add.png\"><p>Upload photos</p></label>\r\n");
      out.write("                                <p>Upload photos</p>\r\n");
      out.write("                                <!-- The Modal -->\r\n");
      out.write("                        <div id=\"myModal\" class=\"modal\">                       \r\n");
      out.write("                        <!-- Modal content -->\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                                        <span class=\"close\">&times;</span>\r\n");
      out.write("                                        <div id=\"wrapper\">\r\n");
      out.write("                                                        <h1>Upload your image</h1>\r\n");
      out.write("                                                <div class=\"flex\">\r\n");
      out.write("                                                 <!-- <h3>Select an image</h3> -->\r\n");
      out.write("                                                 <input id=\"file\" name=\"myimg\" type=\"file\" accept=\"image/*\" onchange=\"preview_image(event)\" style=\"visibility:hidden;\">\r\n");
      out.write("                                                 <label for=\"file\" class=\"btn\"><strong>Select An Image</strong></label>\r\n");
      out.write("                                                 <img id=\"output_image\" >\r\n");
      out.write("                                                <div class=\"flex1\">\r\n");
      out.write("                                                 <h3>Your caption:</h3>\r\n");
      out.write("                                                 <textarea rows=\"4\" cols=\"50\" name=\"caption\">\r\n");
      out.write("                                                \r\n");
      out.write("                                                </textarea>\r\n");
      out.write("\r\n");
      out.write("                                                 <h3>Choose category</h3>\r\n");
      out.write("                                                 <select>\r\n");
      out.write("                                                         <option value=\"animal\">Animal</option>\r\n");
      out.write("                                                         <option value=\"potrait\">Potrait</option>\r\n");
      out.write("                                                         <option value=\"landscape\">Landspace</option>\r\n");
      out.write("                                                         <option value=\"sport\">Sport</option>\r\n");
      out.write("                                                         <option value=\"other\">Other</option>\r\n");
      out.write("                                                 </select>\r\n");
      out.write("                                                 <input type=\"submit\" value=\"Upload\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                        </div>     \r\n");
      out.write("                        </div>                             \r\n");
      out.write("                </div>  \r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"sub\">\r\n");
      out.write("                        <div class=\"cover\">\r\n");
      out.write("                                <div class=\"avatar\">\r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">     \r\n");
      out.write("                                </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"profile\">\r\n");
      out.write("                                <div  class=\"follower\">\r\n");
      out.write("                                        \r\n");
      out.write("                                  <p name=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                      \r\n");
      out.write("                                    <div class=\"wrapper\">\r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">     \r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">     \r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">     \r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">     \r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">     \r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">     \r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\"> \r\n");
      out.write("                                        <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">   \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"inf\">\r\n");
      out.write("                                        <div class=\"first\">\r\n");
      out.write("                                                <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">\r\n");
      out.write("                                                <h6>Wiz Khalifa</h6>\r\n");
      out.write("                                                <div class=\"dropdown\">\r\n");
      out.write("                                                                <button onclick=\"myFunction()\" class=\"dropbtn\"><img src =\"css/images/icon-more.png\" alt=\"more\"></button>\r\n");
      out.write("                                                                <div id=\"myDropdown\" class=\"dropdown-content\">\r\n");
      out.write("                                                                  <a href=\"#\">Delete</a>\r\n");
      out.write("                                                                  <a href=\"#\">Edit</a>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                              </div> \r\n");
      out.write("                                        </div>              \r\n");
      out.write("                                         <div class=\"first\">\r\n");
      out.write("                                                <img src =\"css/images/wiz-khalifa.jpg\" alt=\"potrait\">\r\n");
      out.write("                                                <h6>Wiz Khalifa</h6>\r\n");
      out.write("                                                <div class=\"dropdown\">\r\n");
      out.write("                                                                <button onclick=\"myFunction()\" class=\"dropbtn\"><img src =\"css/images/icon-more.png\" alt=\"more\"></button>\r\n");
      out.write("                                                                <div id=\"myDropdown\" class=\"dropdown-content\">\r\n");
      out.write("                                                                  <a href=\"#\">Delete</a>\r\n");
      out.write("                                                                  <a href=\"#\">Edit</a>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                              </div> \r\n");
      out.write("                                        </div>                 \r\n");
      out.write("                                                                       \r\n");
      out.write("                                        <div class=\"second\">\r\n");
      out.write("                                                <p>This I confess: I am the worst junk food junkie in this great gluttonous galaxy of sugar, salt, and fat. You can keep your lentils, granola, and prunes. I want calories and carbohydrates, burgers and fries. Within minutes after waking up grouchy and puffy eyed in the morning, I stumble to the kitchen and pour myself a tall glass of ice cold Pepsi. Ahh! My tongue tingles and my eyes pop open. I then have the energy to eat.</p>\r\n");
      out.write("                                                <img src =\"css/images/hamburger.jpeg\" alt=\"potrait\">  \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"third\">\r\n");
      out.write("                                                        <img src =\"css/images/icon-heart.png\" alt=\"heart-icon\">\r\n");
      out.write("                                                        <img src =\"css/images/icon-comment.png\" alt=\"comment-icon\"> \r\n");
      out.write("                                                        <img src =\"css/images/icon-share.png\" alt=\"share-icon\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("        \r\n");
      out.write("        </body>\r\n");
      out.write("        <script>\r\n");
      out.write("                        // Get the modal\r\n");
      out.write("                        var modal = document.getElementById('myModal');\r\n");
      out.write("                        \r\n");
      out.write("                        // Get the button that opens the modal\r\n");
      out.write("                        var btn = document.getElementById(\"myBtn\");\r\n");
      out.write("                        \r\n");
      out.write("                        // Get the <span> element that closes the modal\r\n");
      out.write("                        var span = document.getElementsByClassName(\"close\")[0];\r\n");
      out.write("                        \r\n");
      out.write("                        // When the user clicks the button, open the modal \r\n");
      out.write("                        btn.onclick = function() {\r\n");
      out.write("                            modal.style.display = \"block\";\r\n");
      out.write("                        }\r\n");
      out.write("                        \r\n");
      out.write("                        // When the user clicks on <span> (x), close the modal\r\n");
      out.write("                        span.onclick = function() {\r\n");
      out.write("                            modal.style.display = \"none\";\r\n");
      out.write("                        }\r\n");
      out.write("                        \r\n");
      out.write("                        // When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("                        window.onclick = function(event) {\r\n");
      out.write("                            if (event.target == modal) {\r\n");
      out.write("                                modal.style.display = \"none\";\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                        </script>\r\n");
      out.write("                        ");
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
