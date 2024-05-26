package com.example.quiztunes.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {

    private String content;
    private String sender;

    public ChatMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }
}
