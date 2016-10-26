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
import classes.user;
import classes.handleFile;

/**
 *
 * @author Lenovo
 */
public class adduser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String page = "/QuestionsAndAnswers/login.jsp";
        try {
            DBConnect db = new DBConnect();
            ResultSet rs1, rs2;
            boolean isError = false;
            rs1 = db.excuteSelect("SELECT * FROM user WHERE name = '" + username + "'");
            if(rs1.next()){
                page = "/QuestionsAndAnswers/register.jsp?error=UsernameAlreadyExist";
                isError = true;
            }
            rs2 = db.excuteSelect("SELECT * FROM user WHERE email = '" + email + "'");
            if(rs2.next()){
                page = "/QuestionsAndAnswers/register.jsp?error=EmailAlreadyExist";
                isError = true;
            }
            if(isError == false){
                user newUser = new user(Long.valueOf(1),username,email,password,"","");
                newUser.addUser();
                newUser.updateUserId();
                handleFile.doCopy(username);
                page = "/QuestionsAndAnswers/login.jsp?error=doneadding";
            }
        } catch (SQLException ex) {
            Logger.getLogger(adduser.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect(page);
    }
}
