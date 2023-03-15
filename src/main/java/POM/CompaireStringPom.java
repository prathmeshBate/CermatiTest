package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaireStringPom {

	@FindBy(xpath="//input[@type='text']")private WebElement IP;
	@FindBy(xpath="//input[@value='Search']")private WebElement Sh;
	@FindBy(xpath="//h3[text()='Category']")private WebElement Ctg;
	@FindBy(xpath="//span[text()='Selected category']")private WebElement Sctg;
	@FindBy(xpath="//span[text()='Computers/Tablets & Networking']")private WebElement Sctg2;
	
	 public CompaireStringPom (WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 public void enterInput(String name)
	 {
	 IP.sendKeys(name);
	 }
	 public void clickSearch()
	 {
	 	Sh.click();
	 }
	 public void clickCategory()
	 {
	 	Ctg.click();
	 }
	 public void clickSelectCategory()
	 {
	 	Sctg.click();
	 }
	 public void clickSelectAnotherCategory()
	 {
	 	Sctg2.click();
	 }
	 
	 	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
