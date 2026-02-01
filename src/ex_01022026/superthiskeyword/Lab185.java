package ex_01022026.superthiskeyword;

public class Lab185 {

    // super.variable
    // super.method()
    // super() -> DC
    // super("pramod') -> PC

    // this()
    // this.variableName
}

class Person1 {
    Person1() {
        System.out.println("Default Constructor");
    }

    Person1(String a) {
        System.out.println("Parametrized Constructor-1");
    }

    Person1(String a, int a1) {
        System.out.println("Parametrized Constructor-2");
    }


    class Student1 extends Person1 {
        //Call to 'super()' must be first statement in constructor body
        Student1(String s) {
            super();//Calls Default Constructor at Line 15
            //super("Ajit");
//            super("Shweta",90);
            System.out.println("Paramterized Constructor");

        }
        //Constructor chaining concept
        //Student1() { //Default Constructor of Student Class
            //this("Smita");
//super();
//super("Sanket",78);
            //super("Ajit");


        }
    }



