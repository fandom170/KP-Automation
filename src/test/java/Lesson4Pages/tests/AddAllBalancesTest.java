package Lesson4Pages.tests;

import Lesson4Pages.Logic.BalanceLogic;
import Lesson4Pages.pagesTest.BalancePage;
import Lesson4Pages.pagesTest.LoginPage;
import Lesson4Pages.pagesTest.UsersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddAllBalancesTest {

    WebDriver driver;
    LoginPage objLoginPage;
    UsersPage objUsersPage;
    BalancePage objBalancePage;
    BalanceLogic objBalancwLogic;

    @BeforeTest
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get(objLoginPage.address);
        objLoginPage = new LoginPage(driver);
        objLoginPage.logInAuto("admin", "123");
        objUsersPage.enterUserForEdit();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void enterAndVerifyBalance() {

        String windowHandler = driver.getWindowHandle();

        objBalancwLogic.newPopUpWindowReal();
        objBalancePage.balanceRealEnter(objBalancePage.realBalanceValue, objBalancePage.realBalanceNote);
        driver.switchTo().window(windowHandler);

        objBalancwLogic.newPopUpWindowFun();
        objBalancePage.balanceFunEnter(objBalancePage.funBalanceValue, objBalancePage.funBalanceNote);
        driver.switchTo().window(windowHandler);

        objBalancwLogic.newPopUpWindowBonus();
        objBalancePage.balanceBonusEnter(objBalancePage.bonusBalanceValue, objBalancePage.bonusBalanceNote);
        driver.switchTo().window(windowHandler);

    }


}
