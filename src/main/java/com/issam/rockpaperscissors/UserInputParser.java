package com.issam.rockpaperscissors;

import java.util.Optional;
import java.util.Scanner;

/**
 * Main entry of the game : user input parser
 */
public class UserInputParser {

    /**
     * Loop on user input lines, and play at each entered action code.
     */
    public void loopAndParseUserInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your choice : ");
        while (scan.hasNext()) {
            String userChoiceStr = scan.next().trim().toUpperCase();
            Optional<ActionTypeEnum> userChoice = ActionTypeEnum.getActionTypeEnumByCode(userChoiceStr);
            if (userChoice.isEmpty()) {
                System.err.println(String.format("Error : The value %s is not valid", userChoiceStr));
                continue;
            }
            ActionTypeEnum computerChoice = new Computer().randomAction();
            System.out.println(new Game().play(userChoice.get(), computerChoice));
            System.out.print("Please enter your choice : ");
        }
        scan.close();
    }

}
