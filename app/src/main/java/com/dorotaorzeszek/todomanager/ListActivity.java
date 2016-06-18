package com.dorotaorzeszek.todomanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.dorotaorzeszek.todomanager.uimodel.ToDoListEntry;

public class ListActivity extends AppCompatActivity {

    ListView lv;
    ToDoListEntry[] toDoEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Context context = getApplicationContext();
                Intent intent = new Intent(context, AddToDoActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

        lv = (ListView) findViewById(R.id.listView);
        toDoEntries = new ToDoListEntry[15];
        toDoEntries[0] = new ToDoListEntry("Go to the gym", false);
        toDoEntries[1] = new ToDoListEntry("Buy apples and oranges", false);
        toDoEntries[2] = new ToDoListEntry("Work on app", false);
        toDoEntries[3] = new ToDoListEntry("Pay bills", false);
        toDoEntries[4] = new ToDoListEntry("Walk the dog", false);
        toDoEntries[5] = new ToDoListEntry("Meet Mike", false);
        toDoEntries[6] = new ToDoListEntry("Call Mum", false);
        toDoEntries[7] = new ToDoListEntry("Search for shoes online", false);
        toDoEntries[8] = new ToDoListEntry("Study for the exam", false);
        toDoEntries[9] = new ToDoListEntry("Take out the trash", false);
        toDoEntries[10] = new ToDoListEntry("Return a book to the library", false);
        toDoEntries[11] = new ToDoListEntry("Read the article I was recommended", false);
        toDoEntries[12] = new ToDoListEntry("Find the big envelope I got from the bank last week and misplaced", false);
        toDoEntries[13] = new ToDoListEntry("Do the dishes", false);
        toDoEntries[14] = new ToDoListEntry("Call the plumber", false);



        ToDoListAdapter adapter = new ToDoListAdapter(this, toDoEntries);
        lv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        Toast toast = Toast.makeText(getApplicationContext(), "Sorry, unimplemented yet", Toast.LENGTH_SHORT);

        switch(id) {
            case R.id.action_done:
                toast.show();
                return true;
            case R.id.action_delete:
                toast.show();
                return true;
            case R.id.action_settings:
                Intent intent = new Intent(this, SettingsActivity.class);
                this.startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        /* noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
        */
    }

}
