package ex_02022026.excar;
//Car class is a complete class
class Car extends Engine {
    // Engine
    // GearBox
    // Keys

    // Tesla is A Car
    // Tesla - DRIVE()

//All these overridden methods are incomplete
    @Override
    void start() {
        System.out.println("Start the Car");
    }

    @Override
    void stop() {
        System.out.println("Stop the Car");
    }

    @Override
    void partGearbox() {
        System.out.println("Part of Gear Box");
    }

    @Override
    void openCar() {
        System.out.println("OPen the Car with Keys");

    }

    @Override
    void speed() {
        System.out.println("Car speed is in KMPH");

    }
}
