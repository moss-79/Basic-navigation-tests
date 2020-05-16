package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.logging.LogManager;

public class BrowserFactory {


    public static WebDriver getDriver(String browserName) {
        //  System.out.println();

        if (browserName.equalsIgnoreCase("safari")){
            return null;
        }
         else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else{

            WebDriverManager.chromedriver().setup();
            WebDriverManager.chromedriver().version("79").setup();
            return new ChromeDriver();


        }

    }
}