package ex_31012026.singleinheritance.real;

public class BaseTest2 {
    void startBrowser(){
        System.out.println("Staring Browser!!");
        //As BaseTest2 is not using extends keyword with GrandBaseTest2,
        // to inherit GrandBaseTest2 we need to create an object of GrandBaseTest2
        System.out.println(new GrandBaseTest().gold);

    }

    void closeBrowser(){
        System.out.println("Closing Browser!!");
        //As BaseTest2 is not using extends keyword with GrandBaseTest2,
        // to inherit GrandBaseTest2 we need to create an object of GrandBaseTest2
        System.out.println(new GrandBaseTest().gold);
    }
}
