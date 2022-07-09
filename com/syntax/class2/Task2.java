package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//navigate to fb.com
//click on create new account
//fill up all the textboxes
//click on sign up button
//close the pop up
//close the browser

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2500);
        driver.findElement(By.name("firstname")).sendKeys("Java");
        driver.findElement(By.name("lastname")).sendKeys("Girl");
        driver.findElement(By.name("reg_email__")).sendKeys("999-999-9999");
        driver.findElement(By.id("password_step_input")).sendKeys("123456");
        driver.findElement(By.name("birthday_month")).sendKeys("January");
        driver.findElement(By.name("birthday_day")).sendKeys("10");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("Sign Up")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
