package seleniumwithtestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Buttonbox1 
{
@Test
	public void Buttonbox1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Buttonlogin=driver.findElement(By.xpath("// button[@name='login']"));
		boolean  excepteddisplyed=true;
		boolean actualdispalyed=Buttonlogin.isDisplayed();
		System.out.println("actualdispalyed;"+actualdispalyed);
		Assert.assertEquals(excepteddisplyed, excepteddisplyed);
		boolean actualEnabled =true;
		boolean exceptedEnabled =Buttonlogin.isEnabled();
		System.out.println("actualEnabled;"+actualEnabled);
		Assert.assertEquals(actualEnabled,exceptedEnabled);		 
		String actualbuttonlogin=Buttonlogin.getText();
		String exceptedbuttonlogin= "Log In";
		System.out.println("actual button login:="+actualbuttonlogin);
		Assert.assertEquals(actualbuttonlogin,exceptedbuttonlogin); 
		SoftAssert  sai=new SoftAssert();
		sai.assertAll();
		Buttonlogin.click();
	}

}
