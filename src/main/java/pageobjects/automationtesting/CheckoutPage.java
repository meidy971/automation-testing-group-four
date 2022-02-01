package pageobjects.automationtesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    int timeoutSearch = 5;
    WebDriver driver;


    By bancTransfertPaymentSelector = new By.ByCssSelector(".wc_payment_method.payment_method_bacs");
    By chequePaymentSelector = By.id("payment_method_cheque");
    By cashPaymentSelector = By.id("payment_method_cod");
    By paypalPaymentSelector = By.id("payment_method_ppec_paypal");
    By placeOrderSelector = By.id("place_order");
    By firstNameSelector = By.id("billing_first_name");
    By lastNameSelector = By.id("billing_last_name");
    By emailSelector = By.id("billing_email");
    By phoneNumberSelector = By.id("billing_phone");
    By countrySelector = By.id("select2-drop-mask");
    By adressSelector = By.id("billing_address_1");
    By postCodeSelector = By.id("billing_postcode");
    By citySelector = By.id("billing_city");
    By totalPriceSelector = new By.ByCssSelector("tfoot tr + tr +tr >td > strong");


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public  void setFirstNameFromCheckoutPage (String firstName){
        //

        driver.findElement(firstNameSelector).sendKeys(firstName);
        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameSelector));
    }

    public  void setLastNameFromCheckoutPage (String lastName){
        //
        driver.findElement(lastNameSelector).sendKeys(lastName);

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameSelector));
    }
    public  void setEmailFromCheckoutPage (String email){
        //
        //
        driver.findElement(emailSelector).sendKeys(email);

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailSelector));
    }
    public  void setPhoneNumberFromCheckoutPage (String phoneNumber){
        //
        driver.findElement(phoneNumberSelector).sendKeys(phoneNumber);

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneNumberSelector));
    }
    public  void setCountryFromCheckoutPage (String country){
        //
        //
        driver.findElement(countrySelector).sendKeys(country);

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(countrySelector));
    }
    public  void setAdressFromCheckoutPage (String adress){
        //
        driver.findElement(adressSelector).sendKeys(adress);

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(adressSelector));
    }
    public  void setPostcodeFromCheckoutPage (String postCode){
        //
        //
        driver.findElement(postCodeSelector).sendKeys(postCode);

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(postCodeSelector));
    }
    public  void setCityFromCheckoutPage (String city){
        //
        driver.findElement(citySelector).sendKeys(city);

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(citySelector));
    }
    /*public  void getTitleFromCheckoutPage (){
        //
        driver.findElement().click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable());
    }
    public  void getQuantityFromCheckoutPage (){
        //
        //
        driver.findElement().click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable());
    }


    public  void getPruductPriceFromCheckoutPage (){
        //
        driver.findElement().click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable());
    }
    public  void getSubtotalFromCheckoutPage (){
        //
        driver.findElement().click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable());
    }
    public  void getRoamingTaxFromCheckoutPage (){
        //
        driver.findElement().click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable());
    }*/

    public  String getTotalPriceFromCheckoutPage (){
        //
        String price = driver.findElement(totalPriceSelector).getText();
        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(totalPriceSelector));
        return price;
    }
    public  void chooseCash (){
        //
        driver.findElement(cashPaymentSelector).click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(cashPaymentSelector));
    }
    public  void chooseCheck (){
        //
        driver.findElement(chequePaymentSelector).click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(chequePaymentSelector));
    }
    public  void chooseTransfert (){
        //
        driver.findElement(bancTransfertPaymentSelector).click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(bancTransfertPaymentSelector));
    }

    public  void choosePaypal (){
        //
        driver.findElement(paypalPaymentSelector).click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(paypalPaymentSelector));
    }
    public  void placeOrder (){
        //
        driver.findElement(placeOrderSelector).click();

        //
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderSelector));
    }







}
