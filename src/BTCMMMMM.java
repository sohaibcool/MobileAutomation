import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BTCMMMMM extends HybridBase{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id, className, androidUIautomator
		
		//tagName[@attribute='value']
		
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
