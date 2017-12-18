package com.designpatterns.patterns.prototype.tasks;

import java.util.HashSet;
import java.util.Set;

public class Board extends Prototype {

    String name;
    Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board)super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board cloneBoard = (Board)super.clone();
        cloneBoard.lists = new HashSet<>();
        for(TaskList taskList : lists) {
            TaskList clonedList = new TaskList(taskList.getName());
            for(Task task : clonedList.getTasks()) {
                clonedList.getTasks().add(task);
            }
            cloneBoard.getLists().add(clonedList);
        }
        return  cloneBoard;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for(TaskList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }
}
