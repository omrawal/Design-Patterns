from abc import ABC, abstractmethod

class Android(ABC):
  """Interface for Android devices."""
  @abstractmethod
  def on_charge(self):
    pass

class Charger(ABC):
  """Interface for chargers."""
  @abstractmethod
  def charge(self):
    pass

class MicroUSBCharger(Charger):
  """Concrete MicroUSB charger implementation."""
  def charge(self):
    print("Charging with MicroUSBCharger")

class USBTypeCCharger(Charger):
  """Concrete USBTypeC charger implementation."""
  def charge(self):
    print("Charging with USBTypeCCharger")

class USBTypeCToMicroAdapter(Charger):
  """Adapts USBTypeC charger to work with MicroUSB devices."""
  def __init__(self):
    self.micro_usb_charger = MicroUSBCharger()

  def charge(self):
    self.micro_usb_charger.charge()

class NewAndroid(Android):
  """New Android device using a MicroUSB charger through an adapter."""
  def __init__(self, charger):
    self.charger = charger

  def on_charge(self):
    self.charger.charge()

# Usage
new_android = NewAndroid(USBTypeCToMicroAdapter())
new_android.on_charge()