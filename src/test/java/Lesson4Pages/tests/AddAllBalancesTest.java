package Lesson4Pages.tests;


import Lesson4Pages.ApplictionEntities.PlayerBuilder;
import Lesson4Pages.Logic.Player;
import org.testng.annotations.Test;

import java.util.Set;

public class AddAllBalancesTest extends BaseTest {

    String amountReal = "10";
    String amountFun = "22";
    String amountBonus = "33";

    String notesReal = "TestRealBalance";
    String notesFun = "TestFunBalance";
    String notesBonus = "TestBonusBalance";

   @Test
   public void enterAndVerifyBalance (){

       //SwitchWindow switchWindow = new SwitchWindow();
       //open player
       generalLogic.enterUserForBalance();
       //Arrange data

       Player playerInitial = new PlayerBuilder()
               .withRealAmount(playersEditExist.getRealAmount())
               .withFunAmount(playersEditExist.getFunAmount())
               .withBonusAmount(playersEditExist.getBonusAmount())
               .build();


       //open window with balances and adding amount
       Set<String> oldWindowsSet = driver.getWindowHandles();


       //switchWindow.oldWindows (driver);
       generalLogic.openBalancePage();
       Set<String> newWindowsSet = driver.getWindowHandles();
       newWindowsSet.removeAll(oldWindowsSet);
       String newWindowHandle = newWindowsSet.iterator().next();
       driver.switchTo().window(newWindowHandle);
       //switchWindow.newWindows (driver);
       generalLogic.balanceEnter(amountReal, notesReal);

       //switchWindow.oldWindows(driver);
       generalLogic.openFunPage();
       Set<String> newWindowsSetFun = driver.getWindowHandles();
       newWindowsSet.removeAll(oldWindowsSet);
       String newWindowHandleFun = newWindowsSetFun.iterator().next();
       driver.switchTo().window(newWindowHandleFun);
       //switchWindow.newWindows (driver);
       generalLogic.balanceEnter(amountFun, notesFun);

       //switchWindow.oldWindows(driver);
       generalLogic.openBonusPage();
       Set<String> newWindowsSetBonus = driver.getWindowHandles();
       newWindowsSet.removeAll(oldWindowsSet);
       String newWindowHandleBonus = newWindowsSetBonus.iterator().next();
       driver.switchTo().window(newWindowHandleBonus);
       //switchWindow.newWindows (driver);
       generalLogic.balanceEnter(amountBonus, notesBonus);


       //Assert
       Player playerChanged = new PlayerBuilder()
               .withRealAmount(playersEditExist.getRealAmount())
               .withFunAmount(playersEditExist.getFunAmount())
               .withBonusAmount(playersEditExist.getBonusAmount())
               .build();

       //verify new added balances
       assertsInternal.assertCheckEqual(playerChanged.realBalancePlayer, playerInitial.realBalancePlayer);
       assertsInternal.assertCheckEqual(playerChanged.funBalancePlayer,  playerInitial.funBalancePlayer);
       assertsInternal.assertCheckEqual(playerChanged.bonusBalancePlayer,  playerInitial.bonusBalancePlayer);

       //print errors
       assertsInternal.printErrors();

   }
   /*
    public void enterAndVerifyBalance() {
        BalancePage balancePage;


        // usersPage.enterUserForEdit(GlobalVariables.userNameExpected);

        String windowHandler = driver.getWindowHandle();

        balanceLogic.newPopUpWindowReal();
        balancePage.balanceRealEnter(balancePage.realBalanceValue, balancePage.realBalanceNote);
        driver.switchTo().window(windowHandler);

        balanceLogic.newPopUpWindowFun();
        balancePage.balanceFunEnter(balancePage.funBalanceValue, balancePage.funBalanceNote);
        driver.switchTo().window(windowHandler);

        balanceLogic.newPopUpWindowBonus();
        balancePage.balanceBonusEnter(balancePage.bonusBalanceValue, balancePage.bonusBalanceNote);
        driver.switchTo().window(windowHandler);

    }*/


}
