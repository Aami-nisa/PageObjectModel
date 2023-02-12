package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	
	public static RemoteWebDriver driver;
	
	int i=1;

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
	  try {
		if(browser.equalsIgnoreCase("chrome"))  {
			  
			  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			  driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		  driver.manage().window().maximize();
		  
		  driver.get(url);
		  
		  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  
		  //System.out.println("The browser "+browser+" is launched with the given url "+url+" successfully");
		  
		  reportStep("The browser "+browser+" is launched with the given url "+url+" successfully", "pass");
		  
	} catch (SessionNotCreatedException e) {
		// TODO Auto-generated catch block
		
		//System.err.println("The browser "+browser+" is not launched with the given url "+url+" due to session not created successfully" );
		
		reportStep("The browser "+browser+" is not launched with the given url "+url+" due to session not created successfully" , "fail");
		
	} catch (InvalidArgumentException e) {
		// TODO: handle exception
		
		//System.err.println("The browser "+browser+"is not launched as the url "+url+" doesn't contain http/https" );
		
		reportStep("The browser "+browser+"is not launched as the url "+url+" doesn't contain http/https" ,"fail");
				
	} catch (WebDriverException e) {
		// TODO: handle exception
		
		//System.err.println("The browser "+browser+" is not launched due to unknown error");
		
		reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
	} 
	  
}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with id "+idValue+" is not visible in the application");
			
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			
			reportStep("The element with id "+idValue+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			
			reportStep("The element with id "+idValue+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
		
			reportStep("The element with id \"+idValue+\" is not entered with data \"+data+\" due to unknown error", "Fail");
		}
		
}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			//System.out.println("The element with name "+nameValue+" is entered with data"+data);
			
			reportStep("The element with name "+nameValue+" is entered with data"+data, "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			
			reportStep("The element with name "+nameValue+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with name "+nameValue+" is not visible in the application");
			
			reportStep("The element with name "+nameValue+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			
			reportStep("The element with name "+nameValue+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			
			reportStep("The element with name "+nameValue+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+nameValue+" is not entered with data  due to unknown error");
			
			reportStep("The element with name "+nameValue+" is not entered with data  due to unknown error", "Fail");
		}
		
}
	

	public void enterByXpath(String xpathValue, String Data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(Data);
			
			//System.out.println("The element with xpath "+xpathValue+" is entered with data"+Data);
			
			reportStep("The element with xpath "+xpathValue+" is entered with data"+Data, "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with xpath "+xpathValue+" is not visible in the application");
			
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathValue+"is not entered with data"+Data+" due to unknown error");
			
			reportStep("The element with xpath "+xpathValue+"is not entered with data"+Data+" due to unknown error", "Fail");		
		}
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String actualtitle = driver.getTitle();
			
			if (actualtitle.equals(title)) {
				//System.out.println("The title of the page "+actualtitle+" is matched with expected title"+title+"");
				
				reportStep("The title of the page "+actualtitle+" is matched with expected title"+title+"", "Pass");
			}else   {
				//System.err.println("The title of the page "+actualtitle+" is not matched with expected title "+title+"");
				
				reportStep("The title of the page "+actualtitle+" is not matched with expected title "+title+"", "Fail");
				
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+" is not verified due to unknown error");
			
			reportStep("The title of the page "+title+" is not verified due to unknown error", "Fail");
		}
		
}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualtext = driver.findElementById(id).getText();
			
			if (actualtext.equals(text))  {
				//System.out.println("The element with id "+id+" is holding the text "+actualtext+" is matched with expected text"+text+"");
			  
				reportStep("The element with id "+id+" is holding the text "+actualtext+" is matched with expected text "+text+"", "Fail");
			}else
				//System.err.println("The element with id "+id+" is holding the text "+actualtext+" is not matched with expected text"+text+"");
			
				reportStep("The element with id "+id+" is holding the text "+actualtext+" is not matched with expected text"+text+"", "Fail");			
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not interactable in the application");
			
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable in the application");
			
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is holding the text "+text+" is not matched with expected text"+text+" due to unknown error");
			
			reportStep("The element with id "+id+" is holding the text "+text+" is not matched with expected text"+text+" due to unknown error", "Fail");
		}
		
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			
			if (actualtext.equals(text))  {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with expected text"+text+"");
				
				reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is matched with expected text"+text+"", "Pass");
			
			}else
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualtext+" is not matched with expected text"+text+"");
			
				reportStep("The element with xpath "+xpath+" is holding the text "+actualtext+" is not matched with expected text"+text+"", "Fail");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with xpath "+xpath+" is not visible in the application");
			
			reportStep("The element with xpath "+xpath+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			
			reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" is holding the text "+text+"is not matched with expected text"+text+" due to unknown error");
			
			reportStep("The element with xpath "+xpath+" is holding the text "+text+"is not matched with expected text"+text+" due to unknown error", "Fail");
		}
			
		}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			
			if (actualtext.contains(text))  {
				//System.out.println("The element with xpath "+xpath+" contains the text "+actualtext+"is matched with the expected text"+text+"");
				
				reportStep("The element with xpath "+xpath+" contains the text "+actualtext+"is matched with the expected text"+text+"", "Pass");
			
			}else 
				//System.err.println("The element with xpath "+xpath+" contains the text "+actualtext+"is not matched with the expected text"+text+"");
			
				reportStep("The element with xpath "+xpath+" contains the text "+actualtext+"is not matched with the expected text"+text+"", "Fail");
		
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
            
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with xpath "+xpath+" is not visible in the application");
			
			reportStep("The element with xpath "+xpath+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
		//	System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
		//	System.err.println("The element with xpath "+xpath+" is not stable in the application");
			
			reportStep("The element with xpath "+xpath+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpath+" contains the text "+text+"is not matched with expected text"+text+"due to unknown error");
			
			reportStep("The element with xpath "+xpath+" contains the text "+text+"is not matched with expected text"+text+"due to unknown error", "Fail");
		}
		}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(id).click();
			
			//System.out.println("The element with id "+id+" is clicked");
			
			reportStep("The element with id "+id+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not interactable in the application");
			
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable in the application");
			
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			
			reportStep("The element with id "+id+" is not clicked due to unknown error", "Fail");
		
		}
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(classVal).click();
			
			//System.out.println("The element with classname "+classVal+" is clicked");
			
			reportStep("The element with classname "+classVal+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with classname "+classVal+" is not found in the DOM");
			
			reportStep("The element with classname "+classVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with classname "+classVal+" is not visible in the application");
			
			reportStep("The element with classname "+classVal+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with classname "+classVal+" is not interactable in the application");
			
			reportStep("The element with classname "+classVal+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with classname "+classVal+" is not stable in the application");
			
			reportStep("The element with classname "+classVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			System.err.println("The element with classname "+classVal+" is not clicked due to unknown error");
			reportStep("The element with classname "+classVal+" is not clicked due to unknown error", "Fail");
		
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(name).click();
			
			//System.out.println("The element with name "+name+" is clicked");
			
			reportStep("The element with name "+name+" is clicked", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with name "+name+" is not found in the DOM");
			
			reportStep("The element with name "+name+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with name "+name+" is not visible in the application");
			
			reportStep("The element with name "+name+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
		//	System.err.println("The element with name "+name+" is not interactable in the application");
			
			reportStep("The element with name "+name+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+name+" is not stable in the application");
			
			reportStep("The element with name "+name+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			System.err.println("The element with name "+name+" is not clicked due to unknown error");
			
			reportStep("The element with name "+name+" is not clicked due to unknown error", "Fail");
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with linktext "+name+" is clicked");
			reportStep("The element with linktext "+name+" is clicked", "Fail");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with linktext "+name+" is not found in the DOM");
			reportStep("The element with linktext "+name+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with linktext "+name+" is not visible in the application");
			reportStep("The element with linktext "+name+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with linktext "+name+" is not stable in the application");
			reportStep("The element with linktext "+name+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with linktext "+name+" is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error", "Fail");
		
		}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with linktext "+name+" is clicked");
			
			reportStep("The element with linktext "+name+" is clicked", "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with linktext "+name+" is not found in the DOM");
			
			reportStep("The element with linktext "+name+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with linktext "+name+" is not visible in the application");
			
			reportStep("The element with linktext "+name+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			
			reportStep("The element with linktext "+name+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with linktext "+name+" is not stable in the application");
			
			reportStep("The element with linktext "+name+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			System.err.println("The element with linktext "+name+" is not clicked due to unknown error");
			
			reportStep("The element with linktext "+name+" is not clicked due to unknown error", "Fail");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			
			reportStep("The element with xpath "+xpathVal+" is clicked", "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with xpath "+xpathVal+" is not visible in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "Fail");
		
		}

	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			
			reportStep("The element with xpath "+xpathVal+" is clicked", "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.out.println("The element with xpath "+xpathVal+" is not visible in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
		    
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "Fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		
		String text = null;
		
		try {
			text = driver.findElementById(idVal).getText();
			if (text.equals(text))  {
				//System.out.println("The element with id "+idVal+" is holding the text "+text);
				reportStep("The element with id "+idVal+" is holding the text "+text, "Pass");
			}else
				//System.err.println("The element with id "+idVal+" is not holding the text "+text);
			    reportStep("The element with id "+idVal+" is not holding the text "+text, "Fail");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
			
			reportStep("The element with id "+idVal+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			
			reportStep("The element with id "+idVal+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			
			reportStep("The element with id "+idVal+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			
			reportStep("The element with id "+idVal+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not holding the actualtext due to unknown reason");
			
			reportStep("The element with id "+idVal+" is not holding the actualtext due to unknown reason", "Fail");
		}		return text;

	}
		     
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		String text = null;
		
		try {
			text = driver.findElementByXPath(xpathVal).getText();
			if (text.equals(text))  {
				//System.out.println("The element with xpath "+xpathVal+" is holding the text "+text);
				reportStep("The element with xpath "+xpathVal+" is holding the text "+text, "Pass");
			
			}else
				//System.err.println("The element with xpath "+xpathVal+" is not holding the text "+text);
			     reportStep("The element with xpath "+xpathVal+" is not holding the text "+text, "Fail");
		
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "Fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "Fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "Fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "Fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with xpath "+xpathVal+" is not holding the actualtext due to unknown reason");
			
			reportStep("The element with xpath "+xpathVal+" is not holding the actualtext due to unknown reason", "Fail");
		}
		
		return text;

	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement sec = driver.findElementById(id);
			Select sel = new Select(sec);
			sel.selectByVisibleText(value);
			
			//System.out.println("The element with id "+id+" is selected through visibletext ");
			reportStep("The element with id "+id+" is selected through visibletext", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not selected  due to unknown error");
			reportStep("The element with id "+id+" is not selected  due to unknown error", "Fail");
		
		}
		}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement sec = driver.findElementById(id);
			Select sel = new Select(sec);
			sel.selectByIndex(value);
			
			//System.out.println("The element with id "+id+" is selected through indexvalue "+value+"");
			reportStep("The element with id "+id+" is selected through indexvalue "+value+"", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not selected through indexvalue "+value+"  due to unknown error");
			reportStep("The element with id "+id+" is not selected through indexvalue "+value+"  due to unknown error", "Fail");
		
		}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		try {
			
			Set<String>allwinIdsAfterClick = driver.getWindowHandles();
			
			for (String eachId : allwinIdsAfterClick)    {
				driver.switchTo().window(eachId);
				break;
				}
			
			//System.out.println("The windowid has been switch to parentwindow");
			reportStep("The windowid has been switch to parentwindow", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("There is no window available with the given windowid");
			reportStep("There is no window available with the given windowid", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The window has not been switch to parent window due to unknown error");
			reportStep("The window has not been switch to parent window due to unknown error", "Fail");
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String>allwinIdsAfterClick = driver.getWindowHandles();
			
			for (String eachId : allwinIdsAfterClick)    {	
				driver.switchTo().window(eachId);
				}
			
			//System.out.println("The windowid has been switch to Lastwindow");
			reportStep("The windowid has been switch to Lastwindow", "Pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("There is no window available with the given windowid");
			reportStep("There is no window available with the given windowid", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The window has not been switch to lastwindow due to unknown error");
			reportStep("The window has not been switch to lastwindow due to unknown error", "Fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().accept();
			
			//System.out.println("The alert which is opened is accepted");
			reportStep("The alert which is opened is accepted", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The alert is not available to accept");
			reportStep("The alert is not available to accept", "Fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			
			//System.err.println("The alert is not able to handle ");
			reportStep("The alert is not able to handle ", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The alert is not able to accept due to unknown error");
			reportStep("The alert is not able to accept due to unknown error", "Fail");
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().dismiss();
			
			//System.out.println("The alert which is opened is cancelled");
			reportStep("The alert which is opened is cancelled", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The alert is not available to cancel");
			reportStep("The alert is not available to cancel", "Fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			
			//System.err.println("The alert is not able to handle ");
			reportStep("The alert is not able to handle ", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The alert is not able to cancel due to unknown error");
			reportStep("The alert is not able to cancel due to unknown error", "Fail");
		}
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
		String alerttext = null;
		
		try {
		   alerttext = driver.switchTo().alert().getText();
			
			//System.out.println("The alerttext is holding the text "+alerttext+"  ");
			reportStep("The alerttext is holding the text "+alerttext+"  ", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The given alert is not available to get the alerttext");
			reportStep("The given alert is not available to get the alerttext", "Fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			
			//System.err.println("The given alert is not able to handle ");
			reportStep("The given alert is not able to handle ", "Fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The given alert is not able to get the alerttext due to unknown error");
			reportStep("The given alert is not able to get the alerttext due to unknown error", "Fail");
		}
		
		return alerttext;
		
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
	   
		try {
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/snap"+i+".png");
			FileUtils.copyFile(tmp, dest);
			
			//System.out.println("The screenshot has been taken successfully");
			reportStep("The screenshot has been taken successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("Unable to take screenshot due to unknow error ");
			reportStep("Unable to take screenshot due to unknow error ", "Fail");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
		i=i+1;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
		try {
			driver.close();
			//System.out.println("The browser has been closed successfully");
			reportStep("The browser has been closed successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			
			System.err.println("The browser is not able to close due to unknown error");
			reportStep("The element with name \"+nameValue+\" is not entered with data  due to unknown error", "Fail");
		
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
		try {
			driver.quit();
			//System.out.println("All the browsers are closed successfully");
			reportStep("All the browsers are closed successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The browsers are not able to close due to unknown error");
			reportStep("The browsers are not able to close due to unknown error", "Fail");
		
		}
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
      public void selectVisibileTextByXpath(String XpathVal, String value)  {
		
		try {
			WebElement sec = driver.findElementByXPath(XpathVal);
			Select sel = new Select(sec);
			sel.selectByVisibleText(value);
			
			//System.out.println("The element with id "+XpathVal+" is selected through visibletext ");
			reportStep("The element with id "+XpathVal+" is selected through visibletext", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		
			//System.err.println("The element with id "+XpathVal+" is not found in the DOM");
			reportStep("The element with id "+XpathVal+" is not found in the DOM", "Fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+XpathVal+" is not visible in the application");
			reportStep("The element with id "+XpathVal+" is not visible in the application", "Fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+XpathVal+" is not interactable in the application");
			reportStep("The element with id "+XpathVal+" is not interactable in the application", "Fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+XpathVal+" is not stable in the application");
			reportStep("The element with id "+XpathVal+" is not stable in the application", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+XpathVal+" is not selected  due to unknown error");
			reportStep("The element with id "+XpathVal+" is not selected  due to unknown error", "Fail");
		}

		}

      public void pagedown() {
    	  
    	  try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }

      
      public void selectVisibileTextByName(String nameval, String value) {
  		// TODO Auto-generated method stub
  		
  		try {
  			WebElement sec = driver.findElementByName(nameval);
  			Select sel = new Select(sec);
  			sel.selectByVisibleText(value);
  			
  			//System.out.println("The element with name "+nameval+" is selected through visibletext ");
  			reportStep("The element with name "+nameval+" is selected through visibletext", "Pass");
  		} catch (NoSuchElementException e) {
  			// TODO Auto-generated catch block
  		
  			//System.err.println("The element with name "+nameval+" is not found in the DOM");
  			reportStep("The element with name "+nameval+" is not found in the DOM", "Fail");
  		}catch (ElementNotVisibleException e) {
  			// TODO: handle exception
  			
  			//System.err.println("The element with name "+nameval+" is not visible in the application");
  			reportStep("The element with name "+nameval+" is not visible in the application", "Fail");
  		}catch (ElementNotInteractableException e) {
  			// TODO: handle exception
  			
  			//System.err.println("The element with name "+nameval+" is not interactable in the application");
  			reportStep("The element with name "+nameval+" is not interactable in the application", "Fail");
  		}catch (StaleElementReferenceException e) {
  			// TODO: handle exception
  			
  			//System.err.println("The element with name "+nameval+" is not stable in the application");
  			reportStep("The element with name "+nameval+" is not stable in the application", "Fail");
  		}catch (WebDriverException e) {
  			// TODO: handle exception
  			
  			//System.err.println("The element with name "+nameval+" is not selected  due to unknown error");
  			reportStep("The element with name "+nameval+" is not selected  due to unknown error", "Fail");
  		
  		}
      }
      
      public void selectValueById(String id, String value) {
  		// TODO Auto-generated method stub
  		
  		try {
  			WebElement sec = driver.findElementById(id);
  			Select sel = new Select(sec);
  			sel.selectByValue(value);
  			
  			//System.out.println("The element with id "+id+" is selected through value ");
  			reportStep("The element with id "+id+" is selected through value ", "Pass");
  		} catch (NoSuchElementException e) {
  			// TODO Auto-generated catch block
  		
  			//System.err.println("The element with id "+id+" is not found in the DOM");
  			reportStep("The element with id "+id+" is not found in the DOM", "Fail");
  		}catch (ElementNotVisibleException e) {
  			// TODO: handle exception
  			
  			//System.err.println("The element with id "+id+" is not visible in the application");
  			reportStep("The element with id "+id+" is not visible in the application", "Fail");
  		}catch (ElementNotInteractableException e) {
  			// TODO: handle exception
  			
  			//System.err.println("The element with id "+id+" is not interactable in the application");
  			reportStep("The element with id "+id+" is not interactable in the application", "Fail");
  		}catch (StaleElementReferenceException e) {
  			// TODO: handle exception
  			
  			//System.err.println("The element with id "+id+" is not stable in the application");
  			reportStep("The element with id "+id+" is not stable in the application", "Fail");
  		}catch (WebDriverException e) {
  			// TODO: handle exception
  			
  			//System.err.println("The element with id "+id+" is not selected  due to unknown error");
  			reportStep("The element with id "+id+" is not selected  due to unknown error", "Fail");
  		}
      }
        
        public void switchtoframebyId(String Idval)  {
        	
        	try {
				driver.switchTo().frame(Idval);
				
				//System.out.println("The element with id "+Idval+" has successfully switch to a frame");
				reportStep("The element with id "+Idval+" has successfully switch to a frame", "Pass");
			} catch (NoSuchFrameException e) {
				// TODO Auto-generated catch block
				
				//System.err.println("NO such frame is found with the given id "+Idval+" ");
				reportStep("NO such frame is found with the given id "+Idval+"", "Fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				
				//System.out.println("The element with id "+Idval+" is not switch to a frame due to unknown error");
				reportStep("The element with id "+Idval+" is not switch to a frame due to unknown error", "Fail");
			}
			
        }
      
       public void switchoutofframe()  {
    	   
    	   try {
			driver.switchTo().defaultContent();
			
			//System.out.println("It is successfully switch out of the frame ");
			reportStep("It is successfully switch out of the frame ", "Pass");
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("NO such frame is found ");
			reportStep("NO such frame is found", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.out.println("Not able to switch out of the frame due to unknown error");
			reportStep("Not able to switch out of the frame due to unknown error", "Fail");
       }
       }

       public void enteralerttext(String val)  {
    	   
    	   try {
			driver.switchTo().alert().sendKeys(val);
			
			//System.out.println("The text has been entered successfully");
			reportStep("The text has been entered successfully", "Pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		    
			//System.err.println("The given alert is not available to get the alerttext");
			reportStep("The given alert is not available to get the alerttext", "Fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.out.println("The text is not entered due to unknown error");
			reportStep("The text is not entered due to unknown error", "Fail");
       }
       }

      public void refreshbrowser()   {
    	  
    	  try {
			driver.navigate().refresh();
			
			//System.out.println("The browser has been refreshed successfully");
			reportStep("The browser has been refreshed successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			
			
			//System.err.println("The browser has not been refreshed due to unknown error");
			reportStep("The browser has not been refreshed due to unknown error", "Fail");
		
		}
    	  
    	 
      }
      
      
      
	  public void MouseHoverByXPath(String xpath)  {
		  
		 
	     try {
			WebElement sez = driver.findElementByXPath(xpath);
				
			 Actions builder = new Actions(driver);
				
			builder.moveToElement(sez).perform(); 
			
			//System.out.println("The MouseHover Action has been performed Sucessfully");
			reportStep("The MouseHover Action has been performed Sucessfully", "Pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The MouseHover Action was not able Perform due to unknown error");
			reportStep("The MouseHover Action was not able Perform due to unknown error", "Fail");
		
		}
	    
	  }


	  public void selectValueByXpath(String xpathval, String value) {
	  		// TODO Auto-generated method stub
	  		
	  		try {
	  			WebElement sec = driver.findElementByXPath(xpathval);
	  			Select sel = new Select(sec);
	  			sel.selectByValue(value);
	  			
	  			//System.out.println("The element with id "+xpathval+" is selected through value ");
	  			reportStep("The element with id "+xpathval+" is selected through value", "Pass");
	  		} catch (NoSuchElementException e) {
	  			// TODO Auto-generated catch block
	  		
	  			//System.err.println("The element with id "+xpathval+" is not found in the DOM");
	  			reportStep("The element with id "+xpathval+" is not found in the DOM", "Fail");
	  		}catch (ElementNotVisibleException e) {
	  			// TODO: handle exception
	  			
	  			//System.err.println("The element with id "+xpathval+" is not visible in the application");
	  			reportStep("The element with id "+xpathval+" is not visible in the application", "Fail");
	  		}catch (ElementNotInteractableException e) {
	  			// TODO: handle exception
	  			
	  			//System.err.println("The element with id "+xpathval+" is not interactable in the application");
	  			reportStep("The element with id "+xpathval+" is not interactable in the application", "Fail");
	  		}catch (StaleElementReferenceException e) {
	  			// TODO: handle exception
	  			
	  			//System.err.println("The element with id "+xpathval+" is not stable in the application");
	  			reportStep("The element with id "+xpathval+" is not stable in the application", "Fail");
	  		}catch (WebDriverException e) {
	  			// TODO: handle exception
	  			
	  			System.err.println("The element with id "+xpathval+" is not selected  due to unknown error");
	  			reportStep("The element with id "+xpathval+" is not selected  due to unknown error", "Fail");
	  		
	  		}
	      }
	  
	  public void switchtoframebyXpath(String Xpathval)  {
      	
      	try {
      		
      			WebElement element = driver.findElementByXPath(Xpathval);
      			
				driver.switchTo().frame(element);
				
				//System.out.println("The element with id "+Xpathval+" has successfully switch to a frame");
				reportStep("The element with id "+Xpathval+" has successfully switch to a frame", "Pass");
			} catch (NoSuchFrameException e) {
				// TODO Auto-generated catch block
				
				//System.err.println("NO such frame is found with the given id "+Xpathval+" ");
				reportStep("NO such frame is found with the given id "+Xpathval+"", "Fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				
				//System.out.println("The element with id "+Xpathval+" is not switch to a frame due to unknown error");
				reportStep("The element with id "+Xpathval+" is not switch to a frame due to unknown error", "Fail");
			
			}
			
      }
    
}








