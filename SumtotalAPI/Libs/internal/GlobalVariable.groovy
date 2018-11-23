package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object g_URL
     
    /**
     * <p></p>
     */
    public static Object UserName
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object g_EsbToken
     
    /**
     * <p></p>
     */
    public static Object g_LMJwtToken
     
    /**
     * <p></p>
     */
    public static Object g_DBServerName
     
    /**
     * <p></p>
     */
    public static Object g_DBPortNumber
     
    /**
     * <p></p>
     */
    public static Object g_DBName
     
    /**
     * <p></p>
     */
    public static Object g_DBUserName
     
    /**
     * <p></p>
     */
    public static Object g_DBPassword
     
    /**
     * <p></p>
     */
    public static Object g_DBJumboBoxIP
     
    /**
     * <p></p>
     */
    public static Object g_SqlUserName
     
    /**
     * <p></p>
     */
    public static Object g_SqlPassword
     
    /**
     * <p></p>
     */
    public static Object g_Jumbobox
     
    /**
     * <p>Profile default : Update the vpn client path path here</p>
     */
    public static Object g_VpnClientPath
     
    /**
     * <p></p>
     */
    public static Object g_UserID
     
    /**
     * <p></p>
     */
    public static Object g_UserName
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['g_URL' : 'https://ad13sales.sumtotaldevelopment.net', 'UserName' : 'admin', 'Password' : 'Think|Demo', 'g_EsbToken' : '', 'g_LMJwtToken' : '', 'g_DBServerName' : 'AD-UUD13', 'g_DBPortNumber' : '1433', 'g_DBName' : 'UUD_AD13_SALES_TEST', 'g_DBUserName' : 'AAYENDLURI', 'g_DBPassword' : 'DevLab#123', 'g_DBJumboBoxIP' : '192.168.1.22', 'g_SqlUserName' : 'readonly', 'g_SqlPassword' : 'titan#12', 'g_Jumbobox' : '192.168.1.22', 'g_VpnClientPath' : 'C:\\\\Program Files (x86)\\\\Cisco\\\\Cisco AnyConnect Secure Mobility Client', 'g_UserID' : '', 'g_UserName' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        g_URL = selectedVariables['g_URL']
        UserName = selectedVariables['UserName']
        Password = selectedVariables['Password']
        g_EsbToken = selectedVariables['g_EsbToken']
        g_LMJwtToken = selectedVariables['g_LMJwtToken']
        g_DBServerName = selectedVariables['g_DBServerName']
        g_DBPortNumber = selectedVariables['g_DBPortNumber']
        g_DBName = selectedVariables['g_DBName']
        g_DBUserName = selectedVariables['g_DBUserName']
        g_DBPassword = selectedVariables['g_DBPassword']
        g_DBJumboBoxIP = selectedVariables['g_DBJumboBoxIP']
        g_SqlUserName = selectedVariables['g_SqlUserName']
        g_SqlPassword = selectedVariables['g_SqlPassword']
        g_Jumbobox = selectedVariables['g_Jumbobox']
        g_VpnClientPath = selectedVariables['g_VpnClientPath']
        g_UserID = selectedVariables['g_UserID']
        g_UserName = selectedVariables['g_UserName']
        
    }
}
