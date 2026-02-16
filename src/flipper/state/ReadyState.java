package flipper.state;

import flipper.Flipper;

public class ReadyState extends State{

    @Override
    public String getStateName() {
        return "ReadyState";
    }

    @Override
    public void onStartButton() {
        Flipper.getInstance().useCoin();
        System.out.println("Ball launches!");
        Flipper.getInstance().setCurrentState(new PlayingState());
    }

    @Override
    public void onLeftSide() {

    }

    @Override
    public void onRigthSide() {

    }
}
