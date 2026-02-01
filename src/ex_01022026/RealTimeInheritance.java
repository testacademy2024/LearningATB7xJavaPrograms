package ex_01022026;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1=new TestCase1();//dynamic dispatch or Run Time polymorphism
        t1.getBrowser();
        t1.setBrowser("Opera Mini",true);
        t1.openBrowser();
        t1.openBrowser("Opera Mini");
        t1.closeBrowser();

    }

}
//Is a Relationships so single inheritance is used
class TestCase1 extends BaseClass{
    //Method Overriding: Line No 39 to 47 is overridden by Line No 19 to 23
    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
class BaseClass {
    //Default Constructor
    BaseClass() {
        System.out.println("DC - BaseClass");
    }
//Parameterized Constructor
    BaseClass(String b) {
        System.out.println("CC - BaseClass");
    }

    private String browser; //Declaration with private access modifiers
//Initiated getter and setter with Authentication code for setter validated with if else statements
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
            System.out.println("This user is Authenticated");
        }
        else{
            System.out.println("Not an Authenticated User");
        }
    }
    //Method Overloading :Same Function name but different arguments and data type
    void openBrowser() {
        System.out.println("Chrome Browser!!");
    }
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }
    //One more extra function for closing browser is added
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}
