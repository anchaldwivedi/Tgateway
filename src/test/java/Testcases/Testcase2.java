package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_libraries.Base_class;
import generic_libraries.Webdriver_utilities;

public class Testcase2 extends Base_class
{

	@Test
	public void TC4() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='button-animated']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Print Graph report')]")).click();
		System.out.println("Clicked on Select Action dropdown and selected print graph report ");
		Thread.sleep(3000);
		Webdriver_utilities wlib=new Webdriver_utilities();
		wlib.switchToWindow(driver, "blob:https://gateway");
		driver.close();
		wlib.switchToWindow(driver, "gateway");
	}
	
}
