package com.dorotaorzeszek.todomanager.backend;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


/**
 * Created by dorota on 17.06.16.
 */
public class ToDoList {

    ArrayList<ToDo> toDoList = new ArrayList<ToDo>();

    ToDoList() {
    }

    // Generate toDoList from textfile
    ToDoList(String textFile) {
        importToDos(textFile);
    }

    private void addToDo(ToDo todo) {
        toDoList.add(todo);
    }

    private void removeToDo(ToDo todo) {
        toDoList.remove(todo);
    }

    /*
        textFile format:
        ToDoName; Priority; Deadline; Notes
        e.g.
        Walk the dog; HIGH; 2016-6-1; none
     */
    private void importToDos(String textFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(textFile));
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitLine = line.split(";");
                String name = splitLine[0];
                int priority = Integer.parseInt(splitLine[1]);
                Date deadline = new Date(Date.parse(splitLine[2]));
                String notes = splitLine[3];
                ToDo newTodo = new ToDo(name, priority, deadline, notes);
                toDoList.add(newTodo);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
        } catch (IOException e) {
            System.out.println("Error: IOException");
        }
    }

    private void exportToDos(String textFile) {

    }

}
