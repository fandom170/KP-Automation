package Lesson4Pages.Logic;

import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GlobalVariables {

    WebDriver driver;

    public void GlobalVariables () {

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
    //String pL_Gender = "MALE";
    //String pL_Bithday = "12-08-1970";
    //checkboxes
    //Selects:
    //Country
    //Admin
    //gender
    }

}
