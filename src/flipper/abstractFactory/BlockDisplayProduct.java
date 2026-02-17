package flipper.abstractFactory;

public class BlockDisplayProduct implements DisplayProduct {
    @Override
    public void showPressStart() {
        System.out.println("####################");
        System.out.println("## START PRESSED ##");
        System.out.println("## BALL LAUNCHES ##");
        System.out.println("####################");
    }

    @Override
    public void showGameOver() {
        System.out.println("################");
        System.out.println("## GAME OVER ##");
        System.out.println("################");
    }
}
