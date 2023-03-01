package HomeWorkClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

/*
    HW
    use xpath to complete this
    goto http://practice.syntaxtechs.net/basic-first-form-demo.php
    enter the message in the text box
    click on show message
    Enter value of a
    Enter value of B
    click on the button get total
    also please print the value of the attribute type of the button GET TOTAL
*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello Syntax Family");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("Peter");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("Ghobrial");
        driver.findElement(By.xpath("//button[contains(text(),'Total')]")).click();
        WebElement getTotal= driver.findElement(By.tagName("button"));
        String total = getTotal.getText();
        System.out.println(total);
        driver.close();
        }
    }

