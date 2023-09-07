package BaseClassPackage;

import UtilityPackage.ReadConfig;
import UtilityPackage.UtilsClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
public static WebDriver driver;
ReadConfig readConfig=new ReadConfig();
Properties prop = readConfig.LoadConfig();
String url=readConfig.getURL(prop);
protected String username= readConfig.getUserName(prop);
protected String password=readConfig.getPassword(prop);

public void initialization()
{
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get(prop.getProperty("url"));
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(UtilsClass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS  );
    driver.manage().timeouts().implicitlyWait(UtilsClass.IMPLICIT_WAIT,TimeUnit.SECONDS  );
}
}
