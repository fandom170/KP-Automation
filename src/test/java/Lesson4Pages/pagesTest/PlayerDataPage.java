package Lesson4Pages.pagesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlayerDataPage {
    WebDriver driver;

    //Declaration of variables
    //Main user name
    private static String userName00 = "Us";
    private static Date now = new Date();
    private static DateFormat formatter = new SimpleDateFormat("ddMMyyHHmm");
    private static String s = formatter.format(now);
    public static String userNameTs = userName00 + s;
    //Email Address
    private static String eMail00 = "@test.com.ua";
    public static String eMail = userNameTs + eMail00;

    //Other Variables
    public String usPassword = "ABCDEFGH";
    public String pLFirstname = "Alexander";
    public String pLLastname = "Nikolayev";
    public String pLCity = "Odessa";
    //String Country
    //String PL_Address = "187-Avenue";
    private String pLPhone = "+000-00-00-00";
    //String pL_Gender = "MALE";
    //String pL_Bithday = "12-08-1970";
    //checkboxes
    //Selects:
    //Country
    //Admin
    //gender

    // User Name
    @FindBy(xpath = "//input[contains(@id, 'us_login')]")
    WebElement userNameNewInput;

    @FindBy(xpath = "//input[contains(@id, 'us_email')]")
    WebElement userEmailNewInput;

    @FindBy(xpath = "//input[contains(@id, 'us_password')]")
    WebElement userPassNewInput;

    @FindBy(xpath = "//input[contains(@id, 'confirm_password')]")
    WebElement userPassNewConfirmInput;

    @FindBy(xpath = "//input[contains(@id, 'us_fname')]")
    WebElement userFirsNameNewInput;

    @FindBy(xpath = "//input[contains(@id, 'us_lname')]")
    WebElement userLastNameNewInput;

    @FindBy(xpath = "//input[contains(@id, 'us_city')]")
    WebElement userCityNewInput;

    @FindBy(xpath = "//input[contains(@id, 'us_phone')]")
    WebElement userPhoneNewInput;

    @FindBy(name = "button_save")
    WebElement userSaveButton;


    //Balances - need to find new XPath
    @FindBy(xpath = "//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/a/img")
    WebElement addRealMoneyBalanceButton;

    @FindBy (xpath = ".//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[4]/a/img")
    WebElement addFunMoneyBalanceButton;

    @FindBy (xpath = ".//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[4]/td[4]/a/img")
    WebElement addBonusDollarsButton;



    public PlayerDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setNewUserName(String userNameTs) {
        userNameNewInput.sendKeys(userNameTs);
    }

    public void setNewUserEmail(String eMail) {
        userEmailNewInput.sendKeys(PlayerDataPage.eMail);
    }

    public void setUserPassNewInput(String us_Password) {
        userPassNewInput.sendKeys(us_Password);
    }

    public void setUserPassNewConfirmInput(String us_Password) {
        userPassNewConfirmInput.sendKeys(us_Password);
    }

    public void setUserFirsNameNewInput(String pL_Firstname) {
        userFirsNameNewInput.sendKeys(pL_Firstname);
    }

    public void setUserLastNameNewInput(String pL_Lastname) {
        userLastNameNewInput.sendKeys(pL_Lastname);
    }

    public void setUserCityNewInput(String pL_City) {
        userCityNewInput.sendKeys(pL_City);
    }

    public void setUserPhoneNewInput(String pL_Phone) {
        userPhoneNewInput.sendKeys(pL_Phone);
    }

    public void clicknewUserSaveButton() {
        userSaveButton.click();
    }

    public void enterUserDataSave( String usName, String UsPass, String email, String FN, String LN,
                                   String City, String Phone) {
        this.setNewUserName(usName);
        this.setNewUserEmail(email);
        this.setUserPassNewInput(UsPass);
        this.setUserPassNewConfirmInput(UsPass);
        this.setUserFirsNameNewInput(FN);
        this.setUserLastNameNewInput(LN);
        this.setUserCityNewInput(City);
        this.setUserPhoneNewInput(Phone);
        this.clicknewUserSaveButton();
    }

    public void openBalancePageRealMoney() {
        addRealMoneyBalanceButton.click();
    }

    public void openBalancePageFunMoney() {
        addFunMoneyBalanceButton.click();
    }

    public void openBalancePageBonusMoney() {
        addBonusDollarsButton.click();
    }

    //public void runAddingRealMoneyBalance() {
     //   this.openBalancePageRealMoney();
   // }

    //public  void runAddingFunMoneyBalance () {
    //    this.openBalancePageFunMoney();
    //}

    //public  void runAddingBonusMoneyBalance () {
     //   this.openBalancePageBonusMoney();
    //}
}

