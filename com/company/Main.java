package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        // write your code here
                System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
                // for window add extension .axe
                // you can use \\
                WebDriver driver = new ChromeDriver(); // launch the browser
                driver.get("https://www.google.com/"); // navigate to the specigied url
    }
}
