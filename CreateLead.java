package SeleniumFirstProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
WebElement userName = driver.findElement(By.id("username"));
userName.sendKeys("demosalesmanager");

WebElement password = driver.findElement(By.id("password"));	
password.sendKeys("crmsfa");

WebElement login = driver.findElement(By.className("decorativeSubmit"));
login.click();

WebElement linkText = driver.findElement(By.linkText("CRM/SFA"));
linkText.click();

driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Flipkart Pvt Ltd");
WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
firstname.sendKeys("Ajith");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Thala");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mister");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ultimate Star");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10C");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("222");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Vasool King");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Dont encourage Fans Club");
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("2");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12345");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Ajith@Ajith.com");
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Thala Ajith Kumar");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Chennai");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600007");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("22");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Thalaiva");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Cinema");		
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("4");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Thumbs up");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9945678323");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Thala");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.thalaajithkumar.com");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Thalaiva");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Chennai");		
Select dropdown = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));  
dropdown.selectByIndex(4); 
String text=firstname.getAttribute("value");
System.out.println("FirstName: "+text);
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println("Result Title: " +title);
String actualTitle = "View Lead | opentaps CRM";
if (title.equals(actualTitle)){
		System.out.println("Title matched");
} else {
	System.out.println("Title Not Matched");
}

}
}



