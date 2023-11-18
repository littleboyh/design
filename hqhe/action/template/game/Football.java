package hqhe.action.template.game;


public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("教练员和裁判员和球员登场");
    }

    @Override
    void start() {
        System.out.println("进行90分钟比赛");
    }

    @Override
    void end() {
        System.out.println("比赛结束");
    }
}
