import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeWeb2 extends base2Chrome{

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wd=new WebDriverWait(driver,7);

		driver.get("https://www.google.com/recaptcha/api2/demo");

		driver.manage().window().maximize();

		int m=findFrameNumber(driver,By.xpath("//*[@role='presentation'"));

		driver.switchTo().frame(m);

		driver.findElement(By.xpath("//*[@role='presentation'")).click();

		driver.switchTo().defaultContent();

		wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

		int j=findFrameNumber(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));

		if(j!=-1)

		{

		driver.switchTo().frame(j);

		//WebDriverWait wd=new WebDriverWait(driver,5);

		//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));

		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

		}

		else{

		System.out.println("ops");

		}

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



