package PageClassPackage;

import BaseClassPackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass  {
    @FindBy(xpath = "(//input[@id='username'])[1]")
    WebElement uname;
    @FindBy(xpath = "(//input[@id='password'])[1]")
    WebElement pword ;
    @FindBy(xpath = "(//button[@id='login'])[1]")
    WebElement SignIn ;


    public SignInPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void EnterUserName(String un)
    {
        uname.sendKeys(un);
    }
    public void EnterPassword(String pw)
    {
        pword.sendKeys(pw);
    }
    public void ClickSignIn()
    {
        SignIn.click();
    }
    public LandingPage VerifySignIn2()
    {
        uname.sendKeys(super.username);
        pword.sendKeys(super.password);
        SignIn.click();
        return new LandingPage(driver);
    }



}
