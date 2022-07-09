package com.syntax.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe"); // setting the property to use chrome driver
        WebDriver driver = new ChromeDriver(); // creating an object
        driver.get("https://www.amazon.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title+" "+url);
        driver.quit();

    }
}
