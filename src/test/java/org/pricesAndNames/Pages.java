package org.pricesAndNames;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages extends BaseClass {
	
	public Pages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement txtSearch;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/button")
	private WebElement btnSearch;
	
	@FindBy(xpath="/html/body/div[3]/div/span")
	private WebElement btnClose;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName1;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[3]/div[1]/div[1]")
	private WebElement iPhoneName2;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName3;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[5]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName4;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[6]/div/div/div/a/div[3]/div[1]/div[1]")
	private WebElement iPhoneName5;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName6;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[7]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName7;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[9]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName8;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[10]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName9;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[11]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName10;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[12]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName11;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[13]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName12;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[14]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName13;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[15]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName14;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[16]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName15;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[17]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName16;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[18]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName17;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[19]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName18;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[20]/div/div/div/a/div[3]/div[1]/div[1]")
	private WebElement iPhoneName19;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[21]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName20;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[22]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName21;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[23]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName22;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[24]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName23;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[25]/div/div/div/a/div[2]/div[1]/div[1]")
	private WebElement iPhoneName24;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnClose() {
		return btnClose;
	}

	public WebElement getiPhoneName1() {
		return iPhoneName1;
	}

	public WebElement getiPhoneName2() {
		return iPhoneName2;
	}

	public WebElement getiPhoneName3() {
		return iPhoneName3;
	}

	public WebElement getiPhoneName4() {
		return iPhoneName4;
	}

	public WebElement getiPhoneName5() {
		return iPhoneName5;
	}

	public WebElement getiPhoneName6() {
		return iPhoneName6;
	}

	public WebElement getiPhoneName7() {
		return iPhoneName7;
	}

	public WebElement getiPhoneName8() {
		return iPhoneName8;
	}

	public WebElement getiPhoneName9() {
		return iPhoneName9;
	}

	public WebElement getiPhoneName10() {
		return iPhoneName10;
	}

	public WebElement getiPhoneName11() {
		return iPhoneName11;
	}

	public WebElement getiPhoneName12() {
		return iPhoneName12;
	}

	public WebElement getiPhoneName13() {
		return iPhoneName13;
	}

	public WebElement getiPhoneName14() {
		return iPhoneName14;
	}

	public WebElement getiPhoneName15() {
		return iPhoneName15;
	}

	public WebElement getiPhoneName16() {
		return iPhoneName16;
	}

	public WebElement getiPhoneName17() {
		return iPhoneName17;
	}

	public WebElement getiPhoneName18() {
		return iPhoneName18;
	}

	public WebElement getiPhoneName19() {
		return iPhoneName19;
	}

	public WebElement getiPhoneName20() {
		return iPhoneName20;
	}

	public WebElement getiPhoneName21() {
		return iPhoneName21;
	}

	public WebElement getiPhoneName22() {
		return iPhoneName22;
	}

	public WebElement getiPhoneName23() {
		return iPhoneName23;
	}

	public WebElement getiPhoneName24() {
		return iPhoneName24;
	}
	
	
	
}
