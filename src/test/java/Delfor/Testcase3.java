package Delfor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcase3 extends Base_class
{ @Test
	public void TC3() throws Throwable
	{

	 driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/p[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]")).click();
    Thread.sleep(10000);
   WebElement ele1= driver.findElement(By.xpath("//body/app[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-delfor-list[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]"));
     
   ele1.sendKeys("55780009761");
   ele1.sendKeys(Keys.ENTER );
	 }
	 }
	


