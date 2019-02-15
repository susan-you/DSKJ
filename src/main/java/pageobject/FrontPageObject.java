package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * 定位首页元素类
 * @author yrx
 *
 */
public class FrontPageObject {
	
	/**
	 * 获取“我的”链接元素
	 * @param driver 传入WebDriver
	 * @return 返回“我的”链接元素
	 */
	public static WebElement lnkWoDe( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.widget.ImageView[1]"));

	}
	
	
	/**
	 * 获取“首页”链接元素
	 * @param driver 传入WebDriver
	 * @return 返回“我的”链接元素
	 */
	public static WebElement lnkFrontPage( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ImageView[1]"));

	}

}
