package org.launchcode.virtual_events.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Event extends AbstractEntity {

    @NotNull(message ="Name is Required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

//    @NotNull(message = "Date is required")
//    private Date date;
//
//    @NotNull(message = "Attending guests is required")
//    private Integer attending;
//
//    @NotNull(message = "Start time is required")
//    private Time start;
//
//    @NotNull(message = "End time is required")
//    private Time end;


//    @NotNull
//    private Category category;




//    public Event(String name) {
//        super();
//        this.name = name;
////        this.date = date;
////        this.attending = attending;
////        this.start = start;
////        this.end = end;



//    }

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   //    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Integer getAttending() {
//        return attending;
//    }
//
//    public void setAttending(Integer attending) {
//        this.attending = attending;
//    }
//
//    public Time getStart() {
//        return start;
//    }
//
//    public void setStart(Time start) {
//        this.start = start;
//    }
//
//    public Time getEnd() {
//        return end;
//    }
//
//    public void setEnd(Time end) {
//        this.end = end;
//    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
}
