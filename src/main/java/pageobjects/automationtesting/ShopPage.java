package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopPage {

    WebDriver driver;
    int timeoutSearch = 10;
    By shopButton = By.id("menu-item-40");
    By selectProductWithPhotoSelector = By.cssSelector(".woocommerce-LoopProduct-link .attachment-shop_catalog");
    By selectProductWithTitleSelector = By.cssSelector("a[href*='android-quick-start'] > h3");
    By selectProductWithPriceSelector = By.cssSelector("a[href*='android-quick-start'] > .price > ins");
    By addToBasketAndroidButtonSelector = By.cssSelector(".post-169 a[href*='add-to-cart']");
    By addToBasketFunctionnalButtonSelector = By.cssSelector(".post-170 a[href*='add-to-cart']");
    By viewBasketSelector = By.cssSelector(".post-169 a[href*='basket']");

    public ShopPage(WebDriver driver){
        this.driver = driver;
    }

    public void openShopPage(){

        driver.findElement(shopButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(shopButton));
    }

    public void openProductPageWithPhoto(){

        driver.findElement(selectProductWithPhotoSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }

    public void openProductPageWithTitle(){

        driver.findElement(selectProductWithTitleSelector).click();

    }

    public void openProductPageWithPrice(){

        driver.findElement(selectProductWithPriceSelector).click();

    }

    public void addToBasketAndroidFromShopPage(){

        driver.findElement(addToBasketAndroidButtonSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(viewBasketSelector));

    }

    public void addToBasketFunctionnalFromShopPage(){

        driver.findElement(addToBasketFunctionnalButtonSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(viewBasketSelector));

    }

    public void viewBasket(){

        driver.findElement(viewBasketSelector).click();

    }

}
