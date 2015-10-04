package Lesson4Pages.Utils;


import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class AssertsInternal {

   List<String> listFails = new ArrayList<String>();

    public void assertCheckEqual(String actualValue, String expectedValue) {

        try {
            Assert.assertEquals(actualValue, expectedValue);
        } catch (AssertionError e) {
            listFails.add(e.getMessage());
        }
    }

    public  void printErrors(){

        if (!listFails.isEmpty()) {

            for (String r : listFails) {
                System.out.println(r + "\n");
            }
            Assert.fail();
        }
    }

    public void clearAssertlist () {
        listFails.clear();
    }



    /*//In this method, Test execution will not abort even If any assertion fail. Full Test will be executed.
    public void soft_assert_text() {
        Actualtext = driver.findElement(By.xpath("//h2/span")).getText();
        //Text on expected side Is written Incorrect intentionally to get fail this assertion.
        s_assert.assertEquals(Actualtext, "Tuesday, 01 January 2014", "1st assert failed.");
        System.out.println("Soft Assertion -> 1st pagetext assertion executed.");

        s_assert.assertEquals(Actualtext, "Tuesday, 28 January 2014", "2nd assert failed.");
        System.out.println("Soft Assertion -> 2nd pagetext assertion executed.");

        driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
        String Alert_text = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        //Alert expected text Is written Incorrect intentionally to get fail this assertion.
        s_assert.assertEquals(Alert_text, "Hi.. is alert message!", "Alert Is InCorrect");
        System.out.println("Soft Assertion -> 1st alert assertion executed.");

        s_assert.assertEquals(Alert_text, "Hi.. This is alert message!", "Alert Is Correct");
        System.out.println("Soft Assertion -> 2nd alert assertion executed.");
        s_assert.assertAll();
    }*/

}
