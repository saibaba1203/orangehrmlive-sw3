package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com//";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        sendTextToElement(By.xpath("//input[@id='txtUsername']"),"Admin");
        sendTextToElement(By.xpath("//input[@id='txtPassword']"),"admin123");
        clickOnElement(By.xpath("//input[@id='btnLogin']"));
        String expectedMessage = "Welcome Paul";
        String actualMessage = getTextFromElement(By.xpath("//a[@id='welcome']"));
        Assert.assertEquals("welcome text is not displayed", expectedMessage, actualMessage);
    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}

