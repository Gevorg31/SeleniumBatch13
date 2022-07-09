package com.syntax.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //click on register
    //close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Gevorg");
        driver.findElement(By.id("customer.lastName")).sendKeys("Agadzhanyan");
        driver.findElement(By.id("customer.address.street")).sendKeys("333 Java Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Brooklyn");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("12345");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("212-555-3333");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");
        driver.findElement(By.id("customer.username")).sendKeys("gevorg123");
        driver.findElement(By.id("customer.password")).sendKeys("123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        driver.close();

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username")); // getting webelement in return
        username.sendKeys("Tester");
    }
}
