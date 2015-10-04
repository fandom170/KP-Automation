package Lesson4Pages.Logic;


import Lesson4Pages.pages.LoginPage;
import Lesson4Pages.pages.UsersPage;

public class GeneralLogic {

    //PlayersEditNew playersEditNew;
    UsersPage usersPage;

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


}
