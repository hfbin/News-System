<%--
  Created by IntelliJ IDEA.
  User: HuangFuBin
  Date: 2017/9/25
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

    <%
        request.setAttribute("APP_PATH", request.getContextPath());
    %>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
    <title></title>
    <link rel="stylesheet" href="${APP_PATH}/static/css/info.css" />
</head>

<body>
<div class="title">
    ${blogs_info.blogsTitle}
    <br>
    <p style="font-size: 12px; color: #8c8c8c; font-weight: normal ;"> 类型：${blogs_info.blogsTypes.typeName}  发布时间：${blogs_info.blogsData}  浏览量：${blogs_info.blogsPageView}  说明：${blogs_info.blogsCopr}</p>
    <hr>
</div>
<div class="content">
    ${blogs_info.blogsContent}
</div>

</body>

</html>