package flipper;

public class Main {

    /*

    Patterns die im Projekt umgesetzt wurden:

        ✅ Command Pattern
        ✅ MacroCommand Erweiterung
        ✅ Mediator Pattern
        ✅ Composite Pattern
        ✅ State Pattern
        ✅ Singleton (Flipper)

     */

    public static void main(String[] args) {
        Flipper flipper = Flipper.getInstance();

        //check if start state is NoCreditState
        System.out.println("You are in the " + flipper.getCurrentState() + ".\n");

        //insert coin, check credit and if state is ReadyState
        flipper.state().onCoinInsert();
        System.out.println("You are in the " + flipper.getCurrentState() + ".");
        flipper.state().onCoinInsert();
        System.out.println("Credit check: " + flipper.getCredit() + "\n");

        //start game, check state
        flipper.state().onStartButton();
        System.out.println("You are in the " + flipper.getCurrentState() + ".\n");

        //play game
        flipper.state().onLeftSide();
        flipper.state().onRigthSide();
        flipper.state().onLeftSide();
        flipper.state().onRigthSide();
        flipper.state().onLeftSide();
        flipper.state().onRigthSide();
        flipper.state().onLeftSide();
        flipper.state().onRigthSide();

    }

}
