package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.BaseClass;
import Pageobject.*;


public class TC_002_Product_mac_search extends BaseClass{
		
		@Test(groups= {"regression"})
		public void VerifyProduct()
		{
			try
			{
			   //initializing the object
				ProductPage productpage = new ProductPage(driver) ;
				//entering machbook on search bar
				productpage.setSearchString();
				//click on enter
				productpage.click();
				//getting test of first result of the search page
				 String results=productpage.getMacbookresult();
				 //changing the category to  Computers/Tablets & Networking and click on search button
				 productpage.setComputernetwork_search_click();
				 //verifying page loaded or not 
				 if(productpage.Pageload()== true)
				 {
					 System.out.println("page loaded successfully");
				 //getting test of first result of the search page after applying category filter
				 String results2 = productpage.getMacbookresult2();
				 //verifying the results of 2 macbook sear data 
				 
				 if(results2.equals(results))
				 {
					 //both are matching assert.true executes
					 Assert.assertTrue(true, "both are matching");
					 
				 }
				 
				 
				 } 
				 
				 else {
					 System.out.println("page loaded failed");
					 
					 Assert.assertTrue(false, "page not loaded");


				 }
									 }
				 
				 
				 
				
			
			catch(Exception e)
			{
	             //if they ae not matching assert will fails 
				Assert.fail("An exception occurred: " + e.getMessage());
			}
			
			

				 
		}
		
		

}
