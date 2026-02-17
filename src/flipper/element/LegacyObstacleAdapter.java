package flipper.element;

import flipper.Flipper;
import flipper.command.PointAddCommand;

public class LegacyObstacleAdapter implements Element{

    LegacyObstacle legacyObstacle;
    private final int pointsOnHit = 250;

    public LegacyObstacleAdapter(LegacyObstacle legacyObstacle){
        this.legacyObstacle = legacyObstacle;
    }

    @Override
    public void hit() {
        legacyObstacle.collide();
        Flipper.getInstance().executeCommand(new PointAddCommand(pointsOnHit));
    }

    public int getPointsOnHit(){
        return this.pointsOnHit;
    }
}
