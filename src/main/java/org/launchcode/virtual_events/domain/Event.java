package org.launchcode.virtual_events.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Event extends AbstractEntity {

    private String name;
    private Date date;
    private String type;
    private String notes;
    private Category category;

    public Event(String name, Date date, String type, String notes, Category category) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.notes = notes;
        this.category = category;
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
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
