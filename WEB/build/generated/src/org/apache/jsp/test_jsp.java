package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/test.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/editModal.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/drop-drag.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/dropdown.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/lightbox.js\"></script> \n");
      out.write("        <script type=\"text/javascript\" src=\"js/lightbox-plus-jquery.js\"></script>     \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"tabs\">\n");
      out.write("            <div class=\"tab\">\n");
      out.write("                <input type=\"radio\" id=\"tab-1\" name=\"tab-group-1\">\n");
      out.write("                <label for=\"tab-1\"><img src=\"images/icon-menu.png\" width=25px></label>\n");
      out.write("                <div class=\"tab close-tab\">\n");
      out.write("                    <input type=\"radio\" id=\"tab-close\" name=\"tab-group-1\">\n");
      out.write("                    <label for=\"tab-close\"><img src=\"images/icon-menu.png\" width=25px></label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"new-home.jsp\"><img src=\"images/icon-home.png\"><p>Home</p></a></li>\n");
      out.write("                        <li><a href=\"explore.jsp\"><img src=\"images/icon-contact.png\"><p>Explore</p></a></li>\n");
      out.write("                        <li><a href=\"\"><img src=\"images/icon-photo.png\"><p>Photos</p></a></li>\n");
      out.write("                        <li><a href=\"Login\"><img src=\"images/icon-logout.png\"><p>Logout</p></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"hey\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"main\">    \n");
      out.write("\n");
      out.write("            <div class=\"searchbar\">\n");
      out.write("                <input type=\"button\" name = \"search_button\" id =\"search_button\">\n");
      out.write("                <input type=\"text\" id= \"search_text\" name=\"search\" placeholder=\"Find friends or images\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"add\">\n");
      out.write("                <button id=\"myBtn\"></button>         \n");
      out.write("                <label for=\"myBtn\"><img src=\"css/images/icon-add.png\"><p>Upload photos</p></label>\n");
      out.write("                <p>Upload photos</p>\n");
      out.write("                <!-- The Modal -->\n");
      out.write("                <div id=\"myModal\" class=\"modal\">                       \n");
      out.write("                    <!-- Modal content -->\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <span class=\"close\">&times;</span>\n");
      out.write("                        <div id=\"wrapper\">\n");
      out.write("                            <h1>Upload your image</h1>\n");
      out.write("                            <form action=\"upload\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("                                <div class=\"flex\">\n");
      out.write("\n");
      out.write("                                    <!-- <h3>Select an image</h3> -->\n");
      out.write("                                    <input id=\"file\" name=\"myimg\" type=\"file\" accept=\"image/*\" onchange=\"preview_image(event)\" style=\"visibility:hidden;\">\n");
      out.write("                                    <label for=\"file\" class=\"btn\"><strong>Select An Image</strong></label>\n");
      out.write("                                    <img id=\"output_image\" >\n");
      out.write("                                    <div class=\"flex1\">\n");
      out.write("                                        <h3>Your caption:</h3>\n");
      out.write("                                        <textarea rows=\"4\" cols=\"50\" name=\"caption\">\n");
      out.write("                                                        \n");
      out.write("                                        </textarea>\n");
      out.write("                                        <h3>Choose category:</h3>\n");
      out.write("                                        <select>\n");
      out.write("                                            <option value=\"animal\">Animal</option>\n");
      out.write("                                            <option value=\"potrait\">Potrait</option>\n");
      out.write("                                            <option value=\"landscape\">Landspace</option>\n");
      out.write("                                            <option value=\"sport\">Sport</option>\n");
      out.write("                                            <option value=\"other\">Other</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <input type=\"submit\" value=\"Upload\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>     \n");
      out.write("                </div>                             \n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"sub\">\n");
      out.write("            <div class=\"cover\">\n");
      out.write("                <div class=\"avatar\">\n");
      out.write("                    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"profile\">\n");
      out.write("                <div  class=\"follower\">\n");
      out.write("\n");
      out.write("                    <p name=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"wrapper\">\n");
      out.write("                    ");
      if (_jspx_meth_sql_setDataSource_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_sql_query_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inf\">\n");
      out.write("                    <div class=\"first\">\n");
      out.write("                        ");
      if (_jspx_meth_sql_setDataSource_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_sql_query_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <h6>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h6>\n");
      out.write("                    </div>                       \n");
      out.write("\n");
      out.write("                    <div class=\"second\">\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_sql_setDataSource_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_sql_query_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"third\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                // Get the modal\n");
      out.write("                var modal = document.getElementById('myModal');\n");
      out.write("\n");
      out.write("                // Get the button that opens the modal\n");
      out.write("                var btn = document.getElementById(\"myBtn\");\n");
      out.write("\n");
      out.write("                // Get the <span> element that closes the modal\n");
      out.write("                var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("                // When the user clicks the button, open the modal \n");
      out.write("                btn.onclick = function () {\n");
      out.write("                    modal.style.display = \"block\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // When the user clicks on <span> (x), close the modal\n");
      out.write("                span.onclick = function () {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // When the user clicks anywhere outside of the modal, close it\n");
      out.write("                window.onclick = function (event) {\n");
      out.write("                    if (event.target == modal) {\n");
      out.write("                        modal.style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("    </body>\n");
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
          out.write("\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/avatar?email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
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
          out.write("\n");
          out.write("                        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-lightbox=\"wrapper\" data-title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.caption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> \n");
          out.write("                            <img  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/> \n");
          out.write("                        </a>\n");
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
          out.write("\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/avatar?email=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
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
          out.write("\n");
          out.write("                            <div id=\"post-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-lightbox=\"wrapper\" data-title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.caption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> \n");
          out.write("                                    <img  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/> \n");
          out.write("                                </a>\n");
          out.write("                                <div class=\"dropdown\">\n");
          out.write("                                    <button id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                            class=\"dropbtn\">\n");
          out.write("                                        <img src =\"css/images/icon-more.png\" alt=\"more\">\n");
          out.write("                                    </button>\n");
          out.write("\n");
          out.write("                                    <div id=\"myDropdown\" class=\"dropdown-content\" > \n");
          out.write("                                        <a href=\"#\">Delete</a>\n");
          out.write("                                        <div id=\"modal-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <a class=\"myBtn\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a>\n");
          out.write("                                            <div id=\"myModal-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"modal-new \">                       \n");
          out.write("                                                <!-- Modal content -->\n");
          out.write("                                                <div class=\"modal-content\" id=\"modal-content-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                    <span class=\"close\" id=\"close-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">&times;</span>\n");
          out.write("                                                    <form action=\"post\">\n");
          out.write("                                                        <div class=\"new-flex\">                                                                                       \n");
          out.write("                                                            <h3>Your new caption:</h3>     \n");
          out.write("                                                            <!--  Retrieve caption from database --> \n");
          out.write("                                                            <textarea rows=\"4\" cols=\"50\" name=\"caption\">\n");
          out.write("                                                            </textarea>\n");
          out.write("                                                            <h3>Choose new category:</h3>\n");
          out.write("                                                            <select>\n");
          out.write("                                                                <option value=\"animal\">Animal</option>\n");
          out.write("                                                                <option value=\"potrait\">Potrait</option>\n");
          out.write("                                                                <option value=\"landscape\">Landspace</option>\n");
          out.write("                                                                <option value=\"sport\">Sport</option>\n");
          out.write("                                                                <option value=\"other\">Other</option>\n");
          out.write("                                                            </select>\n");
          out.write("                                                            <input type=\"submit\" value=\"Upload\">        \n");
          out.write("                                                            <img  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </form>                                     \n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>   \n");
          out.write("                            </div>\n");
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
