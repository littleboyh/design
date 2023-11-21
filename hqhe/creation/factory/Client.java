package hqhe.creation.factory;


import hqhe.creation.factory.car.AbstractCar;
import hqhe.creation.factory.car.CarFactory;
import hqhe.creation.factory.car.CarType;

public class Client {
    public static void main(String[] args) {
        AbstractCar car = CarFactory.createCar(CarType.BMW);
        car.speedUp(200.2);
        car.speedDown(250);
    }
}
