package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrders {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); // getting webelement in return
        username.sendKeys("Tester"); // performing action the specific element
        WebElement password =  driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        driver.findElement(By.className("button")).click();
    }
}
