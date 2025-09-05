package com.mariiasovhyria.messenger.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "chat_user",
        joinColumns = @JoinColumn(name = "chat_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<User> participants = new HashSet<>();

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    private Set<Message> messages = new HashSet<>();

    public Chat() {} // JPA requires no-arg constructor

    public Chat(Set<User> participants) {
        this.participants = participants;
        this.updatedAt = LocalDateTime.now();
    }

    // Getters and setters
    public Long getId() { return id; }
    public Set<User> getParticipants() { return participants; }
    public void setParticipants(Set<User> participants) { this.participants = participants; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public Set<Message> getMessages() { return messages; }

    public void addMessage(Message message) {
        messages.add(message);
        message.setChat(this);
        this.updatedAt = LocalDateTime.now();
    }
}
