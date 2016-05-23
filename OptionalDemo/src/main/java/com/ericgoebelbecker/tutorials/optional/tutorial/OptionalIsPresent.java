package com.ericgoebelbecker.tutorials.optional.tutorial;

import java.util.HashMap;
import java.util.Optional;

/**
 * A very simple demonstration of using Optional to replace a null check
 */
public class OptionalIsPresent {

    public static void main(String[] args) {

        HashMap<Integer, String> stringMap = new HashMap<>();
        stringMap.put(0, "John Doe");
        stringMap.put(1, "Alfred Neuman");
        stringMap.put(2, "John Galt");

        for (int i = 0; i < 4; i++) {

            Optional<String> optName = Optional.ofNullable(stringMap.get(i));

            if (optName.isPresent()) {
                System.out.println("Name " + i + " is " + optName.get());
            } else {
                System.out.println("Name " + i + " is not found.");
            }
        }
    }
}
