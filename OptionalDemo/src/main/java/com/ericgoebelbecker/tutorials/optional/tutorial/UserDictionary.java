package com.ericgoebelbecker.tutorials.optional.tutorial;

import java.util.HashMap;
import java.util.Optional;


/*
 * A wrapper for a HashMap that returns Optional
 */
class UserDictionary {

    final HashMap<Integer, String> theList = new HashMap<>();

    UserDictionary() {
        theList.put(0, "John Doe");
        theList.put(1, "Alfred Neuman");
        theList.put(2, "John Galt");
    }

    void addUser(int number, String name) {
        theList.put(number, name);
    }

    Optional<String> getUserByNumber(int number) {
        return Optional.ofNullable(theList.get(number));
    }
}
