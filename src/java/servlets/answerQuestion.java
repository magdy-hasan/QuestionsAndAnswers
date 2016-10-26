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
import classes.question;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import classes.user;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class answerQuestion extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String answer = request.getParameter("answer");
        int questionId = Integer.parseInt(request.getParameter("questionId"));
        question qu = new question();
        qu.setId(questionId);
        qu.setQuestionAnswer(answer);
        qu.updateQuestionAnswer();
        HttpSession session = ((HttpServletRequest) request).getSession();
        user curUser = (user)session.getAttribute("user");
        ArrayList<question> allQUToAnswer = null;
        ArrayList<question> allQUAnswered = null;
        try {
            allQUToAnswer = curUser.getAllQUToAnswer();
            allQUAnswered = curUser.getAllQUAnswered();
        } catch (SQLException ex) {
            Logger.getLogger(checklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.setAttribute("allQUToAnswer", allQUToAnswer);
        session.setAttribute("allQUAnswered", allQUAnswered);
        response.sendRedirect("profile.jsp");
    }

}
