package Lesson4Pages.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalancePage {

    WebDriver driver;

    public BalancePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[contains(@id, '__amount')]")
    WebElement userBalanceAmountInput;

    @FindBy (xpath = "//textarea[contains(@id, '__notes')]")
    WebElement userBalanceNotesTextarea;

    @FindBy (name = "button_save")
    WebElement userBalanceSaveButton;

    public void setUserBalanceAmount(String usBal) {
        userBalanceAmountInput.sendKeys(usBal);
     }

    public void setUserBalanceNotes(String usNotes) {
        userBalanceNotesTextarea.sendKeys(usNotes);
    }

    public void clickSaveBalance() {
        userBalanceSaveButton.click();
    }

    /*public void balanceFunEnter(String usBal, String usNotes) {
        //User balance
        this.setUserBalanceAmount(usBal);
        //Notes
        this.setUserBalanceNotes(usNotes);
        //Click save
        this.clickSaveBalance();

    }*/


}
