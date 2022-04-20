package generic_libraries;

import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class 
{
	@BeforeSuite
	public void launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
	}
	

	
}
