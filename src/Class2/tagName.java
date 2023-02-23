package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {

        //tell your project where the webdriver is located.
        //for mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //maximize the screen , very important we have always to do that
        driver.manage().window().maximize();
        //goto amazon website
        driver.get("https://www.amazon.com/");

        //print all the links in the amazon.com
        driver.findElements(By.tagName("a"));

        //to be continued in the next classes
    }
}
