package main.java.modul9;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.push(99);
        stack.remove(1);
        System.out.println("Stack = " + stack);
        System.out.println("Size = " + stack.size());
        System.out.println("Pop = " + stack.pop());
        System.out.println("Peek = " + stack.peek());
        stack.clear();
    }
}
