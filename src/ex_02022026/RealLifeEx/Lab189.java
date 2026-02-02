package ex_02022026.RealLifeEx;

public class Lab189 {
    public static void main(String[] args) {
        CHROME c1=new CHROME();
        c1.openBrowser("Chrome");
        c1.closeBrowser("Chrome");
        c1.takeScreenshot();
        System.out.println("----------");
        FIREFOX f1=new FIREFOX();
        f1.openBrowser("Firefox");
        f1.closeBrowser("Firefox");
        f1.takeScreenshot();

    }
}
