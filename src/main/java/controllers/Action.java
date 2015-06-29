package controllers;

import org.openqa.selenium.Keys;

import java.util.Random;

public enum Action {

    /**
     * Actions enum.
     */
    LEFT(Keys.ARROW_LEFT),
    RIGHT(Keys.ARROW_RIGHT),
    UP(Keys.ARROW_UP),
    DOWN(Keys.ARROW_DOWN);

    private final Keys key;

    private Action(Keys key) {
        this.key = key;
    }

    /**
     * Pick a random value of the Action enum.
     *
     * @return a random Action.
     */
    public static Action randomAction() {
        final Action[] values = Action.values();
        final int idx = new Random().nextInt(values.length);
        return values[idx];
    }

    public Keys getKey() {
        return key;
    }
}
