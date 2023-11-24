package hqhe.action.chain;


import hqhe.model.LoginRequest;

/**
 * 用户登陆校验
 */
public class LoginHandler extends Handler<LoginRequest>{

    @Override
    public void handleRequest(LoginRequest loginRequest) {
        String userName = loginRequest.getUserName();
        String password = loginRequest.getPassword();

        if(userName.equals("hqhe") && password.equals("hhq222wm115")) {
            System.out.println("登陆成功");
        } else {
            System.out.println(String.format("用户名和密码不正确,username:%s,password:%s", userName, password));
            return;
        }
        nextHandler.handleRequest(loginRequest);
    }
}
