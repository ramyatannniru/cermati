package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Factory.BaseClass;
import Pageobject.ProductApplyFilter;

public class TC_001_Product_via_filerapply extends BaseClass{
	
	@Test(groups= {"regression"})
	public void Applyfiletr()
	{
		try
		{
			ProductApplyFilter productApplyFilter =new ProductApplyFilter(driver);
			//clicking on Navigate to Search by category
			productApplyFilter.setShopBycategeory();
			//Navigate to Search by category > Electronics > Cell Phones & accessories
			productApplyFilter.setCell_phones_accessories();
			//After the page loads, click Cell Phones & Smartphones in the left hand side navigation section.
            productApplyFilter.setCell_Phones_smartphones();
            //
			productApplyFilter.setAllfilters();
			//using javascript to scroll down inner table
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			   Object price = null;
			js.executeScript("document.querySelector(\".x-overlay__wrapper--left\").scrollTop=600",price);
			   //setting price minimum value ot maximum value
			productApplyFilter.setPrice();
			//setting condition to Brand new
			productApplyFilter.setCondition(null);
			//setting Location to US
			productApplyFilter.setLocation();
			//clicking all apply button
			productApplyFilter.setAplyfilerbutton();
			//Verifying filters applied or not 
			String actulsresults = productApplyFilter.verifyfiletrsapplied();
			String expectedresults ="Cell Phones & Smartphones between US $200.00 and US $700.00";
			if(actulsresults.equals(expectedresults))
			 {
				 //both are matching assert.true executes
				 Assert.assertTrue(true, "both are matching");
				 
			 }
			 
			 
			 
			
			
		}
		catch(Exception e)
		{
             //if they ae not matching assert will fails 
			Assert.fail("An exception occurred: " + e.getMessage());
		}

}
}
