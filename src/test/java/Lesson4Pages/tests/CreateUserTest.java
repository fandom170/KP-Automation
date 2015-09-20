package Lesson4Pages.tests;

import Lesson4Pages.pagesTest.LoginPage;
import Lesson4Pages.pagesTest.PlayerDataPage;
import Lesson4Pages.pagesTest.UsersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateUserTest {//extends BaseTest {

    WebDriver driver;
    LoginPage objLoginPage;
    PlayerDataPage objPLDataPage;
    UsersPage objUsersPage;



    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://193.138.245.222:81/auth/login");
        objLoginPage = new LoginPage(driver);
        objLoginPage.logInAuto("admin", "123");
        objUsersPage.clickInsertButton();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void VerifyUserNamePositive() {

        objPLDataPage.enterUserDataSave(objPLDataPage.userNameTs, objPLDataPage.usPassword, objPLDataPage.eMail,
                objPLDataPage.pLFirstname, objPLDataPage.pLLastname, objPLDataPage.pLCity, objPLDataPage.pLCity);
        objUsersPage.enterUserForEdit();
       // objPLDataPage.verifyUserData ();

    }

}
