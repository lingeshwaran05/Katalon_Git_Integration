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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.selectOptionByLabel(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/select_All Departments'), 
    Books, false)

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_field-keywords'))

WebUI.setText(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_field-keywords'), 'Da vin ci code')

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_nav-search-submit-button'))

WebUI.selectOptionByLabel(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/select_All Departments'), 
    Electronics, false)

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_field-keywords'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_field-keywords'), 'Mobile Phones')

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_nav-search-submit-button'))

WebUI.selectOptionByLabel(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/select_All Departments'), 
    All_departments, false)

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_field-keywords'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_field-keywords'), 'Washing Machines')

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_nav-search-submit-button'))

WebUI.selectOptionByLabel(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/select_All Departments'), 
    Furniture, false)

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_field-keywords'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_field-keywords'), 'Wooden Tables')

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/input_Search Amazon_nav-search-submit-button'))

WebUI.closeBrowser()

