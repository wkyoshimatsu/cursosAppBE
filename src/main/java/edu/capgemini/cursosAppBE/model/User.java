package edu.capgemini.cursosAppBE.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private long userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "userEmail")
    private String userEmail;

    @Column(name = "userPassword")
    private String userPassword;

    @Column(name = "userStudent")
    private boolean userStudent;

    @Column(name = "userProfessor")
    private boolean userProfessor;

    public User() {
    }

    public User(long userId, String userName, String userEmail, String userPassword, boolean userStudent, boolean userProfessor) {
        setUserId(userId);
        setUserName(userName);
        setUserEmail(userEmail);
        setUserPassword(userPassword);
        setUserStudent(userStudent);
        setUserProfessor(userProfessor);
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isUserStudent() {
        return userStudent;
    }

    public void setUserStudent(boolean userStudent) {
        this.userStudent = userStudent;
    }

    public boolean isUserProfessor() {
        return userProfessor;
    }

    public void setUserProfessor(boolean userProfessor) {
        this.userProfessor = userProfessor;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + this.getUserId() +
                ", userName='" + this.getUserName() + '\'' +
                ", userEmail='" + this.getUserEmail() + '\'' +
                ", userPassword='" + this.getUserPassword() + '\'' +
                ", userStudent=" + this.isUserStudent() +
                ", userProfessor=" + this.isUserProfessor() +
                '}';
    }
}
