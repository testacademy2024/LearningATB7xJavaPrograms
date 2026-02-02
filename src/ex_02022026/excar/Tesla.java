package ex_02022026.excar;

class Tesla extends Engine {
    void drive(){
        openCar();
        start();
        partGearbox();
        stop();
        speed();
    }
    @Override
    void openCar() {
        System.out.println("Tesla Car Opening");
    }
    @Override
    void partGearbox() {
        System.out.println("PartOfGarbox Tesla");
    }


    @Override
    void start() {
        System.out.println("Starting Tesla");
    }
    @Override
    void speed() {
        System.out.println("Speed of Tesla is 500KMPH");
    }


    @Override
    void stop() {
        System.out.println("Stopping Tesla");
    }



}
