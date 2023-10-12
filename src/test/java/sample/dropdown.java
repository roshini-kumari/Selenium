package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown 
 {
	  public static void main(String[] args) 
	  {
					WebDriverManager.edgedriver().setup();
					WebDriver driver=new EdgeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					driver.get("https://www.calculator.net/interest-Calculator.html");
					WebElement element = driver.findElement(By.id("ccompound"));
					Select s=new Select(element);
					s.selectByVisibleText("daily");
					 driver.close();

				}
		    	      
		    	     
		      
}



