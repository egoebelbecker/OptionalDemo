package com.ericgoebelbecker.tutorials.optional.tutorial;

/**
 * Giving Optional a Supplier<String> to replace missing values
 */
public class OptionalOrElseGet {

    public static void main(String[] args) {

        UserDictionary userDictionary = new UserDictionary();

        for (int i = 0; i < 4; i++) {
            String user = userDictionary.getUserByNumber(i).orElseGet(OptionalOrElseGet::produceName);
            System.out.println("Name " + i + " is " + user);
        }
    }


    // A simpler Supplier<String>
    static String produceName() {
        return "empty name";
    }


}
