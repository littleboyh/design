package hqhe.action.observe.demo1;


import java.util.ArrayList;

public class Publisher {
    private final ArrayList<Subscriber> subscribers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllSubscriber();
    }

    public int getState() {
        return state;
    }

    // 订阅
    public void subscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    // 取消订阅
    public void unSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }



    private void notifyAllSubscriber() {
        subscribers.forEach(Subscriber::update);
    }
}
