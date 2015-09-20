package Lesson4Pages.Logic;

import Lesson4Pages.pagesTest.PlayerDataPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class BalanceLogic {
    WebDriver driver;

    PlayerDataPage objPlayerDataPage;

    public BalancePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void newPopUpWindowReal (){


        Set<String> oldWindowsSet = driver.getWindowHandles();
        objPlayerDataPage.openBalancePageRealMoney();
        Set<String> newWindowsSet = driver.getWindowHandles();
        newWindowsSet.removeAll(oldWindowsSet);
        String newWindowHandle = newWindowsSet.iterator().next();
        driver.switchTo().window(newWindowHandle);
    }

    public void newPopUpWindowFun (){

        Set<String> oldWindowsSet = driver.getWindowHandles();
        objPlayerDataPage.openBalancePageFunMoney();
        Set<String> newWindowsSet = driver.getWindowHandles();
        newWindowsSet.removeAll(oldWindowsSet);
        String newWindowHandle = newWindowsSet.iterator().next();
        driver.switchTo().window(newWindowHandle);
    }

    public void newPopUpWindowBonus (){

        Set<String> oldWindowsSet = driver.getWindowHandles();
        objPlayerDataPage.openBalancePageBonusMoney();
        Set<String> newWindowsSet = driver.getWindowHandles();
        newWindowsSet.removeAll(oldWindowsSet);
        String newWindowHandle = newWindowsSet.iterator().next();
        driver.switchTo().window(newWindowHandle);
    }



}
