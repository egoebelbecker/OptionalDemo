package com.ericgoebelbecker.tutorials.optional.tutorial;


/*
 * A function object that consumes a String.
 * Used in OptionalIfPresentConsumer
 */
class ConsumeName {
    void printAName(String name) {
        System.out.println("Name is " + name);
        name = name.concat(" is a nice guy");
        System.out.println(name);
    }
}
