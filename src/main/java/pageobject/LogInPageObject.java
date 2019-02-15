package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * 定位登录页面元素
 */
public class LogInPageObject {
	
	/**
	 * 获取“快速登录”标签
	 * @param driver 传入WebDriver
	 * @return 返回“快速登录”标签
	 */
	public static WebElement findLnkLogInByVerifycode( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='快速登录']"));
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]
	}
	
	
	
	/**
	 * 获取“账号登录”标签
	 * @param driver 传入WebDriver
	 * @return 返回“账号登录”标签
	 */
	public static WebElement findLnkLogInByPassword( WebDriver driver)
	{
		//return driver.findElement(By.xpath("//android.widget.TextView[@text='账号登录']]"));
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]"));
	}
	
	
	/**
	 * 获取手机号码文本框
	 * @param driver 传入WebDriver
	 * @return 返回手机号码文本框
	 */
	public static WebElement findTxtPhoneNumber( WebDriver driver)
	{
		return driver.findElement(By.name("请输入手机号码"));
		//android.widget.EditText[@text='请输入手机号码']
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]
	}
	
	/**
	 * 获取密码文本框
	 * @param driver 传入WebDriver
	 * @return 返回密码文本框
	 */
	public static WebElement findTxtPassword( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.view.View/android.view.View[2]/android.widget.EditText[1]"));
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1];
		
	}
	
	
	/**
	 * 获取登录按钮
	 * @param driver 传入WebDriver
	 * @return 返回登录按钮
	 */
	public static WebElement findBtnLogin( WebDriver driver)
	{
		return driver.findElement(By.name("登 录"));	
		//android.widget.TextView[@text='登 录']
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[5]/android.widget.TextView[1]
	}
	

}
