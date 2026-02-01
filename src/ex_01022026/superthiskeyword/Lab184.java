package ex_01022026.superthiskeyword;

public class Lab184 {
    class Student extends Person{
        @Override
        void message() {
            System.out.println("I am Student message");
        }
void display()
{
    super.message(); //calling parent function
}
    }

    class Person {
        void message() {
            System.out.println("I am person message");
        }
    }

}
