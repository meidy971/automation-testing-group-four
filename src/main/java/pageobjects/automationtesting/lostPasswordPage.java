package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class lostPasswordPage {

    WebDriver driver;
    int timeoutSearch = 5;
    By lostPasswordEmailSelector = By.id("user_login");
    By resetPasswordButton = By.cssSelector("input[value='Reset Password']");

    public lostPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void SetUsernameOrEmail(String emailAddress){

        // Trouver et intéragir avec l'élément
        driver.findElement(lostPasswordEmailSelector).sendKeys(emailAddress);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(lostPasswordEmailSelector));
    }

    public void resetPassword(){

        // Trouver et intéragir avec l'élément
        driver.findElement(resetPasswordButton).click();

    }
}
