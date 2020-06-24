import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.seleniumeasy.com/test/javascript-alert-box-demo.html')

WebUI.click(findTestObject('AlertObjects/Page_Selenium Easy Demo - Automate All Scenarios/Alert_Button'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.click(findTestObject('AlertObjects/Page_Selenium Easy Demo - Automate All Scenarios/confirm_Alert_button'))

WebUI.delay(3)

WebUI.dismissAlert()

WebUI.click(findTestObject('AlertObjects/Page_Selenium Easy Demo - Automate All Scenarios/Prompt_Alert_Button'))

WebDriver driver = DriverFactory.getWebDriver();

driver.switchTo.alert().sendKeys(ram)

WebUI.delay(3)

WebUI.acceptAlert()

