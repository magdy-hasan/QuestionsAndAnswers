/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import classes.user;
import classes.question;

/**
 *
 * @author Lenovo
 */
public class addQuestion extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String question = request.getParameter("question");
        System.out.println("\n\nquestion is :" + question);
        HttpSession session = ((HttpServletRequest) request).getSession();
        user curUser = (user)session.getAttribute("user");
        user viewedUser = (user)session.getAttribute("viewUser");
        question qu = new question(0,curUser.getId(),viewedUser.getId(),0,question,null);
        qu.addQuestion();
        qu.updateQuestionId();
        response.sendRedirect("/QuestionsAndAnswers/profile.jsp");
    }
}
