package Lesson4Pages.tests;

import Lesson4Pages.ApplictionEntities.AdminCredentials;
import Lesson4Pages.ApplictionEntities.URLLibrary;
import Lesson4Pages.Logic.GeneralLogic;
import Lesson4Pages.Utils.AssertsInternal;
import Lesson4Pages.pages.LoginPage;
import Lesson4Pages.pages.PlayersEditExist;
import Lesson4Pages.pages.PlayersEditNew;
import Lesson4Pages.pages.UsersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {

    public WebDriver driver;
    public LoginPage loginPage;
    public UsersPage usersPage;
    public PlayersEditExist playersEditExist;
    public PlayersEditNew playersEditNew;
    public AssertsInternal assertsInternal;
    GeneralLogic generalLogic;


    @BeforeTest
    protected void setUp() throws InterruptedException {

        assertsInternal = new AssertsInternal();
        assertsInternal.clearAssertlist ();
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        driver.get(URLLibrary.baseURL);
        generalLogic.logInAuto(loginPage, AdminCredentials.adminLogin, AdminCredentials.adminPassword);
        //usersPage = new UsersPage(driver);

    }

    @AfterTest
    protected void tearDown() {
        //driver.close();
        driver.quit();
    }

}
