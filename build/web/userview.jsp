<%-- 
    Document   : profile
    Created on : Oct 24, 2016, 2:11:06 PM
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
        <link rel="stylesheet" type="text/css" href="/QuestionsAndAnswers/css/Profile.css">
    </head>
    <body bgcolor="gray">
        <!--Top Header Start-->
        <ul>
            <li style="float: left; margin-left: 10%; margin-top: 12px; color: red; font-size: 120%;">${param.error}</li>
            <li style="float: left;">
                <form action="search" method="POST">
                    <input  type="text" name="search" placeholder="Enter username or email..">
                </form>
            </li>
            <li><a href="/QuestionsAndAnswers/logout">logout</a></li>
            <li><a href="/QuestionsAndAnswers/profileToAnswer.jsp" >Questions</a></li>
            <li><a href="/QuestionsAndAnswers/profile.jsp" >Feed</a></li>
        </ul>
        <!--Top Header End-->
        <div class="profile-bg" style="background-image:url(/QuestionsAndAnswers/images/${sessionScope.viewUser.backgroundname})">
            <img src="/QuestionsAndAnswers/images/${sessionScope.viewUser.picname}" >
        </div>
        <div class="ask content" id="askQuestion">
            <h1> Ask ${sessionScope.viewUser.name}</h1>
            <form method="POST" action="/QuestionsAndAnswers/addQuestion">
                <div>
                    <textarea rows="6" cols="80" name="question" placeholder="Enter your question here" ></textarea>
                </div>
                <input type="submit" value="ask">
            </form>
        </div>
        <section class="content">
            <h3 style="text-align: center;">${viewUser.name} Answered Questions </h3>
            <hr/>
            <br>
            <c:forEach var="qu" items="${viewUserQU}">
                <div class="question">
                    <h1 style="display: inline;">${qu.questionHead}</h1>
                    <a href="/QuestionsAndAnswers/user/${allUsersIds[qu.askedById]}" style="color: #0F4D92; padding-left: 5px; text-decoration: none; font-size: 120%;">${allUsersIds[qu.askedById]}</a>
                    <p>${qu.questionAnswer}</p>
                    <a href="/QuestionsAndAnswers/user/${allUsersIds[qu.askedToId]}" style="color: #acd6ef; padding-left: 5px; text-decoration: none; font-size: 90%;">${allUsersIds[qu.askedToId]}</a>
                    <hr/>
                    <form method="POST" action="#" >
                        <input type="submit" style="display: inline; color: blue;" value="${qu.likes} | like">
                        <a href="#"  style="float: right; padding-right: 20px;">etx<a/>
                    </form>
                </div>
                <hr/>
            </c:forEach>
        </section>
    </body>
</html>
