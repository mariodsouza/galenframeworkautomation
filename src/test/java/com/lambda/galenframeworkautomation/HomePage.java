package com.lambda.galenframeworkautomation;

import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.galenframework.api.Galen;
import com.galenframework.reports.model.LayoutReport;

public class HomePage {
	
	private static final String home = "src/main/java/specs/home.gspec";
	private static final String baseURL = "https://www.shaadi.com/";
	private WebDriver driver;
    private LayoutReport layoutReport;
    
    @BeforeClass
    public void init() {
    	
    	System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    	
    }
    
    @Test
    public void checkShaadiLogo() throws IOException {
    	
    	Galen.checkLayout(driver, home, Arrays.asList("desktop"));
    	
    }

}
