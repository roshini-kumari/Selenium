package sample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;


public class childwindow {




	//public void facebook()
	//{
		//WebDriver driver = WebDriverManager.edgedriver().create();
		//driver.manage().window().maximize();	
		//driver.get("https://www.google.co.in/");
		
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.id());
		public static void main(String[] args)  throws Exception
		{
			//WebDriver driver = new EdgeDriver();
			WebDriver driver = WebDriverManager.edgedriver().create();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/browser-windows");
			driver.findElement(By.id("windowButton")).click();
			String mainWindow = driver.getWindowHandle();
			Set<String> s1 =driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();

			

			while(i1.hasNext())

			{

				String childWindow = i1.next();

				 if(!mainWindow.equalsIgnoreCase(childWindow))

				 {

					 driver.switchTo().window(childWindow);

					 WebElement text = driver.findElement(By.id("sampleHeading"));

					 System.out.println("Heading of child window is " + text.getText());

					 driver.close();

					 System.out.println("child window closed");

				 }

			}

			 driver.switchTo().window(mainWindow);

		        driver.quit();
		
	}

}