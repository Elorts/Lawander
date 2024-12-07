package com.example.lawander.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LawanderController {

    private final ChatClient chatClient;

    public LawanderController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping("/welcome")
    public String showTest() {
        return "test";
    }

    @GetMapping("/ai")
    @ResponseBody
    String generation() {
        return this.chatClient.prompt()
                .user("tell me a joke")
                .call()
                .content();

    }


}

