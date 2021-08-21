package org.launchcode.virtual_events.domain;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


@Entity
public class Category extends AbstractEntity {

    private String name;
    private Date date;
    private Integer attending;
    private Time start;
    private Time end;
    private Type group;
    private Set<Event> events = new TreeSet<>();


    public Category(String name, Date date, Integer attending, Time start, Time end, Set<Event> events) {
        this.name = name;
        this.date = date;
        this.attending = attending;
        this.start = start;
        this.end = end;
        this.events = events;
    }

    public Category(){ }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAttending() {
        return attending;
    }

    public void setAttending(Integer attending) {
        this.attending = attending;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    @ManyToOne
    public Type getGroup() {
        return group;
    }

    public void setGroup(Type group) {
        this.group = group;
    }
    @OneToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY, mappedBy = "category")
    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        return name;
    }


}

