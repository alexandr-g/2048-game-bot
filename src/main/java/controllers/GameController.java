package controllers;


import result.Result;

public interface GameController {

    void startNewGame();

    boolean isGameFinished();

    void makeAction(Action action);

    void printField();

    Result getResult();

}
