package Loans;


import org.testng.annotations.Test;

public class PersonalLoans {
    @Test(groups = {"Smoke"})
    public void fiveTest()
    {
        System.out.println("Fifth Personal Loans");
    }
    @Test(groups = {"Smoke"})
    public void sixTest()
    {
        System.out.println("Sixth Personal Loans");
    }
    @Test(groups = {"Regression"})
    public void personalLoanFraud()
    {
        System.out.println("Fraud Personal Loans");
    }
}
