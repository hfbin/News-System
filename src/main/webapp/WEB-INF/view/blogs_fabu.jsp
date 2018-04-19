<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HuangFuBin
  Date: 2017/9/18
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%
        request.setAttribute("APP_PATH", request.getContextPath());
    %>
    <title>Title</title>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
    <!-- 配置文件 -->
    <script type="text/javascript" src="${APP_PATH}/ueditor/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="${APP_PATH}/ueditor/ueditor.all.js"></script>

    <style type="text/css">
        #editor_from .myEditor {
            min-height: 500px;
            max-width: 1400px;
        }

        #edui1 {
            display: none;
        }
    </style>
</head>
<body>
<div class="top_content">
    <p>博客发布</p>
</div>
<div id="editor_from_f">
    <form method="post">
        <div class="blogs_from_div">
            <p class="blogs_from_p">标题：</p>
            <input name="blogsTitle" class="blogs_i"/>
        </div>
        <div class="blogs_from_div">
            <p class="blogs_from_p">类型：</p>
            <select name="blogsType" class="blogs_i">
                <c:forEach items="${alltype}" var="all">
                    <option value="${all.typeId}">${all.typeName}</option>
                </c:forEach>
            </select>
        </div>
        <div class="blogs_from_div">
            <p class="blogs_from_p">说明：</p>
            <select name="blogsCopr" class="blogs_i">
                <option value="原创">原创</option>
                <option value="改编">改编</option>
                <option value="转发">转发</option>
            </select>
        </div>
        <div class="blogs_from_div">
            <p class="blogs_from_p">作者：</p>
            <input name="blogBoss" class="blogs_i"/>
        </div>
        <script type="text/plain" id="myEditor" class="myEditor">
        </script>
        <input type="file" name="files"/>
        <input type="submit" value="发帖" class="blogs_fabu_submit_content">
        <input type="reset" value="清除" class="blogs_fabu_reset_content">
    </form>
</div>
<script type="text/javascript">
    var editor = new baidu.editor.ui.Editor();
    editor.render('myEditor');
    $(".blogs_fabu_submit_content").click(function () {
        //editor.ready(function () {
        var html = editor.getContent();
        alert("....."+html);
        alert("===="+$("#editor_from_f form").serialize());
        $.ajax({
            url: "${APP_PATH}/blogs",
            type: "post",
            data: $("#editor_from_f form").serialize() + "&blogs_content=" + html,
            success: function (data) {
                alert("返回的数据/n" + data);
                //hrefWith("${APP_PATH}/blogs_fabu");
            }
        });
        //});
    });
</script>
</body>
</html>
