package Lesson4Pages.tests;

import Lesson4Pages.pagesTest.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Positive_Test {

    WebDriver driver;
    LoginPage objLoginPage;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://193.138.245.222:81/auth/login");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void loginAdmin123Positive() {
        //Create Login Page object
        objLoginPage = new LoginPage(driver);
        //Login to Admin Area
        objLoginPage.logInAuto("admin", "123");

    }
}




