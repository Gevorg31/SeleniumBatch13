package com.syntax.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
          System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
          WebElement ageRadioButton = driver.findElement(By.cssSelector("input[value = '5 - 15']"));

          boolean isAgeRadioButtonEnable = ageRadioButton.isEnabled();
          System.out.println(isAgeRadioButtonEnable);

          boolean isAgeRadioButtonDisplayed = ageRadioButton.isDisplayed();
          System.out.println(isAgeRadioButtonDisplayed);

          boolean isAgeRadioButtonSelected = ageRadioButton.isSelected(); // check if it is selected
          System.out.println("Before clicking "+isAgeRadioButtonSelected); // false

          ageRadioButton.click();
          isAgeRadioButtonSelected = ageRadioButton.isSelected(); // checking if it is selected again, that is why we are reassigning
          System.out.println("After clicking "+isAgeRadioButtonSelected);// true

        driver.quit();
    }
}
