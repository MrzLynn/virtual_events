package org.launchcode.virtual_events.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "groups")
public class Type extends AbstractEntity {

    private String name;
    private User user;
    private Set<Category> categories = new TreeSet<>();

    public Type(String name, User user, Set<Category> categories) {
        this.name = name;
        this.user = user;
        this.categories = categories;
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
    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY,mappedBy = "group")
    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
