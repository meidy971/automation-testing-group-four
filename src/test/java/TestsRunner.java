
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.automationtesting.*;

public class TestsRunner {
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
        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAdress());
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
        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAdress());
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

        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAdress());
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
        String newEmail=myAccountPage.getNewEmailAdress();
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
        String newEmail=myAccountPage.getNewEmailAdress();
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
        String newEmail=myAccountPage.getNewEmailAdress();
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


}
