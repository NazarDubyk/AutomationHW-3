package objects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotePad {

    private static final By registerTitleButton = By.cssSelector(".register");
    private static final By emailField = By.xpath("//*[@id=\"loginEmail\"]");
    private static final By passwordField = By.xpath("//*[@id=\"password\"]");
    private static final By loginButton = By.cssSelector(".btn btn-primary");
    private static final By PublicButton = By.cssSelector(".caret");
    private static final By PrivatButton = By.xpath("//*[@id=\"noteAccessText\"]");
    private static final By CloseButton = By.cssSelector(".btn btn-default");
    private static final By noteTitle = By.id("edit_title");
    private static final By saveTitleButton = By.xpath("//*[@id='btnSaveNote']");
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
    public NotePad enterEmail(String email) {
        driver.findElement(emailField).sendKeys("angry.tester2018@gmail.com");
        return this;
    }
    @Step
    public NotePad enterPassword(String password) {
        driver.findElement(passwordField).sendKeys("123456");
        return this;
    }
    @Step
    public NotePad login() {
        driver.findElement(loginButton).click();
        return this;
    }
    @Step
    public NotePad clickPublicNote() {
        driver.findElement(PublicButton).click();
        return this;
    }
    @Step
    public NotePad close() {
        driver.findElement(CloseButton).click();
        return this;
    }
    @Step
    public NotePad clickPrivatNote() {
        driver.findElement(PrivatButton).click();
        return this;
    }
    @Step
    public NotePad setTitle(String title) {
        driver.findElement(noteTitle).sendKeys("My New Note");
        return this;
    }
    @Step
    public NotePad save() {
        driver.findElement(saveTitleButton).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".alert alert-warning"),
                "You have saved your note as a" ));
        return this;
    }


}


