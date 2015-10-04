package Lesson4Pages.tests;

import Lesson4Pages.ApplictionEntities.URLLibrary;
import Lesson4Pages.Logic.GeneralLogic;
import Lesson4Pages.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Negative_Test extends BaseTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public GeneralLogic generalLogic;

    @Override
    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get(URLLibrary.baseURL);
        loginPage = new LoginPage(driver);
    }


    @Test
    public void loginAdminNegative() {

        //arrange
        //act
        // generalLogic.logInAuto();


        //assert

        //Login to Admin Area

        //asserts


    }
}

