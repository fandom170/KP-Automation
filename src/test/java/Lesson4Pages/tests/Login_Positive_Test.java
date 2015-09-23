package Lesson4Pages.tests;

import Lesson4Pages.pagesTest.UsersPage;
import org.junit.Assert;
import org.testng.annotations.Test;


public class Login_Positive_Test extends BaseTest {

    //WebDriver driver;
    public UsersPage userdataPage;

    @Test
    public void loginAdmin123Positive() throws Exception {
        //Create Login Page object
        //loginPage = new LoginPage(driver);
        //Login to Admin Area
        //loginPage.logInAuto("admin", "123");
        //assert
        try {
           Assert.assertEquals("Wrong Login", "Administration Area", userdataPage.adminAreaLabelExpected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}




