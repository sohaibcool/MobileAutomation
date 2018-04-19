import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Iframe extends base2Chrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	//	AndroidDriver<AndroidElement> driver=Capabilities();
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/recaptcha/api2/demo");
	//	driver.manage().window().maximize();
		int m = findFrameNumber(driver,By.xpath(".//*[@role='presentation'"));
		driver.switchTo().frame(m);
		driver.findElement(By.xpath("//*[@role='presentation'")).click();
		driver.switchTo().defaultContent();
		
		//int number1 =
		
		int m1=findFrameNumber(driver,By.xpath("//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(m1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
		
	}

	
	public static int findFrameNumber(WebDriver driver, By by)
	{
		int i;
		int framecount= driver.findElements(By.tagName("iframe")).size();
		System.out.println(framecount);
		for(i=0;i<framecount;i++)
		{
			driver.switchTo().frame(i);
			System.out.println(i);
			int count = driver.findElements(by).size();
			
			if(count>0)
			{
				break;
			}
			else
			{
				System.out.println("coutinue loopoing");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}
}



