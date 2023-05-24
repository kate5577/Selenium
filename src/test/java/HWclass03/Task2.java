package HWclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement username= driver.findElement(By.cssSelector("input[name='txtUsername']"));
        username.sendKeys("kate5577");
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.xpath("//input[@name='Submit']"));
        login.click();
        WebElement errorMessage=driver.findElement(By.cssSelector("span[id='spanMessage']"));
       String text= errorMessage.getText();
        System.out.println(text);

        Thread.sleep(3000);

        driver.quit();
    }
}
