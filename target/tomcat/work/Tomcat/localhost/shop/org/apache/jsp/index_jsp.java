/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-08 01:43:51 UTC
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

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>传智商城</title>\r\n");
      out.write("<link href=\"./css/slider.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./css/common.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"./css/index.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.tools.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.lazyload.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/slider.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/common.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\t<div class=\"container index\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"span24\">\r\n");
      out.write("\t\t\t<div id=\"hotProduct\" class=\"hotProduct clearfix\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t<strong>热门商品</strong>\r\n");
      out.write("\t\t\t\t\t<!-- <a  target=\"_blank\"></a> -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"tab\">\r\n");
      out.write("\t\t\t\t\t<li class=\"current\"><a href=\"./蔬菜分类.htm?tagIds=1\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"_blank\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t\t<div class=\"hotProductAd\">\r\n");
      out.write("\t\t\t<img src=\"./image/a.jpg\" width=\"260\" height=\"343\" alt=\"热门商品\" title=\"热门商品\">\r\n");
      out.write("</div> -->\r\n");
      out.write("\t\t\t\t<ul class=\"tabContent\" style=\"display: block;\">\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/b.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/0ff130db-0a1b-4b8d-a918-ed9016317009-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/c.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/51afeef5-f6cb-4936-abea-315cfca0edc0-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/d.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/e.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/f.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/g.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/h.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/i.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/i.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/i.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"tabContent\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/c5b1b396-181a-4805-9e68-9b400d71f91e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/c5b1b396-181a-4805-9e68-9b400d71f91e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/4107e1ce-5e7c-4941-bc0f-718f35ba14cd-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/4107e1ce-5e7c-4941-bc0f-718f35ba14cd-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/6f8ae4bf-cbd3-41c7-aa22-0fe81db6add4-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/6f8ae4bf-cbd3-41c7-aa22-0fe81db6add4-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/3d835c07-08c5-46d7-912d-adcd41f8c8e6-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/3d835c07-08c5-46d7-912d-adcd41f8c8e6-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/5e5be432-fbee-4bdd-a7bd-a92e01f9bfc4-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/5e5be432-fbee-4bdd-a7bd-a92e01f9bfc4-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/cae1bc6b-0159-4ce0-9a9c-4926df231b4f-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/cae1bc6b-0159-4ce0-9a9c-4926df231b4f-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/40e34b2d-d240-446e-9874-89969edbe89f-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/40e34b2d-d240-446e-9874-89969edbe89f-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/a8db4410-05e5-4dfa-8217-eb885a104af3-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/a8db4410-05e5-4dfa-8217-eb885a104af3-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"tabContent\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/9f164e13-bcaa-48a6-9b35-0ca96629f614-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/9f164e13-bcaa-48a6-9b35-0ca96629f614-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/c41d0347-364c-42bb-baeb-25142c1ed167-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/c41d0347-364c-42bb-baeb-25142c1ed167-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/2af8be8a-75b9-41ae-b009-a7c54b685a4e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/2af8be8a-75b9-41ae-b009-a7c54b685a4e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/1a3ad7de-7ee9-4530-b89a-46375219beb5-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/1a3ad7de-7ee9-4530-b89a-46375219beb5-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/ea566af4-0cdb-4017-a8c7-27e407794204-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/ea566af4-0cdb-4017-a8c7-27e407794204-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/dea31d42-fa3e-4b69-a631-51ca7c79f032-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/dea31d42-fa3e-4b69-a631-51ca7c79f032-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/1c81f492-a3d7-4c06-8658-bc2c76808cd3-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/1c81f492-a3d7-4c06-8658-bc2c76808cd3-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/f1174ca6-6bdf-4d0b-86e6-5455bc8e89ad-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/f1174ca6-6bdf-4d0b-86e6-5455bc8e89ad-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span24\">\r\n");
      out.write("\t\t\t<div id=\"newProduct\" class=\"newProduct clearfix\">\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t<strong>最新商品</strong> <a target=\"_blank\"></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"tab\">\r\n");
      out.write("\t\t\t\t\t<li class=\"current\"><a href=\"./蔬菜分类.htm?tagIds=2\"\r\n");
      out.write("\t\t\t\t\t\ttarget=\"_blank\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- \t\t\t\t\t<div class=\"newProductAd\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"./image/q.jpg\" width=\"260\" height=\"343\" alt=\"最新商品\" title=\"最新商品\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t<ul class=\"tabContent\" style=\"display: block;\">\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/l.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/4a51167a-89d5-4710-aca2-7c76edc355b8-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/m.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/n.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/o.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/p.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/m.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/15.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a>\r\n");
      out.write("\t\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/l.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/b499fb5e-999f-431b-a375-172ee09e4a3e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"display: block;\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/l.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/b499fb5e-999f-431b-a375-172ee09e4a3e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"display: block;\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a target=\"_blank\"><img src=\"./image/l.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/b499fb5e-999f-431b-a375-172ee09e4a3e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"display: block;\" /></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"tabContent\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/b04a22f5-267d-4e33-ac58-dda941eeaf84-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/b04a22f5-267d-4e33-ac58-dda941eeaf84-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/ca3043f5-dbb0-4a03-9bb6-8274f78b5d7e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/ca3043f5-dbb0-4a03-9bb6-8274f78b5d7e-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/a2ac0816-37e4-477a-b179-e64f71252cf5-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/a2ac0816-37e4-477a-b179-e64f71252cf5-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/fbb80ec8-a1d3-49de-b83b-79eae4b1ff69-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/fbb80ec8-a1d3-49de-b83b-79eae4b1ff69-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/bb99deac-0b33-48f1-a3ad-e8310516be07-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/bb99deac-0b33-48f1-a3ad-e8310516be07-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/7b3c0647-1016-4d13-8b84-4d63818e1179-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/7b3c0647-1016-4d13-8b84-4d63818e1179-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/3c79f82f-f136-48aa-9e81-7e10fbb3de2a-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/3c79f82f-f136-48aa-9e81-7e10fbb3de2a-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/b998f840-91fc-41b6-b73d-70587babf760-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/b998f840-91fc-41b6-b73d-70587babf760-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<ul class=\"tabContent\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/9f164e13-bcaa-48a6-9b35-0ca96629f614-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/9f164e13-bcaa-48a6-9b35-0ca96629f614-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/1a3ad7de-7ee9-4530-b89a-46375219beb5-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/1a3ad7de-7ee9-4530-b89a-46375219beb5-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/7acae4ac-5909-4142-8b20-19c5462859d6-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/7acae4ac-5909-4142-8b20-19c5462859d6-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/ea566af4-0cdb-4017-a8c7-27e407794204-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/ea566af4-0cdb-4017-a8c7-27e407794204-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/dea31d42-fa3e-4b69-a631-51ca7c79f032-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/dea31d42-fa3e-4b69-a631-51ca7c79f032-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/1c81f492-a3d7-4c06-8658-bc2c76808cd3-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/1c81f492-a3d7-4c06-8658-bc2c76808cd3-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/f1174ca6-6bdf-4d0b-86e6-5455bc8e89ad-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/f1174ca6-6bdf-4d0b-86e6-5455bc8e89ad-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./Mango商城 - Powered By Mango Team_files/2971c96e-9f11-4491-9faf-9ea7e1fec53c-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-original=\"http://storage.shopxx.net/demo-image/3.0/201301/2971c96e-9f11-4491-9faf-9ea7e1fec53c-thumbnail.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"display: block;\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"span24\">\r\n");
      out.write("\t\t\t<div class=\"friendLink\">\r\n");
      out.write("\t\t\t\t<dl>\r\n");
      out.write("\t\t\t\t\t<dt>新手指南</dt>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\">支付方式</a> |\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\">配送方式</a> |\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\">售后服务</a> |\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\">购物帮助</a> |\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\">蔬菜卡</a> |\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\">礼品卡</a> |\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\">银联卡</a> |\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t<a target=\"_blank\">亿家卡</a> |\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<dd class=\"more\">\r\n");
      out.write("\t\t\t\t\t\t<a>更多</a>\r\n");
      out.write("\t\t\t\t\t</dd>\r\n");
      out.write("\t\t\t\t</dl>\r\n");
      out.write("\t\t\t</div>\r\n");
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
