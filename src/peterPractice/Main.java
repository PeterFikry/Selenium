package peterPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://selectorshub.com/xpath-practice-page//");
        driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("Peter");
        driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Justin");
       driver.findElement(By.xpath("//input[@style='width:auto;display:inline-block;']")).click();
    }
}
