package ex_04022026;

public class Lab200 {
    //SIB are called only once as class are loaded  and IIB called every time object created
    public static void main(String[] args) {
A a=new A();
a.age=30;
        System.out.println(A.discount);//For Static variable Classname.Variablename can be used
A.m1();
a.m2();
A a2=new A();
// Static don't need to object ref. - True
    }
}
    class A{
        int age=10; //Instance Variable
        static int discount=199;//static variable
        // SIB - STATIC initialization block
        static {
            System.out.println("One Time Load SIB");
        }
        // IIB - instance initialization block
        {
            System.out.println("IIB When Object is created");
        }
        static void m1(){
            System.out.println("m1");
            //System.out.println(age);//non static age  cannot be called in static methods
        }
        void m2(){
            System.out.println("m2");
            System.out.println(discount);
        }


    }

