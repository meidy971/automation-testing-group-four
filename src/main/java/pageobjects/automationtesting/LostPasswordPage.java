package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class LostPasswordPage {

    WebDriver driver;
    int timeoutSearch = 5;
    By lostPasswordEmailSelector = By.id("user_login");
    By resetPasswordButton = By.cssSelector("input[value='Reset Password']");

    public LostPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    // Saisier l'email dans le champ email
    public void SetUsernameOrEmail(String emailAddress){

        driver.findElement(lostPasswordEmailSelector).sendKeys(emailAddress);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(lostPasswordEmailSelector));
    }

    // Cliquer sur le bouton récupérer MDP
    public void resetPassword(){

        driver.findElement(resetPasswordButton).click();

    }

    // vérifier que le bouton reset password existe
    public boolean existsElement() {

        try {
            driver.findElement(resetPasswordButton);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
