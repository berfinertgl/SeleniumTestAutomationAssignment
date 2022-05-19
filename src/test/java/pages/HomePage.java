package pages;

import driver.MainTest;
import methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HomePage {

    Methods methods;
    Logger logger = LogManager.getLogger(HomePage.class);

    JavascriptExecutor jsdriver;

    WebDriver driver;
    public HomePage() {

        driver = MainTest.driver;
        methods = new Methods();
        jsdriver = (JavascriptExecutor) driver;

    }

    public void loginControlText() { //3-Sayfaya login kontrolü
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: "+text);
        logger.info("Alınan text: " + text);
        methods.waitBySeconds(2);

    }

    public void favouriteControl() {
        //Favorilere ekleme kontrolü
        String element= "Ürün başarılı bir şekilde favorilerinize eklendi!";
        String mesaj = driver.findElement(By.cssSelector(".swal2-title")).getText();
        Assert.assertEquals(mesaj,element,"Ürün başarılı bir şekilde favorilerinize eklendi!");
    }

    public void searchProduct() { //4-Oyuncak ürünü aratma
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//span[@class='common-sprite button-search']"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//div[@class='product-cr'][7]")); //7.ürüne scroll
        methods.waitBySeconds(2);

        //4 ürün favoriye ekleme
        for(int i=5;i<9;i++) {
            methods.click(By.xpath("(//*[@class='fa fa-heart'])"+"["+ i+"]"));
        }
        methods.waitBySeconds(2);
        /*
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[5]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[6]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[7]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[8]"));
        methods.waitBySeconds(2);
*/
    }

    public void rateProduct() {
        methods.click(By.cssSelector(".logo-text")); //Anasayfaya dönüş
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".lvl1catalog>a"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(1);
        methods.selectByText(By.xpath("//select[@onchange='location = this.value;']"),"Yüksek Oylama");

    }

    public void goToHobiPage() {

        methods.click(By.xpath("//span[text()='Tüm Kitaplar']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[text()='Hobi']"));
        methods.waitBySeconds(5);
        methods.waitBySeconds(2);
    }

    public void goToPacket() { //sepete gidilir.
        methods.click(By.id("cart-items"));
        methods.waitBySeconds(1);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(1);
        driver.findElement(By.xpath("//input[@value='1']")).clear();
        driver.findElement(By.xpath("//input[@value='1']")).sendKeys("3");
        methods.waitBySeconds(5);
        methods.click(By.xpath("//td[@class='to-wishlist']"));
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(4);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(4);
     //   methods.click(By.id("button-checkout-continue"));
        methods.sendKeys(By.id("credit-card-owner"),"berf asdf");
        methods.sendKeys(By.id("credit_card_number_1"),"1111");
        methods.sendKeys(By.id("credit_card_number_2"),"1111");
        methods.sendKeys(By.id("credit_card_number_3"),"1111");
        methods.sendKeys(By.id("credit_card_number_4"),"1111");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("select#credit-card-expire-date-month"),"06");
        methods.selectByText(By.cssSelector("select#credit-card-expire-date-year"),"2027");
        methods.sendKeys(By.id("credit-card-security-code"),"456");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);

    }

    public void randomAdd() {
        List<WebElement> links = methods.getProducts(By.xpath("//*[@class='product-cr']"));
        int products = links.size();
        Random random = new Random();
        int randomProduct = random.nextInt(products);
        methods.scrollWithAction(links.get(randomProduct));
        links.get(randomProduct).click();
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(2);
    }
}
