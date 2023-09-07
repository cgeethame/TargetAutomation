package UtilityPackage;

import BaseClassPackage.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class UtilsClass extends BaseClass  {
    public static long PAGE_LOAD_TIMEOUT = 40;
    public static long IMPLICIT_WAIT = 40;
    public UtilsClass() {
        super();
    }

    public static void TakeScreenshot(String ScreenShotName)
    {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("/Users/geethachandrasekaran/IdeaProjects/DemoAutomationTarget" +
                    "/src/main/resources/Screenshot"+ScreenShotName+".jpg" ));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }

}
