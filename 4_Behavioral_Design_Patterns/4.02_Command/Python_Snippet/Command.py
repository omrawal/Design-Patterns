from abc import abstractmethod, ABC

class Command(ABC):
    @abstractmethod
    def execute(self):
        pass

class TV:
    def turn_on(self):
        print("Turning On TV")
    
    def turn_off(self):
        print("Turning Off TV")



class TVOnCommand(Command):
    def __init__(self,tv) -> None:
        self.tv = tv
    
    def execute(self):
        self.tv.turn_on()

class TVOffCommand(Command):
    def __init__(self,tv) -> None:
        self.tv = tv
    
    def execute(self):
        self.tv.turn_off()

class RemoteControl:
    def __init__(self):
        self.command = None
    
    def set_command(self, command):
        self.command = command
    
    def press_button(self):
        self.command.execute()
    
tv = TV()
tv_on_command = TVOnCommand(tv)
tv_off_command = TVOffCommand(tv)

remote = RemoteControl()

# Pressing the "On" button
remote.set_command(tv_on_command)
remote.press_button()  # Output: Turning TV on

# Pressing the "Off" button
remote.set_command(tv_off_command)
remote.press_button()  # Output: Turning TV off