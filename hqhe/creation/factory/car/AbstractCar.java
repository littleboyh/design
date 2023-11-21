package hqhe.creation.factory.car;


public abstract class AbstractCar {
    protected double speed;

    public AbstractCar(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public abstract void speedUp(double delta);

    public abstract void speedDown(double delta);

    public abstract void showInfo();
}
