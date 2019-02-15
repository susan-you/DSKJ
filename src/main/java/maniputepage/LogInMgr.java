package maniputepage;

import pageobject.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 登录管理类
 */
public class LogInMgr {

	/**
	 * 使用账号、密码登录，返回是否登陆成功
	 * 
	 * @param driver
	 *            手机号码
	 * @param phoneNumber
	 *            手机号码
	 * @param password
	 *            密码
	 * @param successName
	 *            登陆成功后展示的用户名
	 * @return 返回是否登陆成功，true为登陆成功，false为登陆失败
	 * @throws InterruptedException
	 */

	public static boolean logInByPwd(WebDriver driver, String phoneNumber, String password, String successName) {
		boolean flag = false;
		try {

			// System.out.println(String.valueOf(flag));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// 点击“我的”链接
			FrontPageObject.lnkWoDe(driver).click();
			// 点击"登陆/注册"链接
			WoDePageObject.lnkLogInOut(driver).click();
			// 选择账号密码登陆标签
			LogInPageObject.findLnkLogInByPassword(driver).click();
			// 使用账号密码登陆，并判断是否登陆成功
			if (LogInPageObject.findTxtPhoneNumber(driver).isDisplayed() == true
					&& LogInPageObject.findTxtPassword(driver).isDisplayed() == true
					&& LogInPageObject.findBtnLogin(driver).isDisplayed() == true) {
				LogInPageObject.findTxtPhoneNumber(driver).sendKeys(phoneNumber);
				LogInPageObject.findTxtPassword(driver).sendKeys(password);
				LogInPageObject.findBtnLogin(driver).click();

				
				Thread.sleep(10000);
				//点击设置按钮
				WebElement lnkConfig=WoDePageObject.lnkConfig(driver);
				lnkConfig.click();

				// 获取登陆成功后的用户名，并判断用户名是否正确
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
				System.out.println("找不到元素对象");
			}

		} catch (Exception e) {

			// flag = false;//???
			System.out.println(e.toString());

		}
		return flag;
	}

}
