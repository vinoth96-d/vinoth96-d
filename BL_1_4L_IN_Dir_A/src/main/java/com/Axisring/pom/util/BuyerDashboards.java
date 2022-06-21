package com.Axisring.pom.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.Axisring.pom.base.BasePage;
import com.Axisring.pom.testcases.base.BaseTest;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BuyerDashboards extends BaseTest {

    public void createQuote(ExtentTest test) throws Exception {
    	BasePage.click("Quote_document");
    	Thread.sleep(2500);
 
        BasePage.click("explore_quote");

        test.log(LogStatus.INFO, "Enter Customer Code");
        BasePage.enterText("Customer_Code", "customer_Code");
       
        test.log(LogStatus.INFO, "Select customer code : 1827465 (indian specific)");
        BasePage.click("indian_specific");

      /*  test.log(LogStatus.INFO, "Select customer code : 1818781 (AP - Singapore)");
        BasePage.click("singapore_customerCode");*/

        test.log(LogStatus.INFO, " Click on Create Quote Link");
        BasePage.click("create_Quote1");
        
        test.log(LogStatus.INFO, "Click on SFDC_opportunity_id");
        BasePage.enterText("SFDC_Opportunity_ID","SFDC_Opportunity_ID_Data");
        
        test.log(LogStatus.INFO, "Clcik on Update Button");
        BasePage.click("update_Button");
        Thread.sleep(1000);

        test.log(LogStatus.INFO, "Click on Country/Address Link");
        BasePage.click("country_Address");
        
       /*test.log(LogStatus.INFO, "Click on Rest Ship to address");
        BasePage.click("Reset");
        
        test.log(LogStatus.INFO, "Click on Rest Bill to address");
        BasePage.click("Reset1");*/
    }

        public void selectBillingAddress(ExtentTest test) throws Exception {
        test.log(LogStatus.INFO, "Click On Bill to Link");
        BasePage.click("bill_To");

        test.log(LogStatus.INFO, "Select address : A B Road, Palasia, Palasia, Indore  ");
        BasePage.click("billing_Address");
        
       /* test.log(LogStatus.INFO, "Select address : 20 Collyer Quay #01-00  ");
        BasePage.click("billing_Address");*/

       /* test.log(LogStatus.INFO, "Click on Country/Address Link");
        BasePage.click("country_Address");*/

        test.log(LogStatus.INFO, "Click On Ship to Link");
        BasePage.click("ship_To");

        test.log(LogStatus.INFO, "Select address : A B Road, Palasia, Palasia, Indore  ");
        BasePage.click("billing_Address");
        
        /*test.log(LogStatus.INFO, "Select address : 20 Collyer Quay #01-00  ");
        BasePage.click("billing_Address");*/

        test.log(LogStatus.INFO, "Click on Contact Persion dropdown");
        BasePage.click("contact_Persion");

        test.log(LogStatus.INFO, " Select Contact Persion : Other");
        BasePage.selectElementByVisibleText("contact_Persion", "contact_Persion_Other");

        test.log(LogStatus.INFO, " Enter Contact Name");
        BasePage.enterText("contact_Name", "customer_name");

        test.log(LogStatus.INFO, "Enter Contact Phone Number");
        BasePage.enterText("contact_Phone", "customer_PhoneNo");

        test.log(LogStatus.INFO, "Click on Contact Persion dropdown");
        BasePage.click("shipTo_contactPersion");

        test.log(LogStatus.INFO, "Select Contact Persion Dropdown");
        BasePage.selectElementByVisibleText("shipTo_contactPersion", "contact_Persion_Other");

        test.log(LogStatus.INFO, "Enter ShipTo Contact Name");
        BasePage.enterText("ship_contactName", "customer_name");

        test.log(LogStatus.INFO, "Enter ShipTo Contact Phone");
        BasePage.enterText("ship_contactPhone", "customer_PhoneNo");

        test.log(LogStatus.INFO, "Clcik on Update Button");
        BasePage.click("update_Button");
        
        /*Alert alert = driver.switchTo().alert();
        test.log(LogStatus.INFO, "Switching to pop up");
        Thread.sleep(5000);
        test.log(LogStatus.INFO, "click ok on pop up");
        alert.accept();*/
    }

    public void additionalFields(ExtentTest test) throws IOException, InterruptedException {
        test.log(LogStatus.INFO, "Clcik on Additional Field Tab");
        BasePage.click("additional_field");

        test.log(LogStatus.INFO, "Click on client contact number");
        BasePage.click("client_contactno");
        

        test.log(LogStatus.INFO, "Enter Client Contract Number : 40094853");
        BasePage.enterText("client_contact_noInput", "client_contactNo");
     

/*
        test.log(LogStatus.INFO, "Enter Client Contract Number : 40176578");
        BasePage.enterText("client_contact_noInput", "client_contactNo");*/

        test.log(LogStatus.INFO, "Click on Search Button");
        BasePage.click("search_Button");

        test.log(LogStatus.INFO, "Click on YDST client Contract number ");
        BasePage.click("click_f_contract_Number");
        Thread.sleep(1000);
    
        test.log(LogStatus.INFO, "Click on Update Button");
        BasePage.click("additionalField_Update");
        Thread.sleep(1000);
       
    }

   public void integrationFields(ExtentTest test) throws IOException, InterruptedException {
        test.log(LogStatus.INFO, "Click on Integration Field Tab");
        BasePage.click("integration_field");

        test.log(LogStatus.INFO, " Click on Solution Type");
        BasePage.click("solution_type");

        test.log(LogStatus.INFO, " Select Solution Type : CC - Converged Communications");
        BasePage.click("converged_communition1");
        
        test.log(LogStatus.INFO, " Select integration field plant name:");
        BasePage.click("integration_plant_field");
        
        test.log(LogStatus.INFO, " Select integration field plant name:");
        BasePage.click("plant_select_BangaloreIN30");
       
        test.log(LogStatus.INFO, "click on Sales organisation: INBL-India Bangalore");
        BasePage.click("Sales_org");

        test.log(LogStatus.INFO, " Select Sales Office: IN01_DD India");
        BasePage.click("IN01_DD");
        
        test.log(LogStatus.INFO, "click on sales office");
        BasePage.click("Sales_office");
        
        test.log(LogStatus.INFO, "choose the sales office : India Bangalore");
        BasePage.click("Sale_office_indiaBang");
        Thread.sleep(1000);
        
       test.log(LogStatus.INFO, " Click on Order Management Process");
        BasePage.click("order_management_process");
        Thread.sleep(1000);
        

        test.log(LogStatus.INFO, "Select : AUT - Automated Process ");
        BasePage.click("aut_automateProcess");
        Thread.sleep(1000);

        test.log(LogStatus.INFO, "Enter delivery date");
        BasePage.enterText("required_delivery_data", "delivery_data");

        test.log(LogStatus.INFO, "Click on update button");
        BasePage.click("sapIntegration_updateButton");
    }
   
   public void commentsAttachment(ExtentTest test) throws Exception {
	    test.log(LogStatus.INFO, "Click on Comments/Attachments Tab");
	    BasePage.click("comments_attachment");
	    String MainWindow=driver.getWindowHandle();
	    
	    test.log(LogStatus.INFO, "Click on add attachment");
	    BasePage.click("add_attachments");
	    // To handle all new opened window.                             
      Set<String> s1=driver.getWindowHandles();           
      Iterator<String> i1=s1.iterator(); 
  while(i1.hasNext())                     
  {               
      String ChildWindow=i1.next();               
                  
      if(!MainWindow.equalsIgnoreCase(ChildWindow))                       
      {                   
           
             // Switching to Child window
             driver.switchTo().window(ChildWindow);
             driver.findElement(By.xpath("//input[@type='FILE']")).sendKeys("C:\\Users\\LENOVO\\Desktop\\Ta3s.png");
             Thread.sleep(1500);
             test.log(LogStatus.INFO, "Click on attach");
       	   BasePage.click("click_attach");
       	   Thread.sleep(1500);
       	   
       //Close the new window, if that window no more required
       	   // driver.close();
       	   
       	   
      }
      System.out.println("switch to parent window");
      driver.switchTo().window(MainWindow);
       	} 
 }
  
   
 /*  public void commentsAttachment(ExtentTest test) throws Exception {
       test.log(LogStatus.INFO, "Click on Comments/Attachments Tab");
       BasePage.click("comments_attachment");
       //utility.click("add_attachments");
   }*/

   public void customViewAsianPact(ExtentTest test) throws Exception {
        test.log(LogStatus.INFO, "Click on Catalog link under Comments/Attachments Tab ");

        BasePage.click("catalog_link");
        test.log(LogStatus.INFO, " Search Manufacturing Part No : CP-8851-K9=");

        BasePage.enterText("search_field", "search_keyword");
        test.log(LogStatus.INFO, "Click on Go Button");

        BasePage.click("go_button");
        test.log(LogStatus.INFO, " Click on First Product");
        BasePage.click("search_FirstResult");
        Thread.sleep(9000);
        
       /* test.log(LogStatus.INFO, "Click on Contact Persion dropdown");
        BasePage.click("contact_Persion");

        test.log(LogStatus.INFO, " Select Contact Persion : Other");
        BasePage.selectElementByVisibleText("contact_Persion", "contact_Persion_Other");*/

        test.log(LogStatus.INFO, "Cick on Maintenance service");
        BasePage.click("maintenance_service_select");
        Thread.sleep(6000);

        test.log(LogStatus.INFO, "Select : ASIA-PAC_SmartNet");
        BasePage.selectElementByVisibleText("maintenance_service_select", "Maintenance_Service");
        Thread.sleep(4000);

        test.log(LogStatus.INFO, "Click on UGC Backout");
        BasePage.click("ugc_backout");
        Thread.sleep(3000);
      
        test.log(LogStatus.INFO, "Select : No Backout");
        BasePage.selectElementByVisibleText("ugc_backout", "UGS_BackOut");
        Thread.sleep(3000);
    
        test.log(LogStatus.INFO, "Click on Add to Quote");
        BasePage.click("add_to_quote");
        Thread.sleep(5000);

 /*       test.log(LogStatus.INFO, "Clcik on Skip button");
        BasePage.click("skip_button");*/

        test.log(LogStatus.INFO, "Click on First List");
        BasePage.click("click_on_editButton");

        test.log(LogStatus.INFO, "Click on Eventual Customer: ");
        BasePage.click("eventual_customer");

        test.log(LogStatus.INFO, " Select : BNP Paribas Singapore Branch Singapore Invoicing Center-Z1-Singapore-20 Collyer Quay #01-00");
        BasePage.selectElementByVisibleText("eventual_customer", "bnb_paribhas");

        test.log(LogStatus.INFO, "Enter Contact Name : ");
        BasePage.enterText("endCust_customerName", "customer_name");

        test.log(LogStatus.INFO, "Enter Contact Phone :  ");
        BasePage.enterText("endCust_contactPhone", "customer_PhoneNo");

        test.log(LogStatus.INFO, "Select : Product");
        BasePage.selectElementByVisibleText("item_Type", "item_type_product");

        test.log(LogStatus.INFO, "Select : Product");
        BasePage.selectElementByVisibleText("sub_Item_Type", "item_type_product");

        test.log(LogStatus.INFO, "Click on Preferred Supplier:");
        BasePage.click("prefered_supplier");

        test.log(LogStatus.INFO, " Select : CISCO INTERNATIONAL LIMITED");
        BasePage.selectElementByVisibleText("prefered_supplier", "Preferred_Supplier");

        test.log(LogStatus.INFO, " Click on Client Contract number");
        BasePage.click("client_contract_name");
        
        test.log(LogStatus.INFO, " Click on Client Contract number search button");
        BasePage.click("client_contact_noInput");

        test.log(LogStatus.INFO, "Enter client contract number : 40162797");
        BasePage.enterText("client_contact_noInput", "contract_number"); 
        Thread.sleep(1200);

        test.log(LogStatus.INFO, "Click on search Button");
        BasePage.click("search_Button");

        test.log(LogStatus.INFO, "Click on contract number : 40162797");
        BasePage.click("second_contract_Number");
        Thread.sleep(1000);

        test.log(LogStatus.INFO, " Click on Inventory update button");
        BasePage.click("inventory_update");

    }

    public void customViewCisco(ExtentTest test) throws Exception {
        test.log(LogStatus.INFO, "Click on Catalog Link");
        BasePage.click("catalog_link");

        test.log(LogStatus.INFO, "Enter : CP-8851-K9=");
        BasePage.enterText("search_field", "search_keyword");

        test.log(LogStatus.INFO, "click on Go Button");
        BasePage.click("go_button");

        test.log(LogStatus.INFO, "Clcik on Cisco IP Phone 8851 - VoIP phone - SIP, RTCP, RTP, SRTP, SDP - 5 lines\n" +
                "Product Description: \t");
        BasePage.click("search_FirstResult");
        Thread.sleep(9000);

        test.log(LogStatus.INFO, "Click on Maintenance Service");
        BasePage.click("maintenance_service_select");
        Thread.sleep(5000);

        test.log(LogStatus.INFO, " Select : CISCO - Uptime for CISCO Telepresence H/W & S/W");
        BasePage.selectElementByVisibleText("maintenance_service_select", "Maintenance_Service_cisco");
        Thread.sleep(4000);
        
        test.log(LogStatus.INFO, "Click on ugc backout");
        BasePage.click("ugc_backout");
        Thread.sleep(4000);
        
        test.log(LogStatus.INFO, "Select : CON-SNT-CP8851K9: SNTC-8X5XNBD Cisco UC Phone 8851[S$ 13.00]");
        BasePage.selectElementByVisibleText("ugc_backout", "UGS_BackOut_con");
        Thread.sleep(4000);

        test.log(LogStatus.INFO, "Click on Add to Quote");
        BasePage.click("add_to_quote");
        Thread.sleep(5000);

  /*      test.log(LogStatus.INFO, "Click on Skip button");
        BasePage.click("skip_button1");*/

        test.log(LogStatus.INFO, " click on editButton table3");
        BasePage.click("click_on_editButton_table3");

        test.log(LogStatus.INFO, "Click on Eventual Customer");
        BasePage.click("eventual_customer");

        test.log(LogStatus.INFO, "Select : bnb Paribhas");
        BasePage.selectElementByVisibleText("eventual_customer", "bnb_paribhas_singapore");

        test.log(LogStatus.INFO, " Enter Contact Name:");
        BasePage.enterText("endCust_customerName", "customer_name");

        test.log(LogStatus.INFO, "Enter Contact Phone:");
        BasePage.enterText("endCust_contactPhone", "customer_PhoneNo");

        test.log(LogStatus.INFO, " Select item type : Product");
        BasePage.selectElementByVisibleText("item_Type", "item_type_product");

        test.log(LogStatus.INFO, " Select sub item type : Product");
        BasePage.selectElementByVisibleText("sub_Item_Type", "item_type_product");

        test.log(LogStatus.INFO, " Click on Preferred Supplier:  ");
        BasePage.click("prefered_supplier");

        test.log(LogStatus.INFO, "Select Preferred Supplier: CISCO INTERNATIONAL LIMITED");
        BasePage.selectElementByVisibleText("prefered_supplier", "Preferred_Supplier");

        test.log(LogStatus.INFO, "Clcik on Update button ");
        BasePage.click("inventory_update");
    }
    
   

    public void customViewDDPS(ExtentTest test) throws Exception {
        test.log(LogStatus.INFO, "Click on catlog link");
        BasePage.click("catalog_link");

        test.log(LogStatus.INFO, "Enter : DDPS-StagingInstallationServices");
        BasePage.enterText("search_field", "installationServiceSearch");

        test.log(LogStatus.INFO, "Click on Go Button");
        BasePage.click("go_button");
        Thread.sleep(4000);
        
        test.log(LogStatus.INFO, " Click on : Staging and Installation Services FP link");
        BasePage.click("product_description");
        Thread.sleep(3000);
        
        BasePage.click("customer_comment");
        
        BasePage.enterText("customer_comment", "customer_name_text");
        Thread.sleep(1000);

        BasePage.click("preffer_supplier_In");
   /*     test.log(LogStatus.INFO, "Enter Service Contract Start Date : 02/03/19");
        BasePage.enterText("service_contract_date", "Service_Contract_StartDate");

        test.log(LogStatus.INFO, "Enter New Service Expiration Date : 02/03/22 ");
        BasePage.enterText("service_expiration_date", "New_Service_Expiration_Date");*/

        test.log(LogStatus.INFO, "Click on add to quote");
        BasePage.click("add_to_quote");
        Thread.sleep(4000);

     /*   test.log(LogStatus.INFO, " Click on Dimension Data Staging and Installation Services FP Edit button");
        BasePage.click("click_on_editButton_table5");

        test.log(LogStatus.INFO, "Click on Eventual Customer: ");
        BasePage.click("eventual_customer");

        test.log(LogStatus.INFO, "Select Eventual Customer: BNP Paribas Singapore Branch Singapore Invoicing Center-Z1-Singapore-20 Collyer Quay #01-00 ");
        BasePage.selectElementByVisibleText("eventual_customer", "bnb_paribhas_singapore");

        test.log(LogStatus.INFO, "Enter Contact Name: RAM");
        BasePage.enterText("endCust_customerName", "customer_name");

        test.log(LogStatus.INFO, "Enter Contact Phone: 1234");
        BasePage.enterText("endCust_contactPhone", "customer_PhoneNo");

        test.log(LogStatus.INFO, " Click on Preferred Supplier: ");
        BasePage.click("prefered_supplier");

        test.log(LogStatus.INFO, "Enter Preferred Supplier: ANCOM PTE LTD");
        BasePage.selectElementByVisibleText("prefered_supplier", "Preferred_Supplier");

        test.log(LogStatus.INFO, " Click on Inventory update button");
        BasePage.click("inventory_update");*/

        test.log(LogStatus.INFO, "Enter unit price : 100");
        BasePage.enterText("edit_unitPrice", "unit_price");

        test.log(LogStatus.INFO, "Enter price : 65");
        BasePage.enterText("edit_catlogTest", "catalog_price");

        test.log(LogStatus.INFO, "Click on update button");
        BasePage.click("productSummary_update");
        
        Thread.sleep(1500);
        test.log(LogStatus.INFO, "Click on Submit Button");
        BasePage.click("productSummary_submit");
        Thread.sleep(1000);
        
       /* test.log(LogStatus.INFO, "Standard and service radio button");
        BasePage.click("Std_ser_rad");
        
        test.log(LogStatus.INFO, "Standard and service radio button");
        BasePage.click("apply");*/
        
        test.log(LogStatus.INFO, "Enter quote name");
        BasePage.enterText("Quote_name", "quote_name");
        
        test.log(LogStatus.INFO, "Click on submit button");
        BasePage.click("Submit");

        test.log(LogStatus.INFO, "Click on submit Finalize");
        BasePage.click("Finalize");
        
        test.log(LogStatus.INFO, "Click on your quation");
        BasePage.click("Your_quatation");
        
        test.log(LogStatus.INFO, "Click on convert to PO");
        BasePage.click("ConvertToPo");
       /* 
        test.log(LogStatus.INFO, "Click on Accept");
        BasePage.click("Click_accept");
        
*/        test.log(LogStatus.INFO, "Click on search PO");
        BasePage.click("search_po");
        
       /* test.log(LogStatus.INFO, "Click on search PO");
        BasePage.click("search_po");*/
        
        test.log(LogStatus.INFO, "Enter PO name");
        BasePage.enterText("search_po", "PO_name");
        
        test.log(LogStatus.INFO, "Click on Submit");
        BasePage.click("Submit");
        
        test.log(LogStatus.INFO, "Click on finalise PO");
        BasePage.click("finalise_PO");
        
        test.log(LogStatus.INFO, "click on post to erp");
        BasePage.click("post_erp");
        
        test.log(LogStatus.INFO, "Click on finish");
        BasePage.click("Finish");
        
        test.log(LogStatus.INFO, "Click on ERP submission audit trail");
        BasePage.click("ERP_submission");
        
        test.log(LogStatus.INFO, "Click on Cancel");
        BasePage.click("cancel");
        
      /*  test.log(LogStatus.INFO, "Click on Logout");
        BasePage.click("Log_out");*/
       
    }

	
		
		
}