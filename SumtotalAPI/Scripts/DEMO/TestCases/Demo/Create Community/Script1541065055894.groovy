import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.servlet.RequestDispatcher as RequestDispatcher
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def data = findTestData('TestData')

ResponseObject response=WebUI.callTestCase(findTestCase('DEMO/Library/DemoCommunity/Create Community'), [('communityName') : data.getValue(
			'CommunityName', 1), ('CommunityDesc') : data.getValue('CommunityDesc', 1), ('allowDiscussionBoards') : true
        , ('allowBlogPosts') : true, ('allowFileUploads') : true, ('communityCode') : '', ('isPrivate') : false, ('userName') : GlobalVariable.UserName
        , ('userId') : GlobalVariable.g_UserID, ('role') : '1', ('userStatus') : 'Joined', ('isHidden') : false, ('disableJoinRequest') : false], FailureHandling.STOP_ON_FAILURE)
String CommunityID = CustomKeywords.'validations.Assertions.GetAttribute'(response).id
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'name', data.getValue('CommunityName', 1))
