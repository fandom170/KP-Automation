
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

/**
 * Created by Admin on 13.09.2015.
 */
public class Test_003_New_User_Data {
    public static void main(String[] args) {


        //Declaration of WebDriver
        WebDriver driver = new FirefoxDriver();

        //Declaration of variables


        String Username00 = "Username_";

        /*String Date01;
            Date01 = new Date01(System.currentTimeMillis());
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date Date00;
            Date00 = new Date00(dateFormat + Date01);
            // New Username shall be generated*/
        //Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        String UsernameTs = Username00 + format1;
        //Email Address
        String Email00 = "@test.com.ua";
        //String EmailTs = "KP" + Date00 + Email00;
        String EmailTs = "KP" + format1 + Email00;


        //Other Variables
        String Us_Password = "12345678";
        String PL_Firstname = "Alexander";
        String PL_Lastname = "Nikolayev";
        String PL_City = "Odessa";

        //String Country
        String PL_Address = "187-Avenue";
        String PL_Phone = "+000-00-00-00";
        String PL_Gender = "MALE";
        String PL_Bithday = "12-08-1970";

        //checkboxes

        //Select
        //Country
        //Admin
        //gender


        // Opening of Login Page
        driver.get("http://193.138.245.222:81/auth/login");

        //Enter data to Username field
        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys("Admin");

        //Enter data to Password field
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("123");

        // Now submit the form. WebDriver will find the form for us from the element
        WebElement LogIn = driver.findElement(By.id("logIn"));
        LogIn.submit();
         /* test 001 finished. Beginning of test 002*/
        //Click on Insert link

        // WebElement Insert = driver.findElement(By.ByCssSelector("div.datagrid_actions_container a+a"));
        WebElement Insert = driver.findElement(By.xpath("//*[@id='datagrid_actionpanel__723a925886']/a[2]"));
        Insert.submit();
        /* test 002 finished. test 003begins*/


        //Waiting for page load
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        //Enter UserName
        WebElement UserName = driver.findElement(By.xpath("//input[contains(@id, 'us_login')]"));
        UserName.sendKeys(UsernameTs);
        //Enter email
        WebElement Email = driver.findElement(By.xpath("//input[contains(@id, 'us_email')]"));
        Email.sendKeys(EmailTs);
        //Enter Password and confirm it
        WebElement CPassword = driver.findElement(By.xpath("//input[contains(@id, 'us_password')]"));
        CPassword.sendKeys(Us_Password);
        WebElement CMPassword = driver.findElement(By.xpath("//input[contains(@id, 'confirm_password')]"));
        CMPassword.sendKeys(Us_Password);
        //Enter User first name, last name, city, address, phone
        WebElement FN = driver.findElement(By.xpath("//input[contains(@id, 'us_fname')]"));
        FN.sendKeys(PL_Firstname);
        WebElement LN = driver.findElement(By.xpath("//input[contains(@id, 'us_lname')]"));
        LN.sendKeys(PL_Lastname);
        WebElement CITY = driver.findElement(By.xpath("//input[contains(@id, 'us_city')]"));
        CITY.sendKeys(PL_City);
        WebElement ADDR = driver.findElement(By.xpath("//input[contains(@id, 'us_address')]"));
        ADDR.sendKeys(PL_Address);
        WebElement PHN = driver.findElement(By.xpath("//input[contains(@id, 'us_phone')]"));
        PHN.sendKeys(PL_Phone);

        //Click on save button
        WebElement SaveCR = driver.findElement(By.name("button_save"));
        SaveCR.submit();
        //waiting for page load
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
/*_____________________________________________________________*/

        // content of TC 004
        //looking for a field  and enter data
        WebElement FNfield = driver.findElement(By.xpath("//input[contains(@id, '__login')]"));
        FNfield.sendKeys(UsernameTs);
        //click on search button
        WebElement Search = driver.findElement(By.name("search"));
        Search.click();
        //waiting for page load
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

/*____________________________________________________________*/

        // content of TC 005
        // Opening of first Link
        WebElement FirstRes = driver.findElement(By.xpath("//div[contains(@id , 'datagrid_table')]//tr[2]/td[1]//img"));
        FirstRes.click();

/*____________________________________________________________*/

        //Content of TC 006
        //Verifying of Data
        //User Name
        assert (driver.findElement(By.xpath("//input[contains(@id, 'us_login')]")).getText().contains(UsernameTs));
        //User email
        assert (driver.findElement(By.xpath("//input[contains(@id, 'us_email')]")).getText().contains(EmailTs));
        //First Name
        assert (driver.findElement(By.xpath("//input[contains(@id, 'us_fname')]")).getText().contains(PL_Firstname));
        //Last Name
        assert (driver.findElement(By.xpath("//input[contains(@id, 'us_lname')]")).getText().contains(PL_Lastname));
        //City
        assert (driver.findElement(By.xpath("//input[contains(@id, 'us_city')]")).getText().contains(PL_City));
        //Address
        assert (driver.findElement(By.xpath("//input[contains(@id, 'us_address')]")).getText().contains(PL_Address));
        //Phone
        assert (driver.findElement(By.xpath("//input[contains(@id, 'us_phone')]")).getText().contains(PL_Phone));
        //Country
        //Gender
        //Birthday
        //Real Money
        assert (driver.findElement(By.xpath("//td[@id='c5618e27f0ab6d90d503b6ef5faca34c']//tr[2]/td[2]")).getText().contains("0.00"));
        //fun Money
        assert (driver.findElement(By.xpath("//td[@id='c5618e27f0ab6d90d503b6ef5faca34c']//tr[2]//tr[2]/td[2]")).getText().contains("1,000"));
        //Bonus Dollars
        assert (driver.findElement(By.xpath("//td[@id='c5618e27f0ab6d90d503b6ef5faca34c']//tr[2]//tr[4]/td[2]")).getText().contains(UsernameTs));
        //Loyality Points
        assert (driver.findElement(By.xpath("//td[@id='c5618e27f0ab6d90d503b6ef5faca34c']//tr[2]/td/table/tbody/tr[5]/td[2]")).getText().contains(UsernameTs));

        //Click Exit on the page
        WebElement Quit = driver.findElement(By.linkText("/ auth/logout"));
        Quit.click();
        //Exit from the Browser
        driver.quit();


    }
}







