package hqhe.action.chain;


import hqhe.model.LoginRequest;

/**
 * 请求参数校验
 */
public class ValidateHandler extends Handler<LoginRequest>{
    @Override
    public void handleRequest(LoginRequest loginRequest) {
        String username = loginRequest.getUserName();
        String password = loginRequest.getPassword();
        if(username == null || username.length() == 0) {
            System.out.println("用户名为空");
            return;
        }
        if("admin".equals(username)) {
            System.out.println("用户名不能为admin");
            return;
        }
        if(password == null || password.length() == 0) {
            System.out.println("密码不能为空");
            return;
        }
        if(password.length() < 6) {
            System.out.println("密码长度不能小于6");
            return;
        }
        nextHandler.handleRequest(loginRequest);
    }
}
