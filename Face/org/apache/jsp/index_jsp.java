package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>人脸识别</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".head {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tcolor: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tbackground: #10e63e;\r\n");
      out.write("\twidth: 50px;\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tborder-radius: 40px;\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tborder: 2px solid rgb(40, 191, 64);\r\n");
      out.write("\tcolor: green;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:HOVER {\r\n");
      out.write("\tbackground: orange;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".foot {\r\n");
      out.write("\tborder: 1px solid red; \r\n");
      out.write("\twidth : 810px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\tline-height:400px;\r\n");
      out.write("\tmargin: 1px auto;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".f1,.f2{\r\n");
      out.write("border: 1px solid activeborder; \r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("background:yellow;\r\n");
      out.write("transition:width 2s;\r\n");
      out.write("}\r\n");
      out.write(".f2{\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".clear{\r\n");
      out.write("\tclear: both;\r\n");
      out.write("}\r\n");
      out.write("@keyframes puts {\r\n");
      out.write("           0%{\r\n");
      out.write("               height: 80px;\r\n");
      out.write("               background-color: rgba(101, 51, 255, 0.35);\r\n");
      out.write("           }\r\n");
      out.write("           25%{\r\n");
      out.write("               height: 160px;\r\n");
      out.write("               background-color: rgba(101, 51, 255, 0.35);\r\n");
      out.write("           }\r\n");
      out.write("           50%{\r\n");
      out.write("               height: 240px;\r\n");
      out.write("               background-color: rgba(101, 51, 255, 0.35);\r\n");
      out.write("           }\r\n");
      out.write("           75%{\r\n");
      out.write("               height: 320px;\r\n");
      out.write("               background-color: rgba(101, 51, 255, 0.35);\r\n");
      out.write("           }\r\n");
      out.write("           100%{\r\n");
      out.write("               height: 400px;\r\n");
      out.write("               background-color: rgba(101, 51, 255, 0.35);\r\n");
      out.write("           }\r\n");
      out.write("       }\r\n");
      out.write("        .div{\r\n");
      out.write("            height: 0px;\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            animation:puts 7s ease 0s infinite;\r\n");
      out.write("        }\r\n");
      out.write("div{\r\n");
      out.write("position:absolute;\r\n");
      out.write("top:359px;\r\n");
      out.write("letf:500px;}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background: rgba(221, 234, 17, 0.32);\">\r\n");
      out.write("\t<header class=\"head\">\r\n");
      out.write("\t\t人脸识别系统<br /> <img src=\"imgs/pson.png\" />\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<section style=\"text-align: center;\">\r\n");
      out.write("\t\t<form action=\"file.jsp\" method=\"post\" enctype=\"multipart/form-data\"\r\n");
      out.write("\t\t\tid=\"form\">\r\n");
      out.write("\t\t\t<a href=\"javasprict:;\">点击上传图片</a><br /> <input type=\"file\"\r\n");
      out.write("\t\t\t\tname=\"file\" style=\"display: none;\" onchange=\"saveFile();\" /><br />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<footer class=\"foot clear\">\r\n");
      out.write("\t\t<aside class=\"f1\">\r\n");
      out.write("\t\t<div ></div>\r\n");
      out.write("\t\t<img id=\"in\" alt=\"\" src=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${names!=null?names:\"imgs/nvnv.jpg\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" width=\"400px\" height=\"400px\" onload=\"don();\">\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t\t<aside class=\"f2\">\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\"a\").click(function() {\r\n");
      out.write("\t\t\t\t$(\"[type='file']\").click();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction saveFile() {\r\n");
      out.write("\t\t\t/* alert($(\"[type='file']\").val); */\r\n");
      out.write("\t\t\t$(\"#form\").submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction don(){\r\n");
      out.write("\t\t$(\"div\").addClass(\"div\");\r\n");
      out.write("\t\tfaceDao();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction faceDao(){\r\n");
      out.write("\t\talert($(\"#in\").attr(\"src\"));\r\n");
      out.write("\t\t\tvar msg = $(\"img\").attr(\"src\");\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\turl:\"factdao.jsp\",\r\n");
      out.write("\t\t\t\tdata:{\"path\":msg},\r\n");
      out.write("\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t$(\".f2\").prepend(date);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
