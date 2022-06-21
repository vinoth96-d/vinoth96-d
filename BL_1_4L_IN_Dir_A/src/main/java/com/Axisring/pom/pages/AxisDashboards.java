package com.Axisring.pom.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Axisring.pom.base.BasePage;
import com.Axisring.pom.testcases.base.BaseTest;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AxisDashboards extends BaseTest {
	
	public long loadtime;
	
	
	 public void forgotUsername(ExtentTest test) throws Exception 
	    {
		 
		
		
		    test.log(LogStatus.INFO, "Click on the forgot username..");
	        BasePage.click("Forgot_username");
	        
	        
	       
 }
	 
	 public void forgotPassword(ExtentTest test) throws Exception 
	    {
		 
	        test.log(LogStatus.INFO, "Click on forgot password");
	       BasePage.click("Forgot_password");
	   
	    }
	 public void userRegistation(ExtentTest test) throws IOException, InterruptedException 
	    {
	    	
		    test.log(LogStatus.INFO, "Click on new user registration");
	        BasePage.click("New_user_registration");


 }
	 public void CommodityPage (ExtentTest test) throws Exception {
			
			
			test.log(LogStatus.INFO, "Click on the commodity menu .");
	        BasePage.click("Commodities");
	        
	       
	        
	       
	        
		
	       
	        }
	 public void Equitypage(ExtentTest test) throws IOException, InterruptedException 
	    {
		  
		 test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click("market" );
	        Thread.sleep(2000);

	        test.log(LogStatus.INFO, "Click on equity...");
	        BasePage.click("equity" );
	        
	        test.log(LogStatus.INFO, "Click on markets today...");
	        BasePage.click("market_today");
	        
	       
	    }
	
	 public void addFunds(ExtentTest test) throws IOException, InterruptedException 
	    {
		  
	    	test.log(LogStatus.INFO, "Click on limits...");
	    	BasePage.click("Limits");
	    	Thread.sleep(2000);

	        test.log(LogStatus.INFO, "Click on add funds...");
	        BasePage.click("Add_funds" );
	        Thread.sleep(2000);
	  
	    }  

	 public void Watchlist(ExtentTest test) throws IOException, InterruptedException 
	    {
		  
	    	test.log(LogStatus.INFO, "Click on watchlist page...");
	    	BasePage.click("watchlist");
	    	Thread.sleep(2000);

	        test.log(LogStatus.INFO, "Click on create watchlist ...");
	        BasePage.click("create_watchlist" );
	        Thread.sleep(2000);
	        
	       test.log(LogStatus.INFO, "Enter watchlist name...");
	        BasePage.enterText("watchlist_name", "watchlist");
	       Thread.sleep(2000);
	        
	       test.log(LogStatus.INFO, "Click on save watchlist...");
	       BasePage.click("save_watchlist");
	       Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Close the watchlist...");
	        BasePage.click("close_watchlist");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Click on search script ...");
	        BasePage.click("search_script");
	        
	        test.log(LogStatus.INFO, "Enter search script ...");
	        BasePage.enterText("enter_script", "enterscript");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Add the search script ...");
	        BasePage.click("add_tatamotors_stock");
	        Thread.sleep(5000);
	        
	        test.log(LogStatus.INFO, "Click the stock ...");
	        BasePage.click("stock_click");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Delete the script ...");
	        BasePage.click("delete_script");
	        BasePage.click("confirm_delete");
	        Thread.sleep(5000);
	        
	        test.log(LogStatus.INFO, "Click on watchlist page...");
	    	BasePage.click("watchlist");
	    	Thread.sleep(2000);
	    	
	        test.log(LogStatus.INFO, "Click on rename watchlist...");
	        BasePage.click("rename_watchlist");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Clear existing watchlist...");
	        BasePage.clearText("clear_watchlist");
	        Thread.sleep(2000);
	        
	        
	        test.log(LogStatus.INFO, "Enter rename watchlist...");
	        BasePage.enterText("clear_watchlist","rename");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "click rename watchlist...");
	        BasePage.click("renameclick_watchlist");
	        Thread.sleep(6000);
	        
	        test.log(LogStatus.INFO, "Delete watchlist...");
	        BasePage.click("delete_watchlist");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Delete confirmation watchlist...");
	        BasePage.click("delete_confirm");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Close alert watchlist...");
	        BasePage.click("close_alert_watchlist");
	        Thread.sleep(2000);
	        }
	 public void getQuote(ExtentTest test) throws IOException, InterruptedException 
	    {
		 
		    test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click("market" );
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click("market" );
	        Thread.sleep(2000);

	        test.log(LogStatus.INFO, "Click on watchlist ...");
	        BasePage.click("watchlist" );
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Click on search script ...");
	        BasePage.click("search_script");
	        
	        test.log(LogStatus.INFO, "Enter search script ...");
	        BasePage.enterText("enter_script", "enterscript");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Add the search script ...");
	        BasePage.click("add_tatamotors_stock");
	        Thread.sleep(5000);
	        
	        test.log(LogStatus.INFO, "Click the stock ...");
	        BasePage.click("stock_click");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Delete the script ...");
	        BasePage.click("delete_script");
	        BasePage.click("confirm_delete");
	        Thread.sleep(5000);
	        
	        test.log(LogStatus.INFO, "Click on get quote...");
	        BasePage.click("get_quote");
	        Thread.sleep(2000);
	        
	       
}
	 public void Chart(ExtentTest test) throws IOException, InterruptedException 
	    {
		    test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click("market" );
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click("market" );
	        Thread.sleep(2000);
		 
		 
	        test.log(LogStatus.INFO, "Click on watchlist ...");
	        BasePage.click("watchlist" );
	        Thread.sleep(2000);
	        
	        
	        test.log(LogStatus.INFO, "Click on get quote...");
	        BasePage.click("get_quote");
	        Thread.sleep(2000);
	        
	    }
	 public void equityBuysell(ExtentTest test) throws IOException, InterruptedException 
	    {
		    test.log(LogStatus.INFO, "Click on search result ...");
	        BasePage.click("search_result" );
	        BasePage.click("close_result" );
	        Thread.sleep(2000);
	       
	        
	        test.log(LogStatus.INFO, "Click on get quote...");
	        BasePage.click("get_quote");
	        BasePage.click("close_quote");
	        Thread.sleep(2000);
	        
	        
	        test.log(LogStatus.INFO, "Click the stock...");
	        BasePage.click("click_yesbank_bsestock" );
	       Thread.sleep(4000);
	                
	       	        
	        test.log(LogStatus.INFO, "Enter the quantity ...");
	        BasePage.click("click_buy");
	        BasePage.enterText("enter_quantity", "quantity");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Enter the price  ...");
	        BasePage.enterText("enter_price","price" );
	        Thread.sleep(2000);
	        
	       
	        
	        test.log(LogStatus.INFO, "Click buy_confirm order ...");
	        BasePage.click("BSE_buy_confirmation");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Click confirm to buy ...");
	        BasePage.click("confirm_buy");
	        BasePage.click("close_order");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Click order status ...");
	        BasePage.click("order_status");
	        BasePage.click("click_yesbank");
	        Thread.sleep(2000);
	        
	        test.log(LogStatus.INFO, "Cancel the order status ...");
	        BasePage.click("cancel_order");
	        BasePage.click("confirm_cancel");
	        Thread.sleep(2000);
	        
	        
	        }
	 
}
