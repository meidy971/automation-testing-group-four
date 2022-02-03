package pageobjects.automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

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

    // Ouvrir l'historique des commandes
    public  void openOrdesPage (){


        driver.findElement(ordersSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(ordersSelector));
    }
// Ouvrir la page Addresses
    public  void openAddressPage (){

        driver.findElement(adressesSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(adressesSelector));
    }

   // Ourvir la page des informations du compte
    public  void openAccountDetailsPage (){

        driver.findElement(accoutDetailSelector).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(accoutDetailSelector));
    }


    //Se déconnecter
    public  void logout (){

        driver.findElement(logoutSelector).click();

    }

}
