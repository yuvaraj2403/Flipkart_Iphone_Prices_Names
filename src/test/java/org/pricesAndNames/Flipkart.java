package org.pricesAndNames;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("edge");
		urlLaunch("https://www.flipkart.com/");
		implicitlyWait();
	}
	
	@AfterClass
	public static void afterClass() {
		quit();
	}
	
	@Test
	public void searchPage() {
		Pages p=new Pages();
		click(p.getBtnClose());
		sendKeys(p.getTxtSearch(), "iphone");
		click(p.getBtnSearch());
		System.out.println(getText(p.getiPhoneName1()));
		System.out.println(getText(p.getiPhoneName2()));
		System.out.println(getText(p.getiPhoneName3()));
		System.out.println(getText(p.getiPhoneName4()));
		System.out.println(getText(p.getiPhoneName5()));
		System.out.println(getText(p.getiPhoneName6()));
		System.out.println(getText(p.getiPhoneName7()));
		System.out.println(getText(p.getiPhoneName8()));
		System.out.println(getText(p.getiPhoneName9()));
		System.out.println(getText(p.getiPhoneName10()));
		System.out.println(getText(p.getiPhoneName11()));
		System.out.println(getText(p.getiPhoneName12()));
		System.out.println(getText(p.getiPhoneName13()));
		System.out.println(getText(p.getiPhoneName14()));
		System.out.println(getText(p.getiPhoneName15()));
		System.out.println(getText(p.getiPhoneName16()));
		System.out.println(getText(p.getiPhoneName17()));
		System.out.println(getText(p.getiPhoneName18()));
		System.out.println(getText(p.getiPhoneName19()));
		System.out.println(getText(p.getiPhoneName20()));
		System.out.println(getText(p.getiPhoneName21()));
		System.out.println(getText(p.getiPhoneName22()));
		System.out.println(getText(p.getiPhoneName23()));
		System.out.println(getText(p.getiPhoneName24()));
	}
}
