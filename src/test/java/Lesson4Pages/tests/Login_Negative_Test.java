package Lesson4Pages.tests;

import Lesson4Pages.pagesTest.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Negative_Test extends BaseTest{

    WebDriver driver;
    LoginPage loginPage;

    @Override
    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get(loginPage.address);
        loginPage = new LoginPage(driver);
    }


    @Test
    public void loginAdminNegative() {
        //Create Login Page object
        loginPage = new LoginPage(driver);
        //Login to Admin Area
        loginPage.logInAuto("admin1", "1234");
        //assets



        }
}

