package Delfor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase1 extends Base_class
{
 @Test 
 public void TC1() throws Throwable
 {
	 driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/p[1]")).click();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]")).click();
     Thread.sleep(1000);
     

         driver.findElement(By.xpath("//span[contains(text(),'Receiver Filter')]")).click();
         Thread.sleep(1000);
         int Nooptions = driver.findElements(By.xpath("//ul[2]/li")).size();
         // System.out.println(Nooptions);

         for (int i = 1; i <= 2; i++) {

             driver.findElement(By.xpath("//ul[2]/li[1]")).click();
             Thread.sleep(1000);
             String text = driver.findElement(By.xpath("//ngx-select-dropdown[1]/div[1]/div[1]/ul[1]/li[" + i + "]"))
                     .getText();
             System.out.println("Selected Receiver Filter is: " + text);
             // Thread.sleep(1000);
}
         driver.findElement(By.xpath("//span[contains(text(),'Status Filter')]")).click();
         Thread.sleep(1000);
         int Nooptions1 = driver.findElements(By.xpath("//ul[2]/li")).size();
         // System.out.println(Nooptions);

         for (int i = 1; i <=2; i++) {

             driver.findElement(By.xpath("//ul[2]/li[1]")).click();
             Thread.sleep(1000);
             String text = driver.findElement(By.xpath("//ngx-select-dropdown[1]/div[1]/div[1]/ul[1]/li[" + i + "]"))
                     .getText();
             System.out.println("Selected Status Filter is: " + text);
             // Thread.sleep(1000);

         }

     }
 }



