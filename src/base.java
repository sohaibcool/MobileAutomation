import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		File f = new File("src");
		//File fs= new File(f,"com.raaga.android_2.0.apk");
		//	File fs= new File(f,"ApiDemos-debug.apk");
		//File fs = new File(f,"Raaga Hindi Tamil Telugu songs and podcasts_v7.0.14_apkpure.com.apk");
		//File fs= new File(f,"Raaga.apk");
		//	running file*****************************
	//	File fs= new File(f,"android-debug.apk");
		
		//Staging environment file.
		File fs= new File(f,"android-debug_staging.apk");
		
		//For Staging (regtest) enable blow line
		//	File fs= new File(f,"android-debug-regtest.apk");
			//blocktrail
		//File fs= new File(f,"blocktrail.apk");
			//BTC version 2 - app-release.apk
		//	File fs= new File(f,"android-debug-unaligned2.apk");
			//blocktrail_v4.3.12.apk
			//File fs= new File(f,"blocktrail_v4.3.12.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
/*		if(device.equals("emulator"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		}
		else if(device.equals("real"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}*/
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.APP , fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}

}
