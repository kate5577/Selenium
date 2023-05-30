package HWclass04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {


        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement month=driver.findElement(By.cssSelector("select[name='birthday_month']"));
        Select sel=new Select(month);
        sel.selectByVisibleText("Feb");
        WebElement day=driver.findElement(By.cssSelector("select[name='birthday_day']"));
        Select sel2=new Select(day);
        sel2.selectByIndex(4);
        WebElement year=driver.findElement(By.cssSelector("select[name='birthday_year']"));
        Select sel3=new Select(year);
        sel3.selectByValue("1991");
       Thread.sleep(2000);
        driver.quit();



    }
}
