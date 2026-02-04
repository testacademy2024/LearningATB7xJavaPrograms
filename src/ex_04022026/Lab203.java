package ex_04022026;

public class Lab203 {
    public static void main(String[] args) {
        Car c=new Car("Lamborghini");
        c.drive();
        System.out.println(c.model);
        // to access the inner class Object creation.
        Car.Gearbox cg=c.new Gearbox();

    }
}
class Car
{
String model;

    public Car(String model) {
        this.model = model;
    }
    // Method
    void drive() {
        System.out.println("You can driver Car");
    }
    class Gearbox{ //Inner classes are created for Security purpose
        void m2() {
            System.out.println("m2");
            //System.out.println(model);
        }
        class NutBolts{

        }
    }
}
