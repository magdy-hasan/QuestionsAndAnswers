/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import classes.user;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Web application lifecycle listener.
 *
 * @author Lenovo
 */
public class NewServletListener implements ServletContextListener  {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        ConcurrentHashMap<Long,String> allUsersIds = null;
        try {
            allUsersIds = user.getAllUsersIds();
        } catch (SQLException ex) {
            Logger.getLogger(NewServletListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        servletContext.setAttribute("allUsersIds", allUsersIds);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // not do
    }
}
