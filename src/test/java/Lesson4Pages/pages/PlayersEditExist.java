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






    //







    //Value of Balance
}
