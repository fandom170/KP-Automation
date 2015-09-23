package Lesson4Pages.tests;

import Lesson4Pages.pagesTest.LoginPage;
import Lesson4Pages.pagesTest.PlayerDataPage;
import Lesson4Pages.pagesTest.UsersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public PlayerDataPage playerDataPage;
    public UsersPage usersPage;


    @BeforeTest
    protected void setUp () throws InterruptedException
    {
        driver = new FirefoxDriver();
        driver.get("http://193.138.245.222:81/auth/login");
        loginPage = new LoginPage(driver);
        loginPage.logInAuto("admin", "123");
    }

    @AfterTest
    protected void tearDown () {
        driver.quit();
    }

}
