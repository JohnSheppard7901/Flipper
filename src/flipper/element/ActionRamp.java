package flipper.element;

import java.util.ArrayList;
import java.util.List;

public class ActionRamp implements Element{

    private boolean isOpen = false;
    private final List<Element> children = new ArrayList<>();

    @Override
    public void hit() {
        for (Element child : children) {
            child.hit();
        }
    }

    public void open(){
        if (!isOpen){
            System.out.println("Action ramp opens.");
            isOpen = true;
            addRampElements();
        }
    }
    private void addRampElements() {
        if (children.isEmpty()) {
            for (int i = 0; i < 2; i++) children.add(new Bumper());
            for (int i = 0; i < 3; i++) children.add(new RampTarget());
        }
    }

    public void enter(){
        System.out.println("Ball enters the ramp.");
    }

    public boolean isOpen() {
        return isOpen;
    }

}

