package com.qascript;

import com.qascript.utils.PropertiesUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public static void initializeDriver() throws IOException {
        Properties properties = PropertiesUtils.loadApplicationProperties();
        String url= properties.getProperty("application.url").toString();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        //driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
    }

    public static void closedriver(){
        driver.quit();
    }
}
