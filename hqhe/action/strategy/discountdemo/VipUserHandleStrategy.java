package hqhe.action.strategy.discountdemo;


import hqhe.model.User;

public class VipUserHandleStrategy implements IUserHandleStrategy{
    @Override
    public void userHandle(User user) {
        System.out.println("vip用户打8折");
    }
}
