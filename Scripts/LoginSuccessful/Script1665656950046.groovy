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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://e3-app.smith.ai/login/?next=/vr/support/')

WebUI.setText(findTestObject('Object Repository/Page_/input_Email_username'), 'alex.martin@smith.ai')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_password'), '6e8k3i0q2FktvPgILLGDFQ==')

WebUI.click(findTestObject('Object Repository/Page_/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Smith Support tools/h1_Pro accounts'))

WebUI.verifyElementText(findTestObject('Page_Smith Support tools/h1_Pro accounts'), 'Pro accounts')

WebUI.closeBrowser()

