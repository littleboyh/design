package hqhe.action.strategy.discountdemo;


import hqhe.model.User;

public class CUserHandleStrategy implements IUserHandleStrategy {
    @Override
    public void userHandle(User user) {
        System.out.println("普通优化没有优惠");
    }
}
