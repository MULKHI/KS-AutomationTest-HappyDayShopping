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

'Call Test Case Add Product'
WebUI.callTestCase(findTestCase('Happy Day Shopping/Flash Sale/Add Product/TC_AP_01'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Scenario : Checkout without input email address')

Mobile.takeScreenshot()

'Tap Checkout button\r\n'
Mobile.tap(findTestObject('Deliver or Ship/ViewGroup_Checkout Button (Your Bag)'), 0)

Mobile.delay(15)

'Verify Page Shopping Cart'
Mobile.verifyElementText(findTestObject('Deliver or Ship/TextView_Shopping cart'), 'Shopping cart')

'Verify Name Product'
Mobile.verifyElementText(findTestObject('Deliver or Ship/TextView_A Promo Macaroni Pack'), 'A Promo Macaroni Pack')

'Verify Quantity Product (5)'
Mobile.verifyElementText(findTestObject('Deliver or Ship/TextView_Qty 5'), 'Qty: 5')

Mobile.takeScreenshot()

Mobile.clearText(findTestObject('Deliver or Ship/EditText_Field Email Address'), 0)

'Without Email Address'
Mobile.setText(findTestObject('Deliver or Ship/EditText_Field Email Address'), '', 0)

Mobile.scrollToText('Checkout')

Mobile.takeScreenshot()

'Tap Checkout button'
Mobile.tap(findTestObject('Deliver or Ship/View_button Checkout'), 0)

'Users will get error massage "Please enter your email"'
Mobile.verifyElementText(findTestObject('Deliver or Ship/TextView_Error message wthout enters email'), 'Please enter your email')

Mobile.closeApplication()

