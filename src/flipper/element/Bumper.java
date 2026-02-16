package flipper.element;

import flipper.Flipper;
import flipper.command.PointAddCommand;

public class Bumper implements Element{
    private final int pointsOnHit = 50;

    @Override
    public void hit(){
        Flipper.getInstance().executeCommand(new PointAddCommand(pointsOnHit));
    }

    public int getPointsOnHit(){
        return this.pointsOnHit;
    }
}
