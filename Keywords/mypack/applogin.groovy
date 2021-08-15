package mypack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class applogin {

	@Keyword
	public void getlogin() {
		int a = 2;
		for(int i=0;i<1;i++) {
			if(a == 5) {
				WebUI.openBrowser('https://react-crud-app-example.herokuapp.com/')




				WebUI.click(findTestObject('curd-OR/Page_React CRUD App/button_Create New User'))

				WebUI.setText(findTestObject('curd-OR/Page_React CRUD App/input_First Name_first_name'), 'rania')

				WebUI.setText(findTestObject('curd-OR/Page_React CRUD App/input_Last Name_last_name'), 'virk')

				WebUI.setText(findTestObject('curd-OR/Page_React CRUD App/input_E-Mail_email'), 'raniavirk18@gmail.com')

				WebUI.click(findTestObject('curd-OR/Page_React CRUD App/button_Create'))

				WebUI.click(findTestObject('curd-OR/Page_React CRUD App/button_OK'))

				WebUI.setText(findTestObject('curd-OR/Page_React CRUD App/input'), 'george')

				WebUI.click(findTestObject('Page_React CRUD App/button_Update'))

				WebUI.setText(findTestObject('Page_React CRUD App/input_Last Name_last_name'), 'george gogo')

				WebUI.click(findTestObject('New Folder-OR/Page_React CRUD App/button_Update'))

				WebUI.click(findTestObject('New Folder-OR/Page_React CRUD App/button_OK'))
			}else {
				System.out.println("if condition is false")
			}
		}
	}
}

