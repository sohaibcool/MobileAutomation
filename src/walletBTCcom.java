import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class walletBTCcom extends HybridBase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id, className, androidUIautomator
		
		//tagName[@attribute='value']
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		System.out.println(driver.getContext());
		System.out.println(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Hello i am at this point");
		
		//Thread.sleep(4000L);
		//driver.findElement(By.xpath("contains(text='Sign in...'")).click();
		//driver.findElementByAndroidUIAutomator("content-desc(\"Sign in...\")").click();
	//	driver.findElementByAndroidUIAutomator("new UiSelector().content-desc(Sign in...)").click();
		//driver.findElementByClassName("android.view.View").click();
	//	driver.findElementsByXPath("(//android.view.View)[2]").get(2).click();
		driver.findElementsByXPath("//android.view.View").get(1).click();
		
		int size1 = driver.findElementsByXPath("//android.view.View").size();
		int size = driver.findElementsByXPath("//android.view.View").size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
		String abc = driver.findElementByXPath("//android.view.View").getText();
			System.out.println(abc);
		}
		driver.findElementsByXPath("//android.view.View").get(0).click();
		//=========================================================================
		/*
		try {
			driver.findElement(By.xpath("//android.view.View[contains(text(),'Sign in...')]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElementByXPath("//android.view.View[@text='Sign in...']").click();
		
		driver.findElementByXPath("//android.view.View[@text='Sign in...']").click();

		driver.findElementByClassName("//android.view.View[@text='Sign in...']").click();*/
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
/*		driver.findElementById("com.bt.bms:id/btnSignUp").click();
		int s=driver.findElements(By.className("android.widget.EditText")).size();
			System.out.println(s);
			List<WebElement>a=driver.findElements(By.className("android.widget.EditText"));
			a.get(0).sendKeys("Appium");
			a.get(1).sendKeys("Mobile");
			a.get(2).sendKeys("appium@training");
			a.get(3).sendKeys("password");
			driver.findElementById("com.bt.bms:id/action_icon").click();*/
	}

}