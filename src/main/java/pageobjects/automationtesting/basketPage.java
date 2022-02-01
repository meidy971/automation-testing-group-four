package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class basketPage {
    WebDriver driver;

    By productPriceSelector = By.cssSelector(".product-subtotal .woocommerce-Price-amount ");
    By itemsSubtotalSelector = By.cssSelector(".wpmenucart-contents .amount");
    By basketSubtotalSelector = By.cssSelector(".cart-subtotal .woocommerce-Price-amount");
    By proceedToCheckoutButton = By.cssSelector("a[href*='checkout']");

    public basketPage(WebDriver driver) {
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
