package tests;

import driver.MainTest;
import org.junit.Test;
import pages.AddressPage;
import pages.HomePage;
import pages.LoginPage;

public class AddressPageTest extends MainTest {

    @Test
    public void goAddress() {
        LoginPage loginPage;
        loginPage = new LoginPage();
        AddressPage addressPage;
       // HomePage homePage = new HomePage();
        loginPage.login();
        addressPage = new AddressPage();
        addressPage.goToAddress();
    }
}
