package ex_01022026.poly.methodoverriding;

public class Lab182 {
    // Method overriding | Runtime Polymorphism
    public static void main(String[] args) {
        Hound h1=new Hound();
        h1.bark();
        Dog d1=new Dog();
        d1.bark();
//With Parent Class Reference, Object of the child is being created
        Dog dog_ref=new Hound();
        dog_ref.bark();//bark of the Hound will be considered
        //Hound hound_ref=new Dog();
    }


}
