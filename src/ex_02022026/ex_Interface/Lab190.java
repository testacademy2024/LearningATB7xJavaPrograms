package ex_02022026.ex_Interface;

public class Lab190 {
    // Interface - Hide the implementation
    // Interface variables will be inherited to subclasses.
    // interface is a keyword which is used to define User Defined Datatypes.
    public static void main(String[] args) {
//Engine e=new Engine() //Cannot create an object of Interface Engine
WagonR w=new WagonR();
w.drive();
    }
}
