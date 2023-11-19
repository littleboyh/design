package hqhe.action.observe;


import hqhe.action.observe.demo1.BinarySubscriber;
import hqhe.action.observe.demo1.HexSubscriber;
import hqhe.action.observe.demo1.OctalSubscriber;
import hqhe.action.observe.demo1.Publisher;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        BinarySubscriber binarySubscriber = new BinarySubscriber(publisher);
        OctalSubscriber octalSubscriber = new OctalSubscriber(publisher);
        HexSubscriber hexSubscriber = new HexSubscriber(publisher);
        publisher.setState(10);
        publisher.setState(10000012);
        publisher.setState(Integer.MAX_VALUE);
    }
}
