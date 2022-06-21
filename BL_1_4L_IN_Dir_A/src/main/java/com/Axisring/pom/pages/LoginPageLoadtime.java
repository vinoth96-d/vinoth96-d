
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



public class LoginPageLoadtime extends BaseTest {

public long loadtime;
    public void launchApplication(ExtentTest test, WebDriver driver) throws Exception 
    {
        
 		// test.log(LogStatus.INFO, "Launch the Application");
        driver.manage().window().maximize();
        driver.get(Constants.UAT_HOMEPAGE_URL);
        String URL = driver.getCurrentUrl();
        
        BasePage.loadTime("launchpage");
 		loadtime=BasePage.time;
 		test.log(LogStatus.INFO, "Axis Direct Application loadtime =  "+loadtime+" milliseconds");
        
 		// test.log(LogStatus.PASS, "URL opened succesfully=" + URL);
        driver.manage().deleteAllCookies();
       // test.log(LogStatus.PASS, "all cookies deleted");
        
        }

    public void doLogin_Trading(ExtentTest test) throws Exception 
    {
    	//test.log(LogStatus.INFO, "Enter Valid user name ...");
    	BasePage.enterText1("LoginUserForm_user_name", "loginUserName");
  
        //test.log(LogStatus.INFO, "Enter valid password...");
        BasePage.enterText1("LoginUserForm_password", "loginPassword");
        
        //test.log(LogStatus.INFO, "Enter date...");
        BasePage.enterText1("LoginUserForm_date", "DOBDate");
        
        //test.log(LogStatus.INFO, "Enter month...");
        BasePage.enterText1("LoginUserForm_month", "DOBMonth");
        
        //test.log(LogStatus.INFO, "Enter year...");
        BasePage.enterText1("LoginUserForm_year", "DOBYear");
        
        
       // test.log(LogStatus.INFO, "Click on login button");
        BasePage.click1("loginButtonM");
        
        
        BasePage.loadTime("market");
		loadtime=BasePage.time;
		test.log(LogStatus.INFO, "Login the Trading Dashboard Page loadtime = "+loadtime+" milliseconds");
        
        

     
    }
    
    public void doLogin_MyAccount(ExtentTest test) throws Exception 
    {
    	
    	//test.log(LogStatus.INFO, "Enter Valid user name ...");
    	BasePage.enterText1("LoginUserForm_user_name", "loginUserName");
   

        //test.log(LogStatus.INFO, "Enter valid password...");
        BasePage.enterText1("LoginUserForm_password", "loginPassword");
        
        //test.log(LogStatus.INFO, "Enter date...");
        BasePage.enterText1("LoginUserForm_date", "DOBDate");
        
        //test.log(LogStatus.INFO, "Enter month...");
        BasePage.enterText1("LoginUserForm_month", "DOBMonth");
        
       // test.log(LogStatus.INFO, "Enter year...");
        BasePage.enterText1("LoginUserForm_year", "DOBYear");
        
       // test.log(LogStatus.INFO, "Select my account from Take Me to Drop Down");
        BasePage.selectElementByVisibleText("TakeMeTo", "Takemeto");
        
        
       //test.log(LogStatus.INFO, "Click on login button");
        BasePage.click1("loginButtonM");
        
        BasePage.loadTime("Commodities");
		loadtime=BasePage.time;
		 test.log(LogStatus.INFO, "Login the My Account dashboard page loadtime = "+loadtime+" milliseconds");
		 Thread.sleep(2000);

     
    }
    public void doLogin_MyPortfolio(ExtentTest test) throws Exception 
    {
    	
    	//test.log(LogStatus.INFO, "Enter Valid user name ...");
    	BasePage.enterText1("LoginUserForm_user_name", "loginUserName");
   

        //test.log(LogStatus.INFO, "Enter valid password...");
        BasePage.enterText1("LoginUserForm_password", "loginPassword");
        
        //test.log(LogStatus.INFO, "Enter date...");
        BasePage.enterText1("LoginUserForm_date", "DOBDate");
        
        //test.log(LogStatus.INFO, "Enter month...");
        BasePage.enterText1("LoginUserForm_month", "DOBMonth");
        
       // test.log(LogStatus.INFO, "Enter year...");
        BasePage.enterText1("LoginUserForm_year", "DOBYear");
        
       // test.log(LogStatus.INFO, "Select my account from Take Me to Drop Down");
        BasePage.selectElementByVisibleText("TakeMeTo", "MyPortfolio");
        
        
       //test.log(LogStatus.INFO, "Click on login button");
        BasePage.click1("loginButtonM");
       
        
        BasePage.loadTime("Commodities");
		loadtime=BasePage.time;
		 test.log(LogStatus.INFO, "Login the My Portfolio dashboard page loadtime = "+loadtime+" milliseconds");
Thread.sleep(2000);
     
    }
    
    public void doLogin_investing(ExtentTest test) throws Exception 
    {
    	
    	//test.log(LogStatus.INFO, "Enter Valid user name ...");
    	BasePage.enterText1("LoginUserForm_user_name", "loginUserName");
   

        //test.log(LogStatus.INFO, "Enter valid password...");
        BasePage.enterText1("LoginUserForm_password", "loginPassword");
        
        //test.log(LogStatus.INFO, "Enter date...");
        BasePage.enterText1("LoginUserForm_date", "DOBDate");
        
        //test.log(LogStatus.INFO, "Enter month...");
        BasePage.enterText1("LoginUserForm_month", "DOBMonth");
        
       // test.log(LogStatus.INFO, "Enter year...");
        BasePage.enterText1("LoginUserForm_year", "DOBYear");
        
       // test.log(LogStatus.INFO, "Select my account from Take Me to Drop Down");
        BasePage.selectElementByVisibleText("TakeMeTo", "take_to_investing");
        
        
       //test.log(LogStatus.INFO, "Click on login button");
        BasePage.click1("loginButtonM");
        BasePage.click1("investing");
        BasePage.switchWindow1();
        
       
        BasePage.loadTime("dashboard_investing");
		loadtime=BasePage.time;
		 test.log(LogStatus.INFO, "Login the Investing dashboard page loadtime = "+loadtime+" milliseconds");
		 
		
		
		 

     
    }
    
   
    
}