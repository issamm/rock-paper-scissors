package com.issam.rockpaperscissors;

/**
 * Play RockPaperScissors game with two known actions.
 */
public class Game {

    /**
     * Play between two players.
     * @param userAction User action
     * @param computerAction Computer action
     * @return Result output describing the winner
     */
    public String play(ActionTypeEnum userAction, ActionTypeEnum computerAction) {
        int userScore = userAction.instantiateAction().scoreAgainst(computerAction);
        if (userScore > 0) {
            return String.format("User [%s] vs Computer [%s] : User won !", userAction.name(), computerAction.name());
        }
        if (userScore < 0) {
            return String.format("User [%s] vs Computer [%s] : Computer won !", userAction.name(), computerAction.name());
        }
        // Here, userScore = 0
        return String.format("User [%s] vs Computer [%s] : it's a draw !", userAction.name(), computerAction.name());
    }

}
