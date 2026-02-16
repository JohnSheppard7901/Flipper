package flipper.element;

import flipper.Flipper;
import flipper.command.Command;
import flipper.command.LightOnCommand;
import flipper.command.MacroCommand;
import flipper.command.PointAddCommand;

import java.util.List;

public class RampTarget extends Target{
    @Override
    public void hit() {
        super.isHit = true;
        System.out.println("Ramp internal target hit.");

        Command targetHit = new MacroCommand(List.of(
                new PointAddCommand(pointsOnHit),
                new LightOnCommand(5)
        ));
        Flipper.getInstance().executeCommand(targetHit);
    }
}
