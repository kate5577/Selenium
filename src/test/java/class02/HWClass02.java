package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWClass02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.facebook.com/");
        WebElement newAccount =driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        newAccount.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kate");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Tkachuk");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kate678@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("kate678@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("66789k");
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("February");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("5");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1991");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src= 'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
        Thread.sleep(2000);
        driver.quit();
    }

}
