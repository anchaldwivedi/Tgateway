package Delfor;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase2 extends Base_class

{
	@Test
	public void TC2() throws Throwable
	{
		// navigating to delivery forecast page
		driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/p[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@placeholder='From date']")).click();
	    wlb.pickDateFromCalender(driver,"2022", "April", 12);
	    driver.findElement(By.xpath("//input[@placeholder='To date']")).click();
	    wlb.pickDateFromCalender(driver,"2022", "April", 18);
	 
	}
	

}
