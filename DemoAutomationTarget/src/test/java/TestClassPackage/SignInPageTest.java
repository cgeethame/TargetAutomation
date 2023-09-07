package TestClassPackage;

import BaseClassPackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.LandingPage;
import PageClassPackage.SignInPage;
import UtilityPackage.UtilsClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseClass  {
    HomePage hp;
    SignInPage sp;
    LandingPage lp;
    public SignInPageTest()
    {
        super();
    }
    @BeforeMethod
    public void setup()
    {
        initialization() ;
        hp=new HomePage(driver);
        sp=new SignInPage(driver) ;
        hp.VerifySignIn();
    }
    @AfterMethod
    public void teardown()
    {
        driver.close();
    }
    @Test
    public void TestVerifySignIn1()
    {
        lp=sp.VerifySignIn2();
        UtilsClass.TakeScreenshot("WebsiteImage2");
    }
}
