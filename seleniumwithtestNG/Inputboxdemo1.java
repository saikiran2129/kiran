package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Inputboxdemo1 
{
@Test
public void Inputboxdemo()
 	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.google.com");

		WebElement inputbox= driver.findElement(By.xpath("//input[@id='identifierId']"));
		boolean isDisplayed =inputbox.isDisplayed();
		Assert.assertEquals(isDisplayed,isDisplayed);

		boolean isEnabled = inputbox.isEnabled();
		Assert.assertEquals( isEnabled, isEnabled);

		String ActualWaterMarkData =  inputbox.getAttribute("aria-label");
		String ExceptedWaterMarkData ="Email or phone";
		Assert.assertEquals(ActualWaterMarkData,ActualWaterMarkData);
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();
		inputbox.sendKeys("RBGtechnologies");

		String actualEnterdata =  inputbox.getAttribute("value");
		String Excepteddata =" RBGtechnologies";
		Assert.assertEquals( actualEnterdata, Excepteddata);
		}	 
	}













