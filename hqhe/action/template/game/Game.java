package hqhe.action.template.game;


public abstract class Game {
    abstract void initialize(); //abstract修饰符 同类和同包可见
    abstract void start();
    abstract void end();

    public final void play() {
        initialize();
        start();
        end();
    }
}
