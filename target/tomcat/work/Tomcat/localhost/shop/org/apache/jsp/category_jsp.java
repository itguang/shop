/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-08 02:04:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.util.*;
import java.util.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1496886228890L));
    _jspx_dependants.put("/bot.jsp", Long.valueOf(1496825226483L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<!-- saved from url=(0048)http://localhost:8080/mango/product/list/1.jhtml -->\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>传智网上商城</title>\r\n");
      out.write("<link href=\"./css/common.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./css/product.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container header\">\r\n");
      out.write("\t<div class=\"span5\">\r\n");
      out.write("\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t<a href=\"index.htm\">\r\n");
      out.write("\t\t\t\t<img src=\"./image/r___________renleipic_01/logo.gif\" alt=\"传智播客\"/>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"span9\">\r\n");
      out.write("<div class=\"headerAd\">\r\n");
      out.write("\t<img src=\"./image/header.jpg\" width=\"320\" height=\"50\" alt=\"正品保障\" title=\"正品保障\"/>\r\n");
      out.write("</div>\t</div>\r\n");
      out.write("\t<div class=\"span10 last\">\r\n");
      out.write("\t\t<div class=\"topNav clearfix\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a>会员中心</a>\r\n");
      out.write("\t\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a>购物指南</a>\r\n");
      out.write("\t\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<a>关于我们</a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<div class=\"phone\">\r\n");
      out.write("\t\t\t\t客服热线:\r\n");
      out.write("\t\t\t\t<strong>96008/53277764</strong>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"span24\">\r\n");
      out.write("\t\t<ul class=\"mainNav\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"./index.jsp\">首页</a>\r\n");
      out.write("\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"./category.jsp\">定制套餐</a>\r\n");
      out.write("\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a >安全频道</a>\r\n");
      out.write("\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a>亿家卡</a>\r\n");
      out.write("\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a>蔬菜基地</a>\r\n");
      out.write("\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a>节气养生</a>\r\n");
      out.write("\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a>便民服务</a>\r\n");
      out.write("\t\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\t");
      out.write("\r\n");
      out.write("\t<div class=\"container productList\">\r\n");
      out.write("\t\t<div class=\"span6\">\r\n");
      out.write("\t\t\t<div class=\"hotProductCategory\">\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"./image/蔬菜 - Powered By Mango Team.htm\">蔬菜</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>无公害蔬菜</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>特菜类</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>有机蔬菜</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>蔬菜套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>水果</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>国产</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>进口</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>肉类</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>猪肉</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>牛羊肉</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>家禽</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>鱼</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>虾</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>加工水产</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>其他水产</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>蛋、奶及豆制品类</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>蛋</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>奶</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>豆制品</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>干果</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>干制坚果</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>干制果实/果肉</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>干制种仁</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>谷薯杂粮</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>米类</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>杂粮</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>面粉</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>薯类</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>礼盒</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>干货</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>油</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>茶油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>核桃油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>橄榄油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>芥花籽油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>玉米油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>花生油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>红花籽油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>葡萄籽油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>亚麻籽油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>葵花仁油</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>水、软饮</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>水</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>软饮</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>茶</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>绿茶</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>红茶</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>乌龙茶</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>白茶</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>黄茶</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>保健茶</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>黑茶</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl class=\"last\">\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>商城卡</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>商城卡</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl class=\"last\">\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"./蔬菜分类.htm\">定制套餐</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>2-3人套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>4-6人套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>1-2人套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>标准套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>乳母套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>营养师1对1服务</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>儿童套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>高考套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>学生套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>护眼套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>世杯套餐</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t\t<dl class=\"last\">\r\n");
      out.write("\t\t\t\t\t<dt>\r\n");
      out.write("\t\t\t\t\t\t<a>健康生活附属品</a>\r\n");
      out.write("\t\t\t\t\t</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>空气净化器</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a>薰衣草</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span18 last\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form id=\"productForm\"\r\n");
      out.write("\t\t\t\taction=\"./image/蔬菜 - Powered By Mango Team.htm\" method=\"get\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"brandId\" name=\"brandId\" value=\"\"> <input\r\n");
      out.write("\t\t\t\t\ttype=\"hidden\" id=\"promotionId\" name=\"promotionId\" value=\"\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"orderType\" name=\"orderType\" value=\"\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"pageNumber\" name=\"pageNumber\" value=\"1\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"pageSize\" name=\"pageSize\" value=\"20\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"result\" class=\"result table clearfix\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"detail.jsp\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/4a51167a-89d5-4710-aca2-7c76edc355b8-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\" style=\"display: inline-block;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle='color:green'> 大冬瓜 </span> <span class=\"price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t商城价： ￥4.78/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/0ff130db-0a1b-4b8d-a918-ed9016317009-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\" \" style=\"display: inline-block;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span style='color:green'> 圆白菜 </span> <span class=\"price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t商城价： ￥1.78/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/f5e39c37-94b2-462e-8e58-8bde3c5f1b8c-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\" style=\"display: inline-block;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle='color:green'> 甜玉米 </span> <span class=\"price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t商城价： ￥4.48/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/f37ba36a-181b-4161-a88f-f74c9adb485d-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\" style=\"display: inline-block;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle='color:green'> 胡萝卜 </span> <span class=\"price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t商城价： ￥1.58/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/93b9e55f-cbae-4c3c-b2f7-2636c7369db7-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\" style=\"display: inline-block;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle='color:green'> 芹菜 </span> <span class=\"price\"> 商城价：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t￥2.18/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/51afeef5-f6cb-4936-abea-315cfca0edc0-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\" style=\"display: inline-block;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle='color:green'> 小西红柿 </span> <span class=\"price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t商城价： ￥6.98/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/059b5245-e3c8-43bf-80fe-700f0e4e68b8-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\" style=\"display: inline-block;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle='color:green'> 白萝卜 </span> <span class=\"price\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t商城价： ￥3.98/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/750a9ce8-8c19-444d-b8cc-f3e7e786ec5d-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\" style=\"display: inline-block;\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle='color:green'> 菠菜 </span> <span class=\"price\"> 商城价：\r\n");
      out.write("\t\t\t\t\t\t\t\t\t￥3.48/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPic372e7faa-3ad0-444d-a89b-a8e9f0d6e929.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t香菜 </span> <span class=\"price\"> 商城价： ￥2.98/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPica7e5d3dd-5984-4d0f-9851-35cc0987d9b9.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t白菜花 </span> <span class=\"price\"> 商城价： ￥5.38/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPica5720219-ba48-460a-a084-24d5b314bd03.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t韭菜 </span> <span class=\"price\"> 商城价： ￥2.38/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPicaa443d05-27b4-4964-958e-c81536f01d04.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t土豆 </span> <span class=\"price\"> 商城价： ￥2.48/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPicc1e3a29e-17f5-4d9f-a186-b2c5a0b39b88.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t黄瓜 </span> <span class=\"price\"> 商城价： ￥2.58/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPicd0459632-fe4e-4a5d-8373-1a67c9f43ec2.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t西红柿 </span> <span class=\"price\"> 商城价： ￥2.58/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPice7c2e240-4147-4c11-b369-db3765ec3df9.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t大白菜 </span> <span class=\"price\"> 商城价： ￥8.78/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/54890cf9-91b0-40bc-9f68-51462e9c43a8.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t紫甘蓝 </span> <span class=\"price\"> 商城价： ￥5.98/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"last\"><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPic4ed6edbf-fb3e-49a7-be5e-361b2ce02961.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t荷兰豆 </span> <span class=\"price\"> 商城价： ￥9.28/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"last\"><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPic5ab54f67-a479-48fe-a41d-7d34b57036a3.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t尖椒 </span> <span class=\"price\"> 商城价： ￥2.48/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"last\"><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPic13867cc1-935a-4a3a-98f9-edf87ddb1c09.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t小香葱 </span> <span class=\"price\"> 商城价： ￥2.98/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"last\"><a> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"./image/bigPicee0785e3-68e2-4e23-93ef-68904bc2a3c6.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\twidth=\"170\" height=\"170\"> <span style='color:green'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t圆茄子 </span> <span class=\"price\"> 商城价： ￥1.58/份 </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"pagination\">\r\n");
      out.write("\t\t\t\t\t<span class=\"firstPage\">&nbsp;</span> <span class=\"previousPage\">&nbsp;</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"currentPage\">1</span> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript: $.pageSkip(2);\">2</a> <a class=\"nextPage\"\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript: $.pageSkip(2);\">&nbsp;</a> <a class=\"lastPage\"\r\n");
      out.write("\t\t\t\t\t\thref=\"javascript: $.pageSkip(2);\">&nbsp;</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container footer\">\r\n");
      out.write("\t\t<div class=\"span24\">\r\n");
      out.write("\t\t\t<div class=\"footerAd\">\r\n");
      out.write("\t\t\t\t<img src=\"image\\r___________renleipic_01/footer.jpg\" alt=\"我们的优势\"\r\n");
      out.write("\t\t\t\t\ttitle=\"我们的优势\" height=\"52\" width=\"950\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span24\">\r\n");
      out.write("\t\t\t<ul class=\"bottomNav\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">关于我们</a> |</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">联系我们</a> |</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">诚聘英才</a> |</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">法律声明</a> |</li>\r\n");
      out.write("\t\t\t\t<li><a>友情链接</a> |</li>\r\n");
      out.write("\t\t\t\t<li><a target=\"_blank\">支付方式</a> |</li>\r\n");
      out.write("\t\t\t\t<li><a target=\"_blank\">配送方式</a> |</li>\r\n");
      out.write("\t\t\t\t<li><a>SHOP++官网</a> |</li>\r\n");
      out.write("\t\t\t\t<li><a>SHOP++论坛</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span24\">\r\n");
      out.write("\t\t\t<div class=\"copyright\">Copyright © 2005-2013 Mango商城 版权所有</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /menu.jsp(19,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.currentCustomer==null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<li id=\"headerLogin\" class=\"headerLogin\" style=\"display: list-item;\">\r\n");
        out.write("\t\t\t\t\t<a href=\"login.jsp\">登录</a>|\r\n");
        out.write("\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t<li id=\"headerRegister\" class=\"headerRegister\" style=\"display: list-item;\">\r\n");
        out.write("\t\t\t\t\t<a href=\"regist.jsp\">注册</a>|\r\n");
        out.write("\t\t\t\t</li>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /menu.jsp(27,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.currentCustomer!=null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<li id=\"headerRegister\" class=\"headerRegister\" style=\"display: list-item;\">\r\n");
        out.write("\t\t\t\t\t<a href=\"\">欢迎你:");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.currentCustomer.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("</a>|\r\n");
        out.write("\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t<li id=\"headerRegister\" class=\"headerRegister\" style=\"display: list-item;\">\r\n");
        out.write("\t\t\t\t\t<a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
        out.write("/customerAction_logout.action\">退出</a>|\r\n");
        out.write("\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /menu.jsp(51,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.currentCustomer!=null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<div class=\"cart\">\r\n");
        out.write("\t\t\t<a  href=\"cat.jsp\">购物车8件</a>\r\n");
        out.write("\t\t</div>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}
