package ex_04022026;

public class Lab204 {
    public static void main(String[] args) {
        //Anonymous Class
        ABC a=new ABC() {
            @Override
            public void m1() {
                System.out.println("M1");

            }

            @Override
            public void m2() {
                System.out.println("M2");

            }
        };
        CBA b=new CBA() {
            @Override
            void m3() {
                System.out.println("M3");

            }
        };
    }
}
interface  ABC{
    void m1();//Incomplete methods
    void m2();//Incomplete methods
}
abstract class CBA{
    abstract void m3();
}
