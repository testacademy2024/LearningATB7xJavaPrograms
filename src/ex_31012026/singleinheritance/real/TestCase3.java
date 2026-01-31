package ex_31012026.singleinheritance.real;

public class TestCase3 {
    void testCase3(){
        new BaseTest2().startBrowser();
        // Here we will write the TC
        new BaseTest2().closeBrowser();//New Object Created for BaseTest and then method accessed
        new GrandBaseTest2().getDataFromSQL();//New Object Created for GrandBaseTest and then method accessed
        System.out.println(new GrandBaseTest2().gold);//New Object Created for GrandBaseTest and then method accessed

    }
}
