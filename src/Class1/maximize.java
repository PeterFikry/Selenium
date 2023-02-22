package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {
        //connect to webdriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        //initate the instance of webdriver
        WebDriver driver=new ChromeDriver();
        // goto google.com
        driver.get("https://www.google.com/");
        //selenium1.maximize the window
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //close
        driver.close();
    }
}
