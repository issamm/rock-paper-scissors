package com.issam.rockpaperscissors;

import java.util.Random;

/**
 * Computer choosing randomly an action during the game.
 */
public class Computer {

    /**
     * @return Randomly chosen Action
     */
    public ActionTypeEnum randomAction() {
        Random random = new Random();
        int randomIndex = random.nextInt(ActionTypeEnum.values().length);
        return ActionTypeEnum.values()[randomIndex];
    }

}
