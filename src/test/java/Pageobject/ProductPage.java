package Pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage{
	
	
	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//*[@id=\"gh-ac\"]")
	WebElement searchString;
	
	@FindBy(xpath="//*[@id=\"gh-btn\"]")
	WebElement click;
	
	
	@FindBy(xpath="//*[@id='gh-cat']")
	WebElement Computernetwork_search;
	
	@FindBy(xpath="//*[@id='gh-btn']")
	WebElement Computernetwork_search_click;
	
	@FindBy(xpath="//*[@id='item44f93319fb']/div/div[2]/a/div/span")
	WebElement macbookresult;
	
	@FindBy(xpath="//*[@id='item44f93319fb']/div/div[2]/a/div/span")
    WebElement macbookresult2;
	
	public void setSearchString() {
            searchString.sendKeys("macbook");
	}
	public void click() {
        click.click();
	}
	
     
	public void setComputernetwork_search_click() {
	      WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gh-cat']")));
	     Select data= new Select(dropdown);
	     data.selectByVisibleText("Computers/Tablets & Networking");
	     Computernetwork_search_click.click();
	}
	public String getMacbookresult() {
		return macbookresult.getText();
	}
	
	public String getMacbookresult2() {
		return macbookresult2.getText();
	}
	
	public boolean Pageload()
	{
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  boolean data= js.executeScript(" return document.readyState").toString().equals("complete");
		return data;
		
	}
	
	
	
}

