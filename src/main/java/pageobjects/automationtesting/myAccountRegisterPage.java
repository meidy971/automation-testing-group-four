package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class myAccountRegisterPage {
    WebDriver driver;
    int timeoutSearch = 10;
    By emailAddressSelector = By.id("reg_email");
    By passwordSelector = By.id("reg_password");
    By registerButtonSelector = By.name("register");

    public myAccountRegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void emailAddressField(String emailAddress){
        // Trouver et intéragir avec l'élément
        driver.findElement(emailAddressSelector).sendKeys(emailAddress + Keys.ENTER);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressSelector));
    }

    public void passwordField(String password){
        // Trouver et intéragir avec l'élément
        driver.findElement(passwordSelector).sendKeys(password + Keys.ENTER);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(passwordSelector));
    }

    public void register() {
        driver.findElement(registerButtonSelector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(registerButtonSelector));
    }

}
