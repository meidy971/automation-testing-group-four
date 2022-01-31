package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class shopPage {

    WebDriver driver;
    int timeoutSearch = 5;
    By shopButton = By.id("menu-item-40");
    By selectProductSelector = By.cssSelector(".woocommerce-LoopProduct-link .attachment-shop_catalog");

    public shopPage(WebDriver driver){
        this.driver = driver;
    }

    public void openShopPage(){

        // Trouver et intéragir avec l'élément
        driver.findElement(shopButton).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(shopButton));
    }

    public void selectProduct(){

        // Trouver et intéragir avec l'élément
        driver.findElement(selectProductSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }
}
