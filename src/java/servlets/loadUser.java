/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import classes.DBConnect;
import classes.question;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import classes.user;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class loadUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String viewUserName = request.getPathInfo();
        viewUserName = viewUserName.substring(1);
        String toPage = "/userview.jsp";
        try {
            DBConnect db = new DBConnect();
            ResultSet rs;
            rs = db.excuteSelect("SELECT * FROM user WHERE name = '" + viewUserName + "'");
            if(rs.next()) {
                user viewUser = new user(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                ArrayList<question> viewUserQU = viewUser.getAllQUIAnswered();
                HttpSession session = ((HttpServletRequest) request).getSession();
                session.setAttribute("viewUserQU", viewUserQU);
                session.setAttribute("viewUser", viewUser);
            }
            else
                toPage = "/error.html";
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(checklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher(toPage).forward(request, response);
    }
}

