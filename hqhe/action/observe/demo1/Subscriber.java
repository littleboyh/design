package hqhe.action.observe.demo1;


public abstract class Subscriber {
    protected Publisher publisher;
    abstract void update();
}
