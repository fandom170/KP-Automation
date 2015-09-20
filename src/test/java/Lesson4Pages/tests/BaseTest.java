package Lesson4Pages.tests;

import Lesson4Pages.pagesTest.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;

    LoginPage objLoginPage;

    @Test
    public void loginBaseTest() {
        //Create Login Page object
        objLoginPage = new LoginPage(driver);
        //Login to Admin Area
        objLoginPage.logInAuto("admin", "123");
    }
}
