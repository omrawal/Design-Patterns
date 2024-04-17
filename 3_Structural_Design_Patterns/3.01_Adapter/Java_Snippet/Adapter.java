interface Android {
    public void onCharge();
}

interface Charger {
    public void charge();
}

class MicroUSBCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("Charging with MicroUSBCharger");
    }
}

class USBTypeCCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("Charging with USBTypeCCharger");
    }
}

class USBTypeCToMicroAdapter implements Charger {
    MicroUSBCharger microUSBCharger;

    public USBTypeCToMicroAdapter() {
        microUSBCharger = new MicroUSBCharger();
    }

    @Override
    public void charge() {
        microUSBCharger.charge();
    }
}

class NewAndroid implements Android {
    Charger usbTypeCToMicroAdapter;

    public NewAndroid(Charger uSBTypeCToMicroAdapter) {
        this.usbTypeCToMicroAdapter = uSBTypeCToMicroAdapter;
    }

    @Override
    public void onCharge() {
        usbTypeCToMicroAdapter.charge();
    }
}

/**
 * Adapter
 */
public class Adapter {

    public static void main(String[] args) {
        NewAndroid newAndroid = new NewAndroid(new USBTypeCToMicroAdapter());
        newAndroid.onCharge();
    }
}