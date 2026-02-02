package ex_02022026.excar;

class WagonR extends Engine {
    void drive(){
        openCar();
        start();
        partGearbox();
        stop();
        speed();
    }
    @Override
    void openCar() {
        System.out.println("WagonR open the car");
    }
    @Override
    void partGearbox() {
        System.out.println("partofGearbox WagonR");
    }
    @Override
    void start() {
        System.out.println("WagonR starting");
    }
    @Override
    void speed() {
        System.out.println("Speed of Wagor is 120KMPH");
    }

    @Override
    void stop() {
        System.out.println("WagonR stopping");
    }






}
