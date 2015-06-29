import controllers.GameController;
import controllers.GameControllerImpl;
import logic.GameLogic;
import logic.RandomGameLogic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import result.Result;

public class AppMain {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        GameController gameController = new GameControllerImpl(driver);
        GameLogic gameLogic = new RandomGameLogic();
        Result result = gameLogic.run(gameController);
        driver.quit();
    }
}
