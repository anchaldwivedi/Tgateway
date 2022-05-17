package Delfor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic_libraries.Base_class;

public class Testcases5 extends Base_class
{ @Test
	public void TC5() throws Throwable
	{
	driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[3]/div[1]/div[1]/p[1]/i[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//body/app[1]/div[1]/app-b2b-sidebar[1]/nav[1]/ul[1]/li[3]/div[1]/div[2]/div[2]/a[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//tbody/tr[1]/td[2]/i[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@id='button-animated']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//a[contains(text(),'Download PDF')]")).click();
    }
public static void waitForTheExcelFileToDownload(String fileName, int timeWait)
        throws IOException, InterruptedException {
    String downloadPath = getSystemDownloadPath();
    File dir = new File(downloadPath);
    File[] dirContents = dir.listFiles();

    for (int i = 0; i < 3; i++) {
        if (dirContents[i].getName().equalsIgnoreCase(fileName)) {
            break;
        }else {
            Thread.sleep(timeWait);
        }
    }
}
}

	

