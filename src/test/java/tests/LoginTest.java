package tests;

import driver.MainTest;
import org.junit.Test;
import pages.LoginPage;

public class LoginTest extends MainTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
