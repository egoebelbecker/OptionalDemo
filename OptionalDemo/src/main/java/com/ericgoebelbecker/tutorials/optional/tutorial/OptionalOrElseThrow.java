package com.ericgoebelbecker.tutorials.optional.tutorial;

/**
 * Demonstrating orElseThrow
 */
public class OptionalOrElseThrow {

    public static void main(String[] args) throws Exception {

        UserDictionary userDictionary = new UserDictionary();

        for (int i = 0; i < 4; i++) {
            String user = userDictionary.getUserByNumber(i).orElseThrow(NameNotFoundException::new);
            System.err.println("Name " + i + " is " + user);
        }
    }

}
