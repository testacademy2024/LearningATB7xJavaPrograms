package ex_31012026.singleinheritance.real;

public class TestCase2 extends BaseTest {


    public static void main(String[] args) {
        //To print testcase2() method we have to use new ClassName().methodName as the method has void
        new TestCase2().testCase2();
    }
    void testCase2(){
        //Below methods are directly called as we are using extends keyword
        startBrowser();
        // Here we will write the TC
        closeBrowser();
        getDataFromSQL();//GrandBaseTest
        //reference variable (gold) of the GrandBaseTest can be directly used due to multilevel inheritance
        //TestCase2 extends BaseTest extends GrandBaseTest
        System.out.println(gold);

    }
}
