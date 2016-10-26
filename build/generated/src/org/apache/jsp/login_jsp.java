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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <style>\n");
      out.write("        /* Basics */\n");
      out.write("        html, body {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("            font-family: \"Helvetica Neue\", Helvetica, sans-serif;\n");
      out.write("            color: #444;\n");
      out.write("            -webkit-font-smoothing: antialiased;\n");
      out.write("            background: #f0f0f0;\n");
      out.write("        }\n");
      out.write("        #container {\n");
      out.write("            position: fixed;\n");
      out.write("            width: 340px;\n");
      out.write("            height: 280px;\n");
      out.write("            top: 50%;\n");
      out.write("            left: 50%;\n");
      out.write("            margin-top: -140px;\n");
      out.write("            margin-left: -170px;\n");
      out.write("            background: #fff;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            box-shadow: 0 1px 2px rgba(0, 0, 0, .1);\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            margin: 0 auto;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            color: #555;\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-left: 18px;\n");
      out.write("            padding-top: 10px;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        p a {\n");
      out.write("            font-size: 11px;\n");
      out.write("            color: #aaa;\n");
      out.write("            float: right;\n");
      out.write("            margin-top: -13px;\n");
      out.write("            margin-right: 20px;\n");
      out.write("         -webkit-transition: all .4s ease;\n");
      out.write("            -moz-transition: all .4s ease;\n");
      out.write("            transition: all .4s ease;\n");
      out.write("        }\n");
      out.write("        p a:hover {\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("        input {\n");
      out.write("            font-family: \"Helvetica Neue\", Helvetica, sans-serif;\n");
      out.write("            font-size: 12px;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("        input[type=text],\n");
      out.write("        input[type=password] ,input[type=time]{\n");
      out.write("            color: #777;\n");
      out.write("            padding-left: 10px;\n");
      out.write("            margin: 10px;\n");
      out.write("            margin-top: 12px;\n");
      out.write("            margin-left: 18px;\n");
      out.write("            width: 290px;\n");
      out.write("            height: 35px;\n");
      out.write("            border: 1px solid #c7d0d2;\n");
      out.write("            border-radius: 2px;\n");
      out.write("            box-shadow: inset 0 1.5px 3px rgba(190, 190, 190, .4), 0 0 0 5px #f5f7f8;\n");
      out.write("            -webkit-transition: all .4s ease;\n");
      out.write("            -moz-transition: all .4s ease;\n");
      out.write("            transition: all .4s ease;\n");
      out.write("            }\n");
      out.write("        input[type=text]:hover,\n");
      out.write("        input[type=password]:hover,input[type=time]:hover {\n");
      out.write("            border: 1px solid #b6bfc0;\n");
      out.write("            box-shadow: inset 0 1.5px 3px rgba(190, 190, 190, .7), 0 0 0 5px #f5f7f8;\n");
      out.write("        }\n");
      out.write("        input[type=text]:focus,\n");
      out.write("        input[type=password]:focus,input[type=time]:focus {\n");
      out.write("            border: 1px solid #a8c9e4;\n");
      out.write("            box-shadow: inset 0 1.5px 3px rgba(190, 190, 190, .4), 0 0 0 5px #e6f2f9;\n");
      out.write("        }\n");
      out.write("        #lower {\n");
      out.write("            background: #ecf2f5;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 69px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("              box-shadow: inset 0 1px 1px #fff;\n");
      out.write("            border-top: 1px solid #ccc;\n");
      out.write("            border-bottom-right-radius: 3px;\n");
      out.write("            border-bottom-left-radius: 3px;\n");
      out.write("        }\n");
      out.write("        input[type=checkbox] {\n");
      out.write("            margin-left: 20px;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("        .check {\n");
      out.write("            margin-left: 3px;\n");
      out.write("            font-size: 11px;\n");
      out.write("            color: #444;\n");
      out.write("            text-shadow: 0 1px 0 #fff;\n");
      out.write("        }\n");
      out.write("        input[type=submit] {\n");
      out.write("            float: right;\n");
      out.write("            margin-right: 20px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            width: 80px;\n");
      out.write("            height: 30px;\n");
      out.write("            font-size: 14px;\n");
      out.write("            font-weight: bold;\n");
      out.write("            color: #fff;\n");
      out.write("            background-color: #acd6ef; /*IE fallback*/\n");
      out.write("            background-image: -webkit-gradient(linear, left top, left bottom, from(#acd6ef), to(#6ec2e8));\n");
      out.write("            background-image: -moz-linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);\n");
      out.write("            background-image: linear-gradient(top left 90deg, #acd6ef 0%, #6ec2e8 100%);\n");
      out.write("            border-radius: 30px;\n");
      out.write("            border: 1px solid #66add6;\n");
      out.write("            box-shadow: 0 1px 2px rgba(0, 0, 0, .3), inset 0 1px 0 rgba(255, 255, 255, .5);\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        input[type=submit]:hover {\n");
      out.write("            background-image: -webkit-gradient(linear, left top, left bottom, from(#b6e2ff), to(#6ec2e8));\n");
      out.write("            background-image: -moz-linear-gradient(top left 90deg, #b6e2ff 0%, #6ec2e8 100%);\n");
      out.write("            background-image: linear-gradient(top left 90deg, #b6e2ff 0%, #6ec2e8 100%);\n");
      out.write("        }\n");
      out.write("        input[type=submit]:active {\n");
      out.write("            background-image: -webkit-gradient(linear, left top, left bottom, from(#6ec2e8), to(#b6e2ff));\n");
      out.write("            background-image: -moz-linear-gradient(top left 90deg, #6ec2e8 0%, #b6e2ff 100%);\n");
      out.write("            background-image: linear-gradient(top left 90deg, #6ec2e8 0%, #b6e2ff 100%);\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!-- Begin Page Content -->\n");
      out.write("            <div id=\"container\">\n");
      out.write("                <form action=\"doLogin\" method=\"post\">\n");
      out.write("                    <label for=\"loginmsg\" style=\"color:hsla(0,100%,50%,0.5); display: block; font-family:\"Helvetica Neue\",Helvetica,sans-serif;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</label>\n");
      out.write("                    <label for=\"username\">E-mail:</label>\n");
      out.write("                    <input type=\"text\" id=\"username\" name=\"email\">\n");
      out.write("                    <label for=\"password\">Password:</label>\n");
      out.write("                    <input type=\"password\" id=\"password\" name=\"pass\">\n");
      out.write("                    <div id=\"lower\">\n");
      out.write("                        <input type=\"submit\" value=\"Login\">\n");
      out.write("                        <a  href=\"register.jsp\"><span style=\"display: inline-block; margin-right: 5px; margin-top: 7px; padding:15px;\">Register new account</span></a>\n");
      out.write("                    </div><!--/ lower-->\n");
      out.write("                </form>\n");
      out.write("            </div><!--/ container-->\n");
      out.write("            <!-- End Page Content -->\n");
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
}
