package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowHandles extends CommonMethods {
    public static void main(String[] args) {
        String url="http://accounts.google.com/signup";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement help=driver.findElement(By.linkText("Help"));
        help.click();

        WebElement privacy=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacy.click();
//get the window handle of the main page
        String mainPageHandle=driver.getWindowHandle();
        System.out.println(mainPageHandle);
        //get all the window handles and print the titles
       Set<String>allHandles= driver.getWindowHandles();
       for(String handle:allHandles){
           driver.switchTo().window(handle);
           String title=driver.getTitle();
           if(title.equalsIgnoreCase("Google Account Help")){
               break;
           }

        //  System.out.println("the title associated with "+handle+" is :"+title);

       }
        System.out.println(driver.getTitle());
       driver.switchTo().window(mainPageHandle);
        System.out.println("main page title: "+driver.getTitle());






    }
}
