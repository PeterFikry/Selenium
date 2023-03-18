package HomeWorkClass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Task1 {
    /*
    please do this HW
    it is needed to be done before class on saturday
    i request everyone to Attempt it as this will help u alot in working with tables and calenders.

    1.goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

    username=Admin
    password=Hum@nhrm123

    2. click on PIM option
    3. from the table select Any  value of id and click the checkbox associated with it

    make sure that ur code is dynamic i.e
    changing the id doesnt effect the logic or xpath
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement username =wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtUsername")));
        username.sendKeys("Admin");
        WebElement password=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("txtPassword")));;
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
        loginButton.click();
        driver.findElement(By.linkText("PIM")).click();
        List<WebElement> column=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i = 0; i < column.size(); i++) {
            String text=column.get(i).getText();
            if (text.equalsIgnoreCase("52328A")){
                System.out.println(text+" is in the list on index"+i);
                System.out.println(text+" is in the table on index"+(i+1));
                driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]")).click();
            }
        }
    }
}
