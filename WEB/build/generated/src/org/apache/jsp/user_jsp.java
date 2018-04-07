package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_sql_dataSource_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
    _jspx_tagPool_sql_query_var_sql_dataSource_nobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\"/>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/test.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\">\r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/editModal.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/drop-drag.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/dropdown.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lightbox.js\"></script> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lightbox-plus-jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/editAvatar.js\"></script> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/previewAvatar.js\"></script> \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/register.js\"></script> \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"tabs\">\r\n");
      out.write("            <div class=\"tab\">\r\n");
      out.write("                <input type=\"radio\" id=\"tab-1\" name=\"tab-group-1\">\r\n");
      out.write("                <label for=\"tab-1\"><img src=\"images/icon-menu.png\" width=25px></label>\r\n");
      out.write("                <div class=\"tab close-tab\">\r\n");
      out.write("                    <input type=\"radio\" id=\"tab-close\" name=\"tab-group-1\">\r\n");
      out.write("                    <label for=\"tab-close\"><img src=\"images/icon-menu.png\" width=25px></label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"new-home.jsp\"><img src=\"images/icon-home.png\"><p>Home</p></a></li>\r\n");
      out.write("                        <li><a href=\"explore.jsp\"><img src=\"images/icon-explore.png\"><p>Explore</p></a></li>\r\n");
      out.write("                        <li><a class=\"password\"><img src=\"images/icon-setting.png\"><p>Password</p></a></li>\r\n");
      out.write("                        <li><a href=\"Login\"><img src=\"images/icon-logout.png\"><p>Logout</p></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"hey\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main\">    \r\n");
      out.write("            <form action=\"Search\" method=\"GET\" class=\"outside\">\r\n");
      out.write("\r\n");
      out.write("                <input type=\"submit\" name = \"search_button\" id =\"search_button\">\r\n");
      out.write("                <input type=\"text\" id= \"search_text\" name=\"search\" placeholder=\"Find images\">\r\n");
      out.write("                <input type=\"button\" id=\"filter\" class=\"drop\" >\r\n");
      out.write("                <label for=\"filter\"><img src=\"css/images/icon-filter.png\"></label>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"modal-password\">\r\n");
      out.write("                <div class=\"modal-password-content\"> \r\n");
      out.write("                    <span class=\"close1\">&times;</span>\r\n");
      out.write("                    <h2>Change your current password</h2>\r\n");
      out.write("                    <form id=\"change\" action=\"Editpass\" method=\"POST\">\r\n");
      out.write("                        <h4>Your current password:</h4>\r\n");
      out.write("                        <input id=\"oldpassword\" type=\"password\" name=\"password\" >\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <div class=\"new-password\">\r\n");
      out.write("                            <h4>Your new password:</h4>\r\n");
      out.write("                            <input id=\"newpassword\" type=\"password\" name=\"newpassword\" onkeyup= \"checkPasswordMatch();\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"new-password1\"> \r\n");
      out.write("                            <h4>Confirm your new password:</h4>\r\n");
      out.write("                            <input id=\"newconfirmpassword\" type=\"password\" name=\"renewpass\" onkeyup=\"checkPasswordMatch();\" >\r\n");
      out.write("                            <span id=\"noti\"></span>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"submit\" value=\"Confirm\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"modal-filter\">\r\n");
      out.write("                <div class=\"modal-filter-content\"> \r\n");
      out.write("                    <span class=\"close1\">&times;</span>\r\n");
      out.write("                    <form action=\"SearchA\" method=\"GET\">\r\n");
      out.write("                        <h3>Search by caption</h3>\r\n");
      out.write("                        <input type=\"text\" name=\"caption\">\r\n");
      out.write("                        <h3>Search by category</h3>\r\n");
      out.write("                        <select name=\"category\">\r\n");
      out.write("                            <option value=\"animal\">Animal</option>\r\n");
      out.write("                            <option value=\"potrait\">Potrait</option>\r\n");
      out.write("                            <option value=\"landscape\">Landspace</option>\r\n");
      out.write("                            <option value=\"sport\">Sport</option>\r\n");
      out.write("                            <option value=\"other\">Other</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <input type=\"submit\" value=\"Search\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--            </div>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"add\">\r\n");
      out.write("                <button id=\"myBtn\"></button>         \r\n");
      out.write("                <label for=\"myBtn\"><img src=\"css/images/icon-add.png\"><p>Upload photos</p></label>\r\n");
      out.write("                <p>Upload photos</p>\r\n");
      out.write("                <!-- The Modal -->\r\n");
      out.write("                <div id=\"myModal\" class=\"modal\">                       \r\n");
      out.write("                    <!-- Modal content -->\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <span class=\"close\">&times;</span>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"wrapper\">\r\n");
      out.write("                            <h1>Upload your image</h1>\r\n");
      out.write("                            <form action=\"upload\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                <div class=\"flex\">\r\n");
      out.write("\r\n");
      out.write("                                    <!-- <h3>Select an image</h3> -->\r\n");
      out.write("                                    <input id=\"file\" name=\"myimg\" type=\"file\" accept=\"image/*\" onchange=\"preview_image(event)\" style=\"visibility:hidden;\">\r\n");
      out.write("                                    <label for=\"file\" class=\"btn\"><strong>Select An Image</strong></label>\r\n");
      out.write("                                    <img id=\"output_image\" >\r\n");
      out.write("                                    <div class=\"flex1\">\r\n");
      out.write("                                        <h3>Your caption:</h3>\r\n");
      out.write("                                        <textarea rows=\"4\" cols=\"50\" name=\"caption\">\r\n");
      out.write("                                                \r\n");
      out.write("                                        </textarea>\r\n");
      out.write("\r\n");
      out.write("                                        <h3>Choose category</h3>\r\n");
      out.write("                                        <select name=\"category\">\r\n");
      out.write("                                            <option value=\"animal\">Animal</option>\r\n");
      out.write("                                            <option value=\"portrait\">Portrait</option>\r\n");
      out.write("                                            <option value=\"landscape\">Landscape</option>\r\n");
      out.write("                                            <option value=\"sport\">Sport</option>\r\n");
      out.write("                                            <option value=\"other\">Other</option>\r\n");
      out.write("                                        </select>\r\n");
      out.write("                                        <input type=\"submit\" value=\"Upload\" id=\"upload\" >\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>     \r\n");
      out.write("                </div>                             \r\n");
      out.write("            </div>  \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"sub\">\r\n");
      out.write("            <div class=\"cover\">\r\n");
      out.write("                <div class=\"avatar-modal\" id=\"id01\">\r\n");
      out.write("\r\n");
      out.write("                    <form id=\"form1\" class=\"avatar-form\" action=\"avatar\" method=\"POST\" enctype=\"multipart/form-data\">\r\n");
      out.write("                        <h2>Change your profile picture</h2>\r\n");
      out.write("                        <span class=\"close1\">&times;</span>\r\n");
      out.write("                        <input class=\"hinhnen\" type=\"file\" onchange=\"previewFile()\" name=\"myavatar\"><br>\r\n");
      out.write("                        <img class=\"avatar-preview\" src=\"http://via.placeholder.com/300x300\" height=\"300px\" width=\"300px\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Change\" class=\"avatar-submit\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"cover\">\r\n");
      out.write("                <div class=\"avatar\">\r\n");
      out.write("                    <span>\r\n");
      out.write("                        <p class=\"update\">Update</p>\r\n");
      out.write("                    </span>\r\n");
      out.write("                    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"profile\">\r\n");
      out.write("                <div  class=\"follower\">\r\n");
      out.write("\r\n");
      out.write("                    <p name=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"wrapper\">\r\n");
      out.write("                    ");
      if (_jspx_meth_sql_setDataSource_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_sql_query_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"inf\">       \r\n");
      out.write("                    <div class=\"first\">\r\n");
      out.write("                        ");
      if (_jspx_meth_sql_setDataSource_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_sql_query_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <h6>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\r\n");
      out.write("\r\n");
      out.write("                    </div>     \r\n");
      out.write("                    <div class=\"second\">         \r\n");
      out.write("                        ");
      if (_jspx_meth_sql_setDataSource_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_sql_query_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"third\">\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <script>\r\n");
      out.write("                // Get the modal\r\n");
      out.write("                var modal = document.getElementById('myModal');\r\n");
      out.write("\r\n");
      out.write("                // Get the button that opens the modal\r\n");
      out.write("                var btn = document.getElementById(\"myBtn\");\r\n");
      out.write("\r\n");
      out.write("                // Get the <span> element that closes the modal\r\n");
      out.write("                var span = document.getElementsByClassName(\"close\")[0];\r\n");
      out.write("\r\n");
      out.write("                // When the user clicks the button, open the modal \r\n");
      out.write("                btn.onclick = function () {\r\n");
      out.write("                    modal.style.display = \"block\";\r\n");
      out.write("                };\r\n");
      out.write("\r\n");
      out.write("                // When the user clicks on <span> (x), close the modal\r\n");
      out.write("                span.onclick = function () {\r\n");
      out.write("                    modal.style.display = \"none\";\r\n");
      out.write("                };\r\n");
      out.write("\r\n");
      out.write("                // When the user clicks anywhere outside of the modal, close it\r\n");
      out.write("                window.onclick = function (event) {\r\n");
      out.write("                    if (event.target === modal) {\r\n");
      out.write("                        modal.style.display = \"none\";\r\n");
      out.write("                    }\r\n");
      out.write("                };\r\n");
      out.write("\r\n");
      out.write("            </script>\r\n");
      out.write("            <script>\r\n");
      out.write("                $(document).ready(function () {\r\n");
      out.write("                    var someText = \"");
      out.print(session.getAttribute("login"));
      out.write("\";\r\n");
      out.write("                    var email = \"");
      out.print(session.getAttribute("email"));
      out.write("\";\r\n");
      out.write("                    if (someText === \"login\") {\r\n");
      out.write("                        alert(\"Welcome \" + email);\r\n");
      out.write("                    }\r\n");
      out.write("                    console.log(someText);\r\n");
      out.write("\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            </script>\r\n");
      out.write("            <script>\r\n");
      out.write("                $(document).ready(function () {\r\n");
      out.write("                    var check = \"");
      out.print(session.getAttribute("password"));
      out.write("\";\r\n");
      out.write("\r\n");
      out.write("                    $(\"#change\").submit(function (event) {\r\n");
      out.write("\r\n");
      out.write("                        var oldpassword = $(\"#oldpassword\").val();\r\n");
      out.write("                        var password = $(\"#newpassword\").val();\r\n");
      out.write("                        var confirmPassword = $(\"#newconfirmpassword\").val();\r\n");
      out.write("\r\n");
      out.write("                        console.log(oldpassword);\r\n");
      out.write("                        console.log(password);\r\n");
      out.write("                        console.log(confirmPassword);\r\n");
      out.write("                        if (oldpassword === check && oldpassword !== null && password !== null && confirmPassword !== null && password === confirmPassword)\r\n");
      out.write("                        {\r\n");
      out.write("                            alert(\"Congratulations. You have successfully changed your password!\");\r\n");
      out.write("                        } else\r\n");
      out.write("                        {\r\n");
      out.write("                            event.preventDefault();\r\n");
      out.write("                            alert(\"Your current password is wrong or something is missing !! Please input again\");\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("database");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/photics");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${database}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setSql((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("SELECT * FROM user WHERE email ='${sessionScope.email}'", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_0.setVar("result");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/avatar?email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_1 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_1.setParent(null);
    _jspx_th_sql_setDataSource_1.setVar("database");
    _jspx_th_sql_setDataSource_1.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_1.setUrl("jdbc:mysql://localhost:3306/photics");
    _jspx_th_sql_setDataSource_1.setUser("root");
    _jspx_th_sql_setDataSource_1.setPassword("");
    int _jspx_eval_sql_setDataSource_1 = _jspx_th_sql_setDataSource_1.doStartTag();
    if (_jspx_th_sql_setDataSource_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_1);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent(null);
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${database}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_1.setSql((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("SELECT * FROM image INNER JOIN user ON image.email = user.email WHERE user.email ='${sessionScope.email}' ORDER BY ID DESC", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_1.setVar("result");
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("row");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-lightbox=\"wrapper\" data-title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.caption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> \r\n");
          out.write("                            <img  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/> \r\n");
          out.write("                        </a>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_2 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_2.setParent(null);
    _jspx_th_sql_setDataSource_2.setVar("database");
    _jspx_th_sql_setDataSource_2.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_2.setUrl("jdbc:mysql://localhost:3306/photics");
    _jspx_th_sql_setDataSource_2.setUser("root");
    _jspx_th_sql_setDataSource_2.setPassword("");
    int _jspx_eval_sql_setDataSource_2 = _jspx_th_sql_setDataSource_2.doStartTag();
    if (_jspx_th_sql_setDataSource_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_2);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_2);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent(null);
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${database}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_2.setSql((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("SELECT * FROM user WHERE email ='${sessionScope.email}'", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_2.setVar("result");
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("row");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/avatar?email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_3 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_3.setParent(null);
    _jspx_th_sql_setDataSource_3.setVar("database");
    _jspx_th_sql_setDataSource_3.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_3.setUrl("jdbc:mysql://localhost:3306/photics");
    _jspx_th_sql_setDataSource_3.setUser("root");
    _jspx_th_sql_setDataSource_3.setPassword("");
    int _jspx_eval_sql_setDataSource_3 = _jspx_th_sql_setDataSource_3.doStartTag();
    if (_jspx_th_sql_setDataSource_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_3);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_3);
    return false;
  }

  private boolean _jspx_meth_sql_query_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_sql_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent(null);
    _jspx_th_sql_query_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${database}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_3.setSql((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("SELECT * FROM image INNER JOIN user ON image.email = user.email WHERE user.email ='${sessionScope.email}' ORDER BY ID DESC", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sql_query_3.setVar("result");
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_sql_dataSource_nobody.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("row");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class = \"new-post\">\r\n");
          out.write("                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.caption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                <div id=\"post-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                    <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-lightbox=\"wrapper\" data-title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.caption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> \r\n");
          out.write("                                        <img  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/> \r\n");
          out.write("                                    </a>\r\n");
          out.write("                                    <div class=\"dropdown\">\r\n");
          out.write("                                        <button id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                                                class=\"dropbtn\">\r\n");
          out.write("                                            <img src =\"css/images/icon-more.png\" alt=\"more\">\r\n");
          out.write("                                        </button>\r\n");
          out.write("\r\n");
          out.write("                                        <div id=\"myDropdown\" class=\"dropdown-content\" > \r\n");
          out.write("                                            <a href=\"Delete?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" onclick=\"if (!confirm('Do you really want to delete this picture?'))\r\n");
          out.write("                                                        return false\">Delete</a>\r\n");
          out.write("                                            <div id=\"modal-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <a class=\"myBtn\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a>\r\n");
          out.write("                                                <div id=\"myModal-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"modal-new \">                       \r\n");
          out.write("                                                    <!-- Modal content -->\r\n");
          out.write("                                                    <div class=\"modal-content\" id=\"modal-content-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                        <span class=\"close\" id=\"close-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">&times;</span>\r\n");
          out.write("                                                        <form action=\"Edit?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"POST\">\r\n");
          out.write("                                                            <div class=\"new-flex\">                                                                                       \r\n");
          out.write("                                                                <h3>Your new caption:</h3>     \r\n");
          out.write("                                                                <textarea rows=\"4\" cols=\"50\" name=\"captionn\">\r\n");
          out.write("                                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.caption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                                                </textarea>\r\n");
          out.write("                                                                <h3>Choose new category:</h3>\r\n");
          out.write("                                                                <select name=\"categoryn\">\r\n");
          out.write("                                                                    <option value=\"animal\">Animal</option>\r\n");
          out.write("                                                                    <option value=\"potrait\">Portrait</option>\r\n");
          out.write("                                                                    <option value=\"landscape\">Landscape</option>\r\n");
          out.write("                                                                    <option value=\"sport\">Sport</option>\r\n");
          out.write("                                                                    <option value=\"other\">Other</option>\r\n");
          out.write("                                                                </select>\r\n");
          out.write("                                                                <input type=\"submit\" value=\"Edit\" name=\"edit\" />        \r\n");
          out.write("                                                                <img  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </form>                                     \r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>   \r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
