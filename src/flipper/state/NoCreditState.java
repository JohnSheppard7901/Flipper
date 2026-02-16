package flipper.state;
import flipper.Flipper;

public class NoCreditState extends State{
    @Override
    public String getStateName() {
        return "NoCreditState";
    }

    @Override
    public void onCoinInsert() {
        super.onCoinInsert();
        Flipper.getInstance().setCurrentState(new ReadyState());
    }

    @Override
    public void onStartButton() {
        System.out.println("No credit. You have to put in a coin before you can play.");
    }

    @Override
    public void onLeftSide() {

    }

    @Override
    public void onRigthSide() {

    }
}
