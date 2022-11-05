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

Mobile.comment('Scenario : Add product Flash Sale to Bag')

'Open Application'
Mobile.startExistingApplication('com.ecwid.ShopAt.HappyDayShopping')

'Verify Home Page'
Mobile.verifyElementText(findTestObject('Flash Sale/TextView_Happy Day Shopping'), 'Happy Day Shopping')

Mobile.takeScreenshot()

'Tap Flash Sale'
Mobile.tap(findTestObject('Object Repository/Flash Sale/ViewGroup_Flash Sale'), 0)

'Verify Page Flash Sale'
Mobile.verifyElementText(findTestObject('Flash Sale/TextView_Flash Sale'), 'Flash Sale')

'Verify Name Product on Page Flash Sale'
Mobile.verifyElementText(findTestObject('Flash Sale/TextView_A Promo Macaroni Pack (Page Flash Sale)'), 'A Promo Macaroni Pack')

Mobile.takeScreenshot()

'Tap Product "A Promo Macaroni Pack"'
Mobile.tap(findTestObject('Object Repository/Flash Sale/ViewGroup_A Promo Macaroni Pack'), 0)

'Verify Name Product'
Mobile.verifyElementText(findTestObject('Flash Sale/TextView_A Promo Macaroni Pack'), 'A Promo Macaroni Pack')

Mobile.takeScreenshot()

'Add Product Quantity "5"'
Mobile.setText(findTestObject('Object Repository/Flash Sale/EditText_Quantity'), '5', 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Flash Sale/ViewGroup_button Add to Bag'), 0)

Mobile.takeScreenshot()

'Tap Section Add Your Bag'
Mobile.tap(findTestObject('Object Repository/Flash Sale/ViewGroup_section Your Bag'), 0)

'Verify Name Product on Page Add Your Bag'
Mobile.verifyElementText(findTestObject('Flash Sale/TextView_A Promo Macaroni Pack (Page Your Bag)'), 'A Promo Macaroni Pack')

'Verify Product Quantity on Page Add Your Bag'
Mobile.verifyElementText(findTestObject('Flash Sale/TextView -   5'), ' × 5 ')

Mobile.takeScreenshot()

