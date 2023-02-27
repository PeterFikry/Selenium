package HomeWorkClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    HW1:
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("peter");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.lastName")).sendKeys("tester");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.street")).sendKeys("1234 Washington CT");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.city")).sendKeys("Fairfax");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("20222");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("571-222-4567");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.ssn")).sendKeys("123456789");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("PeterTester1");
        Thread.sleep(1000);
        driver.findElement(By.name("customer.password")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(6000);
        driver.close();


    }
}
