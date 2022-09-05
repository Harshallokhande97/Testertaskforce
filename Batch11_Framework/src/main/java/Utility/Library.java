package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_Sendkeys (WebElement element,String Value) {
		try {
			element.sendKeys(Value);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
	}

	public static void custom_click (WebElement element) {
		
		try {
			element.click();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public static void cuxtom_HandleDropDown(WebElement element,String text) {
		
		try {
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
