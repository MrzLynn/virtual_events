package org.launchcode.virtual_events.models;

import javax.persistence.*;

@Entity

public class Type extends AbstractEntity {

    private String name;
    private User user;


    public Type(String name, User user) {
        this.name = name;
        this.user = user;

    }

    public Type() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
