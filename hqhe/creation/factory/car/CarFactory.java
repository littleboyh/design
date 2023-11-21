package hqhe.creation.factory.car;


public class CarFactory {
    public static AbstractCar createCar(CarType type) {
        switch (type) {
            case BMW: return new BMW(100.5);
            case Benz: return new Benz(120.2);
            case BYD: return new BYD(110.5);
            default:
                throw new RuntimeException("unexpected car type");
        }
    }
}
