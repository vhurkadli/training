package TestNGturorials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.ConstantPushInstruction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.openqa.selenium.remote.server.handler.GetCurrentWindowHandle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class AppsPortal {

	WebDriver driver;
	//amn.demo+firstcut@gmail.com
	//Amnimo19
	String gmailUsername="vthoughtclan@gmail.com";
	String gmailPassword="vapdemouser";
	String inviteUserId="vthoughtclan+12@gmail.com";
	String setPassword="vapdemouser";
	String renameTitle="Title1";
	@Test(priority=1,enabled=true)
	//Log in to APPS Portal
	    public void method1_LogInToAPPS_Portal() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://apps.dev-alpine-amo.com/#/home");
		driver.manage().window().maximize();
		try {	
		driver.findElement(By.xpath(".//*[@class=\"mat-form-field-infix ng-tns-c162-1\"]/input")).sendKeys("amn.demo+firstcut@gmail.com");
		driver.findElement(By.xpath(".//*[@class=\"mat-form-field-infix ng-tns-c162-2\"]/input")).sendKeys("Amnimo19");
		driver.findElement(By.xpath(".//*[button]/button")).click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex) {
		}
	}
	
	











}

