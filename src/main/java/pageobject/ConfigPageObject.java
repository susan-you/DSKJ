package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



/**
 * ��λ�ҵ�-����ҳԪ����
 * @author yrx
 *
 */
public class ConfigPageObject {
	/**
	 * ��ȡ���˳���½����ť
	 * @param driver ����WebDriver
	 * @return ���ء��˳���½����ť
	 */
	public static WebElement btnLogOut( WebDriver driver)
	{
		return driver.findElement(By.xpath("//android.widget.TextView[@text='�˳���¼']"));
	}
	

}
