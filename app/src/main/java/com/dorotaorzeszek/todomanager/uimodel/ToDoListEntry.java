package com.dorotaorzeszek.todomanager.uimodel;

/**
 * Created by dorota on 16.06.16.
 */
public class ToDoListEntry {

    String name;
    boolean checked;

    public ToDoListEntry(String name, boolean checked) {
        this.name = name;
        this.checked = checked;
    }
    public String getName() {
        return this.name;
    }
    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
