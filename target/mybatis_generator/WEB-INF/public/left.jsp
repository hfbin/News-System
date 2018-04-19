<%--
  Created by IntelliJ IDEA.
  User: HuangFuBin
  Date: 2017/9/18
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <head>
        <%
            request.setAttribute("APP_PATH", request.getContextPath());
        %>
        <meta charset="utf-8"/>
        <title></title>

    </head>
<body>
<div id="all">
    <div id="divFrame_music">
        <div class="music">
            <img src="${APP_PATH}/static/img/coin02.png" class="left_img"/>
            <h3>博客发布</h3>
            <span hidden="true">close</span>
        </div>
        <div class="music_div" style="display: none;">
            <ul class="music_ul">
                <a href="${APP_PATH}/indexss" id="blogs_fabu">
                    <li><img src="${APP_PATH}/static/img/coin222.png" class="left_image"/>发布</li>
                </a>
                <a href="#" id="blogs_chakan">
                    <li><img src="${APP_PATH}/static/img/coin222.png" class="left_image"/>查看</li>
                </a>
            </ul>
        </div>
    </div>
    <div id="divFrame_book">
        <div class="book">
            <img src="${APP_PATH}/static/img/coin02.png" class="left_img"/>
            <h3>轮播图管理</h3>
            <span hidden="true">close</span>
        </div>
        <div class="book_div" style="display: none;">
            <ul class="book_ul">
                <a href="#" id="banner_fabu">
                    <li><img src="${APP_PATH}/static/img/coin222.png" class="left_image"/>发布</li>
                </a>
                <a href="#" id="banner_chakan">
                    <li><img src="${APP_PATH}/static/img/coin222.png" class="left_image"/>查看</li>
                </a>
            </ul>
        </div>
    </div>

    <div id="divFrame_sport">
        <div class="sport">
            <img src="${APP_PATH}/static/img/coin04.png" class="left_img"/>
            <h3>分类管理</h3>
            <span hidden="true">close</span>
        </div>
        <div class="sport_div" style="display: none;">
            <ul class="sport_ul">
                <a href="#" id="type_edit">
                    <li><img src="${APP_PATH}/static/img/coin222.png" class="left_image"/>编辑</li>
                </a>
                <a href="#" id="type_chakan">
                    <li><img src="${APP_PATH}/static/img/coin222.png" class="left_image"/>你猜</li>
                </a>
            </ul>
        </div>
    </div>
    <div id="divFrame_user">
        <div class="user">
            <img src="${APP_PATH}/static/img/coin04.png" class="left_img"/>
            <h3>登陆管理</h3>
            <span hidden="true">close</span>
        </div>
    </div>


</div>


</body>
</html>

