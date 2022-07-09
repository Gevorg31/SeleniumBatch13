package com.syntax.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe"); // setting the property to use chrome driver
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("http://www.google.com"); // opens google browser
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle(); // method
        System.out.println(title);
        driver.quit();


    }
}
