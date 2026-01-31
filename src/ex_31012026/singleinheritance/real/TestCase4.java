package ex_31012026.singleinheritance.real;

public class TestCase4 {

    public static void main(String[] args) {
        new TestCase4().testCase4();
        new TestCase3().testCase3();
        new BaseTest2().startBrowser();
        new BaseTest2().closeBrowser();
    }
    void testCase4() {
        //If extend keyword is not present then we will have to use new ClassName().methodName()
        new BaseTest2().startBrowser();//New Object Created for BaseTest and then method accessed
        // Here we will write the TC
        new BaseTest2().closeBrowser();//New Object Created for BaseTest and then method accessed
        new GrandBaseTest2().getDataFromSQL();//New Object Created for GrandBaseTest and then method accessed
        System.out.println(new GrandBaseTest2().gold);//New Object Created for GrandBaseTest and then method accessed
    }
}
