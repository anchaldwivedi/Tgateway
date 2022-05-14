package Delfor;

import org.openqa.selenium.By;
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
     Thread.sleep(10000);
 
	 Select  drpdown1= new  Select(driver.findElement(By.xpath("//span[contains(text(),'Pending')]")));
	 	drpdown1.selectByVisibleText("Pending ");
	 	System.out.println("the status filter is selecting pending ");
	 	Thread.sleep(1000);
	 //   Select  drpdown2= new  Select(driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-delfor-list[1]/section[1]/div[1]/div[1]/div[1]/div[1]/app-list-filter[1]/div[1]/div[4]/ngx-select-dropdown[1]/div[1]/button[1]/span[2]")));
	   //  	drpdown2.selectByVisibleText("IPECR ");
	   //  	System.out.println("the reciever filter is selecting IPCER ");
	     
 }
 
}

