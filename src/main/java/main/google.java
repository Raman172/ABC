package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	String brows;
	WebDriver driver;
	Properties prop ;
	FileInputStream fis;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	google() throws IOException {

		fis = new FileInputStream("C:\\Users\\srishti.goel\\Favorites\\eclipse\\Feature1\\src\\main\\java\\config.properties");
		prop = new Properties();
		prop.load(fis);

	}
	public void initWebDriver() throws IOException

	{
		
		brows = prop.getProperty("browser");

		if (brows.equals("chrome"))

		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("ChromePath"));
			driver = new ChromeDriver();
		}

		else
			System.out.println("not found");

	}

}
