package HWclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Kate");
        driver.findElement(By.id("customer.lastName")).sendKeys("Tkachuk");
        driver.findElement(By.id("customer.address.street")).sendKeys("3456 bedford ave");
        driver.findElement(By.name("customer.address.city")).sendKeys("Brooklyn");
        driver.findElement(By.name("customer.address.state")).sendKeys("NY");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("11229");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("6462269075");
        driver.findElement(By.id("customer.ssn")).sendKeys("6548765645");
        driver.findElement(By.name("customer.username")).sendKeys("mikki");
        driver.findElement(By.id("customer.password")).sendKeys("mikki89");
        driver.findElement(By.name("repeatedPassword")).sendKeys("mikki89");
        Thread.sleep(2000);
        driver.quit();






    }
}
