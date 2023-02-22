package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //tell your project where the webdriver is located.
        //for mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //open the website facebook.com
        driver.get("https://www.facebook.com/");

        //get the current url that is there in the browser
        String URL=driver.getCurrentUrl();
        //print out the URL
        System.out.println(URL);

        //get the title of the webpage
        String title=driver.getTitle();
        //print the title of the page
        System.out.println("The title of the page is "+title);

        //to keep the page running / slow down for 3 seconds before quit
        Thread.sleep(3000);

        //close the browser
        driver.quit();

    }
}
