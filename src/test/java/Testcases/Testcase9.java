package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase9 extends Base_class
{

	@Test
	public void test3() throws InterruptedException
	{
		Select drpInboundOutbound1 = new Select (driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[2]/select[1]")));
		drpInboundOutbound1.selectByVisibleText("Outbound");
		System.out.println("Clicked on Inbound Outbound dropdown and selected 'Outbound' option ");
		Thread.sleep(3000);
	}
	
	

}
