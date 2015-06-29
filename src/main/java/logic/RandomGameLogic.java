package logic;

import controllers.Action;
import controllers.GameController;
import result.Result;

public class RandomGameLogic implements GameLogic {

    @Override
    public Result run(GameController gameController) {
        gameController.startNewGame();

        while (!gameController.isGameFinished()) {
            gameController.makeAction(Action.randomAction());
            gameController.printField();
        }

        return gameController.getResult();

    }

}

