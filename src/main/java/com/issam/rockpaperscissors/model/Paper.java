package com.issam.rockpaperscissors.model;

import com.issam.rockpaperscissors.ActionTypeEnum;

/** Paper wins against Rock and lose against Scissors. */
public class Paper implements Action {

    @Override
    public int scoreAgainst(ActionTypeEnum opponentActionType) {
        if(opponentActionType == ActionTypeEnum.ROCK){
            return 1;
        }
        if(opponentActionType == ActionTypeEnum.SCISSORS){
            return -1;
        }
        return 0;
    }

}
