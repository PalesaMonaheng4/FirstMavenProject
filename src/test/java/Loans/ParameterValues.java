package Loans;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterValues {

    @Parameters("URL")
    @Test
    public void storedValue(String URL)
    {
        System.out.println("Testing parameters");
        System.out.println("The takealot website is "+URL);
    }
}
