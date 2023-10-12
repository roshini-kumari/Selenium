package sample;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class RightClick
{
	public static void main(String[] args)
	{
				//Step_1: Launch the browser
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();

				//Step_2: Maximize the browser
				driver.manage().window().maximize();


				//Step_3: Use the Implicit Wait method
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				//Step_4: Launch the application using URL 
				driver.get("https://www.amazon.in/");

				//Step_5: Identify the address of Search text field
				WebElement right = driver.findElement(By.id("twotabsearchtextbox"));

		 
				//Step_6: Right Click Action
				Actions a = new Actions(driver);
				a.contextClick(right).perform();

				//Step_7: Close current browser
				driver.close();	

		

	}

}
