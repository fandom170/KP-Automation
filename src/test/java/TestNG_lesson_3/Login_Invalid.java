package TestNG_lesson_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 15.09.2015.
 */
public class Login_Invalid {
    @Test
    public static void Login_Test () {
        final WebDriver driver = new FirefoxDriver();

        driver.get("http://193.138.245.222:81/auth/login");

        //Enter data to Username field
        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys("Admin");

        //Enter data to Password field
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("234");

        // Now submit the form. WebDriver will find the form for us from the element
        WebElement LogIn = driver.findElement(By.id("logIn"));
        LogIn.click();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        //
        assert (driver.findElement(By.xpath(".//*[@id='username-element']/ul/li")).getText().contains("Invalid username or password"));

        driver.quit();


    }



 }
