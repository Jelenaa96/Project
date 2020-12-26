package tests;

import org.intellij.lang.annotations.JdkConstants;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage;

public class LoginTest extends BaseTest
{
    @Test
    public void logInTest()
    {
        LoginPage homepage= new LoginPage(driver);
        homepage.LoginUser("anci.anci432@gmail.com", "anci4321");
        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[3]"));
        wdWait.until(ExpectedConditions.visibilityOf(logoutButton));
        Assert.assertTrue( "Log out button is not displayed", logoutButton.isDisplayed());


    }
}