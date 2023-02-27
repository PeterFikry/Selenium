package HomeWorkClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    HW2
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
    TIP for HW2:
    just fill in text boxes or button, no need to deal with other webElements
    also u will need a Thread.sleep after clcikng on create new account 🙂
    we will discuss "WHY" in future
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Syntax");
        driver.findElement(By.name("lastname")).sendKeys("Tester");
        driver.findElement(By.name("reg_email__")).sendKeys("5711112222");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");
        driver.findElement(By.id("month")).sendKeys("oct");
        driver.findElement(By.id("day")).sendKeys("10");
        driver.findElement(By.id("year")).sendKeys("1988");
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.className("_8ien")).click();
        Thread.sleep(5000);
        driver.close();



    }

}
