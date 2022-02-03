package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

public class MyAccountPage {

    WebDriver driver;
    int timeoutSearch = 15;
    By emailAddressLoginSelector = By.id("username");
    By passwordLoginSelector = By.id("password");
    By loginButtonSelector = By.cssSelector("input[value='Login']");
    By emailAddressRegisterSelector = By.id("reg_email");
    By passwordRegisterSelector = By.id("reg_password");
    By messageSelector = By.cssSelector("[aria-live='polite']");
    By lostPasswordSelector = By.cssSelector("a[href*='lost-password']");
    By logoutButtonSelector = By.cssSelector("a[href*='logout']");
    By logoutSelector = new By.ByCssSelector(".woocommerce>nav>ul>li+li+li+li+li+li>a");


    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setLoginUserNameOrAdress(String emailAddress) {
        // Trouver et intéragir avec l'élément
        driver.findElement(emailAddressLoginSelector).sendKeys(emailAddress);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressLoginSelector));
    }

    public void setLoginPassword(String password) {
        // Trouver et intéragir avec l'élément
        driver.findElement(passwordLoginSelector).sendKeys(password);
        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(passwordLoginSelector));
    }

    public void login() {
        // Trouver et intéragir avec l'élément
        driver.findElement(loginButtonSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void setRegisterEmailAdress(String emailAddress) {
        // Trouver et intéragir avec l'élément
        driver.findElement(emailAddressRegisterSelector).sendKeys(emailAddress);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressRegisterSelector));

    }

    public void setRegisterPassword(String password) {

        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            String s = new StringBuilder().append(c).toString();
            driver.findElement(passwordRegisterSelector).sendKeys(s);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
            wait.until(ExpectedConditions.visibilityOfElementLocated(messageSelector));
        }

    }

    public void register() {


        driver.findElement(emailAddressLoginSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(messageSelector));


    }

    public void logout() {

        driver.findElement(logoutButtonSelector).click();

    }

    public void getLostPassWord() {

        // Trouver et intéragir avec l'élément
        driver.findElement(lostPasswordSelector).click();

    }

    // Créer un nouveau email
    public String getNewEmailAddress() {
        DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String email = "hello" + format.format(date) + "@yahoo.fr";
        return email;
    }

    // Vérifier que le bouton Login existe
    public boolean existsElement() {
        try {
            driver.findElement(emailAddressLoginSelector);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    // Vérifier que le bouton Logout existe
    public boolean existsElement2() {
        try {
            driver.findElement(logoutSelector);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}