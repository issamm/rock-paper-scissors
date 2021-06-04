package com.issam.rockpaperscissors;

/** Main class. */
public class App {

    public static void printInstructionsMessage() {
        System.out.println("          Please enter:         \n" +
                "            1. \"R\" for ROCK            \n" +
                "            2. \"P\" for PAPER           \n" +
                "            3. \"S\" for SCISSOR         \n");
    }

    public static void main(String[] args) {
        printInstructionsMessage();
        new UserInputParser().loopAndParseUserInput();
    }

}
