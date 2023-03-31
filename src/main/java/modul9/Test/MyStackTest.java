package main.java.modul9.Test;

import main.java.modul9.Collections.MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(4);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.print();
        System.out.println("    size = " + myStack.size());
        System.out.println("myStack.pop = " + myStack.pop());
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.size() = " + myStack.size());
        myStack.remove(1);
        myStack.print();
        System.out.println("myStack.size() = " + myStack.size());
        myStack.clear();
        System.out.println("myStack.size() = " + myStack.size());
    }
}
