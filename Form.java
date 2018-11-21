import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {

    public static void main(String[] arge){

        System.setProperty("webdriver.chrome.driver", "/Users/travis.cooper/Documents/workspace/libs/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Travis");
        driver.findElement(By.id("last-name")).sendKeys("Cooper");
        driver.findElement(By.id("job-title")).sendKeys("Software Engineer");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("Option[value='4'")).click();
        driver.findElement(By.id("datepicker")).sendKeys("11/22/2018");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();


        driver.quit();

    }

}
