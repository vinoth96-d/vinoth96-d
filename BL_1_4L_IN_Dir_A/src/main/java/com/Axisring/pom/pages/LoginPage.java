package com.Axisring.pom.pages;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.time.StopWatch;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Axisring.pom.base.BasePage;
import com.Axisring.pom.testcases.base.BaseTest;
import com.Axisring.pom.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class LoginPage extends BaseTest {


    public void launchApplication(ExtentTest test, WebDriver driver) throws Exception 
    {
    	
 		 test.log(LogStatus.INFO, "Launch the Application");
        driver.manage().window().maximize();
        driver.get(Constants.UAT_HOMEPAGE_URL);
        String URL = driver.getCurrentUrl();
        test.log(LogStatus.PASS, "URL opened succesfully=" + URL);
        driver.manage().deleteAllCookies();
        test.log(LogStatus.PASS, "all cookies deleted");
       
        
        }

    public void doLogin(ExtentTest test) throws IOException, InterruptedException 
    {
    	test.log(LogStatus.INFO, "Enter Valid user name ...");
    	BasePage.enterText("LoginUserForm_user_name", "loginUserName");
  
        test.log(LogStatus.INFO, "Enter valid password...");
        BasePage.enterText("LoginUserForm_password", "loginPassword");
        
        test.log(LogStatus.INFO, "Enter date...");
        BasePage.enterText("LoginUserForm_date", "DOBDate");
        Thread.sleep(2000);
        test.log(LogStatus.INFO, "Enter month...");
        BasePage.enterText("LoginUserForm_month", "DOBMonth");
        
        test.log(LogStatus.INFO, "Enter year...");
        BasePage.enterText("LoginUserForm_year", "DOBYear");
        
        
        test.log(LogStatus.INFO, "Click on sign in button");
        BasePage.click("loginButtonM");

     
    }
    
    public void doLoginmyAccount(ExtentTest test) throws Exception 
    {
    	
    	test.log(LogStatus.INFO, "Enter Valid user name ...");
    	BasePage.enterText("LoginUserForm_user_name", "loginUserName");
   

        test.log(LogStatus.INFO, "Enter valid password...");
        BasePage.enterText("LoginUserForm_password", "loginPassword");
        
        test.log(LogStatus.INFO, "Enter date...");
        BasePage.enterText("LoginUserForm_date", "DOBDate");
        Thread.sleep(2000);
        test.log(LogStatus.INFO, "Enter month...");
        BasePage.enterText("LoginUserForm_month", "DOBMonth");
        
        test.log(LogStatus.INFO, "Enter year...");
        BasePage.enterText("LoginUserForm_year", "DOBYear");
        
        test.log(LogStatus.INFO, "Select my account from Take Me to Drop Down");
        BasePage.selectElementByVisibleText("TakeMeTo", "Takemeto");
        
        
       test.log(LogStatus.INFO, "Click on sign in button");
        BasePage.click("loginButtonM");

     
    }
    public void doLoginmyAccount_loadtime(ExtentTest test) throws Exception 
    {
    	
 		
    	test.log(LogStatus.INFO, "Enter Valid user name ...");
    	BasePage.enterText("LoginUserForm_user_name", "loginUserName");
   

        test.log(LogStatus.INFO, "Enter valid password...");
        BasePage.enterText("LoginUserForm_password", "loginPassword");
        
        test.log(LogStatus.INFO, "Enter date...");
        BasePage.enterText("LoginUserForm_date", "DOBDate");
        Thread.sleep(2000);
        test.log(LogStatus.INFO, "Enter month...");
        BasePage.enterText("LoginUserForm_month", "DOBMonth");
        
        test.log(LogStatus.INFO, "Enter year...");
        BasePage.enterText("LoginUserForm_year", "DOBYear");
        
        test.log(LogStatus.INFO, "Select my account from Take Me to Drop Down");
        BasePage.selectElementByVisibleText("TakeMeTo", "Takemeto");
        
        
       test.log(LogStatus.INFO, "Click on sign in button");
        BasePage.click("loginButtonM");
        
       

     
    }
   
    
}