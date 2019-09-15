/**
 * 
 */
package com.cucumber.testbase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cucumber.enums.Browsers;
import com.cucumber.enums.OS;

/**
 * @author Pranob Kalita 09-Sep-2019
 */
public class TestBase {

	public static WebDriver driver;

	public WebDriver selectBrowser(String browser) {
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase(Browsers.IEXPLORER.name())) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "/resources/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		} else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.firefox.marionette",
						System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase(Browsers.IEXPLORER.name())) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "/resources/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		} else if (System.getProperty("os.name").toLowerCase().contains(OS.LINUX.name().toLowerCase())) {
			if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase(Browsers.IEXPLORER.name())) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "/resources/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		}
		return driver;
	}

	
	//Created for generating random string for Unique email
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
}
