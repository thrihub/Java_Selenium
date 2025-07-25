package Task1;

//Abstract class
abstract class Appliance {
 abstract void turnOn();
}

//Interface
interface Connectable {
 void connect();
}

//Class that extends abstract class and implements interface
class SmartTV extends Appliance implements Connectable {
 public void turnOn() {
     System.out.println("SmartTV is turned ON");
 }

 public void connect() {
     System.out.println("SmartTV is connected to WiFi");
 }
}

//Main class
public class AbsIntComp {
 public static void main(String[] args) {
     SmartTV tv = new SmartTV();
     tv.turnOn();
     tv.connect();
 }
}
