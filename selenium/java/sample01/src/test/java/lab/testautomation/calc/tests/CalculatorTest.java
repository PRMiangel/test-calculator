package lab.testautomation.calc.tests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalculatorTest {

    private static WebDriver wd;

    @BeforeClass
    public static void runBeforeAllTests() {
        wd = new FirefoxDriver();
        wd.get("http://narulakeshav.github.io/calculator/");
        wd.manage().window().maximize();
    }

    @AfterClass
    public static void runAfterAllTests() {
        wd.quit();
    }

    @Before
    public void runBeforeTest() {
        wd.navigate().refresh();
    }

    @After
    public void runAfterTest() {
    }

    @Test
    public void additionTest() {
        wd.findElement(By.id("four")).click();
        wd.findElement(By.id("add")).click();
        wd.findElement(By.id("four")).click();
        wd.findElement(By.id("equals")).click();
        Assert.assertEquals("8", wd.findElement(By.id("display")).getText());
    }

    @Test
    public void subtractionTest() {
        wd.findElement(By.id("four")).click();
        wd.findElement(By.id("subtract")).click();
        wd.findElement(By.id("four")).click();
        wd.findElement(By.id("equals")).click();
        Assert.assertEquals("0", wd.findElement(By.id("display")).getText());
    }

    @Test
    public void multiplicationTest() {
        wd.findElement(By.id("four")).click();
        wd.findElement(By.id("multiply")).click();
        wd.findElement(By.id("four")).click();
        wd.findElement(By.id("equals")).click();
        Assert.assertEquals("16", wd.findElement(By.id("display")).getText());
    }

    @Test
    public void divisionTest() {
        wd.findElement(By.id("four")).click();
        wd.findElement(By.id("divide")).click();
        wd.findElement(By.id("four")).click();
        wd.findElement(By.id("equals")).click();
        Assert.assertEquals("1", wd.findElement(By.id("display")).getText());
    }
}
