/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import classes.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class search extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String toFind = request.getParameter("search");
        String toPage = "/QuestionsAndAnswers/profile.jsp?error=notFound";
        ResultSet rs;
        DBConnect db = null;
        try {
            db = new DBConnect();
            rs = db.excuteSelect("SELECT * FROM user where name = '" + toFind + "' OR email = '" + toFind + "'");
            System.out.println("\n\n name is :" + toFind);
            if(rs.next()){
                String userName = rs.getString(2);
                toPage = "/QuestionsAndAnswers/user/" + userName;
            }
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect(toPage);
    }
}
