package flipper.state;

import flipper.Flipper;

import java.util.Random;

public class PlayingState extends State {
    private final Random random = new Random();

    @Override
    public String getStateName() {
        return "PlayingState";
    }

    public boolean getGameContinues() {
        boolean ballhit = true;
        int num = random.nextInt(4);
        if (num == 0){
            ballhit = false;
        }
        return ballhit;
    }

    @Override
    public void onStartButton() {

    }

    @Override
    public void onLeftSide() {
        System.out.println("Use the left flipper to keep ball in the game.");
        this.flipperMoves();
    }

    @Override
    public void onRigthSide() {
        System.out.println("Use the right flipper to keep ball in the game.");
        this.flipperMoves();
    }

    private void flipperMoves(){
        if(!this.getGameContinues()){
            System.out.println("You flip too late and miss the ball.");
            Flipper.getInstance().getDisplay().showGameOver();
            System.out.println("Points scored: " + Flipper.getInstance().getPoints());
            if (Flipper.getInstance().getCredit() > 0){
                Flipper.getInstance().setCurrentState(new ReadyState());
            }else {
                Flipper.getInstance().setCurrentState(new NoCreditState());
            }
        }else {
            System.out.println("You hit the ball. Ball is send back into play.");
            Flipper.getInstance().getBall().move();

        }

    }
}
