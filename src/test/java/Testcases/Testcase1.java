package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import generic_libraries.Base_class;

public class Testcase1 extends Base_class
{
	public static void main (Strings args())
	{
	
	Select drpRawEDI = new Select(driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-dashboard[1]/div[1]/div[1]/select[1]")));
	drpRawEDI.selectByVisibleText("Consolidated");
	System.out.println("Clicked on RAW EDI dropdown and selected 'Consolidated' option ");

}
}

