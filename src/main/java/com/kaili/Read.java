package com.kaili;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Read {
    public static WebDriver driver;
    //封装driver

    public static void openBaidu() throws InterruptedException {
        //封装打开首页
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        String Url = "https://www.baidu.com/";
        ChromeOptions options=new ChromeOptions();
        //下面这段代码 是你浏览器的所在位置 不加这段代码的话 本地是可以跑的但是放在jenkins 上 会报错误找不到谷歌浏览器
        options.setBinary("D:\\Program Files\\Chrome\\Application\\chrome.exe");
        driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Url);
        // driver.manage().window().maximize();
        Thread.sleep(2000);
        }

public static void refresh(){
        //封装刷vigate().refresh();
        }

public static void quit(){
        //封装结束driver
        driver.quit();
        }

        }