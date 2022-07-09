package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    //Open Chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username and password (username - Admin, password - Hum@nhrm123)
    //Click on login button
    //Then verify Syntax Logo is displayed.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(4000);
        WebElement userNameField = driver.findElement(By.xpath("//span[text() = 'Username']"));
        userNameField.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.xpath("//span[text() = 'Password']"));
        passwordField.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@type = 'submit']"));
        loginButton.click();

    }
}
