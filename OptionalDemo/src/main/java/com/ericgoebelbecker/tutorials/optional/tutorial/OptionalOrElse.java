package com.ericgoebelbecker.tutorials.optional.tutorial;

/**
 * using Optional to replace missing values
 */
public class OptionalOrElse {

    public static void main(String[] args) {

        UserDictionary userDictionary = new UserDictionary();

        for (int i = 0; i < 4; i++) {
            String user = userDictionary.getUserByNumber(i).orElse("not found");
            System.out.println("Name " + i + " is " + user);
        }
    }
}
