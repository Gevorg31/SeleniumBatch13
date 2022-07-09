package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/index.php");
        WebElement startPracticingButton = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticingButton.click();
        Thread.sleep(2000);
        WebElement simpleForDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleForDemo.click();
        Thread.sleep(2000);
        WebElement textBox = driver.findElement(By.cssSelector("input[placeholder ^= 'Please']"));
        textBox.sendKeys("Hello World");
        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick *= 'show']"));
        showMessageButton.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
