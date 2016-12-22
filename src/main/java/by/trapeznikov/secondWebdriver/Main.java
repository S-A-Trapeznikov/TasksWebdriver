package by.trapeznikov.secondWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","c:\\Selenium\\drivers\\geckodriver.exe");
  		WebDriver driver = new FirefoxDriver();
		
//		First(driver);
//  	tutNews(driver);
//  	QuizfulRegistration(driver);
//  	itAcademyStudy(driver);
  		testQuizfulEdit(driver);
			
	}
	
	  private static void First(WebDriver driver) throws InterruptedException{
	   	
		driver.get("https://www.google.by");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement webElement = null;
		
		webElement = driver.findElement(By.id("lst-ib"));
		webElement.sendKeys("JAVA");
		webElement.submit();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		Thread.sleep(5000);
		
		System.out.println("Title name = "+driver.getTitle());
	   
   }
   
	  private static void QuizfulRegistration(WebDriver driver) throws InterruptedException {
		   	
			driver.get("http://www.quizful.net");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement webElement = null;
			
			webElement = driver.findElement(By.xpath(".//*[@id='user-panel']/li[3]/a"));
			webElement.click();
						
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

			webElement = driver.findElement(By.id("login"));
			webElement.sendKeys("Trapeznikov");
			
			webElement = driver.findElement(By.name("registrationForm.password"));
			webElement.sendKeys("Trapeznikov");
			
			webElement = driver.findElement(By.name("registrationForm.repassword"));
			webElement.sendKeys("Trapeznikov");
			
			webElement = driver.findElement(By.name("registrationForm.email"));
			webElement.sendKeys("s.a.trapeznikov@mail.ru");
			
			webElement = driver.findElement(By.id("corporate"));
			webElement.click();
			
			Thread.sleep(10000);
//			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			webElement = driver.findElement(By.name("ok"));
			webElement.click();
			
	   }
	  
	  private static void tutNews(WebDriver driver) {
		   	
			driver.get("https://www.tut.by");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement webElement = null;
			
			webElement = driver.findElement(By.className("anounce__link"));	
			System.out.println(webElement.getText());
			
			webElement = driver.findElement(By.className("header_link"));	
			webElement.click();
						
			webElement = driver.findElement(By.xpath(".//*[@id='article_body']"));
			
			List<WebElement> webElements = webElement.findElements(By.tagName("p"));
			
			System.out.println(webElements.size());
							
	}
   
	  private static void itAcademyStudy(WebDriver driver) throws InterruptedException  {
		   	
			driver.get("http://www.it-academy.by");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement webElement = null;
			
			webElement = driver.findElement(By.cssSelector("#main-menu li.last.expanded.menu-depth-2.menu-item-657"));
						
			String mouseOverScript = "if(document.createEvent)"
										+ "{var evObj = document.createEvent('MouseEvents');"
										+ "evObj.initEvent('mouseover',true, false);"
										+ " arguments[0].dispatchEvent(evObj);"
										+ "} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			
			((JavascriptExecutor) driver).executeScript(mouseOverScript, webElement);
			
			webElement = driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[2]/a"));	
			String textElement = webElement.getText();
			System.out.println(textElement);
			
			webElement = driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[2]/ul/li[1]/a"));	
			textElement = webElement.getText();
			System.out.println(textElement);
			
			webElement = driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[2]/ul/li[2]/a"));	
			textElement = webElement.getText();
			System.out.println(textElement);
			
			webElement = driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[2]/ul/li[2]/ul/li[1]/a"));	
			textElement = webElement.getText();
			System.out.println(textElement);
			
			webElement = driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[2]/ul/li[2]/ul/li[2]/a"));	
			textElement = webElement.getText();
			System.out.println(textElement);
			
			webElement = driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[2]/ul/li[2]/ul/li[3]/a"));	
			textElement = webElement.getText();
			System.out.println(textElement);
			
			webElement = driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[2]/ul/li[2]/ul/li[4]/a"));	
			textElement = webElement.getText();
			System.out.println(textElement);
			
			webElement = driver.findElement(By.cssSelector("#main-menu li.first.expanded.menu-depth-1.menu-item-553"));
			
			((JavascriptExecutor) driver).executeScript(mouseOverScript, webElement);
			webElement = driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[1]/ul/li[5]"));	
			webElement.click();
						
	  }
	  
	  private static void testQuizful(WebDriver driver) throws InterruptedException {
		   	
			driver.get("http://www.quizful.net");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement webElement = null;
			
			webElement = driver.findElement(By.xpath(".//*[@id='user-panel']/li[3]/a"));
			webElement.click();
						
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

			webElement = driver.findElement(By.id("login"));
			webElement.sendKeys("Trapeznikov");
			
			webElement = driver.findElement(By.name("registrationForm.password"));
			webElement.sendKeys("Trapeznikov");
			
			webElement = driver.findElement(By.name("registrationForm.repassword"));
			webElement.sendKeys("Trapeznikov");
			
			webElement = driver.findElement(By.name("registrationForm.email"));
			webElement.sendKeys("s.a.trapeznikov@mail.ru");
			
			webElement = driver.findElement(By.id("corporate"));
			webElement.click();
			
			Thread.sleep(10000);
//			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			webElement = driver.findElement(By.name("ok"));
			webElement.click();
			
	   }
	  
	  private static void testQuizfulEdit(WebDriver driver) throws InterruptedException {
		   	
			driver.get("http://www.quizful.net");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebElement webElement = null;
			
			webElement = driver.findElement(By.xpath(".//*[@id='user-panel']/li[1]/a"));
			webElement.click();
						
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

			webElement = driver.findElement(By.id("login"));
			webElement.sendKeys("Trapeznikov");
			
			webElement = driver.findElement(By.name("loginForm.password"));
			webElement.sendKeys("Trapeznikov");
									
//			Thread.sleep(10000);
//			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			webElement = driver.findElement(By.cssSelector("#login-form  input.btn.btn-primary"));
			webElement.click();
			
			webElement = driver.findElement(By.xpath(".//*[@id='user-panel']/li[1]/b/a"));
			webElement.click();
			
			webElement = driver.findElement(By.cssSelector("#middle  a.btn.btn-default.btn-xs"));
			webElement.click();
			
			webElement = driver.findElement(By.cssSelector("#edit-profile-page  div.title"));
			webElement.click();
			
			webElement = driver.findElement(By.name("personalForm.name"));
			webElement.clear();
			webElement.sendKeys("Sergei");
			
			webElement = driver.findElement(By.name("personalForm.surname"));
			webElement.clear();
			webElement.sendKeys("Trapeznikov");
			
			webElement = driver.findElement(By.name("personalForm.birthyear"));
			webElement.clear();
			webElement.sendKeys("2016");
			
			webElement = driver.findElement(By.name("personalForm.site"));
			webElement.clear();
			webElement.sendKeys("epam.by");
			
			webElement = driver.findElement(By.name("personalForm.company"));
			webElement.clear();
			webElement.sendKeys("epam");
			
			webElement = driver.findElement(By.name("personalForm.about"));
			webElement.clear();
			webElement.sendKeys("epam");
			
			webElement = driver.findElement(By.name("personalForm.countryId"));
			Select country = new Select(webElement);
			country.selectByVisibleText("Беларусь");
			
			webElement = driver.findElement(By.name("personalForm.cityId"));
			Select city = new Select(webElement);
			city.selectByVisibleText("Минск");
			
			webElement = driver.findElement(By.name("personalForm.zone"));
			Select zone = new Select(webElement);
			zone.selectByVisibleText("Белоруссия/Минск(GMT+3)");
			
			webElement = driver.findElement(By.name("personalForm.avatar"));
			webElement.sendKeys("C:\\Users\\MrHacker\\Downloads\\1111.png");			
			
			webElement = driver.findElement(By.name("personalForm.save"));
			webElement.click();
			
			webElement = driver.findElement(By.cssSelector("#profile-notifications-form  div.title"));
			webElement.click();
			
			webElement = driver.findElement(By.name("notificationsForm.notificationsEnabled"));
			webElement.click();
			
			webElement = driver.findElement(By.name("notificationsForm.deliveryEnabled"));
			webElement.click();
			
			webElement = driver.findElement(By.name("notificationsForm.save"));
			webElement.click();
						
			webElement = driver.findElement(By.cssSelector("#profile-privacy-form  div.title"));
			webElement.click();
						
			webElement = driver.findElement(By.xpath(".//*[@id='profile-privacy-form']/div[2]/form/table/tbody/tr[4]/td[1]/label"));
			webElement.click();
			
			webElement = driver.findElement(By.name("privacyForm.save"));
			webElement.click();
			
			
			
	   }
	  
}
