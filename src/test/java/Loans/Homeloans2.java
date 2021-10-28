package Loans;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Homeloans2 {
    @Test(groups = {"Smoke"})
    public void thirdTest()
    {
        System.out.println("Third Home Loans");
        String actual="Test passed";
        String expected="Almost passed";

        Reporter.log("Expected ----------------"+expected);
        Reporter.log("actual--------------------"+actual);

        //Assert.assertEquals(actual,expected);
    }
    @Test(groups = {"Regression"})
    public void fourthTest()
    {
        System.out.println("Fourth Home Loans");
    }
    @Test(groups = {"Smoke"})
    public void home2LoanFraud()
    {
        System.out.println("Fraud Home2 Loans");
    }
    @Test(groups = {"Regression"})
    public void propertFraud()
    {
        System.out.println("Fraud property Loans");
    }
}
