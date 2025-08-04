package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By userIdInput = By.id("Email");
	private By passwordInput = By.name("Password");
	private By loginButton = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/form/button");
	private By eyeIcon = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/form/div[2]/img");
	private By errorMsg = By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/p");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String userId) {
		
		driver.findElement(userIdInput).clear();
		driver.findElement(userIdInput).sendKeys(userId);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(passwordInput).clear();
		driver.findElement(passwordInput).sendKeys(password);
	}

	public void clickLogin() {
		
		
		driver.findElement(loginButton).click();
	}
	
	public void clickEyeIcon() {
        driver.findElement(eyeIcon).click();
    }

	 public boolean isLoginButtonEnabled() {
	        return driver.findElement(loginButton).isEnabled();
    }

	 public boolean isPasswordMasked() {
	        String type = driver.findElement(passwordInput).getAttribute("type");
	        return type.equals("password");
	 }
	 
	 public String getErrorMessage() {
	        return driver.findElement(errorMsg).getText();
	    }

	   

	 public boolean areAllElementsPresent() {
	       return driver.findElement(userIdInput).isDisplayed()
	            && driver.findElement(passwordInput).isDisplayed()
	            && driver.findElement(loginButton).isDisplayed()
	            && driver.findElement(eyeIcon).isDisplayed();
	    }
	}
	


