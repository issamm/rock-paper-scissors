package com.issam.rockpaperscissors.model;

import com.issam.rockpaperscissors.ActionTypeEnum;

/** Super class of all actions : Paper, Rock, Scissors. */
public interface Action {

    /**
     * Determine the score of the implemented action against the given action type.
     * @param opponentActionType
     * @return
     */
    int scoreAgainst(ActionTypeEnum opponentActionType);

}
