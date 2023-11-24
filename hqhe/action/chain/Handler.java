package hqhe.action.chain;


public abstract class Handler<REQUEST> {
    protected Handler nextHandler;
    public void nextHandler(Handler handler) {
        nextHandler = handler;
    }

    public abstract void handleRequest(REQUEST request);

    /**
     * 建造者模式构建责任链
     */
    public static class Builder {
        private Handler head;
        private Handler tail;
        public Builder addHandler(Handler handler) {
            if(head == null) {
                head = tail = handler;
                return this;
            }
            tail.nextHandler(handler);
            tail = handler;
            return this;
        }

        public Handler build() {
            return head;
        }
    }
}
