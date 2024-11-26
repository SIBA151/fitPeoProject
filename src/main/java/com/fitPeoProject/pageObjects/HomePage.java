package com.fitPeoProject.pageObjects;


import org.openqa.selenium.By;

import intTest.BaseClass;
import intTest.Element;

public class HomePage extends BaseClass{
	private final By revenueCalculatorHeader = By
			.xpath(fitPeoSelectorsProperties.getProperty("revenueCalculatorHeader"));
	
	public RevenueCalculatorPage clickRevenueCalculatorHeader() {
		Element.clickElm(revenueCalculatorHeader);
		 return new RevenueCalculatorPage();
	}
}
