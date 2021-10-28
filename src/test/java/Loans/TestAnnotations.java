package Loans;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
    @BeforeTest
    public void cleanDB()
    {
        System.out.println("Clean the database before we start");
    }
    @Test(groups = {"Smoke"})
    public void openWebpage()
    {
        System.out.println("Web page opened successfully");
    }
    @Test(groups = {"Smoke"})
    public void signIn()
    {
        System.out.println("User signed in successfully");
    }
    @Test(groups = {"Smoke"})
    public void homeLoanFraud()
    {
        System.out.println("Fraud Home Loans");
    }
    @BeforeTest
    @AfterTest
    public void cleanDB1()
    {
        System.out.println("Clean the database before we start and end");
    }
}
