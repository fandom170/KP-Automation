package Lesson4Pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

    WebDriver driver;

    //Header of page
    @FindBy(css = ".datagrid_title_container")
    WebElement actualPageTitle;

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

    //Players label
    @FindBy(xpath = "//div[@id='header-center']")
    WebElement titleOfPageActual;

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

    public String getTitleOfPageActual () {
        return titleOfPageActual.getAttribute("value");
    }





}
