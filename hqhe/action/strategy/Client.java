package hqhe.action.strategy;


import hqhe.action.strategy.discountdemo.UserHandleContext;
import hqhe.action.strategy.discountdemo.UserHandleStrategyFactory;
import hqhe.model.User;
import hqhe.model.UserType;

public class Client {
    public static void main(String[] args) {
        User cUser = new User(1, "hhq", 26, UserType.common);
        User vUser = new User(2, "wm", 26, UserType.vip);
        User sUser = new User(3, "qq", 6, UserType.svip);
        UserHandleContext context = new UserHandleContext();
        context.setStrategy(UserHandleStrategyFactory.getStrategyByUserType(cUser.getUserType()));
        context.handleUser(cUser);
        context.setStrategy(UserHandleStrategyFactory.getStrategyByUserType(vUser.getUserType()));
        context.handleUser(vUser);
        context.setStrategy(UserHandleStrategyFactory.getStrategyByUserType(sUser.getUserType()));
        context.handleUser(sUser);
    }
}
