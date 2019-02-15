package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * ��λ��ҳԪ����
 * @author yrx
 *
 */
public class FrontPageObject {
	
	/**
	 * ��ȡ���ҵġ�����Ԫ��
	 * @param driver ����WebDriver
	 * @return ���ء��ҵġ�����Ԫ��
	 */
	public static WebElement lnkWoDe( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.widget.ImageView[1]"));

	}
	
	
	/**
	 * ��ȡ����ҳ������Ԫ��
	 * @param driver ����WebDriver
	 * @return ���ء��ҵġ�����Ԫ��
	 */
	public static WebElement lnkFrontPage( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.ImageView[1]"));

	}

}
