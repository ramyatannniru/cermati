package Pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.BaseClass;

public class ProductApplyFilter extends BasePage{
	
	
	
	public ProductApplyFilter(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//*[@id='gh-shop-ei']")
	WebElement shopBycategeory;
	@FindBy(xpath="//a[normalize-space()='Cell phones & accessories']")
	WebElement cell_phones_accessories;
	@FindBy(xpath="//a[contains(text(),'Cell Phones & Smartphones')][1]")
	WebElement cell_Phones_smartphones;
	@FindBy(xpath="//button[normalize-space()='All Filters']")
	WebElement allfilters;
	
	@FindBy(xpath="/*[@id='c3-mainPanel-price']")
	WebElement price;

	@FindBy(xpath="//*[@id='c3-subPanel-_x-price-textrange']/div/div[1]/div/input")
	WebElement minvalue ;

	@FindBy(xpath="//*[@id='c3-subPanel-_x-price-textrange']/div/div[2]/div/input")
	WebElement maxvalue;

	@FindBy(xpath="//*[@id='c3-mainPanel-condition']")
	WebElement condition;

	@FindBy(xpath="//*[@id='c3-subPanel-LH_ItemCondition_New_cbx']")
	WebElement newcondtion;

	@FindBy(xpath="//*[@id='c3-mainPanel-location']")
	WebElement location;

	@FindBy(xpath="//input[@value='US Only']")
	WebElement USlocation;

	@FindBy(xpath="//*[@id=\\\"x-overlay__form\\\"]/div[3]/div[2]/button")
	WebElement aplyfilerbutton;
	

	@FindBy(css="//h1[@class='b-pageheader']/span[@class='b-pageheader__text']")
	WebElement selectedoptions;


	public void setShopBycategeory() {
		shopBycategeory.click();
	}


	public void setCell_phones_accessories() {
		cell_phones_accessories.click();
	}


	public void setCell_Phones_smartphones() {
		cell_Phones_smartphones.click();
	}


	public void setAllfilters() {
		allfilters.click();
		
	}


	public void setPrice() {
		price.click();
		minvalue.sendKeys("200");
		maxvalue.sendKeys("800");
	}

	public void setCondition(WebElement condition) {
		condition.click();
		newcondtion.click();
		
	}


	public void setLocation() {
		location.click();;
		USlocation.click();
		
	}


	public void setAplyfilerbutton() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement submitbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("aplyfilerbutton")));
		submitbutton.submit();
	
	}
	
	
	


	public String verifyfiletrsapplied( ) {
		return selectedoptions.getText();
	}
	
	
	
	
}
