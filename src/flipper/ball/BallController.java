package flipper.ball;

import flipper.Flipper;
import flipper.element.ActionRamp;
import flipper.element.Bumper;
import flipper.element.Target;

import java.util.List;
import java.util.Random;

public class BallController {

    private final Random random = new Random();

    public void move() {

        Flipper flipper = Flipper.getInstance();

        List<Target> targets = flipper.getTargets();
        List<Bumper> bumpers = flipper.getBumpers();
        ActionRamp ramp = flipper.getActionRamp();

        int totalHits = random.nextInt(2, 7);

        for (int i = 0; i < totalHits; i++) {

            // Target treffen
            Target target = targets.get(random.nextInt(targets.size()));
            if (!target.isHit()) {
                target.hit();
                System.out.println("Ball hit a target. +" + target.getPointsOnHit() + " points.");
            }

            // Bumper treffen
            Bumper bumper = bumpers.get(random.nextInt(bumpers.size()));
            bumper.hit();
            System.out.println("Ball hit a bumper.+" + bumper.getPointsOnHit() + " points.");
        }

        // Ramp betreten
        if (ramp.isOpen()) {
            ramp.enter();
            ramp.hit();
        }
    }
}
