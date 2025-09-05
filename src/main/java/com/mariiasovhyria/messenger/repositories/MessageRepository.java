package com.mariiasovhyria.messenger.repositories;

import com.mariiasovhyria.messenger.entities.Message;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long>{
    List<Message> findBySenderId(Long senderId);
    List<Message> findByChatId(Long chatId);
}
