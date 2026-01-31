package ex_31012026.singleinheritance;

public class Lab172 {
    public static void main(String[] args) {
        Son s = new Son();
        s.bhk3();
        s.bhk2();

        Father f1 = new Father();
        f1.bhk2();
        //f1.bhk3();//Father cannot inherit Son's property


    }

}
