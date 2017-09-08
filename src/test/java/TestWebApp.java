
import junit.framework.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebApp extends TestCase{
	
	public void testHome(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:9090/ExampleWebProject");
		driver.findElement(By.linkText("Click Here")).click();
		
	}

	
}