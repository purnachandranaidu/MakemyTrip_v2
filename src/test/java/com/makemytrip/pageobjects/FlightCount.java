package com.makemytrip.pageobjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FlightCount {
	public WebDriver ldriver;
	public  FlightCount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void Departureflights()
	{
		try {
			WebElement list=ldriver.findElement(By.xpath("//div[@id='ow_domrt-jrny']"));
			
			List<WebElement> options = list.findElements(By.xpath("(//div[@id='ow_domrt-jrny']//label//span[2])"));
			System.out.println(options.size());
			for(int i=0;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
				options.get(i).getText();
				
				
			}
			
		} catch (Exception e) {
			e.getMessage();
			
		}
	}
	
	
	public void Returnflights()
	{
		try {
			WebElement list=ldriver.findElement(By.xpath("//div[@id='rt-domrt-jrny']"));
			
			List<WebElement> options = list.findElements(By.xpath("(//div[@id='rt-domrt-jrny']//label//span[2])"));
			System.out.println(options.size());
			for(int i=0;i<options.size();i++)
			{
				System.out.println(options.get(i).getText());
				options.get(i).getText();	
			}
			
		} catch (Exception e) {
			e.getMessage();
			
		}
	}

}
