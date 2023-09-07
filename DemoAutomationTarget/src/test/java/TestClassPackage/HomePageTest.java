package TestClassPackage;

import BaseClassPackage.BaseClass;
import PageClassPackage.HomePage;
import PageClassPackage.SignInPage;
import UtilityPackage.UtilsClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass  {
    HomePage hp;
    SignInPage sp;
    public HomePageTest()
    {
        super();
    }
    @BeforeMethod
    public void setup()
    {
        initialization() ;
        hp=new HomePage(driver);
    }
    @AfterMethod
    public void teardown()
    {
        driver.close();
    }
    @Test(priority = 1)
    public void TestHomePageTitle()
    {
        String title= hp.VerifyTitle();
        Assert.assertEquals(title,"Target : Expect More. Pay Less.");
    }
    @Test(priority = 2)
    public void TestHomePageRegistry()
    {
        boolean value1=hp.VerifyRegistry();
        Assert.assertTrue(value1);
    }
    @Test(priority = 3)
    public void TestHomePageWeeklyAd()
    {
        boolean value2=hp.VerifyWeeklyAd() ;
        Assert.assertTrue(value2);
    }
    @Test(priority = 4)
    public void TestHomePageRedCard()
    {
        boolean value3=hp.VerifyRedCard() ;
        Assert.assertTrue(value3);
    }
    @Test(priority = 5)
    public void TestHomePageTargetCircle()
    {
        boolean value4=hp.VerifyTargetCircle();
        Assert.assertTrue(value4);
    }
    @Test(priority = 6)
    public void TestHomePageFindStores()
    {
        boolean value5=hp.VerifyFindStores();
        Assert.assertTrue(value5);
        UtilsClass.TakeScreenshot("WebsiteImage1");
    }
    @Test(priority = 7)
    public void TestHomePageSignIn()
    {
        sp=hp.VerifySignIn();
    }


}
