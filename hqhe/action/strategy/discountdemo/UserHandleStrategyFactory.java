package hqhe.action.strategy.discountdemo;


import hqhe.model.User;
import hqhe.model.UserType;

import java.util.HashMap;

public class UserHandleStrategyFactory {
    private static final HashMap<UserType, IUserHandleStrategy> map = new HashMap<>();
    static {
        map.put(UserType.common, new CUserHandleStrategy());
        map.put(UserType.vip, new VipUserHandleStrategy());
        map.put(UserType.svip, new SVipUserHandleStrategy());
    }

    public static IUserHandleStrategy getStrategyByUserType(UserType userType) {
        if(map.containsKey(userType)) return map.get(userType);
        else throw new RuntimeException("map not contains this userType:" + userType);
    }
}
