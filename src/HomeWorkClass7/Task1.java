package HomeWorkClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {
    /*
    For homework
    You have to do all explicit wait examples from.the link I used in class .
    For the alert example
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='hidden']")));
        driver.findElement(By.xpath("//button[@id='hidden']")).click();
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='disable']")));
        driver.findElement(By.xpath("//button[@id='disable']")).click();
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));
    }
}
