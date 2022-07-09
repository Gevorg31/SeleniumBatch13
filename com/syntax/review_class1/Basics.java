package com.syntax.review_class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/index.php");
        //driver.navigate().to("Https://google.com");

        WebElement button1 = driver.findElement(By.linkText("Start Practising"));
        button1.click();
        Thread.sleep(2000);
        WebElement button2 = driver.findElement(By.partialLinkText("Proceed"));
        button2.click();




    }
}
