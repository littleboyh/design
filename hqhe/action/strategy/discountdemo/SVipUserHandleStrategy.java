package hqhe.action.strategy.discountdemo;


import hqhe.model.User;

public class SVipUserHandleStrategy implements IUserHandleStrategy{
    @Override
    public void userHandle(User user) {
        System.out.println("svip用户打5折");
    }
}
