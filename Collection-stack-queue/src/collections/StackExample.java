package collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(12);
        stack.push(22);
        stack.push(32);
        stack.push(42);
        stack.push(52);

        System.out.println(stack.search(22));
        //To print in lifo order
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }



    }
}
