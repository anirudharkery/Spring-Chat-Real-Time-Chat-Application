// package com.chatapp.realtimechatapp.model;

// public class ChatMessage {
//     private String content;
//     private String sender;

//     // Getters and Setters
//     public String getContent() {
//         return content;
//     }

//     public void setContent(String content) {
//         this.content = content;
//     }

//     public String getSender() {
//         return sender;
//     }

//     public void setSender(String sender) {
//         this.sender = sender;
//     }
// }
package com.chatapp.realtimechatapp.model;

public class ChatMessage {
    private String content;
    private String sender; // Add this field

    // Constructors
    public ChatMessage() {}

    public ChatMessage(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    // Getters and Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
