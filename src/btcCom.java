import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class btcCom extends base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Hello i am at this point");
		Thread.sleep(4000L);
		System.out.println(driver);
		//driver.findElementByAndroidUIAutomator("text(\"New Account\")").click();
		driver.findElement(By.xpath("contains(text='Sign in...'")).click();
		//driver.findElementByAndroidUIAutomator("content-desc(\"Sign in...\")").click();
	//	driver.findElementByAndroidUIAutomator("new UiSelector().content-desc(Sign in...)").click();
		//driver.findElementByClassName("android.view.View").click();
	//	driver.findElementsByXPath("(//android.view.View)[2]").get(2).click();
	/*	driver.findElementsByXPath("//android.view.View").get(1).click();
		
		int size1 = driver.findElementsByXPath("//android.view.View").size();
		int size = driver.findElementsByXPath("//android.view.View").size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
		String abc = driver.findElementByXPath("//android.view.View").getText();
			System.out.println(abc);
		}
		driver.findElementsByXPath("//android.view.View").get(0).click();*/
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("sohaibcool10@gmail.com");
		
	//	driver.findElementByXPath(using)
	//	driver.findElementByXPath()
		
	}

}
