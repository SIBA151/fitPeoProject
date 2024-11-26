package com.fitPeoProject.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fitPeo.testComponents.BaseTest;
import com.fitPeoProject.pageObjects.HomePage;
import com.fitPeoProject.pageObjects.RevenueCalculatorPage;

public class revenueCalculatorTest extends BaseTest {

	private final HomePage homePage = new HomePage();
	private final RevenueCalculatorPage revenueCalculatorPage = new RevenueCalculatorPage();
	private final String totalRecRemAmount = fitPeoProperties.getProperty("totalRecRemAmount");
	private final String sliderValue = fitPeoProperties.getProperty("sliderValue");

	String sliderPointFirst;
	String sliderPointSec;

	@Test
	public void RevenueCalculatorTest() {

		homePage.clickRevenueCalculatorHeader();

		revenueCalculatorPage.moveSlider();
		sliderPointFirst = revenueCalculatorPage.getLocationOfSlider();

		revenueCalculatorPage.entertextfieldOFSlider(sliderValue);

		sliderPointSec = revenueCalculatorPage.getLocationOfSlider();

		Assert.assertNotEquals(sliderPointFirst, sliderPointSec, "Verify that slider's position is updated");

		revenueCalculatorPage.clickOnCheckBox("CPT-99091");
		revenueCalculatorPage.clickOnCheckBox("CPT-99453");
		revenueCalculatorPage.clickOnCheckBox("CPT-99454");
		revenueCalculatorPage.clickOnCheckBox("CPT-99474");

		Assert.assertEquals(revenueCalculatorPage.getTotalRecurringReimbursement(), totalRecRemAmount,
				"Verify that the header displaying Total Recurring Reimbursement for all Patients Per Month: shows the value: "
						+ totalRecRemAmount);
	}

}
