// package com.chatapp.realtimechatapp.controller;

// import com.chatapp.realtimechatapp.model.ChatMessage;
// import org.springframework.messaging.handler.annotation.MessageMapping;
// import org.springframework.messaging.handler.annotation.SendTo;
// import org.springframework.stereotype.Controller;

// @Controller
// public class ChatController {

//     @MessageMapping("/sendMessage")
//     @SendTo("/topic/messages")

//     public ChatMessage sendMessage(ChatMessage message) {
//         return message;
//     }
// }
package com.chatapp.realtimechatapp.controller;

import com.chatapp.realtimechatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message; // Ensure sender and content are both returned
    }
}
