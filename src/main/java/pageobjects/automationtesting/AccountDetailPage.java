package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class AccountDetailPage {
    WebDriver driver;
    int timeoutSearch=2;

    By firstNameSelector = By.id("account_first_name");
    By lastNameSelector = By.id("account_last_name");
    By emailSelector = By.id("account_email");
    By currentPasswordSelector = By.id("password_current");
    By newPasswordSelector = By.id("password_1");
    By confirmPasswordSelector = By.id("password_2");
    By saveChangesSelector = new By.ByCssSelector("[value='Save changes']");
    By errorMessage = new By.ByCssSelector(".woocommerce-error");
    By errorMessagePasswordSelector = new By.ByCssSelector("[aria-live='polite']");




    public AccountDetailPage(WebDriver driver){
        this.driver = driver;
    }

    //Saisir le prénom
    public void setFirstName(String firstName){


        driver.findElement(firstNameSelector).clear();
        driver.findElement(firstNameSelector).sendKeys(firstName);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameSelector));

    }

    //Saisir le nom
    public void setLastName(String lastName){


        driver.findElement(lastNameSelector).clear();
        driver.findElement(lastNameSelector).sendKeys(lastName);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameSelector));

    }

    // Saisir l'email
    public void setAddress(String emailAddress){

        driver.findElement(emailSelector).clear();
        driver.findElement(emailSelector).sendKeys(emailAddress);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailSelector));

    }

    // Saisir l'ancien MDP
    public void setCurrentPassword(String password){


        driver.findElement(currentPasswordSelector).sendKeys(password);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(currentPasswordSelector));

    }

   // Saisir le nouveau MDP
    public void setNewPassword(String password){

        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            String s = new StringBuilder().append(c).toString();
            driver.findElement(newPasswordSelector).sendKeys(s);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessagePasswordSelector));
        }


    }

    //Confirmer le nouveau MDP
    public void setConfirmPassword(String password){

        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            String s = new StringBuilder().append(c).toString();
            driver.findElement(confirmPasswordSelector).sendKeys(s);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessagePasswordSelector));
        }




    }

    // Cliquer sur le bouton Save Changes
    public void saveChanges(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(saveChangesSelector));
        driver.findElement(saveChangesSelector).click();

    }

    //Vérifier l'affichage du message d'erreur
    public boolean existsElement() {
        try {
            driver.findElement(errorMessage);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }


}
