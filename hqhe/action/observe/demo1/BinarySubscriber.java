package hqhe.action.observe.demo1;


public class BinarySubscriber extends Subscriber{
    public BinarySubscriber(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.subscriber(this);
    }

    @Override
    void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString(publisher.getState()));
    }
}
