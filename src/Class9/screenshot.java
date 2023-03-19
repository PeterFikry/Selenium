package Class9;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {
        //tell your project where the webdriver is located.
        //for mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //max the window
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //we have to download Jar first and add it using this link : https://mvnrepository.com/artifact/commons-io/commons-io

        //        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");

        //take screenshot
        TakesScreenshot ss=(TakesScreenshot) driver;
        //take the screenshot as file
        File sourceFile=ss.getScreenshotAs(OutputType.FILE);
        System.out.println(sourceFile);
        //save the file in computer
        FileUtils.copyFile(sourceFile,new File("/Users/peterghobrial/Desktop/IntelliJ/SeleniumBatch15/src/screenshot/abc.png"));

    }
}
