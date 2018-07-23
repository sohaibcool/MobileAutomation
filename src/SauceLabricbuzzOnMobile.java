import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SauceLabricbuzzOnMobile extends base2Chrome{

	public static void main(String[] args) throws MalformedURLException  {
		// TODO Auto-generated method stub

		//	AndroidDriver<AndroidElement> driver=Capabilities();
/*			driver.get("http://facebook.com");
			driver.findElementByXPath("//*[@id='u_0_1']/div[1]/div/input").sendKeys("qwerty");
			driver.findElementByName("pass").sendKeys("12345");
			driver.findElementByXPath("//button[@value='Log In']").click();*/
			//rahulonlinetutor@gmail.com
/*			//======================================================
			DesiredCapabilities caps = DesiredCapabilities.android();
			caps.setCapability("name", "Android 7.1");
			caps.setCapability("appiumVersion", "1.7.2");
			caps.setCapability("deviceName","Android Emulator");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("platformVersion", "7.1");
			caps.setCapability("platformName","Android");
			//============================================================
*/			
			DesiredCapabilities caps = DesiredCapabilities.android();
			caps.setCapability("name", "Android 7.1");
			caps.setCapability("appiumVersion", "1.7.2");
			caps.setCapability("deviceName","Samsung Galaxy S8 Plus GoogleAPI Emulator");
			caps.setCapability("deviceOrientation", "portrait");
			caps.setCapability("browserName", "Chrome");
			caps.setCapability("platformVersion", "7.1");
			caps.setCapability("platformName","Android");
			//==================================================================
			AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://team_blocktrail:1c59f27f-a5b4-451a-972e-4804e23fb955@ondemand.saucelabs.com:80/wd/hub"),caps);
			
			driver.get("http://cricbuzz.com");
			driver.findElementByXPath("//a[@href='#menu']").click();
			driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
			System.out.println(driver.getCurrentUrl());
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,480)", "");
			Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories'")).getAttribute("class").contains("header"));
			
	}

}
