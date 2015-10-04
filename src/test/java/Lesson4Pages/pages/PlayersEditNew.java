package Lesson4Pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayersEditNew {

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


    public PlayersEditNew(WebDriver driver) {
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

    /*public String getGenderActualValue() {
        return new Select(genderCombobox).getFirstSelectedOption().getText();
    }*/

}

