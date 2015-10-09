package Lesson4Pages.tests;


import Lesson4Pages.ApplictionEntities.PlayerBuilder;
import Lesson4Pages.Logic.GeneralLogic;
import Lesson4Pages.Logic.Player;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateUserTest extends BaseTest {

    public GeneralLogic generalLogic;

    //Declaration of variables
    Date now = new Date();
    DateFormat formatter = new SimpleDateFormat("ddMMyyHHmm");
    String s = formatter.format(now);
    String userNameExpected = "Us" + s;
    String eMailExpected = userNameExpected + "@test.com.ua";
    String usPasswordExpected = "ABCDEFGH";
    String pLFirstnameExpected = "Alexander";
    String pLLastnameExpected = "Nikolayev";
    String pLCityExpected = "Odessa";
    //String Country
    //String PL_Address = "187-Avenue";
    String pLPhoneExpected = "000-00-00-00";


    @Test
    public void createNewUserPositive() {

        //Arrange data

        Player playerExpected = new PlayerBuilder()
                .withNameOfPlayer(userNameExpected)
                .withEmailOfPlayer(eMailExpected)
                .withPasswordOfPlayer(usPasswordExpected)
                .withFirstNamePlayer(pLFirstnameExpected)
                .withLastNamePlayer(pLLastnameExpected)
                .withCityPlayer(pLCityExpected)
                .withPhonePlayer(pLPhoneExpected)
                .build();


        //Actions
        generalLogic.clickInsertButton();

        //Old Data - do not delete
        //set values for player and click Save
        //generalLogic.enterUserDataSave(userNameExpected, usPasswordExpected, eMailExpected,
        //        pLFirstnameExpected, pLLastnameExpected, pLCityExpected, pLPhoneExpected);


        //Search of Entered Player
        generalLogic.enterUserForEdit(userNameExpected);

        //reading of created player data
        Player playerActual = new PlayerBuilder()
                .withNameOfPlayer(playersEditExist.getUserNameActual())
                .withEmailOfPlayer(playersEditExist.getUserEmailActual())
                .withFirstNamePlayer(playersEditExist.getUserFirstNameActual())
                .withLastNamePlayer(playersEditExist.getUserLastNameActual())
                .withCityPlayer(playersEditExist.getUserCityActual())
                .withPhonePlayer(playersEditExist.getUserPhoneActual())
                .build();


        //Asserts
        assertsInternal.assertCheckEqual(playerActual.nameOfPlayer, playerExpected.nameOfPlayer);
        assertsInternal.assertCheckEqual(playerActual.emailOfPlayer, playerExpected.emailOfPlayer);
        assertsInternal.assertCheckEqual(playerActual.firstNamePlayer, playerExpected.firstNamePlayer);
        assertsInternal.assertCheckEqual(playerActual.lastNamePlayer, playerExpected.lastNamePlayer);
        assertsInternal.assertCheckEqual(playerActual.cityPlayer, playerExpected.cityPlayer);
        assertsInternal.assertCheckEqual(playerActual.phonePlayer, playerExpected.phonePlayer);

        //print errors
        assertsInternal.printErrors();


    }
}


