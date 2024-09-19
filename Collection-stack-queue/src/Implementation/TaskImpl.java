package Implementation;

import model.Status;
import model.Task;

import java.util.*;

public class TaskImpl {
    //priorityqueue - sorted and duplicated allowed.
    // used comparator((a,b)->a.getPriority()-b.getPriority());
    //for string type((a,b)->a.getTitle.compareTo(b.get.Title))
    Queue<Task>taskQueue=new PriorityQueue<>((a,b)->a.getPriority()-b.getPriority());
    Stack<Task> completedTask=new Stack<>();
    public void addTask(){
        Task t1=new Task(2,Status.PENDING,"Sports");
        taskQueue.offer(t1);
        //new(Task)-constructor
        taskQueue.offer(new Task(4,Status.PENDING,"Coding"));
        taskQueue.offer(new Task(3,Status.PENDING,"Learn java"));
        taskQueue.offer(new Task(1,Status.PENDING,"Ride"));
    }
    public void readTask(){
        while(!taskQueue.isEmpty()){
            Task currentTask=taskQueue.poll();
            //toStirng is autocalled for printing objects or set of variables in object.
            System.out.println(currentTask);
            currentTask.setStatus(Status.COMPLETED);
            System.out.println(currentTask.getTitle()+":Completed");
            completedTask.push(currentTask);
        }

    }
    public void taskstack(){
        while (!completedTask.isEmpty()){
            System.out.println(completedTask.pop());
        }
    }

    public static void main(String[] args) {
        TaskImpl taskObj=new TaskImpl();
        taskObj.addTask();
        taskObj.readTask();
        taskObj.taskstack();
    }


}
