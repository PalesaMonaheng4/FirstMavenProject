package Loans;


import org.testng.annotations.Test;

public class VehicleLoans {
    @Test(groups = {"Smoke"})
    public void nineTest()
    {
        System.out.println("Nineth Vehicle Loans");
    }
    @Test(groups = {"Smoke"})
    public void tenTest()
    {
        System.out.println("Tenth vehicle Loans");
    }
    @Test(groups = {"Regression"})
    public void vehicleLoanFraud()
    {
        System.out.println("Fraud vehicle Loans");
    }
}
