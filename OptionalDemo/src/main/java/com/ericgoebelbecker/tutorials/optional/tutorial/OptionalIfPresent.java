package com.ericgoebelbecker.tutorials.optional.tutorial;


/**
 * Using Optional.ifPresent to skip a potential null reference
 */
public class OptionalIfPresent {

    static int i;
    public static void main(String[] args) {

        UserDictionary userDictionary = new UserDictionary();

        for (i = 0; i < 4; i++) {
            userDictionary.getUserByNumber(i).ifPresent(name -> {
                System.out.println("Name " + i + " is " + name);
                name = name.concat(" is a nice guy");
                System.out.println(name);
            });


        }
    }
}
