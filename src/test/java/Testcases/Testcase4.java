package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase4 extends Base_class
{
	@Test
	public void test1() throws InterruptedException
	{
	
	Select drpRawEDI = new Select(driver.findElement(By.xpath("//div[@class='col-lg-2 col-md-3 col-sm-2']/select")));
	drpRawEDI.selectByValue("UC");
	System.out.println("Clicked on RAW EDI dropdown and selected 'Raw EDI' option ");
	Thread.sleep(5000);
	Select drpmonth = new Select(driver.findElement(By.xpath("(//div[@class='row']/div[@class='col-lg-2 col-md-3 col-sm-2']//following-sibling::div/select)[2]")));
	drpmonth.selectByVisibleText("Month");
	System.out.println("Clicked on Month dropdown and selected 'month' option ");
	Thread.sleep(5000);
	
	}
		

}
