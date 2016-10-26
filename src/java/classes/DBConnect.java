/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.*;

public class DBConnect {

    private Connection connection;
    private Statement st;

    public DBConnect() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            throw new SecurityException();
        }
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/questionsandanswers?autoReconnect=true&useSSL=false", "root", "root");
        connection.setAutoCommit(true);
        st = connection.createStatement();

    }

    public ResultSet excuteSelect(String select) throws SQLException {
        return st.executeQuery(select);
    }

    public void excuteDml(String dmlStat) throws Exception {
        st.executeUpdate(dmlStat);
    }

    public void close() throws SQLException {
        st.close();
        connection.close();
    }

}
