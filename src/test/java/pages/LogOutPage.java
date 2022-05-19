package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class LogOutPage {

    Methods methods;

    public LogOutPage() {
        methods = new Methods();
    }

    public void logOut(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        methods.mouseHover(By.cssSelector(".menu.top.login"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//a[text()='Çıkış']"));
        methods.waitBySeconds(3);
    }

}
