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

        driver = new ChromeDriver();
        driver.get("http://practice.automationtesting.in/");
        driver.manage().window().maximize();

    }

    String invalidEmail= "durand.jean75gmail.com";
    String validEmail= "prejauquogrohe-3411@yopmail.com";
    String nonExistentEmail= "durand.jean75@gmail.com";
    String invalidPassword= "Paris75aaaaaaaaaa52374aaaaaaaaaaaaa";
    String validPassword= "Aloui911234567.Ahhjlma%..?";

    @Test
    public void poeiGr4_53() {
        //choisir le paiement par PayPal ,
        //valider le paiement et
        //vérifier les informations dans la page récapitulative

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";
        String firstName = "Meidy";
        String lastName = "J-N";
        String phoneNumber ="0601020304";
        String address = "1 rue du poulet";
        String postCode = "75018";
        String city = "Paris";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.openProductPageWithPhoto();

        ProductPage productpage = new ProductPage(driver);
        productpage.addToBasket();
        productpage.goToBasketPage();

        BasketPage basketpage = new BasketPage(driver);
        basketpage.proceedToCheckout();

        CheckoutPage checkoutpage = new CheckoutPage(driver);
        checkoutpage.setFirstNameFromCheckoutPage(firstName);
        checkoutpage.setLastNameFromCheckoutPage(lastName);
        checkoutpage.setPhoneNumberFromCheckoutPage(phoneNumber);
        checkoutpage.setAdressFromCheckoutPage(address);
        checkoutpage.setPostcodeFromCheckoutPage(postCode);
        checkoutpage.setCityFromCheckoutPage(city);
        checkoutpage.choosePaypal();
        checkoutpage.placeOrder();

        // Assert

    }

    @Test
    public void poeiGr4_52() {
        //choisir le paiement par Cash ,
        //valider le paiement et
        //vérifier les informations dans la page récapitulative

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";
        String firstName = "Meidy";
        String lastName = "J-N";
        String phoneNumber ="0601020304";
        String address = "1 rue du poulet";
        String postCode = "75018";
        String city = "Paris";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.openProductPageWithPhoto();

        ProductPage productpage = new ProductPage(driver);
        productpage.addToBasket();
        productpage.goToBasketPage();

        BasketPage basketpage = new BasketPage(driver);
        basketpage.proceedToCheckout();

        CheckoutPage checkoutpage = new CheckoutPage(driver);
        checkoutpage.setFirstNameFromCheckoutPage(firstName);
        checkoutpage.setLastNameFromCheckoutPage(lastName);
        checkoutpage.setPhoneNumberFromCheckoutPage(phoneNumber);
        checkoutpage.setAdressFromCheckoutPage(address);
        checkoutpage.setPostcodeFromCheckoutPage(postCode);
        checkoutpage.setCityFromCheckoutPage(city);
        checkoutpage.chooseCash();
        checkoutpage.placeOrder();

        // Assert

    }

    @Test
    public void poeiGr4_51() {
        //choisir le paiement par Virement ,
        //valider le paiement et
        //vérifier les informations dans la page récapitulative

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";
        String firstName = "Meidy";
        String lastName = "J-N";
        String phoneNumber ="0601020304";
        String address = "1 rue du poulet";
        String postCode = "75018";
        String city = "Paris";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.openProductPageWithPhoto();

        ProductPage productpage = new ProductPage(driver);
        productpage.addToBasket();
        productpage.goToBasketPage();

        BasketPage basketpage = new BasketPage(driver);
        basketpage.proceedToCheckout();

        CheckoutPage checkoutpage = new CheckoutPage(driver);
        checkoutpage.setFirstNameFromCheckoutPage(firstName);
        checkoutpage.setLastNameFromCheckoutPage(lastName);
        checkoutpage.setPhoneNumberFromCheckoutPage(phoneNumber);
        checkoutpage.setAdressFromCheckoutPage(address);
        checkoutpage.setPostcodeFromCheckoutPage(postCode);
        checkoutpage.setCityFromCheckoutPage(city);
        checkoutpage.chooseTransfert();
        checkoutpage.placeOrder();

        // Assert

    }

    @Test
    public void poeiGr4_50() {
        // poeiGr4_47
        //choisir le paiement par Chèque ,
        //valider le paiement et
        //vérifier les informations dans la page récapitulative

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";
        String firstName = "Meidy";
        String lastName = "J-N";
        String phoneNumber ="0601020304";
        String address = "1 rue du poulet";
        String postCode = "75018";
        String city = "Paris";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.openProductPageWithPhoto();

        ProductPage productpage = new ProductPage(driver);
        productpage.addToBasket();
        productpage.goToBasketPage();

        BasketPage basketpage = new BasketPage(driver);
        basketpage.proceedToCheckout();

        CheckoutPage checkoutpage = new CheckoutPage(driver);
        checkoutpage.setFirstNameFromCheckoutPage(firstName);
        checkoutpage.setLastNameFromCheckoutPage(lastName);
        checkoutpage.setPhoneNumberFromCheckoutPage(phoneNumber);
        checkoutpage.setAdressFromCheckoutPage(address);
        checkoutpage.setPostcodeFromCheckoutPage(postCode);
        checkoutpage.setCityFromCheckoutPage(city);
        checkoutpage.chooseCheck();
        checkoutpage.placeOrder();

        // Assert

    }

    @Test
    public void poeiGr4_56() {
        //Se connecter avec un mot passe valide, un email valide et
        //vérifier la présence des 6 éléments de l’écran « Dashboard »
        //puis se déconnecter

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();
        myaccountpage.logout();

        // Assert

    }

    @Test
    public void poeiGr4_41() {
        //Vérifier l'affichage des détails d’un article
        //en cliquant sur le libellé du produit dans la page « Shop »

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.openProductPageWithTitle();

        // Assert

    }

    @Test
    public void poeiGr4_42() {
        //Vérifier l'affichage des détails d’un article
        //en cliquant sur le prix du produit dans la page « Shop »

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.openProductPageWithPrice();

        // Assert

    }

    @Test
    public void poeiGr4_40() {
        //Vérifier l'affichage des détails d’un article
        //en cliquant sur l’image du produit dans la page « Shop »

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.openProductPageWithPhoto();

        // Assert

    }

    @Test
    public void poeiGr4_39() {
        //Ajouter un article à partir de la page « Shop »
        //en utilisant  le bouton "ADD TO BASKET" et
        //vérifier le contenu du panier à partir du bouton "VIEW BASKET"

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.addToBasketAndroidFromShopPage();
        shoppage.viewBasket();

        // Assert

    }

    @Test
    public void poeiGr4_45() {
        //Ajouter un article au panier à partir de la page « Product »,
        //choisir le nombre d’exemplaires et vérifier l’ajout à partir du bouton "VIEW BASKET"

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";
        String quantity = "10";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.addToBasketAndroidFromShopPage();
        shoppage.viewBasket();

        BasketPage basketpage = new BasketPage(driver);
        basketpage.chooseQuantity(quantity);
        basketpage.updateBasket();

        // Assert

    }

    @Test
    public void poeiGr4_46() {
        // poeiGr4_45
        //Vérifier la modification,
        // la suppression et la mise à jour des prix d'un article,
        // puis passer au paiement

        // Arrange
        String emailAddress = "vimmowetroimme-6874@yopmail.com";
        String password = "Marasou91?";
        String quantity = "10";

        // Act
        HeadPage headpage = new HeadPage(driver);
        headpage.openMyAccountPage();

        MyAccountPage myaccountpage = new MyAccountPage(driver);
        myaccountpage.setLoginUserNameOrAdress(emailAddress);
        myaccountpage.setLoginPassword(password);
        myaccountpage.login();

        ShopPage shoppage = new ShopPage(driver);
        shoppage.openShopPage();
        shoppage.addToBasketAndroidFromShopPage();
        shoppage.addToBasketFunctionnalFromShopPage();
        shoppage.viewBasket();


        BasketPage basketpage = new BasketPage(driver);
        basketpage.deleteProductBasket();
        basketpage.chooseQuantity(quantity);
        basketpage.updateBasket();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        basketpage.proceedToCheckout();

        // Assert

    }

    //US1: Création d'un compte
    @Test
    public void registerWithInvalidEmailAndInvalidPassword24 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterEmailAdress(invalidEmail);
        myAccountPage.setRegisterPassword(invalidPassword);
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }
    @Test
    public void registerWithEmptyEmailAndEmptyPassword25 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);

        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }
    @Test
    public void registerWithValidEmailAndEmptyPassword26 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAddress());
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }

    @Test
    public void registerWithValidEmailAndInvalidPassword27 ()  {
        String[] passwordTab = new String[5];

        passwordTab[0] = "12mmmfg..35ml////%3548";
        passwordTab[1] = "QSML123::%HF215EA...";
        passwordTab[2] = "mlJJff214PPla87";
        passwordTab[3] = "%ldJJJAA...???zer";
        passwordTab[4] = "MLm1.";


        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAddress());
        for(int i=0; i<=4; i++) {
            myAccountPage.setRegisterPassword(passwordTab[i]);

            myAccountPage.register();
            Assert.assertTrue(myAccountPage.existsElement());
        }
    }

    @Test
    public void registerWithValidEmailAndValidPassword23 ()  {



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);

        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAddress());
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement2());

    }

    @Test
    public void registerWithExistingEmailAndValidPassword74 ()  {



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);

        myAccountPage.setRegisterEmailAdress(validEmail);
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();

        Assert.assertTrue(myAccountPage.existsElement());

    }
    @Test

    public void registerWithNonExistentEmailAndValidPassword23 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterEmailAdress(nonExistentEmail);
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }
    @Test
    public void registerWithEmptyEmailAndValidPassword60 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }
    //US2: Connexion à un compte
    @Test
    public void loginWithValidEmailAndValidPassword19 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(validPassword);
        myAccountPage.setLoginUserNameOrAdress(validEmail);
        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement2());

    }
    @Test
    public void loginWithInvalidEmailAndInvalidPassword16 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(invalidPassword);
        myAccountPage.setLoginUserNameOrAdress(invalidEmail);
        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement());

    }
    @Test
    public void loginWithEmptyEmailAndValidPassword18 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(validPassword);

        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement());

    }

    @Test
    public void loginWithEmptyEmailAndEmptyPassword19 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);

        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement());

    }
    @Test
    public void loginWithValidEmailAndLowercaseValidPassword20 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(validPassword.toLowerCase());
        myAccountPage.setLoginUserNameOrAdress(validEmail);
        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement());

    }

    @Test
    public void loginWithValidEmailAndValidPasswordThenLogout15And56 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(validPassword);
        myAccountPage.setLoginUserNameOrAdress(validEmail);
        myAccountPage.login();
        DashbordPage dashbordPage= new DashbordPage(driver);
        dashbordPage.logout();


        Assert.assertTrue(myAccountPage.existsElement());

    }

    //US4. Récupérer MDP

    @Test
    public void getLostPasswordWithInvalidEmail30 (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.getLostPassWord();
        LostPasswordPage lostPasswordPage= new LostPasswordPage(driver);
        lostPasswordPage.SetUsernameOrEmail(nonExistentEmail);
        lostPasswordPage.resetPassword();



        Assert.assertTrue(lostPasswordPage.existsElement());

    }

    // US5. Visualiser les informations de compte

    String firstName= "xx";
    String lastName= "yyy";
    String newPassword= ("M123.jLa3mmm3.?");

    @Test
    public void initiatePasswordWithNewValidPassword32 ()  {

        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        String newEmail=myAccountPage.getNewEmailAddress();
        myAccountPage.setRegisterEmailAdress(newEmail);
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();

        DashbordPage dashbordPage= new DashbordPage(driver);
        dashbordPage.openAccountDetailsPage();
        AccountDetailPage accountDetailPage= new AccountDetailPage(driver);
        accountDetailPage.setFirstName(firstName);
        accountDetailPage.setLastName(lastName);
        accountDetailPage.setCurrentPassword(validPassword);
        accountDetailPage.setNewPassword(newPassword);
        accountDetailPage.setConfirmPassword(newPassword);
        accountDetailPage.saveChanges();
        dashbordPage.logout();
        myAccountPage.setLoginPassword(newPassword);
        myAccountPage.setLoginUserNameOrAdress(newEmail);
        myAccountPage.login();

        Assert.assertTrue(myAccountPage.existsElement2());

    }


    @Test
    public void initiatePasswordWithIncorrectPasswordAndValidPassword34 (){

        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(validPassword);
        myAccountPage.setLoginUserNameOrAdress(validEmail);
        myAccountPage.login();
        DashbordPage dashbordPage= new DashbordPage(driver);
        dashbordPage.openAccountDetailsPage();
        AccountDetailPage accountDetailPage= new AccountDetailPage(driver);
        accountDetailPage.setFirstName(firstName);
        accountDetailPage.setLastName(lastName);
        accountDetailPage.setCurrentPassword(invalidPassword);
        accountDetailPage.setNewPassword(newPassword);
        accountDetailPage.setConfirmPassword(newPassword);
        accountDetailPage.saveChanges();


        Assert.assertTrue(accountDetailPage.existsElement());

    }

    @Test
    public void initiatePasswordWithEmptyCurrentPasswordAndValidPassword33 (){

        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        String newEmail=myAccountPage.getNewEmailAddress();
        myAccountPage.setRegisterEmailAdress(newEmail);
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();
        DashbordPage dashbordPage= new DashbordPage(driver);
        dashbordPage.openAccountDetailsPage();
        AccountDetailPage accountDetailPage= new AccountDetailPage(driver);
        accountDetailPage.setFirstName(firstName);
        accountDetailPage.setLastName(lastName);

        accountDetailPage.setNewPassword(newPassword);
        accountDetailPage.setConfirmPassword(newPassword);
        accountDetailPage.saveChanges();


        Assert.assertTrue(accountDetailPage.existsElement());

    }

    @Test
    public void initiatePasswordWithValidCurrentPasswordAndInvalidPassword35 (){

        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        String newEmail=myAccountPage.getNewEmailAddress();
        myAccountPage.setRegisterEmailAdress(newEmail);
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();
        DashbordPage dashbordPage= new DashbordPage(driver);
        dashbordPage.openAccountDetailsPage();
        AccountDetailPage accountDetailPage= new AccountDetailPage(driver);
        accountDetailPage.setFirstName(firstName);
        accountDetailPage.setLastName(lastName);
        accountDetailPage.setCurrentPassword(validPassword);
        accountDetailPage.setNewPassword(invalidPassword);
        accountDetailPage.setConfirmPassword(invalidPassword);
        accountDetailPage.saveChanges();


        Assert.assertTrue(accountDetailPage.existsElement());

    }

    @AfterMethod
    public void teardown() {
        //driver.quit();
    }

}