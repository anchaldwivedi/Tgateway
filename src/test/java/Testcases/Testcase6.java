package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase6 extends Base_class
{
	@Test
	public void TC5() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='button-animated']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Download Graph report')]")).click();
		System.out.println("Clicked on Select Action dropdown and selected download graph report ");
		Thread.sleep(3000);
		
	}
}
