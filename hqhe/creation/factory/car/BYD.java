package hqhe.creation.factory.car;


public class BYD extends AbstractCar{
    public BYD(double speed) {
        super(speed);
    }

    @Override
    public void speedUp(double delta) {
        this.speed += delta;
        System.out.println(this.getClass().getSimpleName() + "加速到" + speed);
    }

    @Override
    public void speedDown(double delta) {
        this.speed -= delta;
        System.out.println(this.getClass().getSimpleName() + "减速到" + speed);
    }

    @Override
    public void showInfo() {

    }
}
