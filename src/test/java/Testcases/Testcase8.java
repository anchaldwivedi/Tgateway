package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase8 extends Base_class
{
	@Test
	public void TC() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='button-animated']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Export Graph data to Excel')]")).click();
		System.out.println("Clicked on Select Action dropdown and export graph data to excel ");
		
		
	}

}
