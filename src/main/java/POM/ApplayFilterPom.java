package POM;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplayFilterPom {
	
@FindBy(xpath="//input[@type='text']") private WebElement Search;	
@FindBy(xpath="//input[@type='submit']") private WebElement Submit;	
@FindBy(xpath="//span[text()='Cell Phones & Smartphones']") private WebElement Ctg;
@FindBy(xpath="//li[@class='x-refine__main__list--more']") private WebElement Mtg;
@FindBy(xpath="//span[text()='Screen Size']") private WebElement Ft1;
@FindBy(xpath="//input[@aria-hidden='false'][1]") private WebElement Op1;
@FindBy(xpath="//span[text()='Price']") private WebElement Ft2;
@FindBy(xpath="//input[@role='checkbox'][1]") private WebElement Op2;
@FindBy(xpath="//span[text()='Item Location']") private WebElement Ft3;
@FindBy(xpath="//input[@data-value='Default'][1]") private WebElement Op3;
@FindBy(xpath="//button[@aria-label='Apply']") private WebElement Btn;

public ApplayFilterPom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterInput(String name)
{
Search.sendKeys(name);
}
public void clickButton()
{
	Submit.click();
}
public void clickCategory()
{
	Ctg.click();
}
public void clickMoreThings()
{
	Mtg.click();
}
public void clickFilter1()
{
	Ft1.click();
}
public void clickOption1()
{
	Op1.click();
}
public void clickFilter2()
{
	Ft2.click();
}
public void clickOption2()
{
	Op2.click();
}
public void clickFilter3()
{
	Ft3.click();
}
public void clickOption3()
{
	Op3.click();
}
public void clickApplay()
{
	Btn.click();
}







}



