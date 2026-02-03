package ex_02022026.ex_Interface;

public class Lab191 {
    public static void main(String[] args) {

    }
    interface I{}
    class A{} // concrete class
    class B{}//concrete class
    abstract class C{}
    class Test1 extends  A{}
    class Test2 extends B{}
    // class Test3 extends A,B{} // Multiple Inheritance
    class Test0 implements I{}
    interface I1{ }
    interface I2{}
    class Test4 implements I1,I2{} // multiple Inheritance with interface
    class Test5 extends A implements I1,I2{}//extend a class and then get from Interface1&2
    //class Test6 implements I1 extends A{}// Not Ok
    //interface I3 extends A{} //interface cannot extend anything
    //interface I4 implements A{}//Interface implement concrete class is not possible
    //interface I5 extends A,B{}//not possible
    interface I6 extends I1,I2{}//Interface extends another Interface but not class
    //interface I7  extends C{}//Interface cannot extend a concrete class
}
