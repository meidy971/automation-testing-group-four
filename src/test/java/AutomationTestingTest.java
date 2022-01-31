import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.automationtesting.*;

public class AutomationTestingTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        /*URL seleniumGridUrl = null;
        try {
            seleniumGridUrl = new URL("http://127.0.0.1:4444");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(seleniumGridUrl, chromeOptions);
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();*/
        driver = new ChromeDriver();
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void teardown() {
        //driver.quit();
    }

    @Test
    public void addToCartPriceTest() {
        // Arrange
        String emailAddress = "southa541@gmail.com";
        String password = "Marasou91?";

        // Act
        mainPage mainpage = new mainPage(driver);
        mainpage.openMyAccountPage();

        //myAccountRegisterPage myaccountregisterpage = new myAccountRegisterPage(driver);
        //myaccountregisterpage.emailAddressField(emailAddress);
        //myaccountregisterpage.passwordField(password);
        //myaccountregisterpage.register();

        myAccountLoginPage myaccountloginpage = new myAccountLoginPage(driver);
        myaccountloginpage.emailAddressField(emailAddress);
        myaccountloginpage.passwordField(password);

        //shopPage shoppage = new shopPage(driver);
        //shoppage.openShopPage();
        //shoppage.selectProduct();

        //productPage productpage = new productPage(driver);
        //productpage.addToBasket();
        //productpage.goToBasketPage();

        //basketPage basketpage = new basketPage(driver);
        //String productPrice = basketpage.getProductPrice((0));
        //String itemsSubtotal = basketpage.getItemsSubtotal();
        //String basketSubtotal = basketpage.getBasketSubtotal();

        // Assert
        //Assert.assertEquals(basketpage.getProductPrice(0), productPrice);
        //Assert.assertEquals(basketpage.getItemsSubtotal(), productPrice);
        //Assert.assertEquals(basketpage.getBasketSubtotal(), productPrice);
    }
}