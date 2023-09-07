package UtilityPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    public Properties LoadConfig() {
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("/Users/geethachandrasekaran/IdeaProjects/" +
                    "DemoAutomationTarget/src/main/java/ConfigPackage/Config.Properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    public String getURL(Properties prop) {
        String url = prop.getProperty("url");
        return url;
    }

    public String getUserName(Properties prop) {
        String user = prop.getProperty("username");
        return user;
    }

    public String getPassword(Properties prop) {
        String pass = prop.getProperty("password");
        return pass;
    }
}
