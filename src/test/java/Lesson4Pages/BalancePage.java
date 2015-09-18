package Lesson4Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalancePage {
    WebDriver driver;

    @FindBy (xpath = "//input [contains (@name, '__amount')]")
    WebElement userBalanceAmountInput;

    @FindBy (xpath = "//textarea [contains(@id, '_notes')]")
    WebElement userBalanceNotesTextarea;

    //@FindBy (xpath = "//select[contains(@id, '__account')]")
    //WebElement userBalanceAccountSelect;

    @FindBy (name = "button_save")
    WebElement userBalanceSaveButton;
}

public balancePage (WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
}


    public void setUserBalanceAmount (long usBal){
        userBalanceAmountInput.sendKeys(usBal);
    }

    public void setUserBalanceNotes (String usNotes) {
        userBalanceNotesTextarea.sendKeys(usNotes);
    }

    public void clickSaveBalance (){
        userBalanceSaveButton.click();
    }

        public void balanceEnter (int usBal, String usNotes ) {
        //User balance
        this.setUserBalanceAmount(usBal);
        //Notes
        this.setUserBalanceNotes(usNotes);
        //Click save
        this.clickSaveBalance();

    }
