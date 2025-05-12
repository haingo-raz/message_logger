package com.project.message_logger.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class Message {

    @Id //Auto-generated ID
    private String id;

    private String sender;
    private String text;
    
    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }   

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
