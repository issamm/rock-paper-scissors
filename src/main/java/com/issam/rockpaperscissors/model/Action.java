package com.issam.rockpaperscissors.model;

import com.issam.rockpaperscissors.ActionTypeEnum;

/**
 * Super class of all actions : Paper, Rock, Scissors.
 * Theses actions will determine the result from the given opponent action type.
 */
public interface Action {

    /**
     * Determine the score of the implemented action against the given action type.
     * @param opponentActionType The opponent action
     * @return And integer representing the result :
     * A positive number if the current implementation wins against the given opponent action type,
     * A negative number if the current implementation lose against the given opponent action type,
     * 0 if it's a draw.
     */
    int scoreAgainst(ActionTypeEnum opponentActionType);

}
