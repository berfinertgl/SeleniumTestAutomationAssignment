package tests;

import driver.MainTest;
import org.junit.Test;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends MainTest {

 //   LoginPage loginPage = new LoginPage();
  //  HomePage homePage = new HomePage();

    @Test
    public void getLoginTextTest() {

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.login();
        homePage.loginControlText();
    }
    @Test
    public void searchProduct() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.login();
        homePage.searchProduct();
    }

    @Test
    public void rateProduct() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.login();
        homePage.rateProduct();
        homePage.favouriteControl();
    }

    @Test
    public void sepeteGit() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.login();
        homePage.goToPacket();
       // homePage.creditCardInfo();
    }
    @Test
    public void goToHobiPage() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
       // loginPage.login();
        homePage.goToHobiPage();
        homePage.randomAdd();
    }
}
