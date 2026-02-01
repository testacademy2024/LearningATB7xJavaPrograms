package ex_01022026.poly.methodoverloading;

public class Lab181 {
    // Polymorphism
    public static void main(String[] args) {
        MathOperations mathOperation=new MathOperations();
        int res=mathOperation.add(34,13);
        System.out.println(res);

        //To have decimal values i need double data type to be added
        MathOperations mathOperation1=new MathOperations();
        double res1 =mathOperation1.add(34.7889889,13.787787);
        System.out.println(res1);

        MathOperations mathOperation2=new MathOperations();
        String res2=mathOperation2.add("RAMESH","WARAM");
        System.out.println(res2);

       MathOperations mathOperation3=new MathOperations();
        int res3=mathOperation3.add('A','B');
        System.out.println(res3);




    }

}
