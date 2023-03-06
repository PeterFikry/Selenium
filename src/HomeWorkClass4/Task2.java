package HomeWorkClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    Hw2:
    goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
    1. u need to write down the code that can select  1 check box out of 4 mentioned,
    e.g option1 , option2 , option 3, option 4

    Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement op2Btn = driver.findElement(By.cssSelector("input[value='Option-2']"));
        op2Btn.click();
        Thread.sleep(3000);
        boolean op2BtnSelected = op2Btn.isSelected();
        WebElement op4Btn = driver.findElement(By.cssSelector("input[value='Option-4']"));
        boolean op4BtnDisplayed = op4Btn.isDisplayed();
        if (op4BtnDisplayed && op2BtnSelected) {
            op4Btn.click();
        }
        boolean op4BtnSelected = op4Btn.isSelected();
        System.out.println("Check if option 2 button is selected or not : " + op2BtnSelected);
        System.out.println("Check if option 4 button is selected or not : " + op4BtnSelected);
    }
}

