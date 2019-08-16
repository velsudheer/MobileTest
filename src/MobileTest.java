package testPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.AppiumCommandExecutor;
import org.testng.annotations.*;
import org.testng.annotations.Test;



public class MobileTest {
	
	public static  AndroidDriver<MobileElement> driver;
	
	 @Test 
	  public void LaunchApp() throws MalformedURLException {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(MobileCapabilityType.PLATFORM,"Android");
	        //capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1.1");
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0");
	        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus 5 API 25");
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus 6 API 24");
	        
	        capabilities.setCapability("app", "E:\\Java\\motilaltest.apk");
	        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
	        
	  }
		
}
