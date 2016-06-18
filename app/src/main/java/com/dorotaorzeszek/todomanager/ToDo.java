package com.dorotaorzeszek.todomanager;

import java.util.Date;

/**
 * Created by dorota on 17.06.16.
 */
public class ToDo {

    static int nextId = 0;

    int id;
    String name;
    int priority;
    Date deadline;
    String notes;
    boolean done;

    ToDo() {
        this.id = nextId;
        nextId++;
        this.done = false;
    }

    ToDo(String name, int priority, Date deadline, String notes) {
        this.id = nextId;
        nextId++;
        this.done = false;
        setName(name);
        setPriority(priority);
        setDeadline(deadline);
        setNotes(notes);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
