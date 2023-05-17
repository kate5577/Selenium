package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("katetkachuk5577@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("2059818Or");
        String url =driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Facebook - log in or sign up")){
            System.out.println("correct");
        }else{
            System.out.println("incorrect");
        }
        driver.quit();

    }
}
