package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * ��λ��¼ҳ��Ԫ��
 */
public class LogInPageObject {
	
	/**
	 * ��ȡ�����ٵ�¼����ǩ
	 * @param driver ����WebDriver
	 * @return ���ء����ٵ�¼����ǩ
	 */
	public static WebElement findLnkLogInByVerifycode( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='���ٵ�¼']"));
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.TextView[1]
	}
	
	
	
	/**
	 * ��ȡ���˺ŵ�¼����ǩ
	 * @param driver ����WebDriver
	 * @return ���ء��˺ŵ�¼����ǩ
	 */
	public static WebElement findLnkLogInByPassword( WebDriver driver)
	{
		//return driver.findElement(By.xpath("//android.widget.TextView[@text='�˺ŵ�¼']]"));
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]
		return driver.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.TextView[1]"));
	}
	
	
	/**
	 * ��ȡ�ֻ������ı���
	 * @param driver ����WebDriver
	 * @return �����ֻ������ı���
	 */
	public static WebElement findTxtPhoneNumber( WebDriver driver)
	{
		return driver.findElement(By.name("�������ֻ�����"));
		//android.widget.EditText[@text='�������ֻ�����']
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]
	}
	
	/**
	 * ��ȡ�����ı���
	 * @param driver ����WebDriver
	 * @return ���������ı���
	 */
	public static WebElement findTxtPassword( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.view.View/android.view.View[2]/android.widget.EditText[1]"));
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText[1];
		
	}
	
	
	/**
	 * ��ȡ��¼��ť
	 * @param driver ����WebDriver
	 * @return ���ص�¼��ť
	 */
	public static WebElement findBtnLogin( WebDriver driver)
	{
		return driver.findElement(By.name("�� ¼"));	
		//android.widget.TextView[@text='�� ¼']
		//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.support.v4.view.ViewPager[1]/android.view.View[1]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[5]/android.widget.TextView[1]
	}
	

}
