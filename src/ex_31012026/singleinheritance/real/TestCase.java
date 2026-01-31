package ex_31012026.singleinheritance.real;

public class TestCase extends BaseTest{
    void testCase(){
        startBrowser();
        // Here we will write the TC
        closeBrowser();
        getDataFromSQL();//GrandBaseTest
        System.out.println(gold);

    }

}
