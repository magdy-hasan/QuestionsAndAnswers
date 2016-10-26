/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class question {
    private int id;
    private Long askedById;
    private Long askedToId;
    private int likes;
    private String questionHead;
    private String questionAnswer;

    public question(int id, Long askedById, Long askedToId, int likes, String questionHead, String questionAnswer) {
        this.id = id;
        this.askedById = askedById;
        this.askedToId = askedToId;
        this.likes = likes;
        this.questionHead = questionHead;
        this.questionAnswer = questionAnswer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public question() {
    }

    public Long getAskedById() {
        return askedById;
    }

    public void setAskedById(Long askedById) {
        this.askedById = askedById;
    }

    public Long getAskedToId() {
        return askedToId;
    }

    public void setAskedToId(Long askedToId) {
        this.askedToId = askedToId;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getQuestionHead() {
        return questionHead;
    }

    public void setQuestionHead(String questionHead) {
        this.questionHead = questionHead;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }
    
    public void addQuestion() {
        try {
            DBConnect db = new DBConnect();
            db.excuteDml("INSERT INTO questionsandanswers.question (`askedById`, `askedToId`, likes, `questionHead`, `questionAnswer`) VALUES ('" + this.askedById + "', '" + this.askedToId + "', 0, '" + this.questionHead + "', NULL)");
            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void updateQuestionAnswer(){
        try {
            DBConnect db = new DBConnect();
            db.excuteDml("UPDATE questionsandanswers.question SET `questionAnswer` = '" + this.questionAnswer + "' WHERE id = '" + this.id + "'");
            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
    public void updateQuestionId() {
        try {
            DBConnect db = new DBConnect();
            ResultSet rs;
            rs = db.excuteSelect("SELECT LAST_INSERT_ID()");
            rs.next();
            this.id = rs.getInt(1);
            db.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
}
