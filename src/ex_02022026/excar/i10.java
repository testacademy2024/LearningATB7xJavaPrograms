package ex_02022026.excar;

class i10 extends Engine {
    void drive(){
        openCar();
        start();
        partGearbox();
        stop();
        speed();
    }

    @Override
    void openCar() {
        System.out.println("i10 Open the Car");
    }
    @Override
    void partGearbox() {
        System.out.println("PartOfGearbox i10");
    }
    @Override
    void start() {
        System.out.println("i10 Starting");
    }
    @Override
    void speed() {
        System.out.println("i10 speed is 90KMPH");
    }

    @Override
    void stop() {
        System.out.println("i10 Stopping");
    }






}
