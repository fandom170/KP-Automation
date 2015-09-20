package Lesson4Pages.pagesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;


public class UsersPage {

    WebDriver driver;

    //User Name field
    @FindBy(xpath = "//input[contains(@id, '__login')]")
    WebElement userExistNameInput;

    //Insert button - change in future
    @FindBy(xpath = "@id='datagrid_actionpanel__723a925886']/a[1]/img")
    WebElement insertButton;

    // Search button
    @FindBy(name = "search")
    WebElement searchButton;

    //First Link
    @FindBy(xpath = "//div[contains(@id , 'datagrid_table')]//tr[2]/td[1]//img")
    WebElement firstLineEditButton;


    public UsersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setExistUserName(String usrName) {
        userExistNameInput.sendKeys(usrName);
    }

    public void clickInsert() {
        insertButton.click();
    }

    public void clickFirstLinkEdit() {
        firstLineEditButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickInsertButton () {
        //Click Insert button
        this.clickInsert();
    }

    public void enterUserForEdit() {
        //Insert Existing User Name

        this.setExistUserName(PlayerDataPage.userNameTs);
        //Click Search
        this.clickSearchButton();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        //Click First Link
        this.clickFirstLinkEdit();

    }

}
