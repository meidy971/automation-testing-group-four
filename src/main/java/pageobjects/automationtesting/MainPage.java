package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    WebDriver driver;
    int timeoutSearch = 5;
    By myAccountButton = By.id("menu-item-50");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void openMyAccountPage(){

        // Trouver et intéragir avec l'élément
        driver.findElement(myAccountButton).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));

    }
}
