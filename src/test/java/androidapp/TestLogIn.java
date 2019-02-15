package androidapp;

import maniputepage.*;
import pageobject.FrontPageObject;
//import pageobject.LogInPageObject;
import pageobject.WoDePageObject;

//import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

//import com.google.common.base.Verify;

import io.appium.java_client.android.AndroidDriver;

//import org.testng.Assert;

public class TestLogIn {
private AndroidDriver<WebElement> driver;
	
	@BeforeTest
	public void setUp()throws Exception
	{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.3");
		capabilities.setCapability("uid", "36ed98ea");
		capabilities.setCapability("deviceName", "Galaxy Note3 Lite 4G");
		capabilities.setCapability("appPackage", "com.dscf.a");
		capabilities.setCapability("appActivity", "com.dscf.a.activity.MainActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}
		
	
	@Test
	public void testCase()throws Exception
	{
		try {
			//Thread.sleep(10000);
			boolean flag=LogInMgr.logInByPwd(driver,"13694246425","88879487","Miss You");
			//System.out.println("456");
			//Thread.sleep(10000);
			System.out.println(String.valueOf(flag));
			assertTrue(flag);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	@Test(enabled = false)
	public void testramdom() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.widget.TextView[1]" )).click();;
		
	}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
		//Thread.sleep(30000);
		driver.quit();
	
	}

}
