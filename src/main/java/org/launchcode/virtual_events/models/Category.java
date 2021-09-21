package org.launchcode.virtual_events.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


@Entity
public class Category extends AbstractEntity {
    @Size(min = 3, message = "Name must be at least 3 characters long.")
    private String name;

    @NotNull
    private Date date;

    @NotNull
    private String type;

    private String notes;


    public Category(String name, Date date, String type, String notes) {
        super();
        this.name = name;
        this.date = date;
        this.type = type;
        this.notes = notes;

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


    @Override
    public String toString() {
        return name;
    }


}

