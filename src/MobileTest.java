
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class MobileTest {
	
	public static  AndroidDriver<MobileElement> driver;

		public static void main(String[] args) throws MalformedURLException {
		
			    DesiredCapabilities capabilities = new DesiredCapabilities();
		        capabilities.setCapability(MobileCapabilityType.PLATFORM,"Android");
		        //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.1");
		        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0");
		        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus 5 API 25");
		        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus 6 API 24");
		        
		        capabilities.setCapability("app", "E:\\Java\\motilaltest.apk");
		        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
		        
		       /* driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		        
			
		      //Tap Actions
		        //WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		        //driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		       
		        //driver.findElementByXPath("(//android.widget.TextView)[10]").click();
		        
		        // Tap ACTIONS and Tap on Expandlist
		        WebElement expandList= driver.findElementByXPath("(//android.widget.TextView)[10]");
		      	TouchAction t =new TouchAction(driver);
				t.tap(expandList);
				t.perform();
				
				//LONG PRESS ACTIONS
				//driver.findElementByXPath("//android.widget.TextView[@text='2. Cursor (People)']").click();
				//driver.findElementByXPath("(//android.widget.TextView)[2]").click();
				
				WebElement pn= driver.findElementByXPath("(//android.widget.TextView)[2]");
				//pn.click();
				TouchAction t1 =new TouchAction(driver);
				t1.longPress(pn, 5000);
				//t1.longPress(pn).waitAction(5000);
				t1.release().perform();
				
			     System.out.println(driver.findElementByClassName("android.widget.TextView").isDisplayed());
				
				//t.tap((WebElement) tapOptions().withElement(element(expandList))).perform();
				//driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();  //Tap to an element for 250 milliseconds
			    
			     */
			     
			 
		}

}