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
        <link rel="stylesheet" type="text/css" href="css\Profile.css">
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
            <li><a class="active" href="profileToAnswer.jsp" >Questions</a></li>
            <li><a href="profile.jsp" >Feed</a></li>
        </ul>
        <!--Top Header End-->
        <div class="profile-bg" style="background-image:url(/QuestionsAndAnswers/images/${sessionScope.user.backgroundname})">
            <img src="/QuestionsAndAnswers/images/${sessionScope.user.picname}" >
        </div>
        <section class="content">
            <h3 style="text-align: center;">Your UNAnswered Questions </h3>
            <hr/>
            <br>
            <c:forEach var="qu" items="${allQUToAnswer}">
                <div class="question">
                    <h1 style="display: inline;">${qu.questionHead}</h1>
                    <a href="/QuestionsAndAnswers/user/${allUsersIds[qu.askedById]}" style="color: #0F4D92; padding-left: 5px; text-decoration: none; font-size: 120%;">${allUsersIds[qu.askedById]}</a>
                    <form method="POST" action="answerQuestion" style="margin-top: 5px;">
                        <input type="hidden" name="questionId" value="${qu.id}">
                        <div>
                            <textarea rows="4" cols="80" name="answer" placeholder="Enter your Answer here"></textarea>
                        </div>
                        <input type="submit" value="Answer" style="">
                    </form>
                    <hr/>
                </div>
                <hr/>
            </c:forEach>
        </section>
    </body>
</html>
