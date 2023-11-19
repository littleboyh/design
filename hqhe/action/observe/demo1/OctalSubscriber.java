package hqhe.action.observe.demo1;


public class OctalSubscriber extends Subscriber{
    public OctalSubscriber(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.subscriber(this);
    }

    @Override
    void update() {
        System.out.println( "Octal String: " + Integer.toOctalString(publisher.getState()));
    }
}
