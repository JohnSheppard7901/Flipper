package flipper.state;

import flipper.Flipper;

public abstract class State {
    public abstract String getStateName();

    public void onCoinInsert(){
        Flipper.getInstance().addCoin();
        int creditTemp = Flipper.getInstance().getCredit();
        System.out.println("Coin was inserted. Your credit is " + creditTemp + " coin(s).");
    }
    public abstract void onStartButton();
    public abstract void onLeftSide();
    public abstract void onRigthSide();

}
