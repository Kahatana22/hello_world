package main.java.modul9.Test;

import main.java.modul9.Collections.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.remove(1);
        myLinkedList.print();
        System.out.println("index 0 = " + myLinkedList.get(0));
        System.out.println("size = " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("size = " + myLinkedList.size());
    }
}
