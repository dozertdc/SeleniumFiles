import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToActiveWindow {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Users/travis.cooper/Documents/workspace/libs/selenium/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.get("http://formy-project.herokuapp.com/switch-window");

            WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
            newTabButton.click();

            String originalHandle = driver.getWindowHandle();

            for(String handle1: driver.getWindowHandles()) {
                driver.switchTo().window(handle1);
            }

            driver.switchTo().window(originalHandle);

            driver.quit();

        }

}
