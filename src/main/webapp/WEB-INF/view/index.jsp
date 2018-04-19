<%--
  Created by IntelliJ IDEA.
  User: HuangFuBin
  Date: 2017/9/13
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%
        request.setAttribute("APP_PATH", request.getContextPath());
    %>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${APP_PATH}/static/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${APP_PATH}/static/css/left.css"/>
    <link type="text/css" rel="stylesheet" href="${APP_PATH}/static/css/public.css"/>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
    <!-- 配置文件 -->
    <script type="text/javascript" src="${APP_PATH}/ueditor/ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="${APP_PATH}/ueditor/ueditor.all.js"></script>
    <style type="text/css">
        body {
            font-family: 微软雅黑;
            margin: 0;
            padding: 0;
            /*background-color: #eae6e6;*/
        }

        .top {
            height: 90px;
            width: 100%;
        }

        .bodys {
            height: auto;
            min-height: 800px;
        }

        .bodys .left {
            height: 100%;
            float: left;
        }

        .bodys .content {
            width: 80%;
            min-width: 800px;
            height: 100%;
            margin-left: 25px;
            float: left;
            margin-top: 20px;
        }

        .content_top {
            height: 100px;
            border: solid #00a2d4 2px;
        }

        #myEditor {
            min-height: 400px;
        }
    </style>


</head>
<body>
<div class="top">
    <jsp:include page="../public/top.jsp"/>
</div>
<div class="bodys">
    <div class="left">
        <jsp:include page="../public/left.jsp"/>
    </div>
    <div class="content col-lg-10">
        <div class="top_content">
            <p>博客发布</p>
        </div>
        <form class="form-horizontal" id="formData">
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-1 control-label">标题：</label>
                <div class="col-sm-10">
                    <input type="text" name="blogsTitle" class="form-control" id="inputEmail3" placeholder="标题">
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-1 control-label">类型：</label>
                <div class="col-sm-10">
                    <select name="blogsType" class="form-control">
                        <c:forEach items="${alltype}" var="all">
                            <option value="${all.typeId}">${all.typeName}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-1 control-label">标题：</label>
                <div class="col-sm-10">
                    <select name="blogsCopr" class="form-control">
                        <option value="原创">原创</option>
                        <option value="改编">改编</option>
                        <option value="转发">转发</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-1 control-label">作者：</label>
                <div class="col-sm-10">
                    <input type="text" name="blogBoss" class="form-control" placeholder="作者">
                </div>
            </div>
            <script type="text/plain" id="myEditor" class="myEditor">
            </script>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-1 control-label">导航图：</label>
                <div class="col-sm-10">
                    <br>
                    <input type="file" name="filePath" id="filePath"/>
                </div>
            </div>
            <input type="button" value="发帖" class="blogs_fabu_submit_content">
            <input type="reset" value="清除" class="blogs_fabu_reset_content">
        </form>
    </div>
</div>

<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/js/left.js"></script>

<script type="text/javascript">
    $("#banner_fabu").click(function () {
        hrefWith("${APP_PATH}/banner_fabu");
    });
    $("#banner_chakan").click(function () {
        hrefWith("${APP_PATH}/banner_chakan");
    });
    $("#blogs_chakan").click(function () {
        hrefWith("${APP_PATH}/blogs_chakan");
        to_page(1);
    });
    $("#type_edit").click(function () {
        hrefWith("${APP_PATH}/type_edit");
    });

    function hrefWith(data) {
        $(".content").load(data, function (response, status, xhr) {
            $('.content').html("");
            $('.content').html(response);

        });
    }


    var editor = new baidu.editor.ui.Editor();
    editor.render('myEditor');
    $(".blogs_fabu_submit_content").click(function () {
        //editor.ready(function () {
        var html = editor.getContent();
        /*+"&filePath="+$("form #filePath").val()*/
        var formData = new FormData($("#formData")[0]);
        formData.append("blogsContent", html);
        alert(formData);
        //alert($("#editor_from_f form").serialize()+"&blogsContent=" + html);
        $.ajax({
            url: "${APP_PATH}/indexs",
            type: "POST",
            async: false,
            contentType: false, //必须
            processData: false, //必须
            /*+"&filePath="+formData*/
            /*data: $("#editor_from_f form").serialize() + "&blogsContent=" + html,*/
            data: formData,
            success: function (data) {
                if (data.code == 100) {
                    alert("发布成功");
                    //window.location.reload();
                    //$("form").reset();
                } else {
                    alert("失败");
                }
                //hrefWith("${APP_PATH}/blogs_fabu");
            }
        });
        //});
    });


    function shuaxin() {
        window.location.href("${APP_PATH}/indexss");
    }

</script>
<script type="text/javascript" src="${APP_PATH}/static/js/public.js"></script>
</body>
</html>
