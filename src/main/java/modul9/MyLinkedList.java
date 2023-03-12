package main.java.modul9;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Armani");
        list.add("ArmandBasi");
        list.add("Bulgari");
        list.add("Kenzo");
        list.add("Lancome");
        System.out.println("List(1) = " + list.get(1));
        list.remove(2);
        System.out.println("Size = " + list.size());
        list.clear();
    }
}
