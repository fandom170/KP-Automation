package Lesson4Pages.tests;

import Lesson4Pages.pagesTest.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Login_Negative_Test {

    WebDriver driver;
    LoginPage objLogin;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get(objLogin.address);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginAdmin123Positive() {
        //Create Login Page object
        objLogin = new LoginPage(driver);
        //Login to Admin Area
        objLogin.logInAuto("admin1", "1234");
        //assets



        }
}

