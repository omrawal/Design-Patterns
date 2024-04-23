// Command interface
interface Command {
    void execute();
}

// Concrete Command classes
class TVOnCommand implements Command {
    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }
}

class TVOffCommand implements Command {
    private final TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }
}

// Receiver class
class TV {
    public void turnOn() {
        System.out.println("Turning TV on");
    }

    public void turnOff() {
        System.out.println("Turning TV off");
    }
}

// Invoker class
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Main class
public class CommandDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        RemoteControl remote = new RemoteControl();

        // Pressing the "On" button
        remote.setCommand(tvOnCommand);
        remote.pressButton(); // Output: Turning TV on

        // Pressing the "Off" button
        remote.setCommand(tvOffCommand);
        remote.pressButton(); // Output: Turning TV off
    }
}