package Lesson4Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PlayerDataPage {
    WebDriver driver;

    //Main user name
    String userName00 = "Us";
    Date now = new Date();
    DateFormat formatter = new SimpleDateFormat("ddMMyyHHmm");
    String s = formatter.format(now);
    String userNameTs = userName00 + s;
    //Email Address
    String eMail00 = "@test.com.ua";
    String eMail = userNameTs + eMail00;

    //Other Variables
    String us_Password = "ABCDEFGH";
    String pL_Firstname = "Alexander";
    String pL_Lastname = "Nikolayev";
    String pL_City = "Odessa";
    //String Country
    //String pL_Address = "187-Avenue";
    String pL_Phone = "+000-00-00-00";
    //String pL_Gender = "MALE";
    //String pL_Bithday = "12-08-1970";
    //checkboxes
    //Selects:
    //Country
    //Admin
    //gender

    // User Name
    @FindBy (xpath ="//input[contains(@id, 'us_login')]" )
    WebElement userNameNewInput;

    @FindBy (xpath = "//input[contains(@id, 'us_email')]")
    WebElement userEmailNewInput;

    @FindBy (xpath = "//input[contains(@id, 'us_password')]")
    WebElement userPassNewInput;

    @FindBy (xpath = "//input[contains(@id, 'confirm_password')]")
    WebElement userPassNewConfirmInput;

    @FindBy (xpath = "//input[contains(@id, 'us_fname')]")
    WebElement userFirsNameNewInput;

    @FindBy (xpath = "//input[contains(@id, 'us_lname')]")
    WebElement userLastNameNewInput;

    @FindBy (xpath = "//input[contains(@id, 'us_city')]")
    WebElement userCityNewInput;

    @FindBy (xpath = "//input[contains(@id, 'us_phone')]")
    WebElement userPhoneNewInput;

    @FindBy (name = "button_save")
    WebElement userSaveButton;

    public PlayerDataPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setNewUserName (String userNameTs) {
        userNameNewInput.sendKeys(userNameTs);
    }

    public void setNewUserEmail (String eMail) {
        userEmailNewInput.sendKeys(eMail);
    }

    public void setUserPassNewInput (String us_Password) {
        userPassNewInput.sendKeys(us_Password);
    }

    public void setUserPassNewConfirmInput (String us_Password) {
        userPassNewConfirmInput.sendKeys(us_Password);
    }

    public void setUserFirsNameNewInput (String pL_Firstname){
        userFirsNameNewInput.sendKeys(pL_Firstname);
    }

    public void setUserLastNameNewInput (String pL_Lastname){
        userLastNameNewInput.sendKeys(pL_Lastname);
    }

    public void setUserCityNewInput (String pL_City) {
        userCityNewInput.sendKeys(pL_City);
    }

    public void setUserPhoneNewInput (String pL_Phone) {
        userPhoneNewInput.sendKeys(pL_Phone);
    }

    public void clicknewUserSaveButton (){
        userSaveButton.click();
    }

    public void enterUserDataSave() {
        this.setNewUserName(userNameTs);
        this.setNewUserEmail(eMail);
        this.setUserPassNewInput(us_Password);
        this.setUserPassNewConfirmInput(us_Password);
        this.setUserFirsNameNewInput(pL_Firstname);
        this.setUserLastNameNewInput(pL_Lastname);
        this.setUserCityNewInput(pL_City);
        this.setUserPhoneNewInput(pL_Phone);
        this.clicknewUserSaveButton();
    }

    @FindBy (xpath = "//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/a/img")
    WebElement addRealMoneyBalanceButton;

    public void openBalancePageFunMoney (){
        addRealMoneyBalanceButton.click();
    }

    public void runAddingRealMoneyBalance (){
        this.openBalancePageFunMoney();
        }


}

