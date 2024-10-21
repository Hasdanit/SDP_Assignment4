package src.Task3;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commandSlots = new ArrayList<>();
    private List<Command> undoCommands = new ArrayList<>();

    public void setCommand(Command command) { commandSlots.add(command); }

    public void pressButton(int index) {
        if (index < commandSlots.size()) {
            commandSlots.get(index).execute();
            undoCommands.add(commandSlots.get(index));
        }
    }

    public void pressUndo() {
        if (!undoCommands.isEmpty()) {
            undoCommands.remove(undoCommands.size() - 1).undo();
        }
    }
}
