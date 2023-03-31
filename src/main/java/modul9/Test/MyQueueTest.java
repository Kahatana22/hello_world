package main.java.modul9.Test;

import main.java.modul9.Collections.MyQueue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.print();
        System.out.println("size = " + myQueue.size());
        System.out.println("peek = " + myQueue.peek());
        System.out.println("poll = " + myQueue.poll());
        System.out.println("size = " + myQueue.size());
        myQueue.clear();
        System.out.println("size = " + myQueue.size());
    }
}
