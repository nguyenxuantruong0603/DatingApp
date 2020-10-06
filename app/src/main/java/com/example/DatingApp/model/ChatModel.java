package com.example.DatingApp.model;

public class ChatModel {
    String name;
    String Message;
    int Avatar,NumberMessage;
    String Time;

    public ChatModel(String name, String message, int avatar, int numberMessage, String time) {
        this.name = name;
        Message = message;
        Avatar = avatar;
        NumberMessage = numberMessage;
        Time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getAvatar() {
        return Avatar;
    }

    public void setAvatar(int avatar) {
        Avatar = avatar;
    }

    public int getNumberMessage() {
        return NumberMessage;
    }

    public void setNumberMessage(int numberMessage) {
        NumberMessage = numberMessage;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
