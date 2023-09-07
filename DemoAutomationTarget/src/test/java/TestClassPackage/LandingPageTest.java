package TestClassPackage;

import BaseClassPackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.LandingPage;
import PageClassPackage.SignInPage;
import UtilityPackage.UtilsClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseClass  {
HomePage hp;
SignInPage sp;
LandingPage lp;
public LandingPageTest ()
{
    super();
}
@BeforeMethod
public void setup()
{
    initialization();
    hp=new HomePage(driver );
    sp=new SignInPage(driver);
    lp=new LandingPage(driver );
    hp.VerifySignIn();
    sp.VerifySignIn2();
}
@AfterMethod
public void teardown()
{
    driver.close();
}

@Test
    public void TestVerifySignOut() throws InterruptedException {
        boolean Out=lp.VerifySignOut();
        Assert.assertTrue(Out);
        Thread.sleep(2000);
        UtilsClass.TakeScreenshot("WebsiteImage3");

    }
    @Test
    public void TestVerifySignInAfterSignOut() throws InterruptedException {
        boolean in=lp.VerifySignInAfterSignOut();
        Assert.assertTrue(in);
        Thread.sleep(2000);
        UtilsClass.TakeScreenshot("WebsiteImage4");

    }

}
