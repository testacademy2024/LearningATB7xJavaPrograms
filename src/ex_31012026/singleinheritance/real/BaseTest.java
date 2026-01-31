package ex_31012026.singleinheritance.real;

public class BaseTest extends GrandBaseTest {

    void startBrowser(){
        System.out.println("Staring Browser!!");
        System.out.println(gold);
    }

    void closeBrowser(){
        System.out.println("Closing Browser!!");
        System.out.println(gold);
    }
}
