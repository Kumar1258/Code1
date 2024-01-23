package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TiraTest {
	
	@Test
	public void tiraTest()
	{
		WebDriver dc=new ChromeDriver();
		dc.manage().window().maximize();
		dc.get("https://www.tirabeauty.com/");
		WebElement tf = dc.findElement(By.id("search"));
		tf.sendKeys("Perfumes");
		tf.sendKeys(Keys.ENTER);
		
	}

}
