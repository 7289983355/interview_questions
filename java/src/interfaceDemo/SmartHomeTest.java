package interfaceDemo;
interface WiFiDevice {
    // Abstract method
    void connectWiFi();

    // Default method for turning on the device
    default void turnOn() {
        System.out.println("Turning on the device via WiFi...");
    }

    // Default method for turning off the device
    default void turnOff() {
        System.out.println("Turning off the device via WiFi...");
    }
}

interface BluetoothDevice {
    // Abstract method
    void connectBluetooth();

    // Default method for turning on the device
    default void turnOn() {
        System.out.println("Turning on the device via Bluetooth...");
    }

    // Default method for turning off the device
    default void turnOff() {
        System.out.println("Turning off the device via Bluetooth...");
    }
}

class SmartLight implements WiFiDevice, BluetoothDevice {
    @Override
    public void connectWiFi() {
        System.out.println("Connecting SmartLight to WiFi...");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Connecting SmartLight to Bluetooth...");
    }

    // Overriding turnOn and turnOff methods to avoid ambiguity
    @Override
    public void turnOn() {
        System.out.println("SmartLight is turning on with custom behavior.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLight is turning off with custom behavior.");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        
        // Turn on the light
        light.turnOn();
        
        // Turn off the light
        light.turnOff();
        
        // Connect to WiFi
        light.connectWiFi();
        
        // Connect to Bluetooth
        light.connectBluetooth();
    }
}
