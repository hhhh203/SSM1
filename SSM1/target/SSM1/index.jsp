<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>员工列表</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<%--更新员工信息的模态框--%>
<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" >员工修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="empName_add_input" class="col-sm-2 control-label">empName</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="empName_update_static"></p>
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email_add_input" class="col-sm-2 control-label">email</label>
                        <div class="col-sm-10">
                            <input type="text" name="email" class="form-control" id="email_update_input" placeholder="email@atguigu.com">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email_add_input" class="col-sm-2 control-label">gender</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender1_update_input" value="M" checked="checked"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender2_update_input" value="F"> 女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email_add_input" class="col-sm-2 control-label">deptName</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="dId">
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary"id="emp_update_btn">更新</button>
            </div>
        </div>
    </div>
</div>
<%--员工添加模态框--%>
<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">员工添加</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="empName_add_input" class="col-sm-2 control-label">empName</label>
                        <div class="col-sm-10">
                            <input type="text" name="empName" class="form-control" id="empName_add_input" placeholder="empName">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email_add_input" class="col-sm-2 control-label">email</label>
                        <div class="col-sm-10">
                            <input type="text" name="email" class="form-control" id="email_add_input" placeholder="email@atguigu.com">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email_add_input" class="col-sm-2 control-label">gender</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender1_add_input" value="M" checked="checked"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender2_add_input" value="F"> 女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="email_add_input" class="col-sm-2 control-label">deptName</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="dId" id="dept_add_select">
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary"id="emp_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>

<%--搭建显示页面--%>
<div class="container">
    <%--标题--%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <%-- 按钮 --%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
            <button class="btn btn-danger" id="emp_delete_all_btn">删除</button>
        </div>
    </div>
    <%--显示表格数据--%>
    <div class="row">
        <table class="table table-hover" id="emps_table">
            <thead>
                <tr>
                    <th>
                        <input type="checkbox" id="check_all"/>
                    </th>
                    <th>#</th>
                    <th>empName</th>
                    <th>gender</th>
                    <th>email</th>
                    <th>deptName</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
    <%--显示分页信息--%>
    <div class="row">
        <div class="col-md-6" id="page_info_area"></div>
        <div class="col-md-6" id="page_nav_area"></div>
    </div>
</div>
<script type="text/javascript">
    var totalRecord,currenPage;
    $(function(){
       to_page(1);
    });

    function to_page(pn) {
        $.ajax({
            url:"${APP_PATH}/emps",
            data:"pn="+pn,
            type:"get",
            success:function (result) {
                build_emps_table(result);
                build_page_info(result);
                build_page_nav(result);
            }
        });
    }
    function build_emps_table(result) {
        $("#emps_table tbody").empty();
        var emps =result.extend.pageInfo.list;
        $.each(emps,function (index,item) {
            var checkBoxTd=$("<td><input type='checkbox' class='check_item'/></td> ");
            var empIdTd =$("<td></td>").append(item.empId);
            var empNameTd =$("<td></td>").append(item.empName);
            var genderTd =$("<td></td>").append(item.gender=='M'?"男":"女");
            var emailTd =$("<td></td>").append(item.email);
            var deptNameTd =$("<td></td>").append(item.department.deptName);
            var editbtn=$("<button></button>").addClass("btn btn-primary btn-sm edit_btn").append($("<span></span>")
                .addClass("glyphicon glyphicon-pencil\" aria-hidden=\"true").append("编辑"));
            //为员工添加自定义属性
            editbtn.attr("edit-id",item.empId);
            var delbtn=$("<button></button>").addClass("btn btn-danger btn-sm delete_btn").append($("<span></span>")
                .addClass("glyphicon glyphicon-trash\" aria-hidden=\"true").append("删除"));
            delbtn.attr("del-id",item.empId)
            var btnTd =$("<td></td>").append(editbtn).append(" ").append(delbtn);
            $("<tr></tr>").append(checkBoxTd)
                .append(empIdTd)
                .append(empNameTd)
                .append(genderTd)
                .append(emailTd)
                .append(deptNameTd)
                .append(btnTd)
                .appendTo("#emps_table tbody");
        });
    }
    //解析显示分页信息
    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+
            "页,总"+result.extend.pageInfo.pages+"页,总"
            +result.extend.pageInfo.total+"记录数");
        totalRecord = result.extend.pageInfo.total;
        currenPage = result.extend.pageInfo.pageNum;
    }
    //解析显示分页条信息
    function build_page_nav(result) {
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        if(result.extend.pageInfo.hasPreviousPage == false){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else{
            //为元素添加点击翻页的事件
            firstPageLi.click(function(){
                to_page(1);
            });
            prePageLi.click(function(){
                to_page(result.extend.pageInfo.pageNum -1);
            });
        }
        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        if(result.extend.pageInfo.hasNextPage == false){
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else{
            nextPageLi.click(function(){
                to_page(result.extend.pageInfo.pageNum +1);
            });
            lastPageLi.click(function(){
                to_page(result.extend.pageInfo.pages);
            });
        }
        ul.append(firstPageLi).append(prePageLi);
        $.each(result.extend.pageInfo.navigatepageNums,function(index,item){
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if(result.extend.pageInfo.pageNum == item){
                numLi.addClass("active");
            }
            numLi.click(function(){
                to_page(item);
            });
            ul.append(numLi);
        });
        ul.append(nextPageLi).append(lastPageLi);
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }
    function reset_form(ele){
        $(ele)[0].reset();
        //清空表单样式
        $(ele).find("*").removeClass("has-error has-success");
        $(ele).find(".help-block").text("");
    }
    $("#emp_add_modal_btn").click(function () {
        //清除表单数据
        reset_form("#empAddModal form");
        getDepts("#dept_add_select");
        $("#empAddModal").modal({
            backdrop:"static"
        });
    });

    function getDepts(ele) {
        $(ele).empty();
        $.ajax({
            url:"${APP_PATH}/depts",
            type: "GET",
            success:function (result) {
               // $("#dept_add_select").append()
                $.each(result.extend.depts,function () {
                    var optionEle = $("<option></option>").append(this.deptName).attr("value",this.deptId);
                    optionEle.appendTo(ele)
                })
            }
        })
    }

    //校验表单数据
    function validate_add_form(){
        //拿到要校验的数据
       var empName = $("#empName_add_input").val();
       var regName = /(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
       if(!regName.test(empName)){
           // alert("用户名可以是2-5为中文或者6-16位英文和数字的组合");
           show_vaildate_msg("#empName_add_input","error","用户名可以是2-5为中文或者6-16位英文和数字的组合");
           return false;
       }else {
           show_vaildate_msg("#empName_add_input","success","")
       }
       var email =$("#email_add_input").val();
       var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
       if(!regEmail.test(email)){
           // alert("邮箱格式不正确");
           show_vaildate_msg("#email_add_input","error","邮箱格式不正确");
           // $("#email_add_input").parent().addClass("has-error");
           // $("#email_add_input").next("span").text("邮箱格式不正确");
           return false;
       }else {
           show_vaildate_msg("#email_add_input","success","");
           // $("#email_add_input").parent().addClass("has-success");
           // $("#email_add_input").next("span").text("");
       }
       return true;
    }
    //显示校验信息
    function show_vaildate_msg(ele,status,msg){
        $(ele).parent().removeClass("has-success hsa-error");
        $(ele).next("span").text("");
        if("success"==status){
            $(ele).parent().addClass("has-success");
            $(ele).next("span").text(msg);

        }else if("error"==status){
            $(ele).parent().addClass("has-error");
            $(ele).next("span").text(msg);
        }
    }
    $("#empName_add_input").change(function () {
        var empName =this.value;
        $.ajax({
          url:"${APP_PATH}/checkuser",
            data:"empName="+empName,
            type:"POST",
            success:function (result) {
              if(result.code==100){
                  show_vaildate_msg("#empName_add_input","success","用户名可用");
                  $("#emp_save_btn").attr("ajax-va","success");
              }else {
                  show_vaildate_msg("#empName_add_input","error",result.extend.va_msg);
                  $("#emp_save_btn").attr("ajax-va","error");
              }
            }
        })
    });

    $("#emp_save_btn").click(function () {
        /*alert($("#empAddModal form").serialize());*/

        //先对提交给服务器的数据进行校验
        if(!validate_add_form()){
           return false;
        }
        if ($(this).attr("ajax-va")=="error"){
            return false;
        }
        $.ajax({
           url:"${APP_PATH}/emp",
           type:"POST",
           data: $("#empAddModal form").serialize(),
            success:function (result) {
               if(result.code==100)
               {
                   $("#empAddModal").modal("hide");
                   to_page(totalRecord);
               }else {
                   if (undefined!=result.extend.errorFields.email){
                       show_vaildate_msg("#email_add_input","error",result.extend.errorFields.email)
                   }
                   if (undefined!=result.extend.errorFields.empName){
                       show_vaildate_msg("#empName_add_input","error",result.extend.errorFields.empName)
                   }
               }
            }
       })
    });

    $(document).on("click",".edit_btn",function () {
        getDepts("#empUpdateModal select");
        getEmp($(this).attr("edit-id"));
        $("#emp_update_btn").attr("edit-id",$(this).attr("edit-id"));
        $("#empUpdateModal").modal({
            backdrop:"static"
        });
    });
    function getEmp(id) {
        $.ajax({
            url:"${APP_PATH}/emp/"+id,
            type:"GET",
            success:function (result) {
                var empData=result.extend.emp;
                // console.log(result)
                $("#empName_update_static").text(empData.empName);
                $("#email_update_input").val(empData.email);
                $("#empUpdateModal input[name=gender]").val([empData.gender]);
                $("#empUpdateModal select").val([empData.dId]);
            }
        })
    }
    $("#emp_update_btn").click(function () {
        var email =$("#email_update_input").val();
        var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
        if(!regEmail.test(email)){
            show_vaildate_msg("#email_add_input","error","邮箱格式不正确");
            return false;
        }else {
            show_vaildate_msg("#email_add_input","success","");
        }
        $.ajax({
            url:"${APP_PATH}/emp/"+$(this).attr("edit-id"),
            type:"PUT",
            data:$("#empUpdateModal form").serialize(),
            success:function (result) {
                $("#empUpdateModal").modal("hide");
                to_page(currenPage);
            }
        })
    });
    $(document).on("click",".delete_btn",function () {
            var empName =$(this).parents("tr").find("td:eq(2)").text();
            var empId=$(this).attr("del-id")
       // alert($(this).parents("tr").find("td:eq(1)").text());
            if(confirm("确认删除【"+empName+"】吗？")){
                $.ajax({
                    url:"${APP_PATH}/emp/"+empId,
                    type:"DELETE",
                    success:function (result) {
                        to_page(currenPage);
                    }
                })
            }
    });

    $("#check_all").click(function () {
        // alert($(this).prop("checked"))
        // $(this).prop("checked");
        $(".check_item").prop("checked",$(this).prop("checked"));

    })
    $(document).on("click",".check_item",function () {
        var  flag =  $(".check_item:checked").length == $(".check_item").length ;
       $("#check_all").prop("checked",flag);
    });
    $("#emp_delete_all_btn").click(function () {
        var empNames ="";
        var del_idstr="";
        $.each($(".check_item:checked"),function () {
            empNames+= $(this).parents("tr").find("td:eq(2)").text()+",";
            del_idstr+=$(this).parents("tr").find("td:eq(1)").text()+"-";
        });
        empNames=empNames.substring(0,empNames.length-1);
        del_idstr=del_idstr.substring(0,del_idstr.length-1);
        if (confirm("确认删除【"+ empNames+"】吗？")){
            $.ajax({
                url:"${APP_PATH}/emp/"+del_idstr,
                type:"DELETE",
                success:function (result) {
                    alert(result.msg);
                    to_page(currenPage);
                }
            });
        }
    });
</script>
</body>
</html>

