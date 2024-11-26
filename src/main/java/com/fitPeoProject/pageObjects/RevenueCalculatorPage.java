package com.fitPeoProject.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import intTest.BaseClass;
import intTest.Element;

public class RevenueCalculatorPage extends BaseClass {

	private final By revenueCalculatorSliderBy = By
			.cssSelector(fitPeoSelectorsProperties.getProperty("revenueCalculatorSliderBy"));
	private final By revenueCalculatorBoxBy = By
			.cssSelector(fitPeoSelectorsProperties.getProperty("revenueCalculatorBoxBy"));
	private final By totalRecurringReimbursementBy = By
			.xpath(fitPeoSelectorsProperties.getProperty("totalRecurringReimbursementBy"));
	private final String checkBoxElm = fitPeoSelectorsProperties.getProperty("checkBoxElm");

	public RevenueCalculatorPage moveSlider() {
		Element.waitForElement(revenueCalculatorSliderBy);
		Actions action = new Actions(driver);
		action.scrollToElement(driver.findElement(revenueCalculatorBoxBy)).perform();
		action.dragAndDropBy(driver.findElement(revenueCalculatorSliderBy), 94, 0).perform();
		return this;
	}

	public String getLocationOfSlider() {
		return Element.getLocationValue(revenueCalculatorSliderBy).toString();

	}

	public RevenueCalculatorPage entertextfieldOFSlider(String value) {
		Element.entryText(revenueCalculatorBoxBy, value);
		return this;
	}

	public RevenueCalculatorPage clickOnCheckBox(String labelName) {
		By elm = By.xpath(checkBoxElm.replace("{labelName}", labelName));
		Actions action = new Actions(driver);
		action.scrollToElement(driver.findElement(elm)).perform();
		action.click(driver.findElement(elm)).perform();
		return this;
	}

	public String getTotalRecurringReimbursement() {
		return Element.getText(totalRecurringReimbursementBy);

	}
}
