package Lesson4Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;

    @FindBy (id="username")
    WebElement userNameInput;

    @FindBy (id = "password")
    WebElement userPasswordInput;

    @FindBy (id = "logIn")
    WebElement buserConfirm;

    public LoginPage (WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);

    }

    public void setUserName (String usName) {
    userNameInput.sendKeys(usName);
    }

    public void setUserPassword(String usPass) {
    userPasswordInput.sendKeys(usPass);
    }

    public void clickLogin() {
    buserConfirm.click();
    }

    public void logInAuto(String usName, String usPass ) {
    //User name
     this.setUserName(usName);
    //Password
     this.setUserPassword(usPass);
    //Click login
      this.clickLogin();

    }

}



