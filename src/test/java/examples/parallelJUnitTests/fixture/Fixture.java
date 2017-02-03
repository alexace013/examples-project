package examples.parallelJUnitTests.fixture;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(Parallelized.class)
public class Fixture {

    protected static List<WebDriver> driversFromFixture;

    @Parameters
    public static List<WebDriver> addDrivers() {
        List<WebDriver> drivers = new ArrayList<>();
        System.setProperty("webdriver.chrome.driver",
                "/home/tester-344/Workspace/webdrivers/chromedriver");
        drivers.add(new ChromeDriver());
        System.setProperty("webdriver.gecko.driver",
                "/home/tester-344/Workspace/webdrivers/geckodriver");
        drivers.add(new FirefoxDriver());
        return drivers;
    }

    @BeforeClass
    public static void setUp() {
        System.out.println("before class: " +
                Thread.currentThread().getName());
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("after class: " + Thread.currentThread().getName());
        Iterator<WebDriver> driverIterator = driversFromFixture.iterator();
        while (driverIterator.hasNext()) {
            driverIterator.next().quit();
            driverIterator.remove();
        }
    }

}
