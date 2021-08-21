package org.launchcode.virtual_events.domain;

import javax.persistence.*;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    private String username;
    private String password;
    private Set<Type> groups = new TreeSet<>();

    public User(String username, String password, Set<Type> groups) {
        this.username = username;
        this.password = password;
        this.groups = groups;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Type> getGroups() {
        return groups;
    }

    public void setGroups(Set<Type> groups) {
        this.groups = groups;
    }
}
