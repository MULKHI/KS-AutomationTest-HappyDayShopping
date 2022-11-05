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

Mobile.comment('Scenario : Checkout product use option Pick up myself')

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

'Enter Valid Email Address'
Mobile.setText(findTestObject('Deliver or Ship/EditText_Field Email Address'), GlobalVariable.Email, 0)

Mobile.scrollToText('Checkout')

Mobile.takeScreenshot()

'Tap Checkout button'
Mobile.tap(findTestObject('Deliver or Ship/View_button Checkout'), 0)

'Verify Page Checkout'
Mobile.verifyElementText(findTestObject('Deliver or Ship/TextView_Checkout'), 'Checkout')

Mobile.takeScreenshot()

'Select Option I\'II pick it up myself'
Mobile.tap(findTestObject('Deliver or Ship/View_Option Deliver or Ship'), 0)

'Enter Full Name'
Mobile.setText(findTestObject('Deliver or Ship/EditText_Field Full Name'), GlobalVariable.FullName, 0)

'Enter Phone'
Mobile.setText(findTestObject('Deliver or Ship/EditText_Field Phone'), GlobalVariable.Phone, 0)

'Tap button continue'
Mobile.tap(findTestObject(null), 0)

'Pickup date and time'
Mobile.tap(findTestObject(null), 0)

'Set Date'
Mobile.tap(findTestObject(null), 0)

'Set Time'
Mobile.tap(findTestObject(null), 0)

Mobile.tap(findTestObject(null), 0)

'Tap button OK'
Mobile.tap(findTestObject(null), 0)

'Tap button continue'
Mobile.tap(findTestObject(null), 0)

'Tap button Place Order'
Mobile.tap(findTestObject(null), 0)

Mobile.closeApplication()

