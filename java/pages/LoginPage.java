package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseHelper {
    @FindBy(xpath = "//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[1]")
    WebElement loginButton;
    @FindBy(id = "email")
    WebElement emailField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(className = "btn")
    WebElement submitButton;

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void navigateToAllGalleries() {
        driver.get("https://gallery-app.vivifyideas.com/");
    }

    private void clickLoginButton()
    {
        loginButton.click();
    }

    private void enterEmailAddress(String email)
    {
        emailField.click();
        emailField.sendKeys(email);
    }

    private void enterPassword(String password)
    {
        passwordField.click();
        passwordField.sendKeys(password);
    }

    private void clickSubmitButton()
    {
        submitButton.click();
    }

    public void LoginUser(String email, String password)
    {
        navigateToAllGalleries();
        clickLoginButton();
        enterEmailAddress(email);
        enterPassword(password);
        clickSubmitButton();
    }

}
