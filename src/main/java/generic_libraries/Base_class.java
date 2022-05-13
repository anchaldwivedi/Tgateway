package generic_libraries;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class 
{ 
	public Propertyfile_utility plib=new Propertyfile_utility();
	public WebDriver driver;
  public Webdriver_utilities wlb=new Webdriver_utilities();

	
	@BeforeSuite
	public void connect_database()
	{
		 
	System.out.println("connect to database");	
	}
	@BeforeClass
	public void launching_the_browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Webdriver_utilities wlib=new Webdriver_utilities();
		wlib.maxmaisewindow(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("browser launched ");
		
	}
	@BeforeMethod
	public void login_to_application() throws InterruptedException, Throwable
	{
		driver.get(plib.readdatafromproprtyfile("url"));
		 System.out.println("log in successfully");
	     driver.findElement(By.xpath("//input[@name='username']")).sendKeys(plib.readdatafromproprtyfile("username"));
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(plib.readdatafromproprtyfile("password"));
	     Thread.sleep(1000);
	     //driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	     driver.findElement(By.xpath("//button[.=' Login ']")).click();
	     Thread.sleep(1000);
	     }
	@AfterMethod
	public void logout_application() throws InterruptedException
	{
		 driver.findElement(By.xpath("//div[.=' HansVan Ende']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//app-header/div[1]/div[1]/div[3]/div[3]/div[2]/div[2]/a[1]")).click();
		System.out.println("logout application successfully");
		}
	@AfterClass
	public void close_the_browser()
	{  driver.quit();
		System.out.println("close the browser");
		
	}
	@AfterSuite
	public void close_the_database()
	{ 
		System.out.println("database close successfully");
		}
	}

