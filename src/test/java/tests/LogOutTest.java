package tests;

import driver.MainTest;
import org.junit.Test;
import pages.LogOutPage;

public class LogOutTest extends MainTest {

    @Test
    public void logOutTest() {
        LogOutPage logOutPage = new LogOutPage();
        logOutPage.logOut();
    }
}
