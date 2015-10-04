package Lesson4Pages.tests;


import org.testng.annotations.Test;

public class AddAllBalancesTest extends BaseTest {


   @Test
   public void enterAndVerifyBalance (){
       //open player

       //Arrange
       //read balances values

       //open window with balances

       //Assert
       //verify new added balances


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
