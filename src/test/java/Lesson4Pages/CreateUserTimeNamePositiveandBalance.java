package Lesson4Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateUserTimeNamePositiveandBalance {
    WebDriver driver;
    LoginPage objLogin;
    PlayerDataPage objPLData;
    UsersPage objUsers;
    BalancePage objBalance;

    @BeforeTest
    public void setUp (){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://193.138.245.222:81/auth/login");
        objLogin = new LoginPage(driver);
        objLogin.logInAuto("admin", "123");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);


    }
    @AfterTest
    public void tearDown (){
        driver.quit();
    }

    @Test
    public void createUserTimeNamePositive () {
        objUsers.createNewUser();
        objPLData.enterUserDataSave();
        objUsers.enterUserForEdit(objPLData.userNameTs);
        objPLData.runAddingRealMoneyBalance ();
        objBalance.balanceEnter(100, "Just for Test");
    }

}
