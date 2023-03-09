package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        //tell your project where the webdriver is located.
        //for mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //max the window
        driver.manage().window().maximize();

        //goto google.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S285382651%3A1678243024242419&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHdhmJcvrFO6xOhfHGppqJVn1ZoJYaddtoBbKmzVBpGQzzkUYwykosPnWmAfemE_m5CYSh0-");

        //click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        //click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        //get the window handle of the parent window
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        //get window handle of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();

        //print all the window handles
        for (String wh : windowHandles) {
            //switch the focus of the driver to help window
            driver.switchTo().window(wh);
            //check the title of the window to which our focus is right now
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")) {
                break;
            }
        }
        //to verify we switched to the right window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);
    }
}
