import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrollingDemo extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension size = driver.manage().window().getSize();
		int x = size.getWidth()/2;
	/*	int starty =(int)(size.getHeight()*0.60);
		int endy =(int)(size.getHeight() * 0.10);*/
	//	driver.swipe(x,starty,x,endy,2000);
		
		//=====================================================
		/*TouchAction action = new TouchAction(driver);
		 MobileElement element1 = driver.findElement(By.xpath("//android.widget.TextView[@text='NEW RELEASES' and @index ='0']"));
		 MobileElement element2 = driver.findElement(By.xpath("//android.widget.TextView[@text='VOCAL' and @index ='0']"));
		 action.press(element2).waitAction(Duration.ofSeconds(5)).moveTo(element1).release().perform();*/
		//=====================================================
		 
		 TouchAction action = new TouchAction(driver);
		 MobileElement element1 = driver.findElement(By.xpath("//android.widget.TextView[@text='NEW RELEASES' and @index ='0']"));
		 MobileElement element2 = driver.findElement(By.xpath("//android.widget.TextView[@text='VOCAL' and @index ='0']"));
		 action.press(element2).waitAction(Duration.ofSeconds(5)).moveTo(element1).release().perform();
		 
		 
		 
		 System.out.println(driver.getContext());
		 //2nd option
	/*	 TouchAction touchAction = new TouchAction(driver)
		 touchAction.press(startX, startY).moveTo(endX,endY).release().perform();*/
		 //=====================================================
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		
	}

}
