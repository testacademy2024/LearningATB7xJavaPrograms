package ex_31012026;

public class Lab165 {
    int e= 45; // Instance Variable != Global Variable


    void f1(){
        int e = 10; // Local Variable
        System.out.println(e);
    }

    void f2(){
        e = 50;
        System.out.println(e);
    }
    void f3()
    {
        System.out.println(e);
    }

    }

