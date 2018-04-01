package com.codecool.hashmap;

public class HashMapCustomApp {

    public static void main(String[] args) {
        HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<Integer, Integer>();
        hashMapCustom.put(21, 12);
        hashMapCustom.put(25, 121);
        hashMapCustom.put(30, 151);
        hashMapCustom.put(33, 15);
        hashMapCustom.put(35, 89);
        hashMapCustom.put(39, 19);
        hashMapCustom.put(35, 39);
        hashMapCustom.put(735, 489);
        hashMapCustom.put(635, 589);
        hashMapCustom.put(555, 689);
        hashMapCustom.put(435, 789);
        hashMapCustom.put(335, 889);
        hashMapCustom.put(235, 989);
        hashMapCustom.put(135, 189);

        System.out.println("value corresponding to key 21="
                + hashMapCustom.get(21));
        System.out.println("value corresponding to key 51="
                + hashMapCustom.get(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();

        System.out.println("\n\nvalue corresponding to key 21 removed: "
                + hashMapCustom.remove(21));
        System.out.println("value corresponding to key 51 removed: "
                + hashMapCustom.remove(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();

    }
}