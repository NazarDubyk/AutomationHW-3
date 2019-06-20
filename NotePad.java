package objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotePad {

    private static final By registerTitleButton = By.cssSelector(".register");
    private static final By emailField = By.cssSelector(".form-control");
    private static final By passwordField = By.cssSelector(".form-control");
    private WebDriver driver;
    private WebDriverWait wait;

    public NotePad(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 5);
    }
    @Step
    public NotePad open()
    {
        driver.get("https://anotepad.com/");
        return this;
    }
    @Step
    public NotePad register() {
        driver.findElement(registerTitleButton).click();
        return this;
    }
    @Step
    public NotePad enterEmail() {
        driver.findElement(emailField).sendKeys("name@abc.com");
        return this;
    }
    @Step
    public NotePad enterPassword() {
        driver.findElement(passwordField).sendKeys("namepass");
        return this;
    }
    }


