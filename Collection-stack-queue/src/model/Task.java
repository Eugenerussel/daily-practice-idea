package model;

import java.util.Comparator;
import java.util.Queue;

public class Task //implements Comparable<Task>
 {
    // if objects are added to priorityqueue,we need to implement comparable<class>.
     // or use comparator in main method.
    // override the compareTo methode,if comparable implemented.
    private String title;
    private int priority;
    private Status status;

    public Task() {
    }

    public Task(int priority, Status status, String title) {
        this.priority = priority;
        this.status = status;
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    // if comparable is used, use this compareTo method.
//    public int compareTo(Task o){
//        //comparing the priority of two different objects.
//        return priority-o.priority;
//    }

    //it is mandatory to implement toString when encapsulation is used.
    // to print entire object,need toString method.
    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", title='" + title + '\'' +
                ", status=" + status +
                '}';
    }
}
