package hqhe.action.observe.demo1;


public class HexSubscriber extends Subscriber{
    public HexSubscriber(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.subscriber(this);
    }

    @Override
    void update() {
        System.out.println( "Hex String: " + Integer.toHexString(publisher.getState()));
    }
}
