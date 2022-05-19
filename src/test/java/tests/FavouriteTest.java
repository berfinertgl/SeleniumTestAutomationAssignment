package tests;

import driver.MainTest;
import org.junit.Test;
import pages.FavouritePage;
import pages.LoginPage;

public class FavouriteTest extends MainTest {

    @Test
    public void FavouriteTest() {
        LoginPage loginPage = new LoginPage();
        FavouritePage favouritePage = new FavouritePage();
        loginPage.login();
        favouritePage.goToFavouritePage();
        favouritePage.deleteFavourite();

    }
}
