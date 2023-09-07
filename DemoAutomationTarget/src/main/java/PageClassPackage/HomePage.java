package PageClassPackage;

import BaseClassPackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BaseClass  {
    @FindBy(xpath = "(//a[@id='utilityNav-registries'])[1]")
    WebElement registry;
    @FindBy(xpath = "//a[@id='utilityNav-weeklyAd']")
    WebElement WeeklyAd ;
    @FindBy(xpath ="//a[@id='utilityNav-redCardLI']" )
    WebElement RedCard ;
    @FindBy(xpath = "//a[@id='utilityNav-circle']")
    WebElement TargetCircle ;
    @FindBy(xpath ="//a[@id='utilityNav-findStores']" )
    WebElement FindStores;
    @FindBy (xpath ="(//span[@class='styles__LinkText-sc-1e1g60c-3 dZfgoT h-margin-r-x3'])[1]" )
    WebElement SignIn;
    @FindBy(xpath = "(//span[@class='styles__ListItemText-sc-diphzn-1 jaMNVl'][normalize-space()='Sign in'])[1]")
    WebElement SignInButton;
    public HomePage(WebDriver driver )
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public String VerifyTitle()
    {
        String title=driver.getTitle();
        return title;
    }
    public boolean VerifyRegistry()
    {
        boolean registry1=registry.isDisplayed();
        return registry1;
    }
    public boolean VerifyWeeklyAd()
    {
        boolean WeeklyAd1=WeeklyAd.isDisplayed();
        return WeeklyAd1;
    }

    public boolean VerifyRedCard()
    {
        boolean RedCard1=RedCard.isDisplayed();
        return RedCard1;
    }
    public boolean VerifyTargetCircle()
    {
        boolean TargetCircle1=TargetCircle.isDisplayed();
        return TargetCircle1;
    }
    public boolean VerifyFindStores()
    {
        boolean FindStores1=FindStores.isDisplayed();
        return FindStores1;
    }
    public SignInPage VerifySignIn()
    {
        SignIn.click();
        SignInButton.click();
        return new SignInPage(driver);
    }
}
