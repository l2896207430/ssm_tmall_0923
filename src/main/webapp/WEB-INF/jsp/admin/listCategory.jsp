<!-- 模仿天猫整站ssm 教程 为how2j.cn 版权所有-->
<!-- 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关-->
<!-- 供购买者学习，请勿私自传播，否则自行承担相关法律责任-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<script>
    $(function(){

        $("#addForm").submit(function(){
            if(!checkEmpty("name","分类名称"))
                return false;
            if(!checkEmpty("categoryPic","分类图片"))
                return false;
            return true;
        });
    });

</script>

<title>分类管理</title>
<center>
<div class="workingArea">
    <h1 class="label label-info" >分类管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>图片</th>
                <th>分类名称</th>
                <th>属性管理</th>
                <th>产品管理</th>
                <th>编辑</th>
                <th>删除</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="c">

                <tr>
                    <td>${c.id}</td>
                    <td><img height="40px" src="../img/category/${c.id}.jpg"></td>
                    <td>${c.name}</td>

                    <td><a href="${pageContext.request.contextPath}/admin_property_list/${c.id}"><span class="glyphicon glyphicon-th-list"></span></a></td>
                    <td><a href="${pageContext.request.contextPath}/admin_product_list/${c.id}"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
                    <td><a href="${pageContext.request.contextPath}/admin_category_edit/${c.id}"><span class="glyphicon glyphicon-edit"></span></a></td>
                    <td><a deleteLink="true" href="${pageContext.request.contextPath}/admin_category_delete/${c.id}"><span class="glyphicon glyphicon-trash"></span></a></td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

   <%--  <div class="pageDiv">
        <%@include file="../include/admin/adminPage.jsp" %>
    </div> --%>
    
          总记录数：${totals }&nbsp;&nbsp;
	总页数：${pageCounts }&nbsp;&nbsp;
	当前页：${sp}&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/admin_category_list/1">首页</a>&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/admin_category_list/${sp-1 }">上一页</a>&nbsp;&nbsp;
	<form action="${pageContext.request.contextPath}/admin_category_list" method="post" style="display: inline;">
		<input type="text" name="currentPage" value="${sp }" size="4">
	</form>&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/list/${sp+1 }">下一页</a>&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/list/${pageCounts }">末页</a>
	
    <div class="panel panel-warning addDiv">
        <div class="panel-heading">新增分类</div>
        <div class="panel-body">
            <form method="post" id="addForm" action="admin_category_add/${sp }" enctype="multipart/form-data">
                <table class="addTable">
                    <tr>
                        <td>分类名称</td>
                        <td><input  id="name" name="name" type="text" class="form-control"></td>
                    </tr>
                    <tr>
                        <td>分类圖片</td>
                        <td>
                            <input id="categoryPic" accept="image/*" type="file" name="image" />
                        </td>
                    </tr>
                    <tr class="submitTR">
                        <td colspan="2" align="center">
                            <button type="submit" class="btn btn-success">提 交</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</div>
</center>
<%@include file="../include/admin/adminFooter.jsp"%>