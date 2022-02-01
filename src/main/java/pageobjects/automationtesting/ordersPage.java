package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ordersPage {
    WebDriver driver;
    int timeoutSearch = 5;
    By myAccountButton = By.cssSelector(".order-actions .button");
    By ordersButton = By.cssSelector(".woocommerce-MyAccount-navigation-link--orders");

    public ordersPage(WebDriver driver){
        this.driver = driver;
    }

    public void openOrderPage(){

        // Trouver et intéragir avec l'élément
        driver.findElement(ordersButton).click();
        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(ordersButton));

    }

    public void openOrderDetailsPage(){

        // Trouver et intéragir avec l'élément
        driver.findElement(myAccountButton).click();
        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(myAccountButton));

    }

    public void getTotalPriceList(){

    }
}
