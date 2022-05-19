package pages;

import driver.MainTest;
import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavouritePage {

    Methods methods;
    WebDriver driver;

    public FavouritePage(){

        methods = new Methods();
        driver = MainTest.driver;
    }

    public void goToFavouritePage() {
       // methods.mouseHover(By.cssSelector(".menu.top.my.list"));
        methods.click(By.xpath("//a[text()='Listelerim']"));
        methods.waitBySeconds(2);
      //  methods.click(By.xpath("//a[text()='Hobi']"));
        methods.click(By.xpath("//a[text()='Favorilerim']"));
        methods.waitBySeconds(5);

    }

    public void deleteFavourite() {
        if(methods.isElementVisible(By.cssSelector(".sprite.sprite-icon-list"))) {
            methods.click(By.cssSelector(".sprite.sprite-icon-list"));
        }

        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart-o'])[4]"));
       // methods.waitBySeconds(2);
        //methods.click(By.xpath("(//*[@class='fa fa-heart-o'])[3]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='fa fa-heart-o'])[3]"));
        methods.waitBySeconds(3);

    }
}
