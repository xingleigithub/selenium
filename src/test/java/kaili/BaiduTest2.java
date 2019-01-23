package kaili;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @Desc:
 * @author:xinglei
 * @Time: 2018/9/28 14:23
 * @Copyright: © 2018 杭州凯立通信有限公司 版权所有
 * @Warning: 本内容仅限于公司内部传阅, 禁止外泄或用于其它商业目的
 */
public class BaiduTest2 {
    @Test
    public void login_2() throws InterruptedException {
        WebElement webElement = Read.driver.findElement(By.xpath(".//*[@id='kw']"));
        webElement.clear();
        webElement.sendKeys("杭州凯立通信");
        Read.driver.findElement(By.xpath(".//*[@id='su']")).click();
        Thread.sleep(2000);

        Assert.assertTrue(true);
        Reporter.log("搜索杭州凯立通信的测试用例");
    }

    @AfterMethod
    public void afterMethod() {
        Read.refresh();
    }
}
