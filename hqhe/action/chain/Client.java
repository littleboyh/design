package hqhe.action.chain;


import hqhe.model.LoginRequest;

public class Client {
    public static void main(String[] args) {
        Handler.Builder builder = new Handler.Builder();
        Handler handler = builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler()).build();
        handler.handleRequest(new LoginRequest("hqhe", "hhq222wm115"));
    }
}
