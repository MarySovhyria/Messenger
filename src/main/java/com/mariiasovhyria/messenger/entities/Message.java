package com.mariiasovhyria.messenger.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User sender;
    @ManyToOne
    private User receiver;
    
    private String content;
    private LocalDateTime timestamp;
    private boolean isRead;
    private String attachments;

    // Constructor
    public Message(User sender, User receiver, String content, LocalDateTime timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.isRead = false;
    }
    // Getters and Setters
    public Long getId() {
        return id;
    }

     public void setSender(User sender) {
        this.sender = sender;
    }

    public User getSender() {
        return sender;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getReceiver() {
        return receiver;
    }
    

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public String getAttachments() {
        return attachments;
    }
    
    


}
