package flipper.command;

public class LightOnCommand implements Command{

    private int timesOfBlink;

    public LightOnCommand(int timesOfBlink){
        this.timesOfBlink = timesOfBlink;
    }


    @Override
    public void execute() {
        //command would be sent to UI to get target light to blink
    }
}
