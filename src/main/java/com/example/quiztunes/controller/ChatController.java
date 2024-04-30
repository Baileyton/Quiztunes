package com.example.quiztunes.controller;

import com.example.quiztunes.domain.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        if (message.getContent() == null) {
            message.setContent("No content");
        }
        if (message.getSender() == null) {
            message.setSender("Unknown");
        }
        return message;
    }
}
