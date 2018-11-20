package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouseInput {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/travis.cooper/Documents/workspace/libs/selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Travis Cooper");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();

    }

}
