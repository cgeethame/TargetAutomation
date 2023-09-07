package PageClassPackage;

import BaseClassPackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {
@FindBy(xpath = "(//span[@class='styles__LinkText-sc-1e1g60c-3 dZfgoT h-margin-r-x3'])[1]")
    WebElement ClickOnUserName;
@FindBy(xpath = "(//a[@data-test='accountNav-guestSignOut'])[1]")
    WebElement SignOut;
@FindBy (xpath = "(//span[@class='styles__LinkText-sc-1e1g60c-3 dZfgoT h-margin-r-x3'])[1]")
WebElement SignInAfterSignOut;
public LandingPage(WebDriver driver )
{
  this.driver=driver;
    PageFactory.initElements(driver,this);
}


public boolean VerifySignOut()
{
    ClickOnUserName.click();
    return SignOut.isDisplayed();
}
public boolean VerifySignInAfterSignOut()
{
    ClickOnUserName.click();
    SignOut.click();
    return SignInAfterSignOut.isDisplayed();

}


}
