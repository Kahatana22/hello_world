package main.java.modul9;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, String> wondersOfTheWorld = new HashMap<>();
        wondersOfTheWorld.put("Colosseum", "Rome");
        wondersOfTheWorld.put("Great Wall of China", "China");
        wondersOfTheWorld.put("Machu Picchu", "Peru");
        wondersOfTheWorld.put("Petra", "Jordan");
        wondersOfTheWorld.put("Taj Mahal", "Agra");
        wondersOfTheWorld.put("Christ the Redeemer Statue", "Rio de Janeiro");
        wondersOfTheWorld.put("Chichen Itza", "Yucatan");
        System.out.println(wondersOfTheWorld);
        System.out.println(wondersOfTheWorld.get("Petra"));
        System.out.println(wondersOfTheWorld.size());
        wondersOfTheWorld.remove("Great Wall of China");
        wondersOfTheWorld.clear();
    }
}
