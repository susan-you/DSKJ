package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



/**
 * 定位我的-设置页元素类
 * @author yrx
 *
 */
public class ConfigPageObject {
	/**
	 * 获取“退出登陆”按钮
	 * @param driver 传入WebDriver
	 * @return 返回“退出登陆”按钮
	 */
	public static WebElement btnLogOut( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='退出登录']"));
	}
	

}
