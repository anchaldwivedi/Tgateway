package generic_libraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Webdriver_utilities
{
	
		public void maxmaisewindow(WebDriver driver)
		{
			driver.manage().window().maximize(); 
		}
		public void loadforpage(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}
		
		 public void waitforelementtobeclickable(WebDriver driver,WebElement Element)
		 {
			 WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.elementToBeClickable(Element));
		 }
		 public void waitandclick(WebElement element) throws InterruptedException
		 {
			 int count=0;
			 while(count<20)
			 {
				 try{
					 element.click();
					 break;
				 }
				 catch(Throwable e)
				 {
					 Thread.sleep(1000);
				 }
				 }
			 }
		 public void select(WebElement element, String option)
		 {
			 Select select=new Select(element);
			 select.selectByVisibleText(option);
		 }
		 public void select(WebElement element ,int index)
		 {
			 Select select1=new Select(element);
			 select1.selectByIndex(index);
			 
		 }
		 public void mouseover(WebDriver driver ,WebElement element)
		 {
			 Actions act =new Actions( driver);
			 act.moveToElement(element).perform();
			 
		 }
		 public void rightclick(WebDriver driver, WebElement element)
		 {
			 Actions act1 =new Actions( driver);
			 act1.contextClick(element).perform();
		 }
		 public void acceptalert(WebDriver driver)
		 {
			 driver.switchTo().alert().accept();
		 }
		 public void cancelalert(WebDriver driver)
		 {
			 driver.switchTo().alert().dismiss();
		 }
		 public void switchToWindow(WebDriver driver, String partialWinTitle)
			{
				// Step 1: use getWindowHandles to capture all window ids
				Set<String> windows = driver.getWindowHandles();
				
				// Step 2: Iterate thru the windows
				java.util.Iterator<String> it = windows.iterator();
				
				//Step 3: check whether there is next window
				while(it.hasNext())
				{
					// Step 4: capture current window id
					String winId = it.next();
					
					// Step 5: switch to current window title
					String currentWinTitle = driver.switchTo().window(winId).getTitle();
					
					// Step 6: check whether current window is expected
					if(currentWinTitle.contains(partialWinTitle))
					{
						break;
					}
				}
			}
		 
		 }

		 

