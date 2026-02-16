package flipper.elementMediator;

import flipper.element.ActionRamp;
import flipper.element.Element;
import flipper.element.Target;

import java.util.List;

public class TargetMediator implements Mediator{
    private List<Target> targetList;
    private ActionRamp actionRamp;

    public TargetMediator(List<Target> targetList, ActionRamp actionRamp){
        this.targetList = targetList;
        this.actionRamp = actionRamp;
    }

    @Override
    public void notify(Element element, String event) {
        if (event.equalsIgnoreCase("TARGET_HIT")){
            boolean allHit = targetList.stream().allMatch(Target::isHit);

            if (allHit){
                actionRamp.open();
                actionRamp.enter();
            }
        }
    }
}
