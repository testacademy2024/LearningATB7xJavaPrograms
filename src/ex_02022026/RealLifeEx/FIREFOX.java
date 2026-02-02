package ex_02022026.RealLifeEx;

public class FIREFOX extends BaseClass{
    @Override
    String openBrowser(String browserName) {
        System.out.println("Open FIREFOX Browser");
        return "";
    }

    @Override
    String closeBrowser(String browserName) {
        System.out.println("Close FIREFOX browser");
        return "";
    }

    @Override
    void takeScreenshot() {
        System.out.println("Taking Screenshot in Firefox");

    }
}
