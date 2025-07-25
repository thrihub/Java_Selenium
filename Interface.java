// Task 1 & 2: Interface with abstract, default, and static methods
interface RemoteControl {
    void turnOn();  // abstract method

    default void batteryStatus() {
        System.out.println("Battery is 80%");
    }

    static void info() {
        System.out.println("RemoteControl interface - used for controlling devices");
    }
}

// Task 1: Class implementing RemoteControl
class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }
}

// Task 3: Multiple Interfaces
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultifunctionPrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Real-world Scenario: SmartDevice system
interface Controllable {
    void turnOn();

    default void status() {
        System.out.println("Device is working fine.");
    }

    static void deviceInfo() {
        System.out.println("SmartDevice Interface: Common control functions.");
    }
}

class SmartFan implements Controllable {
    public void turnOn() {
        System.out.println("SmartFan is ON");
    }
}

class SmartLight implements Controllable {
    public void turnOn() {
        System.out.println("SmartLight is ON");
    }
}

// Main class to test everything
public class Interface {
    public static void main(String[] args) {
        System.out.println("=== Task 1 & 2 ===");
        TV myTV = new TV();
        myTV.turnOn();
        myTV.batteryStatus();
        RemoteControl.info();

        System.out.println("\n=== Task 3: Multiple Interfaces ===");
        MultifunctionPrinter mfp = new MultifunctionPrinter();
        mfp.print();
        mfp.scan();

        System.out.println("\n=== Real-world SmartDevice ===");
        SmartFan fan = new SmartFan();
        fan.turnOn();
        fan.status();

        SmartLight light = new SmartLight();
        light.turnOn();
        light.status();
        Controllable.deviceInfo();
    }
}


