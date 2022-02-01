package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage {
    WebDriver driver;

    By productPriceSelector = By.cssSelector(".product-subtotal .woocommerce-Price-amount ");
    By itemsSubtotalSelector = By.cssSelector(".wpmenucart-contents .amount");
    By basketSubtotalSelector = By.cssSelector(".cart-subtotal .woocommerce-Price-amount");
    By proceedToCheckoutButton = By.cssSelector("a[href*='checkout']");

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

    public void proceedToCheckout(){

        // Trouver et intéragir avec l'élément
        driver.findElement(proceedToCheckoutButton).click();

    }
}
