package Lesson4Pages.tests;

import org.testng.annotations.Test;

public class Login_Positive_Test extends BaseTest {

    @Test
    public void loginAdmin123Positive() throws Exception {

       String expectedTitleofPage = "Administrator Area";
       String actualTitleOfPage = usersPage.getTitleOfPageActual ();

        //assert
        assertsInternal.assertCheckEqual(actualTitleOfPage, expectedTitleofPage);
        assertsInternal.printErrors();

    }


}




