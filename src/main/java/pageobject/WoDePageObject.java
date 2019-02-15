package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * ��λ��ҳҳ��Ԫ��
 *
 */
public class WoDePageObject {
	
	/**
	 * ��ȡ����¼/ע�ᡱ����Ԫ��
	 * @param driver ����WebDriver
	 * @return ���ء���¼/ע�ᡱ����Ԫ��
	 */
	public static WebElement lnkLogInOut( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='��¼/ע��']"));
	}
	
	
	/**
	 * ��ȡ���û�����Ԫ��
	 * @param driver ����WebDriver
	 * @return ���ء��û�����Ԫ��
	 */
	public static WebElement lblUserName( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[4]/android.view.View[1]/android.widget.TextView[1]" ));
	}
	
		
	/**
	 * ��ȡ�����á�Ԫ��
	 * @param driver ����WebDriver
	 * @return ���ء����á�Ԫ��
	 */
	public static WebElement lnkConfig( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[1]/android.widget.ImageView[1]"));

		//return driver.findElement(By.xpath("//android.widget.ScrollView/android.view.View[1]/android.view.View[1]/android.widget.ImageView[1]"));
	}
}
