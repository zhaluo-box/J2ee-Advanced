/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-26 02:44:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class agreePie_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<title>My JSP 'showStudentInfo.jsp' starting page</title>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<!-- 知乎前10赞同数，用圆饼图展示 -->\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/echarts.js\"></script>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 显示Echarts图表 -->\r\n");
      out.write("\t<div id=\"main\" style=\"width: 500px;height: 300px;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"main2\" style=\"width: 500px;height: 300px;\"></div>\r\n");
      out.write("\t<script>\t//初始化echarts var pieCharts =\r\n");
      out.write("\t\t//初始化echarts\r\n");
      out.write("\t\tvar pieCharts = echarts.init(document.getElementById(\"main\"));\r\n");
      out.write("\t\t//var pieCharts = echarts.init(document.getElementById(\"main2\"));\r\n");
      out.write("\t\t//设置属性\r\n");
      out.write("\t\tpieCharts.setOption({\r\n");
      out.write("\t\t\ttitle : {\r\n");
      out.write("\t\t\t\ttext : '赞同数',\r\n");
      out.write("\t\t\t\tsubtext : '赞同数比',\r\n");
      out.write("\t\t\t\tleft : \"center\", //left 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比，也可以是 'left', 'center', 'right',如果 left 的值为'left', 'center', 'right'，组件会根据相应的位置自动对齐。\r\n");
      out.write("\t\t\t\tright : \"auto\", //right 的值可以是像 20 这样的具体像素值，可以是像 '20%' 这样相对于容器高宽的百分比。\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\ttrigger : 'item',\r\n");
      out.write("\t\t\t\tformatter : \"{a} <br/>{b} : {c} ({d}%)\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t//图例\r\n");
      out.write("\t\t\tlegend : {\r\n");
      out.write("\t\t\t\torient : 'vertical',\r\n");
      out.write("\t\t\t\tx : 'left',\r\n");
      out.write("\t\t\t\tdata : []\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t//工具箱\r\n");
      out.write("\t\t\ttoolbox : {\r\n");
      out.write("\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\tfeature : {\r\n");
      out.write("\t\t\t\t\tmark : {\r\n");
      out.write("\t\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t//数据视图\r\n");
      out.write("\t\t\t\t\tdataView : {\r\n");
      out.write("\t\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\t\treadOnly : false\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\trestore : {\r\n");
      out.write("\t\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t//是否可以保存为图片\r\n");
      out.write("\t\t\t\t\tsaveAsImage : {\r\n");
      out.write("\t\t\t\t\t\tshow : true\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcalculable : true,\r\n");
      out.write("\t\t\t//数据\r\n");
      out.write("\t\t\tseries : [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tname : '赞同数',\r\n");
      out.write("\t\t\t\t\ttype : 'pie',\r\n");
      out.write("\t\t\t\t\tradius : '50%', //半径\r\n");
      out.write("\t\t\t\t\tcenter : [ '50%', '50%' ], //圆心位置\r\n");
      out.write("\t\t\t\t\tdata : []\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t//显示一段动画\r\n");
      out.write("\t\tpieCharts.showLoading();\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar names = [];\r\n");
      out.write("\t\t//异步请求数据\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\tasync : true,\r\n");
      out.write("\t\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/echarts/agreePie',\r\n");
      out.write("\t\t\tdata : [],\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tif (result) {\r\n");
      out.write("\t\t\t\t\tfor (var i = 0; i < result.length; i++) {\r\n");
      out.write("\t\t\t\t\t\tnames.push(result[i].name); //挨个取出类别并填入类别数组\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tpieCharts.hideLoading(); //隐藏加载动画\r\n");
      out.write("\t\t\t\t\tpieCharts.setOption({\r\n");
      out.write("\t\t\t\t\t\tseries : [\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tdata : result\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t],\r\n");
      out.write("\t\t\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\t\t\tdata : names\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t//返回的数据为空时显示提示信息\r\n");
      out.write("\t\t\t\t\talert(\"图表请求数据为空，可能服务器暂未录入近五天的观测数据，您可以稍后再试！\");\r\n");
      out.write("\t\t\t\t\tpieCharts.hideLoading();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function(errorMsg) {\r\n");
      out.write("\t\t\t\t//请求失败时执行该函数\r\n");
      out.write("\t\t\t\talert(\"图表请求数据失败，可能是服务器开小差了\");\r\n");
      out.write("\t\t\t\tpieCharts.hideLoading();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
