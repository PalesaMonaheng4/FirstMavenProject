package Loans;

import org.testng.annotations.BeforeSuite;

public class Before_Suite {
    @BeforeSuite
    public void globalVariable()
    {
        System.out.println("Set global variables before we start");
    }
}
