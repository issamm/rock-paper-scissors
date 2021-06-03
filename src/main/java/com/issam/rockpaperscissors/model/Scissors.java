package com.issam.rockpaperscissors.model;

import com.issam.rockpaperscissors.ActionTypeEnum;

public class Scissors implements Action {

    @Override
    public int scoreAgainst(ActionTypeEnum opponentActionType) {
        if(opponentActionType == ActionTypeEnum.PAPER){
            return 1;
        }
        if(opponentActionType == ActionTypeEnum.ROCK){
            return -1;
        }
        return 0;
    }

}
