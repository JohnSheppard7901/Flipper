package flipper.abstractFactory;

public class RetroDisplayProduct implements DisplayProduct {

    @Override
    public void showPressStart() {
        System.out.println("<<< START PRESSED >>>");
        System.out.println("<<< BALL LAUNCHES >>>");
    }

    @Override
    public void showGameOver() {
        System.out.println("<<< GAME OVER >>>");
    }

}
