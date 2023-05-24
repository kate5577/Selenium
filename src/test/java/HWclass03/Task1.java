package HWclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement fname= driver.findElement(By.cssSelector("input[name='first_name']"));
        fname.sendKeys("Kate");
        WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Tkachuk");
        WebElement mail=driver.findElement(By.cssSelector("input[name='email']"));
        mail.sendKeys("kate5577@gmail.com");
        WebElement phone=driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("869756-89");
        WebElement address=driver.findElement(By.cssSelector("input[placeholder='Address']"));
        address.sendKeys("bedford ave");
        WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("NY");
        WebElement state=driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("New York");
        WebElement zip=driver.findElement(By.xpath("//input[@name='zip']"));
        zip.sendKeys("11213");
        WebElement website=driver.findElement(By.cssSelector("input[name='website']"));
        website.sendKeys("marmi");
        WebElement hosting=driver.findElement(By.cssSelector("input[value='no']"));
        hosting.click();

        WebElement project=driver.findElement(By.cssSelector("textarea[name='comment']"));
        project.sendKeys("Selenium class");
        Thread.sleep(3000);
        WebElement send=driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        send.click();
        Thread.sleep(3000);

        driver.quit();


    }

}




