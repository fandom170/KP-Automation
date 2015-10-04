package Lesson4Pages.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "username")
    WebElement userNameInput;

    @FindBy(id = "password")
    WebElement userPasswordInput;

    @FindBy(id = "logIn")
    WebElement userConfirmButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void setUserName(String adminLogin) {
        userNameInput.sendKeys(adminLogin);
    }

    public void setUserPassword(String adminPassword) {
        userPasswordInput.sendKeys(adminPassword);
    }

    public void clickLogin() {
        userConfirmButton.click();
    }




}



