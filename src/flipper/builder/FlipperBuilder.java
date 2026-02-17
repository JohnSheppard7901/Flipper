package flipper.builder;

import flipper.Flipper;
import flipper.element.ActionRamp;
import flipper.element.Bumper;
import flipper.element.Target;

import java.util.ArrayList;
import java.util.List;

public class FlipperBuilder {
    private final List<Target> targets = new ArrayList<>();
    private final List<Bumper> bumpers = new ArrayList<>();
    private final ActionRamp actionRamp = new ActionRamp();

    public FlipperBuilder addTargets(int count){
        for (int i = 0; i < count; i++) {
            targets.add(new Target());
        }
        return this;
    }

    public FlipperBuilder addBumpers(int count) {
        for (int i = 0; i < count; i++) {
            bumpers.add(new Bumper());
        }
        return this;
    }

    public void build() {
        Flipper flipper = Flipper.getInstance();
        flipper.configure(targets, bumpers, actionRamp);
    }

}
