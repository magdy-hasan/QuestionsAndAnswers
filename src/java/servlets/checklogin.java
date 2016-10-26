/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import classes.DBConnect;
import classes.question;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import classes.user;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class checklogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String page = "login.jsp?error=WrongEmailOrPassword";
        try {
            DBConnect db = new DBConnect();
            ResultSet rs;
            rs = db.excuteSelect("SELECT * FROM user WHERE email = '" + email + "' AND pass = '" + pass + "'");
            if(rs.next()) {
                user curUser = new user(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                HttpSession session = ((HttpServletRequest) request).getSession();
                session.setAttribute("user", curUser);
                ArrayList<question> allQUAnswered = curUser.getAllQUAnswered();
                ArrayList<question> allQUToAnswer = curUser.getAllQUToAnswer();
                session.setAttribute("allQUAnswered", allQUAnswered);
                session.setAttribute("allQUToAnswer", allQUToAnswer);
                page = "profile.jsp";
            }
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(checklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect(page);
    }
}
