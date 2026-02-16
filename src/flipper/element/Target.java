package flipper.element;

import flipper.Flipper;
import flipper.command.Command;
import flipper.command.LightOnCommand;
import flipper.command.MacroCommand;
import flipper.command.PointAddCommand;

import java.util.List;

public class Target implements Element{
    protected boolean isHit = false;
    protected final int pointsOnHit = 100;

    public Target() {}

    @Override
    public void hit(){
        isHit = true;

        Command targetHit = new MacroCommand(List.of(
                new PointAddCommand(pointsOnHit),
                new LightOnCommand(5)
        ));
        Flipper.getInstance().executeCommand(targetHit);

        Flipper.getInstance().getElemtentMediator().notify(this, "TARGET_HIT");
    }

    public boolean isHit(){
        return this.isHit;
    }

    public int getPointsOnHit(){
        return this.pointsOnHit;
    }
}
