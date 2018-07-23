import org.openqa.selenium.remote.DesiredCapabilities;

public class SauceSafariIOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc= DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");
	// cap.setCApability(MobileCapbilityType.PLATFORM_VERSION,"7.1");
		dc.setCapability("appiumVersion", "1.3.4");
		dc.setCapability("deviceName", "iPhone Simulator");
		dc.setCapability("browserName", "safari");
		

	}

}
