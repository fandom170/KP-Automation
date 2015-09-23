package Lesson4Pages.pagesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayerDataPage {
    WebDriver driver;

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

    //Value of Balance


    public PlayerDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setNewUserName(String userNameTs) {
        userNameNewInput.sendKeys(userNameTs);
    }

    public void setNewUserEmail(String eMail) {
        userEmailNewInput.sendKeys(eMail);
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

    public void setUserPhoneNewInput(String pLPhone) {
        userPhoneNewInput.sendKeys(pLPhone);
    }

    public void clicknewUserSaveButton() {
        userSaveButton.click();
    }

    public void enterUserDataSave(String usName, String UsPass, String email, String FN, String LN,
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




}

