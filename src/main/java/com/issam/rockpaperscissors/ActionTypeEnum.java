package com.issam.rockpaperscissors;

import com.issam.rockpaperscissors.model.Action;
import com.issam.rockpaperscissors.model.Paper;
import com.issam.rockpaperscissors.model.Rock;
import com.issam.rockpaperscissors.model.Scissors;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * This enumeration represents the differents actions types : Rock, Paper, Scissors.
 */
@Getter
@RequiredArgsConstructor
public enum ActionTypeEnum {

    ROCK("R", Rock.class),
    PAPER("P", Paper.class),
    SCISSORS("S", Scissors.class);

    /** Action code (user must type this code). */
    private final String actionCode;
    /** Action bound to the current type. */
    private final Class<? extends Action> actionClass;
    /** Action type by action code*/
    private final static Map<String, ActionTypeEnum> actionTypeEnumByCode;

    public Action instantiateAction() {
        try {
            return actionClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException(String.format("Unable to instantiate actionClass %s", actionClass.getName()));
        }
    }

    static {
        actionTypeEnumByCode = new HashMap<>();
        Arrays.stream(ActionTypeEnum.values())
                .forEach(actionEnum -> actionTypeEnumByCode.put(actionEnum.getActionCode(), actionEnum));
    }

    /**
     * @return Action enumeration from action code (e.g. "R").
     */
    public static Optional<ActionTypeEnum> getActionTypeEnumByCode(String actionCode) {
        if (actionCode == null || actionCode.isBlank()) {
            return Optional.empty();
        }
        if (actionTypeEnumByCode.containsKey(actionCode)) {
            return Optional.of(actionTypeEnumByCode.get(actionCode));
        }
        return Optional.empty();
    }

}
