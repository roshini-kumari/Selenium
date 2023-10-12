package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class links 
{
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		  List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		  System.out.println(AllLinks.size());
			for(int i =1;i< AllLinks.size();i++)
			{

				System.out.println(AllLinks.get(i).getText());

			  

			 }

			driver.close();
		

	}

}
