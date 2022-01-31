package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class myAccountLoginPage {
    WebDriver driver;
    int timeoutSearch =5;
    By emailAddressSelector = By.id("username");
    By passwordSelector = By.id("password");

    public myAccountLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void emailAddressField(String emailAddress){
        // Trouver et intéragir avec l'élément
        driver.findElement(emailAddressSelector).sendKeys(emailAddress);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressSelector));
    }

    public void passwordField(String password){
        // Trouver et intéragir avec l'élément
        driver.findElement(passwordSelector).sendKeys(password + Keys.ENTER);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

}
