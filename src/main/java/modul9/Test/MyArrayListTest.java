package main.java.modul9.Test;

import main.java.modul9.Collections.MyArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.remove(0);
        myArrayList.print();
        System.out.println("index 1 = " + myArrayList.get(1));
        System.out.println("size = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("size = " + myArrayList.size());
    }
}
