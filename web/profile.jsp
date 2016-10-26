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
            <li><a href="profileToAnswer.jsp" >Questions</a></li>
            <li><a style="cursor:pointer" id="myBtn">Update Image</a></li>
            <li><a class="active" href="profile.jsp" >Home</a></li>
        </ul>
        <!--Top Header End-->
        <div class="clear"></div>
        <div class="profile-bg" style="background-image:url(/QuestionsAndAnswers/images/${sessionScope.user.backgroundname})">
            <img src="/QuestionsAndAnswers/images/${sessionScope.user.picname}" >
        </div>
        <section class="content">
            <h3 style="text-align: center;">Questions you asked  </h3>
            <hr/>
            <br>
            <!-- view all answered question -->
            <c:forEach var="qu" items="${allQUAnswered}">   
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
            <!-- End view all answered question -->
        </section>

        <!-- The Modal for changing photo -->
        <div id="myModal" class="modal">

            <!-- Modal content -->
            <div class="modal-content">
                <div class="modal-header">
                    <span class="close">×</span>
                    <h2>Change your image</h2>
                </div>
                <div class="modal-body">
                    <table>
                        <tr style="outline:  1px solid #66add6;">
                            <td style="padding-left: 7px;">Update profile picture: </td>
                            <td>
                                <form method="POST" action="uploadImagePic" enctype="multipart/form-data">
                                    <input type="file" name="image"><input type="submit" value="Update" style="background-color: #5cb85c;">
                                </form>
                            </td>
                        </tr>
                        <tr style="height: 5px;"></tr>
                        <tr style="outline:  1px solid #66add6;">
                            <td style="padding-left: 7px;">Update background picture: </td>
                            <td> 
                                <form method="POST" action="uploadImageBG" enctype="multipart/form-data">
                                    <input type="file" name="image"><input type="submit" value="Update" style="background-color: #5cb85c">
                                </form>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>

        </div>
        <!-- script for changing photo -->
        <script>
            // Get the modal
            var modal = document.getElementById('myModal');

            // Get the button that opens the modal
            var btn = document.getElementById("myBtn");

            // Get the <span> element that closes the modal
            var span = document.getElementsByClassName("close")[0];

            // When the user clicks the button, open the modal
            btn.onclick = function () {
                modal.style.display = "block";
            }

            // When the user clicks on <span> (x), close the modal
            span.onclick = function () {
                modal.style.display = "none";
            }

            // When the user clicks anywhere outside of the modal, close it
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            }
        </script>
    </body>
</html>
