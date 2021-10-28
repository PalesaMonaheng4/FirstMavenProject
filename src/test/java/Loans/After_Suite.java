package Loans;

import org.testng.annotations.AfterSuite;

public class After_Suite {
    @AfterSuite
    public void globalVariableReset()
    {
        System.out.println("Reset global variables");
    }
}
