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
public class Login_Positive {
    @Test
    public static void Login_Test() {
        final WebDriver driver = new FirefoxDriver();

        driver.get("http://193.138.245.222:81/auth/login");

        //Enter data to Username field
        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys("Admin");

        //Enter data to Password field
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("123");

        // Submit the form.
        WebElement LogIn = driver.findElement(By.id("logIn"));
        LogIn.click();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        //Verifying that page loaded
        assert (driver.findElement(By.xpath(".//*[@id='datagrid__723a925886']/div[1]")).getText().contains("Players"));

        driver.quit();


    }


}


