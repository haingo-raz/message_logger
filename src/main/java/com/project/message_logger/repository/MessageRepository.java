package com.project.message_logger.repository;

import com.project.message_logger.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;   

public interface MessageRepository extends MongoRepository<Message, String> {

}
  