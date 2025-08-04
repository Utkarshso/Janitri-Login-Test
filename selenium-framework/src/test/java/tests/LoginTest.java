package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Basetest;
import pages.LoginPage;

public class LoginTest extends Basetest {
	
	
	@Test
	public void testValidLogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		
		Assert.assertFalse(loginPage.isLoginButtonEnabled(), "Login button should be disabled when fields are empty");
		
	}

	@Test
    public void testPasswordMaskedButton() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterPassword("testPassword");
        Assert.assertTrue(loginPage.isPasswordMasked(), "Password should be masked initially");
        loginPage.clickEyeIcon();
        Assert.assertFalse(loginPage.isPasswordMasked(), "Password should be unmasked after toggle");
    }

    @Test
    public void testInvalidLoginShowsErrorMessage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("temp@email.com");
        loginPage.enterPassword("password");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.getErrorMessage().length() > 0, "Error message should appear on invalid login");
        System.out.println("Captured Error Message: " + loginPage.getErrorMessage());
    }

    @Test
    public void testPresenceOfAllElements() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.areAllElementsPresent(), "All required elements should be present on the page");
    }
}
