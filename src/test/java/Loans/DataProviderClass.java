package Loans;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    @BeforeTest
    public void cleanDB()
    {
        System.out.println("Clean the database before we start");
    }
    @Test
    public void openWebpage()
    {
        System.out.println("Web page opened successfully");
    }
    @Test(dataProvider = "getData")
    public void signIn(String username, String password)
    {
        System.out.println("Enter login details");
        System.out.println("Your username is "+ username+" and password is "+password);
        System.out.println("User signed in successfully");
    }
    @Test
    public void homeLoanFraud()
    {
        System.out.println("Fraud Home Loans");
    }
    @AfterTest
    public void cleanDB1()
    {
        System.out.println("Clean the database before we start and end");
    }
    @DataProvider
    public Object[][] getData()
    {
        Object[][] data=new Object[3][2];
        data[0][0]="FisrtUsername";
        data[0][1]="FirstPassword";

        data[1][0]="SecondUsername";
        data[1][1]="SecondPassword";

        data[2][0]="ThirdUsername";
        data[2][1]="ThirdPassword";
        return data;
    }
}
