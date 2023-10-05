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
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[1]")
	private WebElement iPhoneName1;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[2]")
	private WebElement iPhoneName2;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[3]")
	private WebElement iPhoneName3;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[4]")
	private WebElement iPhoneName4;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[5]")
	private WebElement iPhoneName5;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[6]")
	private WebElement iPhoneName6;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[7]")
	private WebElement iPhoneName7;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[8]")
	private WebElement iPhoneName8;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[9]")
	private WebElement iPhoneName9;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[10]")
	private WebElement iPhoneName10;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[11]")
	private WebElement iPhoneName11;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[12]")
	private WebElement iPhoneName12;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[13]")
	private WebElement iPhoneName13;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[14]")
	private WebElement iPhoneName14;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[15]")
	private WebElement iPhoneName15;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[16]")
	private WebElement iPhoneName16;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[17]")
	private WebElement iPhoneName17;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[18]")
	private WebElement iPhoneName18;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[19]")
	private WebElement iPhoneName19;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[20]")
	private WebElement iPhoneName20;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[21]")
	private WebElement iPhoneName21;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[22]")
	private WebElement iPhoneName22;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[23]")
	private WebElement iPhoneName23;
	
	@FindBy(xpath="(//div[@class=\"_4rR01T\"])[24]")
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
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[1]")
	public WebElement cost1;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[2]")
	public WebElement cost2;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[3]")
	public WebElement cost3;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[4]")
	public WebElement cost4;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[5]")
	public WebElement cost5;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[6]")
	public WebElement cost6;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[7]")
	public WebElement cost7;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[8]")
	public WebElement cost8;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[9]")
	public WebElement cost9;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[10]")
	public WebElement cost10;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[11]")
	public WebElement cost11;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[12]")
	public WebElement cost12;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[13]")
	public WebElement cost13;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[14]")
	public WebElement cost14;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[15]")
	public WebElement cost15;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[16]")
	public WebElement cost16;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[17]")
	public WebElement cost17;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[18]")
	public WebElement cost18;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[19]")
	public WebElement cost19;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[20]")
	public WebElement cost20;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[21]")
	public WebElement cost21;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[22]")
	public WebElement cost22;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[23]")
	public WebElement cost23;
	
	@FindBy(xpath="(//div[@class=\"_30jeq3 _1_WHN1\"])[24]")
	public WebElement cost24;
	
	public WebElement getCost1() {
		return cost1;
	}

	public WebElement getCost2() {
		return cost2;
	}

	public WebElement getCost3() {
		return cost3;
	}

	public WebElement getCost4() {
		return cost4;
	}

	public WebElement getCost5() {
		return cost5;
	}

	public WebElement getCost6() {
		return cost6;
	}

	public WebElement getCost7() {
		return cost7;
	}

	public WebElement getCost8() {
		return cost8;
	}

	public WebElement getCost9() {
		return cost9;
	}

	public WebElement getCost10() {
		return cost10;
	}

	public WebElement getCost11() {
		return cost11;
	}

	public WebElement getCost12() {
		return cost12;
	}

	public WebElement getCost13() {
		return cost13;
	}

	public WebElement getCost14() {
		return cost14;
	}

	public WebElement getCost15() {
		return cost15;
	}

	public WebElement getCost16() {
		return cost16;
	}

	public WebElement getCost17() {
		return cost17;
	}

	public WebElement getCost18() {
		return cost18;
	}

	public WebElement getCost19() {
		return cost19;
	}

	public WebElement getCost20() {
		return cost20;
	}

	public WebElement getCost21() {
		return cost21;
	}

	public WebElement getCost22() {
		return cost22;
	}

	public WebElement getCost23() {
		return cost23;
	}

	public WebElement getCost24() {
		return cost24;
	}
	
	
	
}
