package Lesson4Pages.Logic;


import Lesson4Pages.pages.BalancePage;
import Lesson4Pages.pages.LoginPage;
import Lesson4Pages.pages.PlayersEditExist;
import Lesson4Pages.pages.UsersPage;

public class GeneralLogic {

    UsersPage usersPage;
    PlayersEditExist playersEditExist;
    BalancePage balancePage;

    public void logInAuto(LoginPage loginPage, String adminLogin, String adminPassword) {
        //User name
        loginPage.setUserName(adminLogin);
        //Password
        loginPage.setUserPassword(adminPassword);
        //Click login
        loginPage.clickLogin();

    }

    /*public void enterUserDataSave(String usName, String UsPass, String email, String FN, String LN,
                                  String City, String Phone) {
        playersEditNew.setNewUserName(usName);
        playersEditNew.setNewUserEmail(email);
        playersEditNew.setUserPassNewInput(UsPass);
        playersEditNew.setUserPassNewConfirmInput(UsPass);
        playersEditNew.setUserFirsNameNewInput(FN);
        playersEditNew.setUserLastNameNewInput(LN);
        playersEditNew.setUserCityNewInput(City);
        playersEditNew.setUserPhoneNewInput(Phone);
        playersEditNew.clicknewUserSaveButton();
    }*/

    public void clickInsertButton() {
        //Click Insert button
        usersPage.clickInsert();
    }

    public void enterUserForEdit(String usName) {
        //Insert Existing User Name

        usersPage.setExistUserName(usName);
        //Click Search
        usersPage.clickSearchButton();
        //Click First Link
        usersPage.clickFirstLinkEdit();

    }

    public void enterUserForBalance() {

        //Click First Link
        usersPage.clickFirstLinkEdit();

    }

    public void openBalancePage () {
        playersEditExist.clickAddRealAmountButton();

    }

    public void openFunPage () {
        playersEditExist.clickAddFunAmountButton();

    }

    public void openBonusPage () {
        playersEditExist.clickAddBonusAmountButton();

    }
    public void balanceEnter(String usBal, String usNotes) {

        //User balance
        balancePage.setUserBalanceAmount(usBal);
        //Notes
        balancePage.setUserBalanceNotes(usNotes);
        //Click save
        balancePage.clickSaveBalance();

    }


}
