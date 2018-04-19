import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends base{

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		TouchAction t =new TouchAction(driver);
		Thread.sleep(2000L);
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		Thread.sleep(2000L);
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		Thread.sleep(2000L);
		t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofSeconds(3)).release().perform();
		Thread.sleep(2000L);
		System.out.println(driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']").getText());
		
	}

}
