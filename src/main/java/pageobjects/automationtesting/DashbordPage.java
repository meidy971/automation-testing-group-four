package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DashbordPage {


    int timeoutSearch = 6;
    WebDriver driver;
    By logoutSelector = new By.ByCssSelector(".woocommerce>nav>ul>li+li+li+li+li+li>a");
    By accoutDetailSelector= new By.ByCssSelector(".woocommerce>nav>ul>li+li+li+li+li>a");
    By adressesSelector= new By.ByCssSelector(".woocommerce>nav>ul>li+li+li+li>a");
    By ordersSelector= new By.ByCssSelector(".woocommerce>nav>ul>li+li>a");
    public DashbordPage (WebDriver driver) {
        this.driver = driver;
    }
    public  void openOrdesPage (){


        driver.findElement(ordersSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(ordersSelector));
    }

    public  void openAdressPage (){

        driver.findElement(adressesSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(adressesSelector));
    }
    public  void openAccountDetailsPage (){

        driver.findElement(accoutDetailSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(accoutDetailSelector));
    }
    public  void logout (){

        driver.findElement(logoutSelector).click();

    }

}
