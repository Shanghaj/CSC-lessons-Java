package ООП;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class CustomStringArrayList {

    static ArrayList<String> planets = new ArrayList<>();

    public static void createNewPlanet(String planetName) {
        planets.add(3, planetName);
    }
    public static void main(String[] args) {
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i < 25; i++) {
            arrayList.add("count" + i);
        }
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).equalsIgnoreCase("bug"))
                list.remove(i);
            i--;
        }
    }
    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            String s = it.next();
            if(s.equalsIgnoreCase("BUG"))
                it.remove();
        }
    }
    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copyList = new ArrayList(list);
        for(String s : copyList)
        {
            if(s.equalsIgnoreCase("Bug"))
                list.remove(s);
        }
    }

    static private int size;
    static private int capacity;
    static private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        String[] newTemp = new String[(int)(capacity * 1.5)];
        for(int i = 0; i < elements.length; i++)
        {
            newTemp[i] = elements[i];
        }
        elements = newTemp;
        capacity = (int)(capacity * 1.5);

    }

}


