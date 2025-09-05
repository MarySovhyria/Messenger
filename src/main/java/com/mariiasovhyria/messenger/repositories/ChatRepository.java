package com.mariiasovhyria.messenger.repositories;

import com.mariiasovhyria.messenger.entities.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long>{
    
}
