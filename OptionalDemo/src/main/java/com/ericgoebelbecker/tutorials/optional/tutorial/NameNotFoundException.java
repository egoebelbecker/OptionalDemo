package com.ericgoebelbecker.tutorials.optional.tutorial;


/*
 * A simple exception class to illustrate orElseThrow()
 */
class NameNotFoundException extends Exception {

    NameNotFoundException() {
        super("Name not found!");
    }
}
