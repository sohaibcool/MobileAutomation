

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Raaga extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	     
	     driver.findElementByXPath("//android.widget.Button[@text='LATER']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='Done']").click();
	     driver.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='World Music']").click();
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(resource-id(\"com.raaga.android:id/music_album_row_image\"));");
	     driver.findElementByXPath("com.raaga.android:id/music_home_raaga_live").click();
	 //    driver.findElementByXPath("//android.widget.TextView[@text='or Skip to Raaga']").click();
	     //driver.findElementById("com.raaga.android:id/music_album_row_image").click();
	      
	     
	}

}
