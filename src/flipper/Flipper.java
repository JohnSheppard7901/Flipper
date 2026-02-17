package flipper;

import flipper.abstractFactory.DisplayFactory;
import flipper.abstractFactory.DisplayProduct;
import flipper.ball.BallController;
import flipper.command.Command;
import flipper.element.ActionRamp;
import flipper.element.Bumper;
import flipper.element.Target;
import flipper.elementMediator.TargetMediator;
import flipper.state.NoCreditState;
import flipper.state.State;

import java.util.ArrayList;
import java.util.List;

public class Flipper {

    private static Flipper instance;
    private State currentState;

    private int credit;
    private int points;

    private TargetMediator mediator;
    private List<Target> targetList;
    private ActionRamp actionRamp;
    private List<Bumper> bumpers;
    private final BallController ball = new BallController();

    private DisplayFactory displayFactory;
    private DisplayProduct displayProduct;


    private Flipper(){ //Konstruktor ist private, damit niemand den Flipper automat erstellen kann außer diese Klasse selbst
        currentState = new NoCreditState();
        credit = 0;
    }

    public static Flipper getInstance() {
        if(instance == null){
            instance = new Flipper();
        }
        return instance;
    }

//    private void createTargets(){
//        for (int i = 0; i <= 5; i++){
//            Target target = new Target();
//            targetList.add(target);
//        }
//    }
//    private void createBumpers(){
//        for (int i = 0; i <= 7; i++){
//            Bumper bumper = new Bumper();
//            bumpers.add(bumper);
//        }
//    }

    public void configure(List<Target> targets, List<Bumper> bumpers, ActionRamp actionRamp){
        this.targetList = targets;
        this.bumpers = bumpers;
        this.actionRamp = actionRamp;

        this.mediator = new TargetMediator(targetList, actionRamp);
    }

    public void setCurrentState(State state){
        currentState = state;
    }
    public State state(){
        return this.currentState;
    }
    public String getCurrentState(){return this.currentState.getStateName();}
    public List<Target> getTargets() {
        return targetList;
    }
    public List<Bumper> getBumpers() {
        return bumpers;
    }
    public ActionRamp getActionRamp() {
        return actionRamp;
    }
    public BallController getBall() {
        return this.ball;
    }

    public void addCoin(){
        credit ++;
    }
    public void useCoin(){
        credit --;
    }
    public int getCredit(){
        return credit;
    }

    public int getPoints(){
        return points;
    }
    public void setPoints(int points){
        this.points = points;
    }

    public TargetMediator getElemtentMediator(){
        return this.mediator;
    }

    //ruft das command nur auf, macht nichts damit (Aufrufer)
    public void executeCommand(Command command){
        command.execute();
    }

    public void setDisplayFactory(DisplayFactory factory){
        this.displayFactory = factory;
        this.displayProduct = factory.createDisplay();
    }

    public DisplayProduct getDisplay(){
        return this.displayProduct;
    }

}
