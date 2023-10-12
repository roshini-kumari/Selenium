package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class facebook2
{
	public void facebook()
		{

		
			WebDriver driver = WebDriverManager.edgedriver().create();
			driver.manage().window().maximize();	
			driver.get("https://www.google.co.in/");
			
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("roshini@gmail.com");
		}
			

}
