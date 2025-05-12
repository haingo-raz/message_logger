package com.project.message_logger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.message_logger.model.Message;
import com.project.message_logger.repository.MessageRepository;

@RestController
@RequestMapping("/messages")
public class MessageController {
    
    @Autowired
    private MessageRepository messageRepository;

    // Get request
    @GetMapping
    public List<Message> getAllMessages(){
        return messageRepository.findAll();
    }

    // POST request
    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        return messageRepository.save(message);
    }
}
