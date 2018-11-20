package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {


    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/travis.cooper/Documents/workspace/libs/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Cheese");

        element.submit();



    }

}
