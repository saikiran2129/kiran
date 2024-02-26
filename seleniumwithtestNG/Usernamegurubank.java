package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Usernamegurubank {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement userinputbox = driver.findElement(By.xpath("//input[@name='userName']"));

		boolean isDisplayed = userinputbox .isDisplayed();
		Assert.assertEquals(isDisplayed,isDisplayed);

 		boolean isEnabled =userinputbox .isEnabled();
 		Assert.assertEquals(isEnabled ,isEnabled);
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();
		userinputbox.sendKeys("saikiran");

		String actualEnterdata =userinputbox.getAttribute("value");
		String Excepteddata ="saikiran";
 		Assert.assertEquals(actualEnterdata ,actualEnterdata);
 
	}
}
	



	


