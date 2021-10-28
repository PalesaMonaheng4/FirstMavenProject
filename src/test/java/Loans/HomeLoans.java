package Loans;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeLoans {
    @Test(groups = {"Smoke"})
    public void firstTest()
    {
        System.out.println("First Home Loans");
    }
    @Test(groups = {"Smoke"})
    public void secondTest()
    {
        System.out.println("Second Home Loans");
    }
    @Test(groups = {"Regression"})
    public void homeLoanFraud()
    {
        System.out.println("Fraud Home Loans");
        Assert.assertTrue(false);
    }
}
