package hqhe.action.chain;


import hqhe.model.LoginRequest;

/**
 * 用户权限认证
 */
public class AuthHandler extends Handler<LoginRequest>{
    @Override
    public void handleRequest(LoginRequest loginRequest) {
        if("admin".equals(loginRequest.getUserName())) {
            System.out.println("管理员你好");
        }else {
            System.out.println("用户你好");
        }
    }
}
