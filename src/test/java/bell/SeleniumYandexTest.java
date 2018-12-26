package bell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class SeleniumYandexTest {

    public static void main(String[] args) throws MalformedURLException {
        URL chromeDriverUrl = new URL("http://localhost:9515");
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new RemoteWebDriver(new ChromeOptions());
        WebDriver driver = new RemoteWebDriver(chromeDriverUrl, new ChromeOptions()); // открываем хром
        driver.manage().window().maximize(); // разворачиваем окно
        driver.get("https://yandex.ru/"); // идем на яндекс

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ждем прогрузки
        driver.findElement(By.linkText("Маркет")).click(); // жмем на маркет
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ждем прогрузки

        // в этой части мы зависаем над элементом чтобы прогрузилось выпадающие окно
        Actions hover = new Actions(driver);
        hover.moveToElement(driver.findElement(By.linkText("Компьютерная техника"))).build().perform();

        //альтернтивный вариант зайти в раздел комп.техники и оттуда в компьютеры
//        driver.findElement(By.linkText("Компьютерная техника")).click(); // жмем на маркет
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ждем прогрузки

        driver.findElement(By.linkText("Компьютеры")).click(); // жмем на Компьютеры
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ждем прогрузки

        driver.findElement(By.linkText("Ноутбуки")).click(); // жмем на Ноутбуки
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ждем прогрузки
    }
}
