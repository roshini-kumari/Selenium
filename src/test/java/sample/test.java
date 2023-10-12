package sample;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();//launch the browser
		
		driver.manage().window().maximize();// to maximize the browser
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	  //driver.manage().window().minimize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		//driver.navigate().to("https://www.nykaa.com/");
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//driver.navigate().refresh();
		driver.close();
		driver.quit();
		
	}

}
