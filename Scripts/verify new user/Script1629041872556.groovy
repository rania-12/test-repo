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

WebUI.openBrowser('https://react-crud-app-example.herokuapp.com/')

for (i = 0; i <= 0; i++) {
    WebUI.click(findTestObject('curd-OR/Page_React CRUD App/button_Create New User'))

    WebUI.setText(findTestObject('curd-OR/Page_React CRUD App/input_First Name_first_name'), 'rania')

    WebUI.setText(findTestObject('curd-OR/Page_React CRUD App/input_Last Name_last_name'), 'virk')

    WebUI.setText(findTestObject('curd-OR/Page_React CRUD App/input_E-Mail_email'), 'raniavirk18@gmail.com')

    WebUI.click(findTestObject('curd-OR/Page_React CRUD App/button_Create'))

    WebUI.click(findTestObject('curd-OR/Page_React CRUD App/button_OK'))

    WebUI.setText(findTestObject('curd-OR/Page_React CRUD App/input'), 'rania')

    WebUI.click(findTestObject('Page_React CRUD App/button_Update'))

    WebUI.setText(findTestObject('Page_React CRUD App/input_Last Name_last_name'), 'george')

    WebUI.click(findTestObject('New Folder-OR/Page_React CRUD App/button_Update'))

    WebUI.click(findTestObject('New Folder-OR/Page_React CRUD App/button_OK'))
}

