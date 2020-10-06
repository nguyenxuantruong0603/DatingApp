package com.example.DatingApp.model;

public class Meeting {
    String name;
    int age;
    int avatar;

    public Meeting(String name, int age, int avatar) {
        this.name = name;
        this.age = age;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
