package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {

    WebDriver driver;
    int timeoutSearch =15;
    By emailAddressLoginSelector = By.id("username");
    By passwordLoginSelector = By.id("password");
    By loginButtonSelector = By.cssSelector("input[value='Login']");
    By emailAddressRegisterSelector = By.id("reg_email");
    By passwordRegisterSelector = By.id("reg_password");
    By registerButtonSelector = By.cssSelector("input[value='Register']");
    By noWhereSelector = By.id("woocommerce-register-nonce");
    By lostPasswordSelector = By.cssSelector("a[href*='lost-password']");

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    public void setLoginUserNameOrAdress(String emailAddress){
        // Trouver et intéragir avec l'élément
        driver.findElement(emailAddressLoginSelector).sendKeys(emailAddress);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressLoginSelector));
    }

    public void setLoginPassword(String password){
        // Trouver et intéragir avec l'élément
        driver.findElement(passwordLoginSelector).sendKeys(password);
        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(passwordLoginSelector));
    }

    public void login(){
        // Trouver et intéragir avec l'élément
        driver.findElement(loginButtonSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void setRegisterEmailAdress(String emailAddress){
        // Trouver et intéragir avec l'élément
        driver.findElement(emailAddressRegisterSelector).sendKeys(emailAddress);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(emailAddressRegisterSelector));

    }

    public void setRegisterPassword(String password){
        // Trouver et intéragir avec l'élément
        driver.findElement(passwordRegisterSelector).sendKeys(password);

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(passwordRegisterSelector));

    }

    public void register(){
        // Trouver et intéragir avec l'élément
        driver.findElement(noWhereSelector).click();
        driver.findElement(registerButtonSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(registerButtonSelector));


    }

    public void getLostPassWord(){

        // Trouver et intéragir avec l'élément
        driver.findElement(lostPasswordSelector).click();

    }

    public void setLastname(){

    }

    public void setFirstname(){

    }

}
