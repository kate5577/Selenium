package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        //navigate to google.com

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

      String currentUrl = driver.getCurrentUrl();
        System.out.println("the current url of the website  is : "+currentUrl);
        String title=driver.getTitle();
        System.out.println("the title of the page is :"+title);
        Thread.sleep(5000);
        driver.quit();



    }
}
