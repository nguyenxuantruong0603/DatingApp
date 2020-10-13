package com.example.DatingApp.model;

public class Meeting {
    String name;
    int age;
    int avatar;
    boolean expanded;

    public Meeting(String name, int age, int avatar) {
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.expanded = false;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
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
