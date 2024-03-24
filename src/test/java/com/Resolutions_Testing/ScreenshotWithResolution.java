package com.Resolutions_Testing;


import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	
	public class ScreenshotWithResolution {

	    public static void main(String[] args) {
	       

	        // Create WebDriver instances for different browsers
	        WebDriver chromeDriver = new ChromeDriver();
	        WebDriver firefoxDriver = new FirefoxDriver();

	        try {
	            // Set different resolutions
	            Dimension[] resolutions = {new Dimension(1920, 1080), new Dimension(1366, 768), new Dimension(1536, 864)};
	            
	            for (org.openqa.selenium.Dimension resolution : resolutions) {
	                // Set resolution for Chrome
	                chromeDriver.manage().window().setSize((resolution);
	                // Open a webpage
	                chromeDriver.get("https://www.example.com");
	                // Take screenshot and save it
	                takeScreenshot(chromeDriver, "chrome_screenshot_" + resolution.getWidth() + "x" + resolution.getHeight() + ".png");

	                // Set resolution for Firefox
	                firefoxDriver.manage().window().setSize(resolution);
	                // Open a webpage
	                firefoxDriver.get("https://www.example.com");
	                // Take screenshot and save it
	                takeScreenshot(firefoxDriver, "firefox_screenshot_" + resolution.getWidth() + "x" + resolution.getHeight() + ".png");
	            }
	        } finally {
	            // Close the browsers
	            chromeDriver.quit();
	            firefoxDriver.quit();
	        }
	    }

	    public static void takeScreenshot(WebDriver driver, String fileName) {
	        // Convert WebDriver instance to TakeScreenshot
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        // Capture screenshot
	        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	        // Define the path to save the screenshot
	        File destFile = new File(fileName);
	        try {
	            // Copy the screenshot to the desired location
	            FileUtils.copyFile(srcFile, destFile);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


