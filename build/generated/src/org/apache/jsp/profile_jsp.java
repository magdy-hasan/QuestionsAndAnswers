package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/QuestionsAndAnswers/css/Profile.css\">\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"gray\">\n");
      out.write("        <!--Top Header Start-->\n");
      out.write("        <ul>\n");
      out.write("            <li style=\"float: left; margin-left: 10%; margin-top: 12px; color: red; font-size: 120%;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("            <li style=\"float: left;\">\n");
      out.write("                <form action=\"search\" method=\"POST\">\n");
      out.write("                    <input  type=\"text\" name=\"search\" placeholder=\"Enter username or email..\">\n");
      out.write("                </form>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"/QuestionsAndAnswers/logout\">logout</a></li>\n");
      out.write("            <li><a href=\"profileToAnswer.jsp\" >Questions</a></li>\n");
      out.write("            <li><a style=\"cursor:pointer\" id=\"myBtn\">Update Image</a></li>\n");
      out.write("            <li><a class=\"active\" href=\"profile.jsp\" >Home</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <!--Top Header End-->\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("        <div class=\"profile-bg\" style=\"background-image:url(/QuestionsAndAnswers/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.backgroundname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(")\">\n");
      out.write("            <img src=\"/QuestionsAndAnswers/images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.picname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\n");
      out.write("            <form><input type=\"file\" ></form>\n");
      out.write("        </div>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <section class=\"content\">\n");
      out.write("            <h3 style=\"text-align: center;\">Questions you asked  </h3>\n");
      out.write("            <hr/>\n");
      out.write("            <br>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- The Modal for changing photo -->\n");
      out.write("        <div id=\"myModal\" class=\"modal\">\n");
      out.write("\n");
      out.write("            <!-- Modal content -->\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <span class=\"close\">×</span>\n");
      out.write("                    <h2>Change your image</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr style=\"outline:  1px solid #66add6;\">\n");
      out.write("                            <td style=\"padding-left: 7px;\">Update profile picture: </td>\n");
      out.write("                            <td>\n");
      out.write("                                <form method=\"POST\" action=\"uploadImagePic\">\n");
      out.write("                                    <input type=\"file\" name=\"image\"><input type=\"submit\" value=\"Update\" style=\"background-color: #5cb85c;\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr style=\"height: 5px;\"></tr>\n");
      out.write("                        <tr style=\"outline:  1px solid #66add6;\">\n");
      out.write("                            <td style=\"padding-left: 7px;\">Update background picture: </td>\n");
      out.write("                            <td>\n");
      out.write("                                <form method=\"POST\" action=\"uploadImageBG\">\n");
      out.write("                                    <input type=\"file\" name=\"image\"><input type=\"submit\" value=\"Update\" style=\"background-color: #5cb85c\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- script for changing photo -->\n");
      out.write("        <script>\n");
      out.write("            // Get the modal\n");
      out.write("            var modal = document.getElementById('myModal');\n");
      out.write("\n");
      out.write("            // Get the button that opens the modal\n");
      out.write("            var btn = document.getElementById(\"myBtn\");\n");
      out.write("\n");
      out.write("            // Get the <span> element that closes the modal\n");
      out.write("            var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("            // When the user clicks the button, open the modal\n");
      out.write("            btn.onclick = function () {\n");
      out.write("                modal.style.display = \"block\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // When the user clicks on <span> (x), close the modal\n");
      out.write("            span.onclick = function () {\n");
      out.write("                modal.style.display = \"none\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // When the user clicks anywhere outside of the modal, close it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target == modal) {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("mapIds");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${applicationScope['allUsersIds']}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
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
    _jspx_th_c_forEach_0.setVar("qu");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allQUAnswered}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("   \n");
          out.write("                <div class=\"question\">\n");
          out.write("                    <h1 style=\"display: inline;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qu.questionHead}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h1>\n");
          out.write("                    <a href=\"/QuestionsAndAnswers/user/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allUsersIds[qu.askedById]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"color: #0F4D92; padding-left: 5px; text-decoration: none; font-size: 120%;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allUsersIds[qu.askedById]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qu.questionAnswer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                    <a href=\"/QuestionsAndAnswers/user/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allUsersIds[qu.askedToId]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"color: #acd6ef; padding-left: 5px; text-decoration: none; font-size: 90%;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allUsersIds[qu.askedToId]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    <hr/>\n");
          out.write("                    <form method=\"POST\" action=\"#\" >\n");
          out.write("                        <input type=\"submit\" style=\"display: inline; color: blue;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qu.likes}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" | like\">\n");
          out.write("                        <a href=\"#\"  style=\"float: right; padding-right: 20px;\">etx<a/>\n");
          out.write("                    </form>\n");
          out.write("                </div>\n");
          out.write("                <hr/>\n");
          out.write("            ");
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
