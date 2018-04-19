<%--
  Created by IntelliJ IDEA.
  User: HuangFuBin
  Date: 2017/9/18
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="top_content">
    <p>所有博客</p>
</div>
<div class="row">
    <div class="col-md-12">
        <table class="table table-hover" id="emps_table">
            <thead>
            <tr>
                <th class="col-md-1">
                    <input type="checkbox" id="check_all"/>
                </th>
                <th class="col-md-1">ID</th>
                <th class="col-md-1">标题</th>
                <th class="col-md-2">导航图</th>
                <th class="col-md-1">类型</th>
                <th class="col-md-1">浏览量</th>
                <th class="col-md-3">内容</th>
                <th class="col-md-1">操作</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
    <!-- 显示分页信息 -->
    <div class="row">
        <!--分页文字信息  -->
        <div class="col-md-6" id="page_info_area"></div>
        <!-- 分页条信息 -->
        <div class="col-md-6" id="page_nav_area">

        </div>
    </div>
</div>

</body>
</html>
