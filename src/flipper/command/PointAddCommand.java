package flipper.command;

import flipper.Flipper;

public class PointAddCommand implements Command{

    private int newPoints;

    public PointAddCommand(int newPoints){
        this.newPoints = newPoints;
    }

    //hier wird der Empfänger aufgerufen was auch der Flipper
    public void execute(){
        Flipper.getInstance().setPoints(
                Flipper.getInstance().getPoints() + newPoints
        );
    }
}
