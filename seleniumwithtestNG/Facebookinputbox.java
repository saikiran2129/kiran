package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebookinputbox
{
	@Test
	public void Facebookinputbox()
 	{
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.facebook.com/");

		WebElement Facebookinputbox=driver.findElement(By.xpath("//input[@id='email']")); 
		boolean isDisplayed = Facebookinputbox.isDisplayed();
		Assert.assertEquals(isDisplayed,isDisplayed);

		boolean isEnabled = Facebookinputbox.isEnabled();
		Assert.assertEquals(isEnabled, isEnabled);

		String ActualWaterMarkData =Facebookinputbox.getAttribute("aria-label");
		String ExceptedWaterMarkData ="Email address or phone number";
		Assert.assertEquals(ActualWaterMarkData,ExceptedWaterMarkData);
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();
		Facebookinputbox.sendKeys("RBGtechnologies");

		String actualEnterdata =  Facebookinputbox.getAttribute("value");
		String Excepteddata =" RBGtechnologies";
		Assert.assertEquals( actualEnterdata, Excepteddata);

 	}
}