package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
    public static void main(String[] args) {
        //tell your project where the webdriver is located.
        //for mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
        chooseFile.sendKeys("/Users/peterghobrial/Downloads/4f3e25b2-1c56-4fbe-a6de-a327fb995dd4.jpg");          //we have to type the file location here (inside sendKeys) to upload it
    }
}
