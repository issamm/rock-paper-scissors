package com.issam.rockpaperscissors.model;

import com.issam.rockpaperscissors.ActionTypeEnum;

public class Rock implements Action {

    @Override
    public int scoreAgainst(ActionTypeEnum opponentActionType) {
        if(opponentActionType == ActionTypeEnum.SCISSORS){
            return 1;
        }
        if(opponentActionType == ActionTypeEnum.PAPER){
            return -1;
        }
        return 0;
    }

}
