package examples.parallelJUnitTests.tests;

import examples.parallelJUnitTests.fixture.Fixture;
import examples.parallelJUnitTests.fixture.Parallelized;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

import java.util.List;

@RunWith(Parallelized.class)
public class Test01 extends Fixture {

    private WebDriver driver;

    public Test01(WebDriver driver) {
        this.driver = driver;
    }

    @Parameters
    public static List<WebDriver> data() {
        driversFromFixture = addDrivers();
        return driversFromFixture;
    }

    @Test
    public void test01() {
        driver.get("http://www.testurl.com/");
    }

    @Test
    public void test02() {
        driver.get("http://www.google.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void test03() {
        driver.get("http://www.github.com");
        System.out.println(driver.getTitle());
    }

}
