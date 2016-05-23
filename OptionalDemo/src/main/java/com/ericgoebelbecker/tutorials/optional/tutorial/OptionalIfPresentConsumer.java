package com.ericgoebelbecker.tutorials.optional.tutorial;

/*
 * Constructs a UserDictionary and uses ConsumeName to print the names
 */
public class OptionalIfPresentConsumer {

    public static void main(String[] args) {
        ConsumeName consumer = new ConsumeName();
        UserDictionary userDictionary = new UserDictionary();
        for (int i = 0; i < 3; i++) {
            userDictionary.getUserByNumber(i).ifPresent(consumer::printAName);
        }
    }

}
