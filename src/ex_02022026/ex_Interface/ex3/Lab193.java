package ex_02022026.ex_Interface.ex3;
//User Class+Interface+Overridden Class -----all in one Java file can be created
public class Lab193 {
    public static void main(String[] args) {
        Car c = new Car();
        c.openCar();
        c.start();
        c.m1();
        c.gear();


    }
}

    interface Eng {
        void start();
        void gear();
        void openCar();
        default void m1(){//complete method available with default keyword to all the classes
            System.out.println("Old M1");
        }
    }
interface GearBox extends Eng{
    void gear();

}
interface Keys extends GearBox{
    void openCar();
}
    class Car implements Keys {

        @Override
        public void start() {
            System.out.println("Starting");
        }

        @Override
        public void gear() {
            System.out.println("Gear is initiated");

        }

        @Override
        public void openCar() {
            System.out.println("Car is opening");
        }
    }

