package SauceLabsTC;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class sauceIOSapp {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub 
		DesiredCapabilities dc=DesiredCapabilities.iphone();
		//for sauce lab use below
		dc.setCapability("platformName", "iOS");

		//for IOS safari use below code
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);

		dc.setCapability("platformVersion", "11.2");

		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1");

		dc.setCapability("appiumVersion", "1.7");

		dc.setCapability("deviceName", "iPhone Simulator");

		dc.setCapability("browserName", "");

		dc.setCapability("app","sauce-storage:UICatalog.app.zip");

		//IOSDriver driver=new IOSDriver(new URL("http://sohaibcool:e950d779-1817-4c3c-b122-06715b814dfd@ondemand.saucelabs.com:80/wd/hub"),dc);
		IOSDriver driver=new IOSDriver(new URL("http://team_blocktrail:1c59f27f-a5b4-451a-972e-4804e23fb955@ondemand.saucelabs.com:80/wd/hub"),dc);
		//IOSDriver driver=new IOSDriver(new URL("http://team_blocktrail:1c59f27f-a5b4-451a-972e-4804e23fb955@ondemand.saucelabs.com:80/wd/hub"),dc);
		
	//	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://google.com");
		
		
		driver.quit();

		//normal code
	}

}
