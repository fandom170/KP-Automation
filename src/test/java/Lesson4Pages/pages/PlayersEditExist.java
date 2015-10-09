package Lesson4Pages.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayersEditExist {

    WebDriver driver;

    // User Name
    @FindBy(xpath = "//input[contains(@id, 'us_login')]")
    WebElement userNameExistInput;

    @FindBy(xpath = "//input[contains(@id, 'us_email')]")
    WebElement userEmailExistInput;

    @FindBy(xpath = "//input[contains(@id, 'us_fname')]")
    WebElement userFirsNameExistInput;

    @FindBy(xpath = "//input[contains(@id, 'us_lname')]")
    WebElement userLastNameExistInput;

    @FindBy(xpath = "//input[contains(@id, 'us_city')]")
    WebElement userCityExistInput;

    @FindBy(xpath = "//input[contains(@id, 'us_phone')]")
    WebElement userPhoneExistInput;

    //Balances - need to find new XPath
    @FindBy(xpath = "//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/a/img")
    WebElement addRealMoneyBalanceButton;

    @FindBy(xpath = ".//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[4]/a/img")
    WebElement addFunMoneyBalanceButton;

    @FindBy(xpath = ".//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[4]/td[4]/a/img")
    WebElement addBonusDollarsButton;

    //Balances - displayed Amount
    @FindBy (xpath = ".//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]")
    WebElement existRealMoneyAmount;

    @FindBy (xpath = ".//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]")
    WebElement existFunMoneyAmount;

    @FindBy (xpath = ".//*[@id='c5618e27f0ab6d90d503b6ef5faca34c']/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]")
    WebElement existBonusMoneyAmount;


    public PlayersEditExist (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Get element values
    public String getUserNameActual() {
        return userNameExistInput.getAttribute("value");
    }


    public String getUserEmailActual() {
        return userEmailExistInput.getAttribute("value");
    }

    public String getUserFirstNameActual() {
        return userFirsNameExistInput.getAttribute("value");
    }

    public String getUserLastNameActual() {
        return userLastNameExistInput.getAttribute("value");
    }

    public String getUserCityActual() {
        return userCityExistInput.getAttribute("value");
    }

    public String getUserPhoneActual() {
        return userPhoneExistInput.getAttribute("value");
    }

    public void clickAddRealAmountButton() {
        addRealMoneyBalanceButton.click();
    }

    public void clickAddFunAmountButton() {
        addFunMoneyBalanceButton.click();
    }

    public void clickAddBonusAmountButton() {
        addBonusDollarsButton.click();
    }


    public String getRealAmount () {
      return existRealMoneyAmount.getAttribute("value");
    }

    public String getFunAmount () {
       return existFunMoneyAmount.getAttribute("value");
    }

    public String getBonusAmount () {
        return existBonusMoneyAmount.getAttribute("value");
    }



}
