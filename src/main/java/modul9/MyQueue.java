package main.java.modul9;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Audi");
        queue.add("BMW");
        queue.add("Ford");
        queue.add("Mazda");
        queue.add("Mercedes");
        System.out.println("Queue = " + queue);
        queue.poll();
        System.out.println("First element = " + queue.peek());
        System.out.println("Size = " + queue.size());
        queue.clear();
    }
}
