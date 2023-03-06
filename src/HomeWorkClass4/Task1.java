package HomeWorkClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    HW1:
    goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
    check if the check box    "click on this check box" is Selected
    if no  Select the check box
    check gain if the checkbox is Selected or not
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBox=driver.findElement(By.cssSelector("input#isAgeSelected"));
        boolean isSelectedBox= checkBox.isSelected();
        System.out.println(isSelectedBox);
        if (!isSelectedBox){
            checkBox.click();
        }
        isSelectedBox= checkBox.isSelected();
        System.out.println(isSelectedBox);
    }
}
