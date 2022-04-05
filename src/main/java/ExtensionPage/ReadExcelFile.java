package ExtensionPage;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReadExcelFile {

    public void s() throws FilloException {

        String uName, uPass;
        Fillo fillo = new Fillo();
        Connection conn = fillo.getConnection("src/test/resources/data/testData.xls");
        String query = "Select * from Data";
        Recordset record = conn.executeQuery(query);
        List<String> name = new ArrayList<>();
        List<String> pass = new ArrayList<>();
        while (record.next()) {
            name.add(record.getField("username"));
            pass.add(record.getField("password"));
        }
        for (int i = 0; i < name.size(); i++) {
            uName = name.get(i);
            uPass = pass.get(i);
//            driver.findElement(By.name("uid")).clear();
//            driver.findElement(By.name("uid")).sendKeys(uName);
//            driver.findElement(By.name("password")).clear();
//            driver.findElement(By.name("password")).sendKeys(uPass);
//            driver.findElement(By.name("btnLogin")).click();
        }
    }
}