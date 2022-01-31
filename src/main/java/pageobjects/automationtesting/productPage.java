package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class productPage {

    WebDriver driver;
    int timeoutSearch = 5;
    By addToBasketButtonSelector = By.cssSelector(".single_add_to_cart_button");
    By itemsSelector = By.cssSelector(".cartcontents");

    public productPage(WebDriver driver){
        this.driver = driver;
    }

    public void addToBasket(){

        // Trouver et intéragir avec l'élément
        driver.findElement(addToBasketButtonSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(addToBasketButtonSelector));
    }

    public void goToBasketPage(){

        // Trouver et intéragir avec l'élément
        driver.findElement(itemsSelector).click();

        // Attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
    }
}
