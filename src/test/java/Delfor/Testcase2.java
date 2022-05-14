package Delfor;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase2 extends Base_class

{
	@Test
	public void TC2()
	{
	Select drpdown1=new Select (driver.findElement(By.xpath("//span[contains(text(),'Status Filter')]")));
	drpdown1.deselectByVisibleText("Pending ");
	System.out.println("the status filter is selecting pending ");
		
	}
	

}
