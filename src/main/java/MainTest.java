import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.sql.SQLOutput;
import java.util.List;
import java.util.NoSuchElementException;

public class MainTest {


    @Test
    public void f() {
        //   driver.get("http://facebook.com");

        // WebDriverWait wait = new WebDriverWait(driver, 10);

        ////***********************************CssSelector************************************************

//        WebElement input=driver.findElement(By.tagName("input"));
//        input.sendKeys("mohamed samir");
//        WebElement i=driver.findElement(By.cssSelector("input.gNO89b"));
//        System.out.println(i.getTagName());


//          //   //  **************************Get all links on page*********************************************

//        List<WebElement>links=driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        Assert.assertEquals(19,links.size());
//        for (WebElement link:links) {
//           System.out.println(link.getAttribute("href"));
//
//        }

//        WebElement el=driver.findElement(By.linkText("English"));
//        System.out.println(el.getAttribute("href"));


        //// ******************************Navigations*****************************************************


//        driver.manage().window().maximize();
//        driver.navigate().to("http://youtube.com");
//       System.out.println(driver.getCurrentUrl());
//        driver.navigate().back();
//        System.out.println(driver.getCurrentUrl());
//        driver.navigate().forward();
//        System.out.println(driver.getCurrentUrl());
//        driver.navigate().refresh();


        ////*******************************************Navigations*********************************************************

//        driver.navigate().back();
//        driver.navigate().to("http://google.com");
//        driver.manage().window().maximize();
//        txt=driver.findElement(By.name("q"));
//        txt.clear();
//        txt.sendKeys("web driver");
//        txt.submit();
//        txt=driver.findElement(By.name("q"));
//        txt.clear();
//        txt.sendKeys("web driver book");
//        txt.submit();

        ////******************************************* Drop Down Menu*********************************************************


//        driver.manage().window().maximize();
//        driver.navigate().to("https://the-internet.herokuapp.com");
//        driver.findElement(By.linkText("Dropdown")).click();
//        Select listoptions = new Select(driver.findElement(By.id("dropdown")));
//        Assert.assertFalse(listoptions.isMultiple());
//        Assert.assertEquals(3,listoptions.getOptions().size());
//     //   listoptions.selectByVisibleText("Option 1");
//          listoptions.selectByValue("2");
//          Assert.assertEquals("Option 2",listoptions.getFirstSelectedOption().getText());
////        listoptions.selectByIndex(0);


        ////*********************************************Checkboxes***********************************************/********

        driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");

        WebElement check1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        check1.click();
        WebElement check2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
   //     if (check2.isSelected()) {
         //       check2.click();
//             }


            ////*********************************************WebTables*******************************************************

//        driver.navigate().to("https://the-internet.herokuapp.com/tables");
//        WebElement webtable=driver.findElement(By.id("table1"));
//        List<WebElement> rows=webtable.findElements(By.tagName("tr"));
//        Assert.assertEquals(5,rows.size());
//        for (WebElement row:rows)
//        {
//            List<WebElement> cols=row.findElements(By.tagName("td"));
//            for (WebElement col:cols)
//            {
//                System.out.print(col.getText()+"\t\t");
//            }
//            System.out.println();
//         driver.findElement(By.linkText("edit")).click();
//
//        }
//        driver.findElement(By.linkText("edit")).click();
//        //*[@id="table1"]/tbody/tr[1]/td[6]/a[1]
//        driver.findElement(By.linkText("delete")).click();


            ////*********************************************isElementPresent*******************************************************

//            driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
//            if (isElementPresent(By.xpath("//*[@id=\"checkboxes\"]/input[1]")));
//            WebElement check1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
//            if (!check1.isSelected()) {
//                       check1.click();
//                 }
//            else {
//                Assert.fail("NOt Exist");
//            }
//
//            WebElement check2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
//            if (check2.isSelected()) {
//                check2.click();
//            }


            ////*********************************************Actions (Double click)*******************************************************


//        driver.navigate().to("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");
//
//              WebElement message =driver.findElement(By.id("message"));
//              Assert.assertEquals("rgba(0, 0, 255, 1)",message.getCssValue( "background-color"));
//              System.out.println(message.getCssValue( "background-color"));
//                Actions builder=new Actions(driver);
//                builder.doubleClick(message).perform();
//               System.out.println(message.getCssValue( "background-color"));
//               Assert.assertEquals("rgba(255, 255, 0, 1)",message.getCssValue( "background-color"));


            ////*********************************************Actions (DragDropDemo)*******************************************************


//        driver.navigate().to("http://cookbook.seleniumacademy.com/DragDropDemo.html");
//        Actions builder=new Actions(driver);
//        WebElement src =driver.findElement(By.id("draggable"));
//        WebElement target =driver.findElement(By.id("droppable"));
//        builder.dragAndDrop(src,target).perform();

            ////*********************************************Actions (Alert)*******************************************************

//        driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
//        WebElement alert =driver.findElement(By.id("simple"));
//        alert.click();
//        Alert alert1=driver.switchTo().alert();
//        String alertText=alert1.getText();
//        Assert.assertEquals("Hello! I am an alert box!",alertText);

            ////*********************************************Actions (Prompt)*******************************************************
        driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
        WebElement promptbtn =driver.findElement(By.id("prompt"));
        promptbtn.click();

        Alert alert1=driver.switchTo().alert();
        alert1.sendKeys("mohamed samir");
        alert1.accept();
        WebElement msg=driver.findElement(By.id("prompt_demo"));

        Assert.assertEquals("Hello mohamed samir! How are you today?",msg.getText());


            ////*********************************************Selenium4 Relative locators*******************************************************





//        private  boolean isElementPresent(By by)
//        {
//            try {
//                driver.findElement(by);
//                return true;
//            }catch (NoSuchElementException e)
//            {
//                return  false;
//            }
//        }


//
//    @AfterClass
//    void closeDriver() {
//        driver.quit();
//    }
    }

    WebDriver driver;
    WebElement txt;

    @BeforeClass
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeClass
    void setupTest() {
        driver = new ChromeDriver();
    }
}