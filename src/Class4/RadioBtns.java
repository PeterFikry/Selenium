package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        //tell your project where the webdriver is located.
        //for mac users please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");

        //create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        //max the window
        driver.manage().window().maximize();
        //goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        //click on the radio button
        WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
        //check if the radio button is enabled
        boolean isEnabledMale = maleBtn.isEnabled();
        System.out.println("the radio button male is enabled " + isEnabledMale);
        //check f the radio button is displayed
        boolean isDisplayedMale = maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed " + isDisplayedMale);
        //check if the radio button is Selected
        boolean isSelectedMale = maleBtn.isSelected();
        System.out.println("the male button is selected " + isSelectedMale);
        //if the radio button is not selected click on it
        if (!isSelectedMale) {
            maleBtn.click();
        }
        //check if the radio button is selected after the click
        isSelectedMale = maleBtn.isSelected();
        System.out.println("the status of selection is " + isSelectedMale);
    }
}

