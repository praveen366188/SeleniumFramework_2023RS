package pdfValidation;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class pdfReadingAndValidationURLConnection {
    WebDriver driver;
    static String path = "file:///C:/Users/Admin/Downloads/Praveenkumar_Resume_2024.pdf";

    //    static String path="https://www.adobe.com/support/products/enterprise/knowledgecenter/media/c4611_sample_explain.pdf";
    @BeforeTest
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\SeleniumFramework_2023RS\\src\\main\\resources\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get(path);

    }

    @Test
    public void ReadAndVerifyPdfDocument() throws IOException, URISyntaxException {
        URL url = new URI(path).toURL();
        URLConnection urlConnection = url.openConnection();
//        urlConnection.setRequestProperty("User-Agent", "Chrome");
        InputStream inputStream = urlConnection.getInputStream();

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        PDDocument pdDocument = PDDocument.load(bufferedInputStream);
        System.out.println("number of page->  " + pdDocument.getNumberOfPages());
        System.out.println("====================================");
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
//        String text=pdfTextStripper.getText(pdDocument);
//        System.out.println(text);
//        Assert.assertTrue(text.contains("5/55 EAST RAJA STREET"));
        pdfTextStripper.setStartPage(2);
        String secondPage = pdfTextStripper.getText(pdDocument);
        System.out.println(secondPage);

    }

    @AfterMethod
    public void afterMethod() {

        driver.close();
    }
}
