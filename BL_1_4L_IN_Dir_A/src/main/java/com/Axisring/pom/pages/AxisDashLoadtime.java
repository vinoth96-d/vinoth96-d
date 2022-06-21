package com.Axisring.pom.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Axisring.pom.base.BasePage;
import com.Axisring.pom.testcases.base.BaseTest;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AxisDashLoadtime extends BaseTest {
	
	public long loadtime;
	
	
	 public void forgotUsername(ExtentTest test) throws Exception 
	    {
		 
		// BasePage.loadTime("Forgot_username");
		//loadtime=BasePage.time;
		 // test.log(LogStatus.INFO, "Page-1:Time taken to lauch the application "+loadtime+" milliseconds");
		
		   // test.log(LogStatus.INFO, "Click on the forgot username..");
	        BasePage.click1("Forgot_username");
	        
	        
	        BasePage.loadTime("usernamepage");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Forgot username page loadtime = "+loadtime+" milliseconds");    
	        
			BasePage.navigateBack();
			Thread.sleep(3000);
	        
	       
 }
	 
	 public void forgotPassword(ExtentTest test) throws Exception 
	    {
		 
		 
	       // test.log(LogStatus.INFO, "Click on forgot password");
	       BasePage.click1("Forgot_password");
	       
	       BasePage.loadTime("passwordpage");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Forgot password page loadtime = "+loadtime+" milliseconds"); 
			
			BasePage.navigateBack();
			Thread.sleep(3000);
	   
	    }
	 public void userRegistation(ExtentTest test) throws Exception 
	    {
		 
	    	
		    //test.log(LogStatus.INFO, "Click on new user registration");
	        BasePage.click1("New_user_registration");
	        BasePage.loadTime("userregpage");
			loadtime=BasePage.time;
			  test.log(LogStatus.INFO, "User registration page loadtime = "+loadtime+" milliseconds");
			  
			  BasePage.navigateBack();
				Thread.sleep(3000);


 }
	 public void CommodityPage (ExtentTest test) throws Exception {
			
		
			  
			//test.log(LogStatus.INFO, "Click on the commodity menu .");
		 BasePage.click1("home_btn");
		 Thread.sleep(5000);
	        BasePage.click1("Commodities");
	        
	        
	        
	      //  BasePage.switchWindow();
	       // BasePage.isElementPresent1("commodity_page_table");
	        BasePage.loadTime("commodity_page_table");
	        loadtime=BasePage.time;
	        test.log(LogStatus.INFO, "Commodity page loadtime = "+loadtime+" milliseconds");
	        Thread.sleep(2000);
	        
	        
	       
	        
		
	       
	        }
	 public void Equitypage(ExtentTest test) throws Exception 
	    {
		  
		 //BasePage.loadTime("market");
			//loadtime=BasePage.time;
			 // test.log(LogStatus.INFO, "Login the dashboard page = "+loadtime+" milliseconds");
		 
			 // test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click1("market" );
	        Thread.sleep(2000);

	       // test.log(LogStatus.INFO, "Click on equity...");
	        BasePage.click1("equity" );
	        
	        
	       // test.log(LogStatus.INFO, "Click on markets today...");
	        BasePage.click1("market_today");
	        
	       // test.log(LogStatus.INFO, "Click on Equity page...");
	        BasePage.loadTime("equitypage");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Equity page loadtime = "+loadtime+" milliseconds");
			Thread.sleep(2000);
			
			BasePage.click1("my_account");
			Thread.sleep(1000);
			BasePage.click1("logout");
			Thread.sleep(1000);
			BasePage.click1("login");
			Thread.sleep(1000);
	        
	       
	    }
	
	 public void addFunds(ExtentTest test) throws Exception 
	    {
		  
		   
	    	
			//test.log(LogStatus.INFO, "Click on limits...");
	    	BasePage.click1("Limits");
	    	BasePage.loadTime("Add_funds");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Limit Page loadtime = "+loadtime+" milliseconds");
	    	Thread.sleep(2000);
	    	
	    	 

	        //test.log(LogStatus.INFO, "Click on add funds...");
	        BasePage.click1("Add_funds" );
	        Thread.sleep(2000);
	        BasePage.loadTime("Add_funds_page");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Add Funds Page loadtime = "+loadtime+" milliseconds");
			
			BasePage.click1("Add_funds_page");
			Thread.sleep(1000);
			
	  
	    }  

	 public void Watchlist(ExtentTest test) throws Exception 
	    {
		 //BasePage.loadTime("watchlist");
			//loadtime=BasePage.time;
			//test.log(LogStatus.INFO, "Login the Dashboard Page = "+loadtime+" milliseconds");
			
	    	//test.log(LogStatus.INFO, "Click on watchlist page...");
	    	BasePage.click1("watchlist");
	    	BasePage.loadTime("create_watchlist");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Watchlist page loadtime = "+loadtime+" milliseconds");
			
	       // test.log(LogStatus.INFO, "Click on create watchlist ...");
	        BasePage.click1("create_watchlist" );
	        BasePage.loadTime("watchlist_name");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Create New Watchlist page loadtime = "+loadtime+" milliseconds");
			
	        
	      // test.log(LogStatus.INFO, "Enter watchlist name...");
	        BasePage.enterText1("watchlist_name", "watchlist");
	       Thread.sleep(2000);
	        
	      // test.log(LogStatus.INFO, "Click on save watchlist...");
	       BasePage.click1("save_watchlist");
	       Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Close the watchlist...");
	        BasePage.click1("close_watchlist");
	        Thread.sleep(2000);
	       
			
	        
	        //test.log(LogStatus.INFO, "Click on search script ...");
	        BasePage.click1("search_script");
	        BasePage.loadTime("enter_script");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Search script page loadtime = "+loadtime+" milliseconds");
	        
	       // test.log(LogStatus.INFO, "Enter search script ...");
	        BasePage.enterText1("enter_script", "enterscript");
	        BasePage.loadTime("add_tatamotors_stock");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Add script page loadtime = "+loadtime+" milliseconds");
	        
	        Thread.sleep(2000);
	        
	        
	       
	       // test.log(LogStatus.INFO, "Add the search script ...");
	        BasePage.click1("add_tatamotors_stock");
	         Thread.sleep(5000);
	        
	       // test.log(LogStatus.INFO, "Click the stock ...");
	        BasePage.click1("stock_click");
	       Thread.sleep(2000);
	        
	       
	       // test.log(LogStatus.INFO, "Delete the script ...");
	        BasePage.click1("delete_script");
	        BasePage.loadTime("confirm_delete");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Delete script page loadtime = "+loadtime+" milliseconds");
	        
			BasePage.click1("confirm_delete");
	        Thread.sleep(5000);
	       
	        
	       // test.log(LogStatus.INFO, "Click on watchlist page...");
	    	BasePage.click1("watchlist");
	    	Thread.sleep(2000);
	    	
			
			
	       
				//test.log(LogStatus.INFO, "Click on rename watchlist...");
	        BasePage.click1("rename_watchlist");
	        BasePage.loadTime("clear_watchlist");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Rename watchlist page loadtime = "+loadtime+" milliseconds");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Clear existing watchlist...");
	        BasePage.clearText("clear_watchlist");
	        Thread.sleep(2000);
	        
	        
	       // test.log(LogStatus.INFO, "Enter rename watchlist...");
	        BasePage.enterText1("clear_watchlist","rename");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "click rename watchlist...");
	        BasePage.click1("renameclick_watchlist");
	        Thread.sleep(6000);
	        
			
	        
	      //  test.log(LogStatus.INFO, "Delete watchlist...");
	        BasePage.click1("delete_watchlist");
	        BasePage.loadTime("delete_confirm");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Delete watchlist page loadtime = "+loadtime+" milliseconds");
	        
	       // test.log(LogStatus.INFO, "Delete confirmation watchlist...");
	        BasePage.click1("delete_confirm");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Close alert watchlist...");
	        BasePage.click1("close_alert_watchlist");
	        Thread.sleep(3000);
	        }
	 public void getQuote(ExtentTest test) throws Exception 
	    {
		 //BasePage.loadTime("market");
			//loadtime=BasePage.time;
			//test.log(LogStatus.INFO, "Login the dashboard page = "+loadtime+" milliseconds");
			
		   // test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click1("market" );
	        BasePage.loadTime("equity");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Market dashboard page loadtime = "+loadtime+" milliseconds");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click1("market" );
	        Thread.sleep(2000);

	       
			
	      //  test.log(LogStatus.INFO, "Click on watchlist ...");
	        BasePage.click1("watchlist" );
	        BasePage.loadTime("create_watchlist");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Watchlist page loadtime = "+loadtime+" milliseconds");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Click on search script ...");
	        BasePage.click1("search_script");
	        BasePage.loadTime("enter_script");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Search script page loadtime = "+loadtime+" milliseconds");
	        
	        //test.log(LogStatus.INFO, "Enter search script ...");
	        BasePage.enterText1("enter_script", "enterscript");
	        BasePage.loadTime("add_tatamotors_stock");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Add script page loadtime = "+loadtime+" milliseconds");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Add the search script ...");
	        BasePage.click1("add_tatamotors_stock");
	        BasePage.click1("addpage_close");
	        Thread.sleep(2000);
	        
	        
	        //test.log(LogStatus.INFO, "Click the stock ...");
	        BasePage.click1("stock_click");
	        Thread.sleep(2000);
	        
	        
	       
	       // test.log(LogStatus.INFO, "Delete the script ...");
	        BasePage.click1("delete_script");
	        BasePage.loadTime("confirm_delete");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Delete script page loadtime = "+loadtime+" milliseconds");
	        BasePage.click1("confirm_delete");
	        Thread.sleep(5000);
	        
	        
	        
	        
	       // test.log(LogStatus.INFO, "Click on get quote...");
	        BasePage.click1("get_quote");
	        BasePage.loadTime("get_quote_page");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Get quote page loadtime = "+loadtime+" milliseconds");
			
			BasePage.click1("get_quote_page");
			Thread.sleep(2000);
	        
	       
}
	 public void Chart(ExtentTest test) throws Exception 
	    {
		// BasePage.loadTime("market");
			//loadtime=BasePage.time;
			//test.log(LogStatus.INFO, "Login the dashboard page loadtime= "+loadtime+" milliseconds");
		    //test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click1("market" );
	        BasePage.loadTime("equity");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Market dashboard page loadtime = "+loadtime+" milliseconds");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Click on market dashboard ...");
	        BasePage.click1("market" );
	        
	        Thread.sleep(2000);
		 
		 
	        //test.log(LogStatus.INFO, "Click on watchlist ...");
	        BasePage.click1("watchlist" );
	        BasePage.loadTime("create_watchlist");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Watchlist page loadtime = "+loadtime+" milliseconds");
	        Thread.sleep(2000);
	        
	        
	        
	       // test.log(LogStatus.INFO, "Click on get quote...");
	        BasePage.click1("get_quote");
	       BasePage.loadTime("get_quote_page");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Get quote page loadtime = "+loadtime+" milliseconds");
			
			BasePage.click1("get_quote_page");
			Thread.sleep(1000);
			
	        
	    }
	 public void equityBuysell(ExtentTest test) throws Exception 
	    {
		    //BasePage.loadTime("search_result");
			//loadtime=BasePage.time;
			//test.log(LogStatus.INFO, "Dashboard page loadtime = "+loadtime+" milliseconds");
			
		   // test.log(LogStatus.INFO, "Click on search result ...");
	        BasePage.click1("search_result" );
	        BasePage.loadTime("close_result");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Search result page loadtime = "+loadtime+" milliseconds");
	        
			BasePage.click1("close_result" );
	        Thread.sleep(2000);
	       
	        
	        //test.log(LogStatus.INFO, "Click on get quote...");
	        BasePage.click1("get_quote");
	        BasePage.loadTime("close_quote");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "Get Quote page loadtime = "+loadtime+" milliseconds");
	        
			BasePage.click1("close_quote");
	        Thread.sleep(2000);
	        
	        
	       // test.log(LogStatus.INFO, "Click the stock...");
	        BasePage.click1("click_yesbank_bsestock" );
	        BasePage.loadTime("click_buy");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "BSE buy landing page loadtime = "+loadtime+" milliseconds");
	       Thread.sleep(4000);
	                
	       	        
	       // test.log(LogStatus.INFO, "Enter the quantity ...");
	        BasePage.click1("click_buy");
	        BasePage.enterText1("enter_quantity", "quantity");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Enter the price  ...");
	        BasePage.enterText1("enter_price","price" );
	        Thread.sleep(2000);
	        
	       
	        
	      //  test.log(LogStatus.INFO, "Click buy_confirm order ...");
	        BasePage.click1("BSE_buy_confirmation");
	        BasePage.loadTime("confirm_buy");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "BSE buy confirmation page loadtime = "+loadtime+" milliseconds");
	        
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Click confirm to buy ...");
	        BasePage.click1("confirm_buy");
	        BasePage.loadTime("close_order");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "BSE buy order successful page loadtime = "+loadtime+" milliseconds");
	        
	        BasePage.click1("close_order");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Click order status ...");
	        BasePage.click1("order_status");
	        BasePage.click1("click_yesbank");
	        Thread.sleep(2000);
	        
	       // test.log(LogStatus.INFO, "Cancel the order status ...");
	        BasePage.click1("cancel_order");
	        BasePage.loadTime("confirm_cancel");
			loadtime=BasePage.time;
			test.log(LogStatus.INFO, "BSE buy order cancel confirmation page loadtime = "+loadtime+" milliseconds");
	        
			BasePage.click1("confirm_cancel");
			 BasePage.loadTime("order_Cancel");
				loadtime=BasePage.time;
				test.log(LogStatus.INFO, "BSE buy order cancelled page loadtime = "+loadtime+" milliseconds");
				
				BasePage.click1("order_Cancel");
			
	        Thread.sleep(2000);
	        
	        
	        }
	 
}

