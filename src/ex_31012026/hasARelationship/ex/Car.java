package ex_31012026.hasARelationship.ex;

public class Car {
    protected void StartTheCar(){
        new Engine().start();
        new Tyres().rolling();
    }

}
