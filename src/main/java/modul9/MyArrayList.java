package main.java.modul9;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Chanel");
        list.add("Gucci");
        list.add("Dior");
        list.add("Hermes");
        list.add("LouisVuitton");
        System.out.println(list.get(3));
        System.out.println("Size = " + list.size());
        list.remove(1);
        System.out.println(list);
        list.clear();
    }
}
