import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class btcCom extends base2Chrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.get("http://btc.com");
	}

}