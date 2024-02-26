package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Browserlabelchrome4
{
	@Test
public void Browserlabelchrome()
 	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com");
		WebElement	label=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		String excptedData="to continue to gmail";
		String actualData=label.getText();
		Assert.assertEquals(excptedData,actualData );

	}

}	



