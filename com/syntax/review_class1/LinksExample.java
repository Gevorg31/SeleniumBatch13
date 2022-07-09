package com.syntax.review_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/index.php");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
         String  text = link.getText();
            System.out.println(text);
        }
    }
}
