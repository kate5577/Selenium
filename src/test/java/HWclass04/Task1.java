package HWclass04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement days = driver.findElement(By.xpath("//select[@id='select-demo']"));
        days.click();
        Select sel=new Select(days);
        sel.selectByVisibleText("Tuesday");
        Thread.sleep(2000);
        sel.selectByIndex(5);
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
        driver.quit();




    }
}
