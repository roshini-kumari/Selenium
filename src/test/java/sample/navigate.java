package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigate
{
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
	
		
		
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.get("https://www.amazon.in/");
				
				driver.navigate().to("https://www.nykaa.com/");
				driver.navigate().back();
				driver.navigate().forward();
				driver.close();
				
	}

}
