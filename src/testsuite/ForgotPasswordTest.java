package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com//";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        clickOnElement(By.xpath("//a[normalize-space()='Forgot your password?']"));
        String expectedMessage = "Forgot Your Password?";
       // WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        Assert.assertEquals("Forgot password is not displayed",expectedMessage , actualMessage);
    }
    @After
    public void closeBrowser(){

    }
}


