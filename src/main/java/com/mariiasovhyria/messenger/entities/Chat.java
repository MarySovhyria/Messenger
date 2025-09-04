package com.mariiasovhyria.messenger.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private Set<User> participants;
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    private Set<Message> messages;

    // Constructor
    public Chat(Set<User> participants, Set<Message> messages, LocalDateTime updatedAt) {
        this.participants = participants;
        this.updatedAt = LocalDateTime.now();
    }

}
