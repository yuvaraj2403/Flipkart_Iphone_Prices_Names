package org.pricesAndNames;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
	}
	
	@AfterClass
	public static void afterClass() {
		quit();
	}
	
	@Test
	public void searchPage() {
		implicitlyWait();
		Pages p=new Pages();
		click(p.getBtnClose());
		sendKeys(p.getTxtSearch(), "iphone");
		click(p.getBtnSearch());
		System.out.println(getText(p.getiPhoneName1()));
		System.out.println(getText(p.getCost1()));
		System.out.println(getText(p.getiPhoneName2()));
		System.out.println(getText(p.getCost2()));
		System.out.println(getText(p.getiPhoneName3()));
		System.out.println(getText(p.getCost3()));
		System.out.println(getText(p.getiPhoneName4()));
		System.out.println(getText(p.getCost4()));
		System.out.println(getText(p.getiPhoneName5()));
		System.out.println(getText(p.getCost5()));
		System.out.println(getText(p.getiPhoneName6()));
		System.out.println(getText(p.getCost6()));
		System.out.println(getText(p.getiPhoneName7()));
		System.out.println(getText(p.getCost7()));
		System.out.println(getText(p.getiPhoneName8()));
		System.out.println(getText(p.getCost8()));
		System.out.println(getText(p.getiPhoneName9()));
		System.out.println(getText(p.getCost9()));
		System.out.println(getText(p.getiPhoneName10()));
		System.out.println(getText(p.getCost10()));
		System.out.println(getText(p.getiPhoneName11()));
		System.out.println(getText(p.getCost11()));
		System.out.println(getText(p.getiPhoneName12()));
		System.out.println(getText(p.getCost12()));
		System.out.println(getText(p.getiPhoneName13()));
		System.out.println(getText(p.getCost13()));
		System.out.println(getText(p.getiPhoneName14()));
		System.out.println(getText(p.getCost14()));
		System.out.println(getText(p.getiPhoneName15()));
		System.out.println(getText(p.getCost15()));
		System.out.println(getText(p.getiPhoneName16()));
		System.out.println(getText(p.getCost16()));
		System.out.println(getText(p.getiPhoneName17()));
		System.out.println(getText(p.getCost17()));
		System.out.println(getText(p.getiPhoneName18()));
		System.out.println(getText(p.getCost18()));
		System.out.println(getText(p.getiPhoneName19()));
		System.out.println(getText(p.getCost19()));
		System.out.println(getText(p.getiPhoneName20()));
		System.out.println(getText(p.getCost20()));
		System.out.println(getText(p.getiPhoneName21()));
		System.out.println(getText(p.getCost21()));
		System.out.println(getText(p.getiPhoneName22()));
		System.out.println(getText(p.getCost22()));
		System.out.println(getText(p.getiPhoneName23()));
		System.out.println(getText(p.getCost23()));
		System.out.println(getText(p.getiPhoneName24()));
		System.out.println(getText(p.getCost24()));
	}
}
