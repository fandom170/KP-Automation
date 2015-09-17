package Lesson4Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LoginTest4 {

        WebDriver driver;
        LoginPage objLogin;
    //  UserPage objUsPage;
    //  UserSearchPag objUsSearch;

        @BeforeTest
        public void setUp(){
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("http://193.138.245.222:81/auth/login");
        }
        @AfterTest
        public void tearDown (){
            driver.quit();
        }

        @Test
        public void LogTest4(){
            //Create Login Page object
            objLogin = new LoginPage(driver);
            //Login to Admin Area
            objLogin.logInAuto ("admin", "123");
            }
    }




