package com.Axisring.pom.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.Axisring.pom.base.BasePage;
import com.Axisring.pom.pages.LoginPage;
import com.Axisring.pom.testcases.base.BaseTest;
import com.Axisring.pom.util.Log;


public class Login extends BaseTest {
	
	// Four login methods using loadtime
	 @Test()
	    public void Loging_module() throws Exception {startExtent=extent.startTest("Login Module");
	    Log.startLog("Login Module");
	    
	    logtime.launchApplication(startExtent, driver);
	    logtime.doLogin_Trading(startExtent);
	    BasePage.navigateBack();
	    Thread.sleep(2000);
	    
	    logtime.doLogin_MyPortfolio(startExtent);
	    BasePage.navigateBack();
	    Thread.sleep(2000);
	    
	    logtime.doLogin_MyAccount(startExtent);
	    BasePage.navigateBack();
	    Thread.sleep(2000);
	    
	    logtime.doLogin_investing(startExtent);
	   
	    Log.endLog("Login Module");
	    
	    }

   @Test()
    public void Loging() throws Exception {startExtent=extent.startTest("Axis RING Platform");
    Log.startLog("Axis Ring");
    /*  //METHODS without loadtime 
    //loginTest.launchApplication(startExtent,driver);
    //loginTest.doLogin(startExtent);
    //loginTest.doLoginmyAccount(startExtent);
    //dashboard.forgotUsername(startExtent);
    //dashboard.forgotPassword(startExtent);
    //dashboard.userRegistation(startExtent);
    //dashboard.Equitypage(startExtent);
   // dashboard.CommodityPage(startExtent);
    //dashboard.addFunds(startExtent);
    //dashboard.getQuote(startExtent);
   // dashboard.Chart(startExtent);
   // dashboard.equityBuysell(startExtent);
    //dashboard.Watchlist(startExtent);*/

    //METHODS using loadtime
    logtime.launchApplication(startExtent, driver);
    loadtime.forgotUsername(startExtent);
    loadtime.forgotPassword(startExtent);
    loadtime.userRegistation(startExtent);
    logtime.doLogin_Trading(startExtent);
    loadtime.addFunds(startExtent);
     loadtime.Watchlist(startExtent);
    loadtime.getQuote(startExtent);
    loadtime.Chart(startExtent);
    loadtime.equityBuysell(startExtent);
    loadtime.Equitypage(startExtent);
   logtime.doLogin_MyAccount(startExtent);
  loadtime.CommodityPage(startExtent);
 
    
    Log.endLog("Axis Ring");
    
    
    
    
   
   
}
   
      @AfterClass
   public void quit() {
        if (extent != null) {
            extent.endTest(startExtent);
            extent.flush();
        }
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
                driver.quit();
              
            }
        }
    }
}
