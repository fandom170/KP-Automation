package TestNG_lesson_3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class BaseTest {

    protected final String AdminName = "admin";


    final WebDriver driver = new FirefoxDriver();


    @BeforeClass
    protected void B_Login() throws InterruptedException {
        driver.get("http://193.138.245.222:81/auth/login");

    }

    @AfterClass
    protected void TearDown() {
        driver.quit();
    }


}
