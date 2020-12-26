package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LoginPage;

public class SearchTerm extends BaseTest
{

    @Test
    public void searchFilter()
    {
        LoginPage homepage= new LoginPage(driver);
        homepage.LoginUser("anci.anci432@gmail.com", "anci4321");
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("input-group")));
        WebElement searchField= driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/div/input"));
        searchField.sendKeys("Flower");
        WebElement filterButton = driver.findElement(By.className("btn"));
        filterButton.click();
      WebElement titleOfGallery= driver.findElement(By.className("box-title"));
      Assert.assertTrue("Gallery is not displayed",titleOfGallery.getText().contains("Flower"));


    }
}
