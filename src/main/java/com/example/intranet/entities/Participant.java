package com.example.intranet.entities;

public class Participant {

    private User user;
    private String comment;

    public Participant(User user, String comment) {
        this.user = user;
        this.comment = comment;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }
}
