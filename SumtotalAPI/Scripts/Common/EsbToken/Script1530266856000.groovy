import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.nio.charset.Charset as Charset

import com.google.gson.JsonObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64 as Base64
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import java.io.UnsupportedEncodingException as UnsupportedEncodingException
import javax.xml.bind.DatatypeConverter as DatatypeConverter
import org.apache.commons.lang.StringUtils as StringUtils
import groovy.json.JsonParser
import groovy.json.JsonSlurper
import com.google.gson.Gson
CustomKeywords.'dbConnectionPackage.DBConnectionKeyword.CloseConnections'()



WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.g_URL)
WebUI.delay(5)
// logging in
WebUI.setText(findTestObject('DEMO/EsbToken/Page_Sign In/input_ctl00ctl00ctl00BodyConte'), username)
WebUI.setText(findTestObject('DEMO/EsbToken/Page_Sign In/input_ctl00ctl00ctl00BodyConte_1'), password)
WebUI.click(findTestObject('DEMO/EsbToken/Page_Sign In/input_ctl00ctl00ctl00BodyConte_2'))
WebUI.waitForPageLoad(30)
WebUI.waitForElementPresent(findTestObject('DEMO/EsbToken/Page_Home - SumTotal/i_fa fa-user'), 10)
// getting view source code
String s = ((WebUI.executeJavaScript('return document.documentElement.innerHTML;', null)) as String)
GlobalVariable.g_EsbToken=CustomKeywords.'validations.Assertions.GetToken'(s)
WebUI.comment('esb'+GlobalVariable.g_EsbToken)
int stokenindex = (s.lastIndexOf('search:{') + 'search:{'.length()) + 1
int etokenindex = (s.lastIndexOf('social:{') + 'social:{'.length()) + 1
String searchToken=s.substring(stokenindex, etokenindex)
// getting lm jwt token
GlobalVariable.g_LMJwtToken=CustomKeywords.'validations.Assertions.GetToken'(searchToken)
WebUI.comment('esbsearch'+GlobalVariable.g_LMJwtToken)

String decoded = new String(DatatypeConverter.parseBase64Binary(GlobalVariable.g_EsbToken))
decoded=decoded.substring(decoded.indexOf("}{")+1)
WebUI.comment('ESB DECRYPTED ' + decoded)
def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText(decoded.toString())
String userId=object.personid
String userName=object.sub
GlobalVariable.g_UserID = userId
GlobalVariable.g_UserName=userName
WebUI.closeBrowser()



