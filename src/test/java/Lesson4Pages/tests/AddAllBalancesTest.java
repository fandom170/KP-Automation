package Lesson4Pages.tests;

import Lesson4Pages.Logic.BalanceLogic;
import Lesson4Pages.pagesTest.BalancePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddAllBalancesTest extends BaseTest {

    WebDriver driver;
    //LoginPage loginPage;
   // UsersPage usersPage;
    BalancePage balancePage;
    BalanceLogic balanceLogic;

    //@BeforeTest
    //public void setUp() {
    //    driver = new FirefoxDriver();
    //    driver.get(loginPage.address);
    //    loginPage = new LoginPage(driver);
     //   loginPage.logInAuto("admin", "123");

    //}

    //@AfterTest
    //public void tearDown() {
    //    driver.quit();
    //}

    @Test
    public void enterAndVerifyBalance() {


       // usersPage.enterUserForEdit(GlobalVariables.userNameExpected);

        String windowHandler = driver.getWindowHandle();

        balanceLogic.newPopUpWindowReal();
        balancePage.balanceRealEnter(balancePage.realBalanceValue, balancePage.realBalanceNote);
        driver.switchTo().window(windowHandler);

        balanceLogic.newPopUpWindowFun();
        balancePage.balanceFunEnter(balancePage.funBalanceValue, balancePage.funBalanceNote);
        driver.switchTo().window(windowHandler);

        balanceLogic.newPopUpWindowBonus();
        balancePage.balanceBonusEnter(balancePage.bonusBalanceValue, balancePage.bonusBalanceNote);
        driver.switchTo().window(windowHandler);

    }


}
