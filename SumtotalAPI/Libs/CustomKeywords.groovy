
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.RequestObject

import com.kms.katalon.core.testobject.ResponseObject

import java.sql.ResultSet


def static "validations.Assertions.VerifyElementValue"(
    	String Actual	
     , 	String Expected	) {
    (new validations.Assertions()).VerifyElementValue(
        	Actual
         , 	Expected)
}

def static "validations.Assertions.setRequestBody"(
    	RequestObject request	
     , 	String data	) {
    (new validations.Assertions()).setRequestBody(
        	request
         , 	data)
}

def static "validations.Assertions.GetAttribute"(
    	ResponseObject response	) {
    (new validations.Assertions()).GetAttribute(
        	response)
}

def static "validations.Assertions.GetStringFromResponse"(
    	String Value	
     , 	ResponseObject Response	) {
    (new validations.Assertions()).GetStringFromResponse(
        	Value
         , 	Response)
}

def static "validations.Assertions.GetToken"(
    	String s	) {
    (new validations.Assertions()).GetToken(
        	s)
}

def static "validations.Assertions.AddHeaders"() {
    (new validations.Assertions()).AddHeaders()
}

def static "validations.Assertions.AddHeaders"(
    	String sumAuth	) {
    (new validations.Assertions()).AddHeaders(
        	sumAuth)
}

def static "validations.Assertions.LMAddHeaders"() {
    (new validations.Assertions()).LMAddHeaders()
}

def static "dbConnectionPackage.DBConnectionKeyword.pingHost"() {
    (new dbConnectionPackage.DBConnectionKeyword()).pingHost()
}

def static "dbConnectionPackage.DBConnectionKeyword.DisconnectVPN"() {
    (new dbConnectionPackage.DBConnectionKeyword()).DisconnectVPN()
}

def static "dbConnectionPackage.DBConnectionKeyword.ConnectVPN"() {
    (new dbConnectionPackage.DBConnectionKeyword()).ConnectVPN()
}

def static "dbConnectionPackage.DBConnectionKeyword.isProcessRunning"(
    	String processName	) {
    (new dbConnectionPackage.DBConnectionKeyword()).isProcessRunning(
        	processName)
}

def static "dbConnectionPackage.DBConnectionKeyword.KillProcess"(
    	String ProcessName	) {
    (new dbConnectionPackage.DBConnectionKeyword()).KillProcess(
        	ProcessName)
}

def static "dbConnectionPackage.DBConnectionKeyword.connectDB"() {
    (new dbConnectionPackage.DBConnectionKeyword()).connectDB()
}

def static "dbConnectionPackage.DBConnectionKeyword.executeQuery"(
    	String queryString	) {
    (new dbConnectionPackage.DBConnectionKeyword()).executeQuery(
        	queryString)
}

def static "dbConnectionPackage.DBConnectionKeyword.closeDatabaseConnection"() {
    (new dbConnectionPackage.DBConnectionKeyword()).closeDatabaseConnection()
}

def static "dbConnectionPackage.DBConnectionKeyword.execute"(
    	String queryString	) {
    (new dbConnectionPackage.DBConnectionKeyword()).execute(
        	queryString)
}

def static "dbConnectionPackage.DBConnectionKeyword.CloseConnections"() {
    (new dbConnectionPackage.DBConnectionKeyword()).CloseConnections()
}

def static "dbConnectionPackage.DBConnectionKeyword.getObject"(
    	ResultSet set	
     , 	String query	
     , 	String ColumnName	) {
    (new dbConnectionPackage.DBConnectionKeyword()).getObject(
        	set
         , 	query
         , 	ColumnName)
}
