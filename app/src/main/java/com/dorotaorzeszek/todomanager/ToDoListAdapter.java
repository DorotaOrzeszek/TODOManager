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
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

import com.dorotaorzeszek.todomanager.uimodel.ToDoListEntry;

import java.util.List;

public class ToDoListAdapter extends ArrayAdapter<ToDoListEntry> {
    List<ToDoListEntry> toDoEntries;
    Context context;

    public ToDoListAdapter(Context context, List<ToDoListEntry> entries) {
        super(context,R.layout.row, entries);
        this.context = context;
        this.toDoEntries = entries;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int finalPosition = position;
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.row, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.textView1);
        CheckBox cb = (CheckBox) convertView.findViewById(R.id.checkBox1);
        name.setText(toDoEntries.get(position).getName());
        cb.setChecked(toDoEntries.get(position).isChecked());
        cb.setOnCheckedChangeListener(new OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                toDoEntries.get(finalPosition).setChecked(isChecked);
            }});
        return convertView;
    }
}
