package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasketPage {

    WebDriver driver;
    int timeoutSearch = 10;
    By productPriceSelector = By.cssSelector(".product-subtotal .woocommerce-Price-amount ");
    By itemsSubtotalSelector = By.cssSelector(".wpmenucart-contents .amount");
    By basketSubtotalSelector = By.cssSelector(".cart-subtotal .woocommerce-Price-amount");
    By proceedToCheckoutButton = By.cssSelector("a[href*='checkout']");
    By quantitySelector = By.cssSelector("input[type='number']");
    By updateBasketButtonSelector = By.cssSelector("input[value='Update Basket']");
    By crossDeleteButtonSelector = By.cssSelector("[data-product_id='170']");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductPrice(int index) {
        return driver.findElements(productPriceSelector).get(index).getText();
    }

    public String getItemsSubtotal() {
        return driver.findElement(itemsSubtotalSelector).getText();
    }

    public String getBasketSubtotal() {
        return driver.findElement(basketSubtotalSelector).getText();
    }

    public void chooseQuantity(String quantity){

        driver.findElement(quantitySelector).clear();

        driver.findElement(quantitySelector).sendKeys(quantity);

    }
    public void updateBasket(){

        driver.findElement(updateBasketButtonSelector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(updateBasketButtonSelector));

    }

    public void deleteProductBasket(){

        driver.findElement(crossDeleteButtonSelector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(crossDeleteButtonSelector));

    }

    public void proceedToCheckout(){

        driver.findElement(proceedToCheckoutButton).click();


    }
}
