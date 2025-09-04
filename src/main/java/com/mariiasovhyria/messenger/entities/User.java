package com.mariiasovhyria.messenger.entities;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String fullName; 
    private String email;
    private LocalDateTime createdAt;
    private String avatar;

    //Constructor
    public User(String fullName, String username, String email, String password) {

        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdAt = LocalDateTime.now();

    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getusername() {
        return username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }
    
    public Long getId() {
        return id;
    }

}
