package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeadPage {

     int timeoutSearch = 2;
     WebDriver driver;
     By shopPageSelector = By.id("menu-item-40");
     By basketPageSelector = By.id("wpmenucartli");
     By myAccountPageSelector= By.id("menu-item-50");

    public HeadPage(WebDriver driver) {
        this.driver = driver;
    }

    //Ouvrir la page Shop
    public  void openShopPage (){

        driver.findElement(shopPageSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(shopPageSelector));
    }

    //Ouvrir la page Basket
    public  void openBasketPage (){

        driver.findElement(basketPageSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(basketPageSelector));
    }

    // Ouvrir la page MyAccount
    public  void openMyAccountPage (){
        driver.findElement(myAccountPageSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(myAccountPageSelector));
    }

}
