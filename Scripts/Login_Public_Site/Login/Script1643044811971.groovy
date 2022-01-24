import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import org.testng.Assert
import org.testng.Assert as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.TestURL)

WebUI.click(findTestObject('Firsthand_Landing_Page/span_Login'))

WebUI.setText(findTestObject('Object Repository/Public_Site_Login_Page1/input_Type_Your_Email'), GlobalVariable.UserName)

WebUI.click(findTestObject('Object Repository/Public_Site_Login_Page1/button_Submit'))

WebUI.setEncryptedText(findTestObject('Object Repository/Public_Site_Login_Page2/input_Password'), GlobalVariable.Passowrd)

WebUI.click(findTestObject('Object Repository/Public_Site_Login_Page2/button_Submit'))

Ecpected_title ="Firsthand"
welcome_page_title = WebUI.getWindowTitle()
Assert.assertEquals(Ecpected_title, welcome_page_title)
print(welcome_page_title)

