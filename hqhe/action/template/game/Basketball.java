package hqhe.action.template.game;


public class Basketball extends Game{
    @Override
    void initialize() {
        System.out.println("球员和教练员登场");
    }

    @Override
    void start() {
        System.out.println("进行四节比赛");
    }

    @Override
    void end() {
        System.out.println("比赛结束");
    }
}
