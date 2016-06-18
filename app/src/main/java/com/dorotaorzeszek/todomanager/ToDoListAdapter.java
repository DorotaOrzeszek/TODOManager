package com.dorotaorzeszek.todomanager;

/**
 * Created by dorota on 16.06.16.
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.dorotaorzeszek.todomanager.uimodel.ToDoListEntry;

public class ToDoListAdapter extends ArrayAdapter<ToDoListEntry> {
    ToDoListEntry[] toDoEntries = null;
    Context context;

    public ToDoListAdapter(Context context, ToDoListEntry[] resource) {
        super(context,R.layout.row, resource);
        this.context = context;
        this.toDoEntries = resource;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.row, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox1);
        name.setText(toDoEntries[position].getName());
        cb.setChecked(toDoEntries[position].isChecked());
        return convertView;
    }
}
