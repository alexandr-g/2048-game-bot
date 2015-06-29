package controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import result.Result;
import utils.Log4Test;

import static java.lang.Integer.parseInt;

public class GameControllerImpl implements GameController {

    public static final String GAME_URL = "http://gabrielecirulli.github.io/2048/";
    public static final String NEW_GAME_BUTTON = "//a[@class='restart-button']";
    public static final String GAME_OVER_MESSAGE = "//div[@class='game-message game-over']";
    public static final String GAME_CONTAINER = "game-container";
    public static final String SCORE = ".score-container";

    private WebDriver driver;

    public GameControllerImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void startNewGame() {
        Log4Test.info("Game started");
        driver.get(GAME_URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath(NEW_GAME_BUTTON)).click();
    }

    @Override
    public boolean isGameFinished() {
        return driver.findElements(By.xpath(GAME_OVER_MESSAGE)).size() != 0;
    }

    @Override
    public void makeAction(Action action) {
        Actions actions = new Actions(driver);
        driver.findElement(By.className(GAME_CONTAINER)).sendKeys(Action.randomAction().getKey());
        actions.perform();
    }

    @Override
    public void printField() {

    /*  TODO: After each step, print current games field like:

        | 2 | 0 | 4 | 8|
        | 2 | 0 | 4 | 8|
        | 2 | 0 | 4 | 8|
        | 4 | 8 | 32 | 16 |
    */

    }

    @Override
    public Result getResult() {
        int score;
        String scoreInString = driver.findElement(By.cssSelector(SCORE)).getText().trim();

        //trim '+' and spaces with regexp from score
        String[] scoreArr = scoreInString.split("\\+");
        if (scoreArr.length == 2) {
            score = parseInt(scoreArr[0].trim());
        } else {
            score = parseInt(scoreInString);
        }

        Result result = new Result();
        result.setScore(score);
        Log4Test.info("Game finished");
        Log4Test.info("Result is: " + score);
        return result;
    }

}


