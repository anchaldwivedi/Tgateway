package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase1 extends Base_class
{
	
	@Test
	public void test1() throws InterruptedException
	{
	
	Select drpRawEDI = new Select(driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[1]/select[1]")));
	drpRawEDI.selectByVisibleText("Consolidated");
	System.out.println("Clicked on RAW EDI dropdown and selected 'Consolidated' option ");
	Thread.sleep(5000);
	Select drpmonth = new Select(driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[5]/select[1]")));
	drpmonth.selectByVisibleText("Month");
	System.out.println("Clicked on Month dropdown and selected 'month' option ");
	Thread.sleep(5000);
	
	}
		

	@Test
	public void test2() throws InterruptedException
	{
		Select drpInboundOutbound1 = new Select (driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/select[1]")));
		drpInboundOutbound1.selectByVisibleText("Inbound");
		System.out.println("Clicked on Inbound Outbound dropdown and selected 'Inbound' option ");
		Thread.sleep(3000);
	}
	@Test
	public void test3() throws InterruptedException
	{
		Select drpInboundOutbound1 = new Select (driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/select[1]")));
		drpInboundOutbound1.selectByVisibleText("Outbound");
		System.out.println("Clicked on Inbound Outbound dropdown and selected 'Outbound' option ");
		Thread.sleep(3000);
	}
	
	
	
}

