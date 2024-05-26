package com.example.quiztunes.service;

import com.example.quiztunes.domain.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

//    @Autowired
//    private SimpMessagingTemplate messagingTemplate;
//
//    public void sendChatMessage(ChatMessage chatMessage) {
//        messagingTemplate.convertAndSend("/topic/chat", chatMessage);
//    }
}