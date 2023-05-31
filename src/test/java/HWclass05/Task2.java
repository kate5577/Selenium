package HWclass05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.switchTo().frame("frame1");
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
       driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        WebElement dd=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Selenium class5");





    }
}
