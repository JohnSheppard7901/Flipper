package flipper.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command{

    private List<Command> commands = new ArrayList<>();

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
