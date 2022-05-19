package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.click(By.cssSelector(".menu-top-button.login"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-email"),"berfin.ertgl@hotmail.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"120317Berfin");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn")); //2-Login olunur
        methods.waitBySeconds(10);
    }
}
