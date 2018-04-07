package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class animal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Join us now!</title>\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/newexplore.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/lightbox.css\">\n");
      out.write("    <script src=\"http://ajax.googleapjax/libs/jquery/1.7.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/editModal.js\"></script> \n");
      out.write("    <script type=\"text/javascript\" src=\"js/lightbox.js\"></script> \n");
      out.write("    <script type=\"text/javascript\" src=\"js/lightbox-plus-jquery.js\"></script>   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"search\">\n");
      out.write("        <form action=\"Search\" method=\"GET\">      \n");
      out.write("            <input type=\"submit\" name = \"search_button\" id =\"search_button\">\n");
      out.write("            <input type=\"text\" id= \"search_text\" name=\"search\" placeholder=\"Find images\">\n");
      out.write("            <input type=\"button\" id=\"filter\" class=\"drop\" >\n");
      out.write("            <label for=\"filter\"><img src=\"css/images/icon-filter.png\"></label>\n");
      out.write("        </form>\n");
      out.write("        <div class=\"modal-filter\">\n");
      out.write("            <div class=\"modal-filter-content\"> \n");
      out.write("                <span class=\"close1\">&times;</span>\n");
      out.write("                <form action=\"SearchA\" method=\"GET\">\n");
      out.write("                    <h3>Search by caption</h3>\n");
      out.write("                    <input type=\"text\" name=\"caption\">\n");
      out.write("                    <h3>Search by category</h3>\n");
      out.write("                    <select name=\"category\">\n");
      out.write("                        <option value=\"animal\">Animal</option>\n");
      out.write("                        <option value=\"potrait\">Potrait</option>\n");
      out.write("                        <option value=\"landscape\">Landspace</option>\n");
      out.write("                        <option value=\"sport\">Sport</option>\n");
      out.write("                        <option value=\"other\">Other</option>\n");
      out.write("                    </select>\n");
      out.write("                    <input type=\"submit\" value=\"Search\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
      out.write("            <li><a href=\"explore.jsp\" style=\"visibility:hidden\">Explore</a></li>\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("            <li><a href=\"explore.jsp\">Explore</a></li>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </nav>\n");
      out.write("    <div class='wrapper'>\n");
      out.write("        ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"filter\">\n");
      out.write("            <p class=\"animals\">\n");
      out.write("                <a href=\"animal.jsp\">Animals</a>\n");
      out.write("            </p>\n");
      out.write("            <p class=\"nature\">\n");
      out.write("                <a href=\"portrait.jsp\">Portrait</a>\n");
      out.write("            </p>\n");
      out.write("            <p class=\"food\">\n");
      out.write("                <a href=\"landscape.jsp\">Landscape</a>\n");
      out.write("            </p>\n");
      out.write("            <p class=\"fashion\">\n");
      out.write("                <a href=\"sport.jsp\">Sport</a>\n");
      out.write("            </p>\n");
      out.write("            <p class=\"art\">\n");
      out.write("                <a href=\"other.jsp\">Other</a>\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
    _jspx_th_sql_query_0.setSql("SELECT * from image WHERE category = 'animal' ORDER BY RAND()");
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
          out.write("            <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" data-lightbox=\"wrapper\" data-title=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.caption}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" by ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                <img  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.servletContext.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/upload?ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/> \n");
          out.write("            </a>\n");
          out.write("        ");
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
}
