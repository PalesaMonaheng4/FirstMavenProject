package Loans;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExercises {

    @Test(dataProvider = "setData")
    public void signIn(String ID, String name, String surname,String occupationType,String nameOfCompany)
    {
        System.out.println(ID+" "+name +" "+surname+" "+occupationType+" "+" "+nameOfCompany);
    }

    @DataProvider
    public Object[][] setData()
    {
        Object[][] data=new Object[10][5];
        data[0][0]="01";
        data[0][1]="Palesa";
        data[0][2]="Monaheng";
        data[0][3]="Test Analyst";
        data[0][4]="Inspired Testing";

        data[1][0]="02";
        data[1][1]="James";
        data[1][2]="Jacop";
        data[1][3]="QA";
        data[1][4]="Telesure";

        data[2][0]="03";
        data[2][1]="Jane";
        data[2][2]="Adams";
        data[2][3]="Android Developer";
        data[2][4]="DVT";

        data[3][0]="04";
        data[3][1]="Bongani";
        data[3][2]="Sethole";
        data[3][3]="IOS Developer";
        data[3][4]="Discovery";

        data[4][0]="05";
        data[4][1]="Lerato";
        data[4][2]="Mokoena";
        data[4][3]="Test Analyst";
        data[4][4]="Hollard";

        data[5][0]="06";
        data[5][1]="Dineo";
        data[5][2]="Moloi";
        data[5][3]="Project Manager";
        data[5][4]="Discovery";

        data[6][0]="07";
        data[6][1]="Jason";
        data[6][2]="Andrews";
        data[6][3]="Test Analyst";
        data[6][4]="Inspired Testing";

        data[7][0]="08";
        data[7][1]="Lisa";
        data[7][2]="Simson";
        data[7][3]="Business Analyst";
        data[7][4]="CloudSmiths";

        data[8][0]="09";
        data[8][1]="Vannesa";
        data[8][2]="Mikes";
        data[8][3]="API";
        data[8][4]="Telesure";

        data[9][0]="10";
        data[9][1]="Mbali";
        data[9][2]="Mbeki";
        data[9][3]="Test Analyst";
        data[9][4]="Inspired Testing";

        return data;
    }
}
