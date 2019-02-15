package maniputepage;

import pageobject.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * ��¼������
 */
public class LogInMgr {

	/**
	 * ʹ���˺š������¼�������Ƿ��½�ɹ�
	 * 
	 * @param driver
	 *            �ֻ�����
	 * @param phoneNumber
	 *            �ֻ�����
	 * @param password
	 *            ����
	 * @param successName
	 *            ��½�ɹ���չʾ���û���
	 * @return �����Ƿ��½�ɹ���trueΪ��½�ɹ���falseΪ��½ʧ��
	 * @throws InterruptedException
	 */

	public static boolean logInByPwd(WebDriver driver, String phoneNumber, String password, String successName) {
		boolean flag = false;
		try {

			// System.out.println(String.valueOf(flag));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// ������ҵġ�����
			FrontPageObject.lnkWoDe(driver).click();
			// ���"��½/ע��"����
			WoDePageObject.lnkLogInOut(driver).click();
			// ѡ���˺������½��ǩ
			LogInPageObject.findLnkLogInByPassword(driver).click();
			// ʹ���˺������½�����ж��Ƿ��½�ɹ�
			if (LogInPageObject.findTxtPhoneNumber(driver).isDisplayed() == true
					&& LogInPageObject.findTxtPassword(driver).isDisplayed() == true
					&& LogInPageObject.findBtnLogin(driver).isDisplayed() == true) {
				LogInPageObject.findTxtPhoneNumber(driver).sendKeys(phoneNumber);
				LogInPageObject.findTxtPassword(driver).sendKeys(password);
				LogInPageObject.findBtnLogin(driver).click();

				
				Thread.sleep(10000);
				//������ð�ť
				WebElement lnkConfig=WoDePageObject.lnkConfig(driver);
				lnkConfig.click();

				// ��ȡ��½�ɹ�����û��������ж��û����Ƿ���ȷ
				WebElement btnLogout = ConfigPageObject.btnLogOut(driver);
				if (btnLogout.isDisplayed() == true)// &&WoDePageObject.lblUserName(driver).getText()==successName)
				{
					System.out.println(btnLogout.getText());
					flag = true;
					// System.out.println(lblUserName.getAttribute("content-desc"));
					// System.out.print(lblUserName.getText());
					// System.out.print(lblUserName.getAttribute("text"));

				}

			} else {
				System.out.println("�Ҳ���Ԫ�ض���");
			}

		} catch (Exception e) {

			// flag = false;//???
			System.out.println(e.toString());

		}
		return flag;
	}

}
