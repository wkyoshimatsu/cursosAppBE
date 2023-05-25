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
}
