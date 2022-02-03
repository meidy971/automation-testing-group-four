package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrdersPage {

    WebDriver driver;
    int timeoutSearch = 5;
    By myAccountButton = By.cssSelector(".order-actions .button");
    By ordersButton = By.cssSelector(".woocommerce-MyAccount-navigation-link--orders");

    public OrdersPage(WebDriver driver){
        this.driver = driver;
    }

    public void openOrderPage(){

        driver.findElement(ordersButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(ordersButton));

    }

    public void openOrderDetailsPage(){

        driver.findElement(myAccountButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(myAccountButton));

    }

}
