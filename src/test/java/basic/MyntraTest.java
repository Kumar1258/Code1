package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest {

	@Test

	public void myntraTest()

	{
			WebDriver dc = new ChromeDriver();
		    dc.manage().window().maximize();
		    dc.get("https://www.myntra.com/");
		    String allTitle = dc.getTitle();
		    System.out.println(allTitle);

	}


}
