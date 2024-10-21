package src.Task3;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new TurnTVOn(tv));
        remote.pressButton(0);

        remote.pressUndo();
    }
}
