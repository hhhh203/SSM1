/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-04-27 11:51:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>员工列表</title>\r\n");
      out.write("    ");

        pageContext.setAttribute("APP_PATH",request.getContextPath());
    
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/bootstrap-3.3.7-dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"empUpdateModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" >员工修改</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form class=\"form-horizontal\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"empName_add_input\" class=\"col-sm-2 control-label\">empName</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <p class=\"form-control-static\" id=\"empName_update_static\"></p>\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"email_add_input\" class=\"col-sm-2 control-label\">email</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\" id=\"email_update_input\" placeholder=\"email@atguigu.com\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"email_add_input\" class=\"col-sm-2 control-label\">gender</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"gender1_update_input\" value=\"M\" checked=\"checked\"> 男\r\n");
      out.write("                            </label>\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"gender2_update_input\" value=\"F\"> 女\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"email_add_input\" class=\"col-sm-2 control-label\">deptName</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <select class=\"form-control\" name=\"dId\">\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\"id=\"emp_update_btn\">更新</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"empAddModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">员工添加</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form class=\"form-horizontal\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"empName_add_input\" class=\"col-sm-2 control-label\">empName</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"empName\" class=\"form-control\" id=\"empName_add_input\" placeholder=\"empName\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"email_add_input\" class=\"col-sm-2 control-label\">email</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\" id=\"email_add_input\" placeholder=\"email@atguigu.com\">\r\n");
      out.write("                            <span class=\"help-block\"></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"email_add_input\" class=\"col-sm-2 control-label\">gender</label>\r\n");
      out.write("                        <div class=\"col-sm-10\">\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"gender1_add_input\" value=\"M\" checked=\"checked\"> 男\r\n");
      out.write("                            </label>\r\n");
      out.write("                            <label class=\"radio-inline\">\r\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"gender2_add_input\" value=\"F\"> 女\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"email_add_input\" class=\"col-sm-2 control-label\">deptName</label>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <select class=\"form-control\" name=\"dId\" id=\"dept_add_select\">\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\"id=\"emp_save_btn\">保存</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <h1>SSM-CRUD</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-4 col-md-offset-8\">\r\n");
      out.write("            <button class=\"btn btn-primary\" id=\"emp_add_modal_btn\">新增</button>\r\n");
      out.write("            <button class=\"btn btn-danger\" id=\"emp_delete_all_btn\">删除</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <table class=\"table table-hover\" id=\"emps_table\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>\r\n");
      out.write("                        <input type=\"checkbox\" id=\"check_all\"/>\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <th>#</th>\r\n");
      out.write("                    <th>empName</th>\r\n");
      out.write("                    <th>gender</th>\r\n");
      out.write("                    <th>email</th>\r\n");
      out.write("                    <th>deptName</th>\r\n");
      out.write("                    <th>操作</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-6\" id=\"page_info_area\"></div>\r\n");
      out.write("        <div class=\"col-md-6\" id=\"page_nav_area\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    var totalRecord,currenPage;\r\n");
      out.write("    $(function(){\r\n");
      out.write("       to_page(1);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function to_page(pn) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emps\",\r\n");
      out.write("            data:\"pn=\"+pn,\r\n");
      out.write("            type:\"get\",\r\n");
      out.write("            success:function (result) {\r\n");
      out.write("                build_emps_table(result);\r\n");
      out.write("                build_page_info(result);\r\n");
      out.write("                build_page_nav(result);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    function build_emps_table(result) {\r\n");
      out.write("        $(\"#emps_table tbody\").empty();\r\n");
      out.write("        var emps =result.extend.pageInfo.list;\r\n");
      out.write("        $.each(emps,function (index,item) {\r\n");
      out.write("            var checkBoxTd=$(\"<td><input type='checkbox' class='check_item'/></td> \");\r\n");
      out.write("            var empIdTd =$(\"<td></td>\").append(item.empId);\r\n");
      out.write("            var empNameTd =$(\"<td></td>\").append(item.empName);\r\n");
      out.write("            var genderTd =$(\"<td></td>\").append(item.gender=='M'?\"男\":\"女\");\r\n");
      out.write("            var emailTd =$(\"<td></td>\").append(item.email);\r\n");
      out.write("            var deptNameTd =$(\"<td></td>\").append(item.department.deptName);\r\n");
      out.write("            var editbtn=$(\"<button></button>\").addClass(\"btn btn-primary btn-sm edit_btn\").append($(\"<span></span>\")\r\n");
      out.write("                .addClass(\"glyphicon glyphicon-pencil\\\" aria-hidden=\\\"true\").append(\"编辑\"));\r\n");
      out.write("            //为员工添加自定义属性\r\n");
      out.write("            editbtn.attr(\"edit-id\",item.empId);\r\n");
      out.write("            var delbtn=$(\"<button></button>\").addClass(\"btn btn-danger btn-sm delete_btn\").append($(\"<span></span>\")\r\n");
      out.write("                .addClass(\"glyphicon glyphicon-trash\\\" aria-hidden=\\\"true\").append(\"删除\"));\r\n");
      out.write("            delbtn.attr(\"del-id\",item.empId)\r\n");
      out.write("            var btnTd =$(\"<td></td>\").append(editbtn).append(\" \").append(delbtn);\r\n");
      out.write("            $(\"<tr></tr>\").append(checkBoxTd)\r\n");
      out.write("                .append(empIdTd)\r\n");
      out.write("                .append(empNameTd)\r\n");
      out.write("                .append(genderTd)\r\n");
      out.write("                .append(emailTd)\r\n");
      out.write("                .append(deptNameTd)\r\n");
      out.write("                .append(btnTd)\r\n");
      out.write("                .appendTo(\"#emps_table tbody\");\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    //解析显示分页信息\r\n");
      out.write("    function build_page_info(result) {\r\n");
      out.write("        $(\"#page_info_area\").empty();\r\n");
      out.write("        $(\"#page_info_area\").append(\"当前\"+result.extend.pageInfo.pageNum+\r\n");
      out.write("            \"页,总\"+result.extend.pageInfo.pages+\"页,总\"\r\n");
      out.write("            +result.extend.pageInfo.total+\"记录数\");\r\n");
      out.write("        totalRecord = result.extend.pageInfo.total;\r\n");
      out.write("        currenPage = result.extend.pageInfo.pageNum;\r\n");
      out.write("    }\r\n");
      out.write("    //解析显示分页条信息\r\n");
      out.write("    function build_page_nav(result) {\r\n");
      out.write("        $(\"#page_nav_area\").empty();\r\n");
      out.write("        var ul = $(\"<ul></ul>\").addClass(\"pagination\");\r\n");
      out.write("        var firstPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"首页\").attr(\"href\",\"#\"));\r\n");
      out.write("        var prePageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&laquo;\"));\r\n");
      out.write("        if(result.extend.pageInfo.hasPreviousPage == false){\r\n");
      out.write("            firstPageLi.addClass(\"disabled\");\r\n");
      out.write("            prePageLi.addClass(\"disabled\");\r\n");
      out.write("        }else{\r\n");
      out.write("            //为元素添加点击翻页的事件\r\n");
      out.write("            firstPageLi.click(function(){\r\n");
      out.write("                to_page(1);\r\n");
      out.write("            });\r\n");
      out.write("            prePageLi.click(function(){\r\n");
      out.write("                to_page(result.extend.pageInfo.pageNum -1);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        var nextPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"&raquo;\"));\r\n");
      out.write("        var lastPageLi = $(\"<li></li>\").append($(\"<a></a>\").append(\"末页\").attr(\"href\",\"#\"));\r\n");
      out.write("        if(result.extend.pageInfo.hasNextPage == false){\r\n");
      out.write("            nextPageLi.addClass(\"disabled\");\r\n");
      out.write("            lastPageLi.addClass(\"disabled\");\r\n");
      out.write("        }else{\r\n");
      out.write("            nextPageLi.click(function(){\r\n");
      out.write("                to_page(result.extend.pageInfo.pageNum +1);\r\n");
      out.write("            });\r\n");
      out.write("            lastPageLi.click(function(){\r\n");
      out.write("                to_page(result.extend.pageInfo.pages);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("        ul.append(firstPageLi).append(prePageLi);\r\n");
      out.write("        $.each(result.extend.pageInfo.navigatepageNums,function(index,item){\r\n");
      out.write("            var numLi = $(\"<li></li>\").append($(\"<a></a>\").append(item));\r\n");
      out.write("            if(result.extend.pageInfo.pageNum == item){\r\n");
      out.write("                numLi.addClass(\"active\");\r\n");
      out.write("            }\r\n");
      out.write("            numLi.click(function(){\r\n");
      out.write("                to_page(item);\r\n");
      out.write("            });\r\n");
      out.write("            ul.append(numLi);\r\n");
      out.write("        });\r\n");
      out.write("        ul.append(nextPageLi).append(lastPageLi);\r\n");
      out.write("        var navEle = $(\"<nav></nav>\").append(ul);\r\n");
      out.write("        navEle.appendTo(\"#page_nav_area\");\r\n");
      out.write("    }\r\n");
      out.write("    function reset_form(ele){\r\n");
      out.write("        $(ele)[0].reset();\r\n");
      out.write("        //清空表单样式\r\n");
      out.write("        $(ele).find(\"*\").removeClass(\"has-error has-success\");\r\n");
      out.write("        $(ele).find(\".help-block\").text(\"\");\r\n");
      out.write("    }\r\n");
      out.write("    $(\"#emp_add_modal_btn\").click(function () {\r\n");
      out.write("        //清除表单数据\r\n");
      out.write("        reset_form(\"#empAddModal form\");\r\n");
      out.write("        getDepts(\"#dept_add_select\");\r\n");
      out.write("        $(\"#empAddModal\").modal({\r\n");
      out.write("            backdrop:\"static\"\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function getDepts(ele) {\r\n");
      out.write("        $(ele).empty();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/depts\",\r\n");
      out.write("            type: \"GET\",\r\n");
      out.write("            success:function (result) {\r\n");
      out.write("               // $(\"#dept_add_select\").append()\r\n");
      out.write("                $.each(result.extend.depts,function () {\r\n");
      out.write("                    var optionEle = $(\"<option></option>\").append(this.deptName).attr(\"value\",this.deptId);\r\n");
      out.write("                    optionEle.appendTo(ele)\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    //校验表单数据\r\n");
      out.write("    function validate_add_form(){\r\n");
      out.write("        //拿到要校验的数据\r\n");
      out.write("       var empName = $(\"#empName_add_input\").val();\r\n");
      out.write("       var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5})/;\r\n");
      out.write("       if(!regName.test(empName)){\r\n");
      out.write("           // alert(\"用户名可以是2-5为中文或者6-16位英文和数字的组合\");\r\n");
      out.write("           show_vaildate_msg(\"#empName_add_input\",\"error\",\"用户名可以是2-5为中文或者6-16位英文和数字的组合\");\r\n");
      out.write("           return false;\r\n");
      out.write("       }else {\r\n");
      out.write("           show_vaildate_msg(\"#empName_add_input\",\"success\",\"\")\r\n");
      out.write("       }\r\n");
      out.write("       var email =$(\"#email_add_input\").val();\r\n");
      out.write("       var regEmail = /^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\r\n");
      out.write("       if(!regEmail.test(email)){\r\n");
      out.write("           // alert(\"邮箱格式不正确\");\r\n");
      out.write("           show_vaildate_msg(\"#email_add_input\",\"error\",\"邮箱格式不正确\");\r\n");
      out.write("           // $(\"#email_add_input\").parent().addClass(\"has-error\");\r\n");
      out.write("           // $(\"#email_add_input\").next(\"span\").text(\"邮箱格式不正确\");\r\n");
      out.write("           return false;\r\n");
      out.write("       }else {\r\n");
      out.write("           show_vaildate_msg(\"#email_add_input\",\"success\",\"\");\r\n");
      out.write("           // $(\"#email_add_input\").parent().addClass(\"has-success\");\r\n");
      out.write("           // $(\"#email_add_input\").next(\"span\").text(\"\");\r\n");
      out.write("       }\r\n");
      out.write("       return true;\r\n");
      out.write("    }\r\n");
      out.write("    //显示校验信息\r\n");
      out.write("    function show_vaildate_msg(ele,status,msg){\r\n");
      out.write("        $(ele).parent().removeClass(\"has-success hsa-error\");\r\n");
      out.write("        $(ele).next(\"span\").text(\"\");\r\n");
      out.write("        if(\"success\"==status){\r\n");
      out.write("            $(ele).parent().addClass(\"has-success\");\r\n");
      out.write("            $(ele).next(\"span\").text(msg);\r\n");
      out.write("\r\n");
      out.write("        }else if(\"error\"==status){\r\n");
      out.write("            $(ele).parent().addClass(\"has-error\");\r\n");
      out.write("            $(ele).next(\"span\").text(msg);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    $(\"#empName_add_input\").change(function () {\r\n");
      out.write("        var empName =this.value;\r\n");
      out.write("        $.ajax({\r\n");
      out.write("          url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkuser\",\r\n");
      out.write("            data:\"empName=\"+empName,\r\n");
      out.write("            type:\"POST\",\r\n");
      out.write("            success:function (result) {\r\n");
      out.write("              if(result.code==100){\r\n");
      out.write("                  show_vaildate_msg(\"#empName_add_input\",\"success\",\"用户名可用\");\r\n");
      out.write("                  $(\"#emp_save_btn\").attr(\"ajax-va\",\"success\");\r\n");
      out.write("              }else {\r\n");
      out.write("                  show_vaildate_msg(\"#empName_add_input\",\"error\",result.extend.va_msg);\r\n");
      out.write("                  $(\"#emp_save_btn\").attr(\"ajax-va\",\"error\");\r\n");
      out.write("              }\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(\"#emp_save_btn\").click(function () {\r\n");
      out.write("        /*alert($(\"#empAddModal form\").serialize());*/\r\n");
      out.write("\r\n");
      out.write("        //先对提交给服务器的数据进行校验\r\n");
      out.write("        if(!validate_add_form()){\r\n");
      out.write("           return false;\r\n");
      out.write("        }\r\n");
      out.write("        if ($(this).attr(\"ajax-va\")==\"error\"){\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("        $.ajax({\r\n");
      out.write("           url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp\",\r\n");
      out.write("           type:\"POST\",\r\n");
      out.write("           data: $(\"#empAddModal form\").serialize(),\r\n");
      out.write("            success:function (result) {\r\n");
      out.write("               if(result.code==100)\r\n");
      out.write("               {\r\n");
      out.write("                   $(\"#empAddModal\").modal(\"hide\");\r\n");
      out.write("                   to_page(totalRecord);\r\n");
      out.write("               }else {\r\n");
      out.write("                   if (undefined!=result.extend.errorFields.email){\r\n");
      out.write("                       show_vaildate_msg(\"#email_add_input\",\"error\",result.extend.errorFields.email)\r\n");
      out.write("                   }\r\n");
      out.write("                   if (undefined!=result.extend.errorFields.empName){\r\n");
      out.write("                       show_vaildate_msg(\"#empName_add_input\",\"error\",result.extend.errorFields.empName)\r\n");
      out.write("                   }\r\n");
      out.write("               }\r\n");
      out.write("            }\r\n");
      out.write("       })\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(document).on(\"click\",\".edit_btn\",function () {\r\n");
      out.write("        getDepts(\"#empUpdateModal select\");\r\n");
      out.write("        getEmp($(this).attr(\"edit-id\"));\r\n");
      out.write("        $(\"#emp_update_btn\").attr(\"edit-id\",$(this).attr(\"edit-id\"));\r\n");
      out.write("        $(\"#empUpdateModal\").modal({\r\n");
      out.write("            backdrop:\"static\"\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    function getEmp(id) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\"+id,\r\n");
      out.write("            type:\"GET\",\r\n");
      out.write("            success:function (result) {\r\n");
      out.write("                var empData=result.extend.emp;\r\n");
      out.write("                // console.log(result)\r\n");
      out.write("                $(\"#empName_update_static\").text(empData.empName);\r\n");
      out.write("                $(\"#email_update_input\").val(empData.email);\r\n");
      out.write("                $(\"#empUpdateModal input[name=gender]\").val([empData.gender]);\r\n");
      out.write("                $(\"#empUpdateModal select\").val([empData.dId]);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    $(\"#emp_update_btn\").click(function () {\r\n");
      out.write("        var email =$(\"#email_update_input\").val();\r\n");
      out.write("        var regEmail = /^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$/;\r\n");
      out.write("        if(!regEmail.test(email)){\r\n");
      out.write("            show_vaildate_msg(\"#email_add_input\",\"error\",\"邮箱格式不正确\");\r\n");
      out.write("            return false;\r\n");
      out.write("        }else {\r\n");
      out.write("            show_vaildate_msg(\"#email_add_input\",\"success\",\"\");\r\n");
      out.write("        }\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\"+$(this).attr(\"edit-id\"),\r\n");
      out.write("            type:\"PUT\",\r\n");
      out.write("            data:$(\"#empUpdateModal form\").serialize(),\r\n");
      out.write("            success:function (result) {\r\n");
      out.write("                $(\"#empUpdateModal\").modal(\"hide\");\r\n");
      out.write("                to_page(currenPage);\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    });\r\n");
      out.write("    $(document).on(\"click\",\".delete_btn\",function () {\r\n");
      out.write("            var empName =$(this).parents(\"tr\").find(\"td:eq(2)\").text();\r\n");
      out.write("            var empId=$(this).attr(\"del-id\")\r\n");
      out.write("       // alert($(this).parents(\"tr\").find(\"td:eq(1)\").text());\r\n");
      out.write("            if(confirm(\"确认删除【\"+empName+\"】吗？\")){\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\"+empId,\r\n");
      out.write("                    type:\"DELETE\",\r\n");
      out.write("                    success:function (result) {\r\n");
      out.write("                        to_page(currenPage);\r\n");
      out.write("                    }\r\n");
      out.write("                })\r\n");
      out.write("            }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $(\"#check_all\").click(function () {\r\n");
      out.write("        // alert($(this).prop(\"checked\"))\r\n");
      out.write("        // $(this).prop(\"checked\");\r\n");
      out.write("        $(\".check_item\").prop(\"checked\",$(this).prop(\"checked\"));\r\n");
      out.write("\r\n");
      out.write("    })\r\n");
      out.write("    $(document).on(\"click\",\".check_item\",function () {\r\n");
      out.write("        var  flag =  $(\".check_item:checked\").length == $(\".check_item\").length ;\r\n");
      out.write("       $(\"#check_all\").prop(\"checked\",flag);\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#emp_delete_all_btn\").click(function () {\r\n");
      out.write("        var empNames =\"\";\r\n");
      out.write("        var del_idstr=\"\";\r\n");
      out.write("        $.each($(\".check_item:checked\"),function () {\r\n");
      out.write("            empNames+= $(this).parents(\"tr\").find(\"td:eq(2)\").text()+\",\";\r\n");
      out.write("            del_idstr+=$(this).parents(\"tr\").find(\"td:eq(1)\").text()+\"-\";\r\n");
      out.write("        });\r\n");
      out.write("        empNames=empNames.substring(0,empNames.length-1);\r\n");
      out.write("        del_idstr=del_idstr.substring(0,del_idstr.length-1);\r\n");
      out.write("        if (confirm(\"确认删除【\"+ empNames+\"】吗？\")){\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${APP_PATH}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/emp/\"+del_idstr,\r\n");
      out.write("                type:\"DELETE\",\r\n");
      out.write("                success:function (result) {\r\n");
      out.write("                    alert(result.msg);\r\n");
      out.write("                    to_page(currenPage);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
