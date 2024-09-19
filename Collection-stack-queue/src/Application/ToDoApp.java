package Application;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ToDoApp {
    private Queue<String>queue=new LinkedList<>();
    private Stack<String> completedTask=new Stack<>();

    public void addTask(){
        queue.offer("Learn java");
        queue.offer("Learn Badminton");
        queue.offer("Learn Snooker");
        queue.offer("Gym");
    }
    public void ProcessTask(){
        while(!queue.isEmpty()){
            String currentTask=queue.poll();
            System.out.println(currentTask+": completed");
            completedTask.push(currentTask);

        }
    }
    public void displayPastCompletedTask(){
        while (!completedTask.isEmpty()){
            System.out.println(completedTask.pop());
        }
    }
    public static void main(String[] args) {
        ToDoApp todo=new ToDoApp();
        todo.addTask();
        todo.ProcessTask();
        todo.displayPastCompletedTask();


    }
}
