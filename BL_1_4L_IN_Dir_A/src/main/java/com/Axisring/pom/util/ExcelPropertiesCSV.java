package com.Axisring.pom.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class ExcelPropertiesCSV 
{
	WebDriver driver;
	String baseURL = "https://www.youtube.com/watch?v=1b-DQ0hke2s";
	String CSV_file = "C:\\Users\\Akshay\\eclipse-workspace\\AutomationAxisring\\data\\LoginAxisring.csv";

	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void verify_Search() throws FileNotFoundException
	{
		//CSVReader Class
		CSVReader reader = new CSVReader(new FileReader(CSV_file));
		
	}
	
}
