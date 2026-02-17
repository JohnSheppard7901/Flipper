package flipper.state;

import flipper.Flipper;

public class ReadyState extends State{

    @Override
    public String getStateName() {
        return "ReadyState";
    }

    @Override
    public void onStartButton() {
        Flipper flipper = Flipper.getInstance();

        flipper.useCoin();
        flipper.getDisplay().showPressStart();
        flipper.setCurrentState(new PlayingState());
    }

    @Override
    public void onLeftSide() {

    }

    @Override
    public void onRigthSide() {

    }
}
