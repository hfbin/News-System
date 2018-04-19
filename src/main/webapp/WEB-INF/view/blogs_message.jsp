<%--
  Created by IntelliJ IDEA.
  User: HuangFuBin
  Date: 2017/9/25
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%
        request.setAttribute("APP_PATH", request.getContextPath());
    %>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
    <title></title>
    <link rel="stylesheet" href="${APP_PATH}/css/info.css" />
</head>
<style type="text/css">
    .textarea-fw{
        color: #ccc;
    }
</style>

<body>
<div class="title">

</div>
<div class="content">

</div>
<div class="replay">
    <!--PC版-->
    <div id="SOHUCS" sid="请将此处替换为配置SourceID的语句"></div>
    <script charset="utf-8" type="text/javascript" src="https://changyan.sohu.com/upload/changyan.js"></script>
    <script type="text/javascript">
        window.changyan.api.config({
            appid: 'cysX5MNF0',
            conf: 'prod_18a31540856aeb49c3dbaca1be06e4d0'
        });
    </script>
</div>
</body>

</html>