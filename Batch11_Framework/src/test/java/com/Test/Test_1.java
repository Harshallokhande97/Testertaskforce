package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;

import Utility.BaseClass;
import Utility.Library;

public class Test_1 extends BaseClass {
	
	
	@Test
	public void verifyTC_001 () {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys(excel.getStringdata("Sheet1", 0, 0));
		login.getTxt_pass().sendKeys(excel.getStringdata("Sheet1", 0, 1));
	
		
	}

}
