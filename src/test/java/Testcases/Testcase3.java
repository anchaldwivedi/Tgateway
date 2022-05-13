package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase3 extends Base_class
{
	@Test
	public void test1() throws InterruptedException
	{
	
	
	Select drpRawEDI = new Select(driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[1]/select[1]")));
	drpRawEDI.selectByVisibleText("Consolidated");
	System.out.println("Clicked on RAW EDI dropdown and selected 'Consolidated' option ");
	Thread.sleep(5000);
	Select drpmonth = new Select(driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[5]/select[1]")));
	drpmonth.selectByVisibleText("Year");
	System.out.println("Clicked on Month dropdown and selected 'year' option ");
	Thread.sleep(5000);
	
	}
		

}
