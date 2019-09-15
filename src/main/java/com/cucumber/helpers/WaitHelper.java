/**
 * 
 */
package com.cucumber.helpers;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * @author Pranob Kalita 08-Sep-2019
 */
public class WaitHelper {

	Logger log = LoggerHelper.getLogger(WaitHelper.class);

	private WebDriver driver;

	public WaitHelper(WebDriver driver) {
		this.driver = driver;
	}

	public void WaitForElement(WebElement element, long timeOutInSeconds) {
		
		log.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("element is visible..");
	}

}
