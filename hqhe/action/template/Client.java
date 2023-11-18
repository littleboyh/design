package hqhe.action.template;


import hqhe.action.template.game.Basketball;
import hqhe.action.template.game.Game;

public class Client {
    public static void main(String[] args) {
        Game game = new Basketball();
        game.play();
        game = new Basketball();
        game.play();
    }
}
