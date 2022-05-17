package Delfor;

import org.testng.annotations.Test;

import generic_libraries.Base_class;
import org.openqa.selenium.*;

public class Testcase4 extends Base_class
{
	@Test
	public void TC4() throws Throwable
	{
		
		 driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[2]/div[1]/div[1]/p[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("//span[contains(text(),'Partner Filter')]")).click();
	        Thread.sleep(1000);
	        int Nooptions = driver.findElements(By.xpath("//ul[2]/li")).size();
	        // System.out.println(Nooptions);

	        for (int i = 1; i <= 2; i++) {

	            driver.findElement(By.xpath("//ul[2]/li[1]")).click();
	            Thread.sleep(1000);
	            String text = driver.findElement(By.xpath("//ngx-select-dropdown[1]/div[1]/div[1]/ul[1]/li[" + i + "]"))
	                    .getText();
	            System.out.println("Selected Partner Filter is: " + text);
	            Thread.sleep(1000);
	            driver.findElement(By.xpath("//span[contains(text(),'Partner Org Filter')]")).click();
	            Thread.sleep(1000);
	            int Nooptions1 = driver.findElements(By.xpath("//ul[2]/li")).size();
	            // System.out.println(Nooptions1);

	            for (int i1 = 1; i1 <= 2; i1++) {

	                driver.findElement(By.xpath("//ul[2]/li[1]")).click();
	                Thread.sleep(1000);
	                String text1 = driver.findElement(By.xpath("//ngx-select-dropdown[1]/div[1]/div[1]/ul[1]/li[" + i + "]"))
	                        .getText();
	                System.out.println("Selected Partner Org Filter is: " + text1);
	                // Thread.sleep(1000);

	            }

        }
	}
}
		

	
	
	
	


