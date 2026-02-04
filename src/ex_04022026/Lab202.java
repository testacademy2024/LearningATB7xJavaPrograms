package ex_04022026;

public class Lab202 {
    public static void main(String[] args) {

    }
}
// Nested Class  - Rarely you will be using it
class OC{
    Integer a=10;
    void outerm1()
    {
        //System.out.println(b);//Outer class cannot access inner class instance variable
        System.out.println("OCM1");
    }
    static class P{ //Not generally used in Automation

    }
    class Innerclass{
        Integer b=20;
        void Inner_m2(){
            System.out.println(a);//inner class can use outer classes instance variable
            System.out.println("ICM2");

        }

    }
}
