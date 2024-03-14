import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Test;

import java.time.Duration;


@Execution(ExecutionMode.CONCURRENT)
public class courseselenium
{
    static WebDriver driver = new ChromeDriver();
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



    @Test
    public  void StartPage ()
    {


        driver.get("https://www.google.ru/?hl=ru");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("html")));

        driver.quit();

    }


}
