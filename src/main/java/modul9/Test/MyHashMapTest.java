package main.java.modul9.Test;

import main.java.modul9.Collections.MyHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, String> wondersOfTheWorld = new MyHashMap<>();
        wondersOfTheWorld.put("Colosseum", "Rome");
        wondersOfTheWorld.put("Great Wall of China", "China");
        wondersOfTheWorld.put("Machu Picchu", "Peru");
        wondersOfTheWorld.put("Petra", "Jordan");
        wondersOfTheWorld.put("Taj Mahal", "Agra");
        wondersOfTheWorld.put("Christ the Redeemer Statue", "Rio de Janeiro");
        wondersOfTheWorld.put("Chichen Itza", "Yucatan");
        System.out.println("wondersOfTheWorld = " + wondersOfTheWorld);
        System.out.println(wondersOfTheWorld.get("Chichen Itza"));
        System.out.println(wondersOfTheWorld.size());
        wondersOfTheWorld.remove("Great Wall of China");
        wondersOfTheWorld.remove("Christ the Redeemer Statue");
        wondersOfTheWorld.remove("Chichen Itza");
        wondersOfTheWorld.remove("Colosseum");
        System.out.println("wondersOfTheWorld = " + wondersOfTheWorld);
        System.out.println("wondersOfTheWorld.size() = " + wondersOfTheWorld.size());
        wondersOfTheWorld.clear();
    }
}
