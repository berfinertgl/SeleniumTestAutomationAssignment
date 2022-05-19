package pages;

import driver.MainTest;
import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {

    Methods methods;
    WebDriver driver;

    public AddressPage() {

        methods = new Methods();
        driver = MainTest.driver;
    }

    public void goToAddress() {
        methods.click(By.cssSelector(".fa.fa-map-marker.fa-fw"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".right"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.id("address-firstname-companyname"));
        methods.sendKeys(By.id("address-firstname-companyname"),"asdf");
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.id("address-lastname-title"));
        methods.sendKeys(By.id("address-lastname-title"),"qwert");
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.id("address-zone-id"));
        methods.selectByText(By.id("address-zone-id"),"İzmir");
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.id("address-county-id"));
        methods.selectByText(By.id("address-county-id"),"BUCA");
        methods.scrollWithAction(By.id("address-address-text"));
        methods.sendKeys(By.id("address-address-text"),"atatürk mahallesi, daire:12");
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.id("address-postcode"));
        methods.sendKeys(By.id("address-postcode"),"35000");
        methods.scrollWithAction(By.id("address-mobile-telephone"));
        methods.sendKeys(By.id("address-mobile-telephone"),"5055555055");
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.cssSelector(".right"));
        methods.click(By.cssSelector(".right"));

        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@title='kitapyurdu.com']"));
        methods.waitBySeconds(2);

        String beklenen = ("Kart numarası geçersiz. Kontrol ediniz!");
        //Assert.assertEquals("Test failed",beklenen,methods.getText());


    }
}


