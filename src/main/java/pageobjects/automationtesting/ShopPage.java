package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPage {

    WebDriver driver;
    int timeoutSearch = 5;
    By shopButton = By.id("menu-item-40");
    By selectProductWithPhotoSelector = By.cssSelector(".woocommerce-LoopProduct-link .attachment-shop_catalog");
    By selectProductWithTitleSelector = By.cssSelector(".woocommerce-LoopProduct-link .attachment-shop_catalog");
    By selectProductWithPriceSelector = By.cssSelector("");


    public ShopPage(WebDriver driver){
        this.driver = driver;
    }

    public void openShopPage(){

        // Trouver et intéragir avec l'élément
        driver.findElement(shopButton).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(shopButton));
    }

    public void openProductPageWithPhoto(){

        // Trouver et intéragir avec l'élément
        driver.findElement(selectProductWithPhotoSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void openProductPageWithTitle(){

        // Trouver et intéragir avec l'élément
        //driver.findElement(selectProductSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void openProductPageWithPrice(){

        // Trouver et intéragir avec l'élément
        //driver.findElement(selectProductSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void addToBasketFromShopPage(){

        // Trouver et intéragir avec l'élément
        //driver.findElement(selectProductSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void getFinalProductPriceFromShopPage(){

        // Trouver et intéragir avec l'élément
        //driver.findElement(selectProductSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void getTitleFromShopPage(){

        // Trouver et intéragir avec l'élément
        //driver.findElement(selectProductSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void viewBasket(){

        // Trouver et intéragir avec l'élément
        //driver.findElement(selectProductSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }
}
