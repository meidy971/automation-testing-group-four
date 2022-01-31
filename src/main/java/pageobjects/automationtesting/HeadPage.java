package pageobjects.automationtesting;


       /*

public SearchResultPage searchProduct(String productName) {
        // Trouver l'element et interagir avec l'element
        driver.findElement(searchBarSelector).sendKeys(productName + Keys.ENTER);

        // attendre que l'action soit fini
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(searchResultSelector));

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        return searchResultPage;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeadPage {
    static int timeoutSearch = 2;
    static WebDriver driver;
    static By shopPageSelector = By.id("menu-item-40");
    static By basketPageSelector = By.id("wpmenucartli");
    static By myAccountPageSelector= By.id("menu-item-50");

    public HeadPage(WebDriver driver) {
        this.driver = driver;
    }
    public static void openShopPage (){
        //
        driver.findElement(shopPageSelector).click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(shopPageSelector));
    }
    public static void openBasketPage (){
//
        driver.findElement(basketPageSelector).click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(basketPageSelector));
    }
    public static void openMyAccountPage (){
        driver.findElement(myAccountPageSelector).click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(myAccountPageSelector));
    }



}
