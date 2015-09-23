package Lesson4Pages.tests;

import Lesson4Pages.pagesTest.PlayerDataPage;
import Lesson4Pages.pagesTest.UsersPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateUserTest extends BaseTest {

    WebDriver driver;


    @Test
    public void createNewUserPositive() {
        //New Pages
        usersPage = new UsersPage(driver);
        playerDataPage = new PlayerDataPage(driver);
        //Click Insert
        usersPage.clickInsertButton();
        //Enter User Data

        //Declaration of variables
        //Main user name
        Date now = new Date();
        DateFormat formatter = new SimpleDateFormat("ddMMyyHHmm");
        String s = formatter.format(now);
        String userNameExpected = "Us" + s;
        //Email Address
        String eMailExpected = userNameExpected + "@test.com.ua";
        //Other Variables
        String usPasswordExpected = "ABCDEFGH";
        String pLFirstnameExpected = "Alexander";
        String pLLastnameExpected = "Nikolayev";
        String pLCityExpected = "Odessa";
        //String Country
        //String PL_Address = "187-Avenue";
        String pLPhoneExpected = "000-00-00-00";


        playerDataPage.enterUserDataSave(userNameExpected, usPasswordExpected, eMailExpected,
                pLFirstnameExpected, pLLastnameExpected, pLCityExpected, pLPhoneExpected);
        usersPage.enterUserForEdit(userNameExpected);

        //asserts
        try {
            Assert.assertNotEquals("IncorrectFirstName", driver.findElement(By.xpath ("//input[contains(@id, 'us_fname')]")),
                    pLFirstnameExpected);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
