package Class9;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {
    public static void main(String[] args) {
        //tell your project where the webdriver is located.
        //for mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        //goto amazon.com
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //find the webElement username
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("admin");

        //to highlight the username box

        //1. declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //2. execute script
        // js.executeScript("arguments[0].style.border='10px dotted pink'");    draw a box
        //we can search for it by typing execution script for draw a box
        js.executeScript("arguments[0].style.border='3px solid red'",username);

        //find the WebElement
        WebElement loginBtn= driver.findElement(By.xpath("//input[@id='btnLogin']"));
        //click the login button
        js.executeScript("arguments[0].click();",loginBtn);

    }
}
