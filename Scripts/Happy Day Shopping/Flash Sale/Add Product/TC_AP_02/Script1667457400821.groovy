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

Mobile.comment('Scenario : Add product with 10000000 Quantity')

Mobile.startExistingApplication('com.ecwid.ShopAt.HappyDayShopping')

Mobile.verifyElementText(findTestObject('Flash Sale/TextView_Happy Day Shopping'), 'Happy Day Shopping')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Flash Sale/ViewGroup_Flash Sale'), 0)

Mobile.verifyElementText(findTestObject('Flash Sale/TextView_Flash Sale'), 'Flash Sale')

Mobile.verifyElementText(findTestObject('Flash Sale/TextView_A Promo Macaroni Pack (Page Flash Sale)'), 'A Promo Macaroni Pack')

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Flash Sale/ViewGroup_A Promo Macaroni Pack'), 0)

Mobile.verifyElementText(findTestObject('Flash Sale/TextView_A Promo Macaroni Pack'), 'A Promo Macaroni Pack')

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/Flash Sale/EditText_Quantity'), '10000000', 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Flash Sale/ViewGroup_button Add to Bag'), 0)

Mobile.takeScreenshot()

'Expected Result : Users can\'t add 10000000 product'
Mobile.comment('BUG : Users can add 10000000 product')

'there should be an error message like this "Quantity exceeds the limit"'
Mobile.comment('this just my assumption')

Mobile.tap(findTestObject('Flash Sale/ViewGroup_section Your Bag'), 0)

Mobile.takeScreenshot()

WebUI.callTestCase(findTestCase('Happy Day Shopping/Flash Sale/Add Product/Clear Your Bag'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.pressHome()

Mobile.closeApplication()

