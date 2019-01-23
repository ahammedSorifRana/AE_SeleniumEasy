package bootStrapDatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Test.test.seleniumEasy.BaseTest.TestBase;

public class DateExample extends TestBase {
	
	
	
	WebDriver Driver;
	
	final String Jan = "January";
	final String Jan2 = "January";
	final String Jan3 = "January2";
	final String Jan4 = "January";
	final String Feb1 ="February";
	final String Feb2 ="February";
	
	final String Feb ="February";
	final String Mar ="March";
	final String Apr ="April";
	final String May ="May";
	final String Jun ="June";
	final String Jul ="July";
	final String Jul2 ="JulyFirst";

	final String Agu ="August";
	final String Sep ="September";
	final String Oct ="October";
	final String Oct2 ="October";
	final String Oct3 ="October";
	final String Nov ="November";
	final String Dec ="December";

	final String Dec2 ="December";
	final String Dec3 ="December";

	final String Dec29 ="December";
	final String Dec39 ="December";
	final String Dec28 ="December";
	final String Dec38 ="December";

}
	





 /*
  * List<WebElement> allDates = Driver.findElements(By.xpath("html/body/div[3]/div[1]/table/tbody/tr/td"));
		for(WebElement xdate : allDates) {
			String DateValue = xdate.getText();
			System.out.println(DateValue);
			System.out.println("Input Date " + Date);
			Select xValue = new Select(xdate);
			xValue.selectByVisibleText(Date);
		}
  * 
  * 
  * int size =allDates.size();
  */
	/*	System.out.println(size);
		for(WebElement dates : allDates) {
			//boolean dateText = dates.getText().equalsIgnoreCase(Date);
			System.out.println(dates.getText());
			Select dText = new Select(dates);
			dText.selectByVisibleText(Date);
			
			/*if(dateText== true) {
				dates.click();
				break;
			}
			
		}*/
