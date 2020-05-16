package com.cbt.tests;

import com.cbt.utilities.StringUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTest {

    public static void main(String[] args) {
        chrome();
        firefox();
        edge();


    }

    public static void chrome(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtilities.verifyEquals(title,driver.getTitle());
        driver.navigate().forward();
        StringUtilities.verifyEquals(title2,driver.getTitle());

        driver.close();

    }
    public static void edge(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtilities.verifyEquals(title,driver.getTitle());
        driver.navigate().forward();
        StringUtilities.verifyEquals(title2,driver.getTitle());

        driver.close();

    }
    public static void firefox(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        driver.get("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        StringUtilities.verifyEquals(title,driver.getTitle());
        driver.navigate().forward();
        StringUtilities.verifyEquals(title2,driver.getTitle());

        driver.close();

    }
}
