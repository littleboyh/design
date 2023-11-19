package hqhe.action.strategy.discountdemo;


import hqhe.model.User;

public class UserHandleContext {
    private IUserHandleStrategy strategy;

    public void setStrategy(IUserHandleStrategy strategy) {
        this.strategy = strategy;
    }

    public void handleUser(User user) {
        strategy.userHandle(user);
    }
}
