import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.automationtesting.DashbordPage;
import pageobjects.automationtesting.HeadPage;
import pageobjects.automationtesting.MyAccountPage;

public class TestsRunner {
    WebDriver driver;

        @BeforeMethod
    public void setup() {
            driver = new ChromeDriver();
            driver.get("http://practice.automationtesting.in/");
            driver.manage().window().maximize();
        }
        String invalidEmail= "durand.jean75gmail.com";
        String validEmail= "faxatezage-9317@yopmail.com";
        String nonExistentEmail= "durand.jean75@gmail.com";
        String invalidPassword= "Paris75";
        String validPassword= "Aloui911234567.Ahhjlma%..?";

        @Test

    public void registerWithInvalidEmailAndInvalidPassword (){



            HeadPage headPage= new HeadPage(driver);
            headPage.openMyAccountPage();
            MyAccountPage myAccountPage=new MyAccountPage(driver);
            myAccountPage.setRegisterEmailAdress(invalidEmail);
            myAccountPage.setRegisterPassword(invalidPassword);
            myAccountPage.register();


            Assert.assertTrue(myAccountPage.existsElement());

    }
@Test
    public void registerWithEmptyEmailAndEmptyPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);

        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }
@Test
    public void registerWithValidEmailAndEmptyPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAdress());
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }

@Test
    public void registerWithValidEmailAndInvalidPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAdress());
        myAccountPage.setRegisterPassword(invalidPassword);
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }

    @Test
    public void registerWithValidEmailAndValidPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);

        myAccountPage.setRegisterEmailAdress(myAccountPage.getNewEmailAdress());
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();


        Assert.assertFalse(myAccountPage.existsElement());

    }
    @Test

    public void registerWithNonExistentEmailAndValidPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterEmailAdress(nonExistentEmail);
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }
@Test
    public void registerWithEmptyEmailAndValidPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setRegisterPassword(validPassword);
        myAccountPage.register();


        Assert.assertTrue(myAccountPage.existsElement());

    }
//US2: Connexion à un compte
    @Test
    public void loginWithValidEmailAndValidPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(validPassword);
        myAccountPage.setLoginUserNameOrAdress(validEmail);
        myAccountPage.login();


        Assert.assertFalse(myAccountPage.existsElement());

    }
    @Test
    public void loginWithInvalidEmailAndInvalidPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(invalidPassword);
        myAccountPage.setLoginUserNameOrAdress(invalidEmail);
        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement());

    }
    @Test
    public void loginWithEmptyEmailAndValidPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(validPassword);

        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement());

    }

    @Test
    public void loginWithEmptyEmailAndEmptyPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);

        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement());

    }
    @Test
    public void loginWithValidEmailAndLowercaseValidPassword (){



        HeadPage headPage= new HeadPage(driver);
        headPage.openMyAccountPage();
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.setLoginPassword(validPassword.toLowerCase());
        myAccountPage.setLoginUserNameOrAdress(validEmail);
        myAccountPage.login();


        Assert.assertTrue(myAccountPage.existsElement());

    }


    @Test
    public void loginWithValidEmailAndValidPasswordThenLoout (){



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

}
