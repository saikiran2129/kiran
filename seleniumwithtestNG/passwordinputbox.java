package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class passwordinputbox {

	@Test
	public void  passwordinputbox () 
	{
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.facebook.com/");

		WebElement  passwordinputbox = driver.findElement(By.xpath("//input[@id='pass']"));

		boolean isDisplayed =passwordinputbox .isDisplayed();
		Assert.assertEquals(isDisplayed, isDisplayed);

		boolean isEnabled =  passwordinputbox .isEnabled();
		Assert.assertEquals( isEnabled,isEnabled);


		String ActualWaterMarkData = passwordinputbox.getAttribute("aria-label");
		String ExceptedWaterMarkData =" Email address or phone number";
		Assert.assertEquals(ActualWaterMarkData,ExceptedWaterMarkData);
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();

		passwordinputbox.sendKeys("saikiran");

		String actualEnterdata =passwordinputbox.getAttribute("value");
		String Excepteddata ="saikiran";
		Assert.assertEquals( actualEnterdata, Excepteddata);

	}

	}


