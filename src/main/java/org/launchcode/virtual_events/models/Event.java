package org.launchcode.virtual_events.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;

@Entity
public class Event extends AbstractEntity {

    private String name;
    private Date date;
    private Integer attending;
    private Time start;
    private Time end;
    private Type group;

    public Event(String name, Date date, Integer attending, Time start, Time end, Type group) {
        this.name = name;
        this.date = date;
        this.attending = attending;
        this.start = start;
        this.end = end;
        this.group = group;
    }

    public Event() {
    }

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
}
