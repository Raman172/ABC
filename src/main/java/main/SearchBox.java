package main;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Timeouts;

public class SearchBox extends google{

	
	By srchEntr = By.id("twotabsearchtextbox");
	SearchBox() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	String url  ;
	public void search() throws IOException
	{
		initWebDriver();
		url= prop.getProperty("URL");
		driver.get(url);
		
	}
	
	public void enter(String text)
	{
		driver.findElement(srchEntr).sendKeys(Keys.chord(text, Keys.ENTER));
	}
	
	
	public void get()
	{
		enter("mobile");
	}
	
	
	public void screenShot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE) ;
		
		String filepath = ".//Result.png"	 ;
		
		 FileUtils.copyFile(scr, new File(filepath));
	}
	
	
	public void waitForElement(By locator) throws InterruptedException
	{
		for(int i=0;i<20;i++)
		{
			if(!isElementPresent(locator))
			{
				Thread.sleep(1000);
			}
			else
				break;
		}
	}

	private boolean isElementPresent(By locator) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElement(locator);
			return true ;
		}
		catch(NoSuchElementException e)
		{
			e.getStackTrace();

			return false;
		}
		catch(ElementNotVisibleException e)
		{
			
		}
		return false;
	}
	
	
	
}
