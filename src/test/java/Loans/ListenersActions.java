package Loans;

import base.BaseClass1;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersActions extends BaseClass1 implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        //ITestListener.super.onTestStart(result);
        System.out.println("On test start "+result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       // ITestListener.super.onTestSuccess(result);
        System.out.println("On test success "+result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //ITestListener.super.onTestFailure(result);
        System.out.println("On test failure "+result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //ITestListener.super.onTestSkipped(result);
        System.out.println("On test skip "+result);
    }

    @Override
    public void onStart(ITestContext context) {
       // ITestListener.super.onStart(context);
        System.out.println("On start "+context);
    }

    @Override
    public void onFinish(ITestContext context) {
       // ITestListener.super.onFinish(context);
        System.out.println("On Finish "+context);
    }
}
