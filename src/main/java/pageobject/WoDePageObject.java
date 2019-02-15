package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 定位首页页面元素
 *
 */
public class WoDePageObject {
	
	/**
	 * 获取“登录/注册”链接元素
	 * @param driver 传入WebDriver
	 * @return 返回“登录/注册”链接元素
	 */
	public static WebElement lnkLogInOut( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='登录/注册']"));
	}
	
	
	/**
	 * 获取“用户名”元素
	 * @param driver 传入WebDriver
	 * @return 返回“用户名”元素
	 */
	public static WebElement lblUserName( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.widget.TextView[1]" ));
	}
	
		
	/**
	 * 获取“设置”元素
	 * @param driver 传入WebDriver
	 * @return 返回“设置”元素
	 */
	public static WebElement lnkConfig( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[1]/android.widget.ImageView[1]"));

		//return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.view.View[1]/android.widget.ImageView[1]"));
	}
}
