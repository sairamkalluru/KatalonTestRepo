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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login_Public_Site/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('WelcomePage/span_The Library'))

WebUI.click(findTestObject('Page_Insights from Insiders/a_Guides'))

WebUI.verifyElementPresent(findTestObject('Page_Vault Guides Landing Page/h1_Vault Guides'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Vault Guides Landing Page/p_Our career guides offer industry insights_280d53'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Vault Guides Landing Page/div_All Guides'), 
    0)

WebUI.click(findTestObject('Page_Vault Guides Landing Page/button_View'))

WebUI.verifyElementPresent(findTestObject('Page_Vault Guide to the Top Florida Law/label_Vault Guide to the Top Florida Law Fi_8e41c7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Vault Guide to the Top Florida Law/img'), 
    0)

WebUI.click(findTestObject('Page_Vault Guide to the Top Florida Law/img'))

WebUI.verifyElementPresent(findTestObject('Page_Vault Guide to the Top Florida Law/div_Select the type of guide to download'), 
    0)

WebUI.click(findTestObject('Page_Vault Guide to the Top Florida Law/input_Select the type of guide to download__1ca7d7'))

WebUI.verifyElementPresent(findTestObject('Page_Vault Guide to the Top Florida Law/button_Download'), 
    0)

WebUI.click(findTestObject('Page_Vault Guide to the Top Florida Law/button_Download'))

WebUI.click(findTestObject('Page_Vault Guide to the Top Florida Law/div_Select the type of guide to downloadepu_2316ca'))

WebUI.closeBrowser()

