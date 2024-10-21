package src.Task3;

public class SetVolume implements Command {
    private Stereo stereo;

    public SetVolume(Stereo stereo) { this.stereo = stereo; }

    @Override
    public void execute() { stereo.turnOn(); }

    @Override
    public void undo() { stereo.turnOff(); }
}
