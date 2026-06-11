package lab3.task3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("OOP");
        list.add("Lab3");

        System.out.println("Size: " + list.size());
        System.out.println("Contains OOP: " + list.contains("OOP"));

        list.remove("OOP");

        System.out.println("Size after remove: " + list.size());

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }

        list.clear();
        System.out.println("Is empty: " + list.isEmpty());
    }
}