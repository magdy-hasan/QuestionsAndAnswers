/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Lenovo
 */
public class user {
    private Long id;
    private String name;
    private String email;
    private String pass;
    private String picname;
    private String backgroundname;

    
    
    public user() {
    }

    public user(Long id, String name, String email, String pass, String picname, String backgroundname) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.picname = picname;
        this.backgroundname = backgroundname;
    }
    
    
    public String getPicname() {
        return picname;
    }

    public void setPicname(String picname) {
        this.picname = picname;
    }

    public String getBackgroundname() {
        return backgroundname;
    }

    public void setBackgroundname(String backgroundname) {
        this.backgroundname = backgroundname;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void addUser() {
        try {
            DBConnect db = new DBConnect();
            db.excuteDml("INSERT INTO questionsandanswers.`user` (`name`, email, pass, picname, backgroundname) VALUES ('" + this.name + "', '" + this.email + "', '" + this.pass + "', '" + this.name + "_pic.jpg', '" + this.name + "_bg.jpg')");
            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void updateUserId() {
        try {
            DBConnect db = new DBConnect();
            ResultSet rs;
            rs = db.excuteSelect("SELECT id,'picname','backgroundname' FROM user WHERE name = '" + this.name + "'");
            rs.next();
            this.id = rs.getLong(1);
            this.picname = rs.getString(2);
            this.backgroundname = rs.getString(3);
            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public ArrayList<question> getAllQUAnswered() throws SQLException {
        DBConnect db = new DBConnect();
        ArrayList<question> allQU = new ArrayList<>();
        try {
            ResultSet rs;
            rs = db.excuteSelect("SELECT * FROM question WHERE askedById = '" + this.id + "' AND questionAnswer IS NOT NULL order by id desc");
            while (rs.next()) {
                question qh = new question(rs.getInt(1),rs.getLong(2),rs.getLong(3),rs.getInt(4),rs.getString(5),rs.getString(6));
                allQU.add(qh);
            }
            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }

        return allQU;
    }
    
    public ArrayList<question> getAllQUIAnswered() throws SQLException {
        DBConnect db = new DBConnect();
        ArrayList<question> allQU = new ArrayList<>();
        try {
            ResultSet rs;
            rs = db.excuteSelect("SELECT * FROM question WHERE askedToId = '" + this.id + "' AND questionAnswer IS NOT NULL order by id desc");
            while (rs.next()) {
                question qh = new question(rs.getInt(1),rs.getLong(2),rs.getLong(3),rs.getInt(4),rs.getString(5),rs.getString(6));
                allQU.add(qh);
            }
            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }

        return allQU;
    }
    
    public static ConcurrentHashMap<Long,String> getAllUsersIds() throws SQLException {
        DBConnect db = new DBConnect();
        ConcurrentHashMap<Long,String> allUsersId = new ConcurrentHashMap<>();
        try {
            ResultSet rs;
            rs = db.excuteSelect("SELECT * FROM user");
            while (rs.next()) {
                allUsersId.put(rs.getLong(1),rs.getString(2));
            }
            db.close();
        } catch (Exception ex) {
        System.out.print(ex);
        }
        return allUsersId;
    }
    
    public ArrayList<question> getAllQUToAnswer() throws SQLException {
        DBConnect db = new DBConnect();
        ArrayList<question> allQU = new ArrayList<>();
        try {
            ResultSet rs;
            rs = db.excuteSelect("SELECT * FROM question WHERE askedToId = '" + this.id + "' AND questionAnswer IS NULL order by id desc");
            while (rs.next()) {
                question qh = new question(rs.getInt(1),rs.getLong(2),rs.getLong(3),rs.getInt(4),rs.getString(5),rs.getString(6));
                System.out.println("\nThis question id:" + qh.getId());
                allQU.add(qh);
            }
            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }

        return allQU;
    }
}
