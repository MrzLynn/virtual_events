package org.launchcode.virtual_events.models;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Category extends AbstractEntity {

    private String name;
    private Date date;
    private String type;
    private String notes;
    private Event event;

    public Category(String name, Date date, String type, String notes, Event event) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.notes = notes;
        this.event = event;
    }

    public Category() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @ManyToOne
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return name;
    }


}

