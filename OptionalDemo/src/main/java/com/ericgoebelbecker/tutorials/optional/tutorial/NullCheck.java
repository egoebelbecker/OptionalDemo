package com.ericgoebelbecker.tutorials.optional.tutorial;

import java.util.HashMap;


/*
 * How we normally avid NullPointerExceptions
 */
public class NullCheck {

    public static void main(String[] args) throws Exception {

        HashMap<Integer, String> stringMap = new HashMap<>();
        stringMap.put(0, "John Doe");
        stringMap.put(1, "Alfred Neuman");
        stringMap.put(2, "John Galt");

        for (int i = 0; i < 4; i++) {
            String name = stringMap.get(i);
            if (name != null) {
                System.out.println("Name " + i + " is " + name);
            } else {
                System.out.println("Name " + i + " is not found.");
            }
        }
    }
}
