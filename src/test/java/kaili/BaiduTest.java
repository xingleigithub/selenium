package kaili;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class BaiduTest {
    @BeforeSuite
    public void beoreMethod() throws InterruptedException {
        Read.openBaidu();
    }

    @org.testng.annotations.Test
    public void login() throws InterruptedException {
        Read.driver.findElement(By.name("username")).clear();
        Read.driver.findElement(By.name("username")).sendKeys("admin");
        Read.driver.findElement(By.name("password")).clear();
        Read.driver.findElement(By.name("password")).sendKeys("123456");
        Read.driver.findElement(By.xpath("//*[@id=\"form\"]/button")).click();
        Thread.sleep(1000);
        Read.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/div/ul/div/li[2]/div")).click();
        Read.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/div[1]/div/div/ul/div/li[2]/ul/div[1]/li/li")).click();



        Thread.sleep(2000);
        //此处做判断就是搜索内容必须包含上面内容给
        Assert.assertTrue(true);
        Reporter.log("模拟中小物流平台测试");
    }

    @AfterMethod
    public void afterMethod() {
       // Read.refresh();
    }



}
