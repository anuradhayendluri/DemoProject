package validations
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import groovy.json.JsonParser
import groovy.json.JsonSlurper
import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import org.json.*
import org.junit.Assert

import internal.GlobalVariable
import oracle.net.aso.s
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import java.util.Scanner;


class Assertions {

	@Keyword
	def VerifyElementValue(String  Actual,String Expected) {
		assert	WS.verifyMatch(Actual, Expected, false)
	}

	@Keyword
	def setRequestBody(RequestObject request,String data) {
		ResponseObject reponse
		String vsRequestBody = '';
		vsRequestBody = request.getHttpBody();
		def jsonSlurper = new JsonSlurper()
		//def object = jsonSlurper.parseText(request)
		def String=vsRequestBody.substring(vsRequestBody.lastIndexOf('$'))
		println (vsRequestBody)
	}
	@Keyword
	def  GetAttribute(ResponseObject response) {
		def jsonSlurper = new JsonSlurper()
		def object = jsonSlurper.parseText(response.getResponseText())
		return object
	}
	@Keyword
	def String GetStringFromResponse(String Value,ResponseObject Response) {
		String CommunityRole = Response.getResponseText().toString()
		String id="\""+Value+"\""
		int firstIndex = CommunityRole.indexOf(id)+id.length()
		String name = CommunityRole.substring(firstIndex)
		int lastIndex = name.indexOf(',')
		String val = name.substring(0, lastIndex).replace("\"", "").replaceAll("[:]","").trim()
		return val
	}
	@Keyword
	def String GetToken(String s) {
		int startString = (s.lastIndexOf('esbApiToken') + 'esbApiToken'.length()) + 1
		String substring = s.substring(startString)
		WebUI.comment('substring' + substring)
		int lenght = substring.indexOf(',')
		WebUI.comment('length' + lenght)
		String esb = substring.substring(0, lenght)
		WebUI.comment('esb' + esb)
		String esbapitoken = esb.subSequence(2, esb.length() - 1)
		WebUI.comment('esb api token ' + esbapitoken)
		return esbapitoken
	}
	@Keyword
	def List<TestObjectProperty> AddHeaders() {
		TestObjectProperty esbToken = new TestObjectProperty()
		esbToken.setName('sumtauth-header')
		esbToken.setValue(GlobalVariable.g_EsbToken)
		TestObjectProperty contentType = new TestObjectProperty()
		contentType.setName('Content-Type')
		contentType.setValue('application/json')
		List<TestObjectProperty> headers = new ArrayList<TestObjectProperty>()
		headers.add(esbToken)
		headers.add(contentType)
		return headers
	}
	@Keyword
	def List<TestObjectProperty> AddHeaders(String sumAuth) {
		TestObjectProperty esbToken = new TestObjectProperty()
		esbToken.setName('sumtauth-header')
		esbToken.setValue(sumAuth)
		TestObjectProperty contentType = new TestObjectProperty()
		contentType.setName('Content-Type')
		contentType.setValue('application/json')
		List<TestObjectProperty> headers = new ArrayList<TestObjectProperty>()
		headers.add(esbToken)
		headers.add(contentType)
		return headers
	}
	@Keyword
	def List<TestObjectProperty> LMAddHeaders() {
		TestObjectProperty ajaxReq = new TestObjectProperty()
		ajaxReq.setName('X-sumtotal-AjaxRequest')
		ajaxReq.setValue('1')
		TestObjectProperty authMode = new TestObjectProperty()
		authMode.setName('x-sumtotal-authenticationmode')
		authMode.setValue('jwt')
		TestObjectProperty esbToken = new TestObjectProperty()
		esbToken.setName('sumtotaljwt')
		esbToken.setValue(GlobalVariable.g_LMJwtToken)
		List<TestObjectProperty> headers = new ArrayList<TestObjectProperty>()
		headers.add(ajaxReq)
		headers.add(authMode)
		headers.add(esbToken)
		return headers
	}
}


