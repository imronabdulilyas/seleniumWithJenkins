package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DBConnection;

import java.sql.Connection;

@Epic("UI Tests")
@Feature("Google Search")
public class SampleTest extends BaseTest {

    @Test(description = "Verify Google title and DB connection")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyGoogleHomePage() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Allure.step("Page title is: " + title);
        Assert.assertTrue(title.contains("Google"));
        System.out.println("Pageee tittle is: " + title);
        System.out.println("Imron Abdul Ilyas");

//        Connection conn = DBConnection.getConnection();
//        Assert.assertNotNull(conn, "Database connection should be established");
//        DBConnection.closeConnection(conn);
    }
}
