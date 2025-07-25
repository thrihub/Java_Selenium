package Task1;

//Base class
class Vehicle {
 String brand;
 int speed;

 Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 void showDetails() {
     System.out.println("Brand:" + brand+"  ,Speed:" + speed + " kmph");
 }
}

//Derived class - Car
class Car extends Vehicle {
 Car(String brand, int speed) {
     super(brand, speed);
 }

 @Override
 void showDetails() {
     System.out.println("Car Details:");
     super.showDetails();
 }
}

//Derived class - Bike
class Bike extends Vehicle {
 Bike(String brand, int speed) {
     super(brand, speed);
 }

 @Override
 void showDetails() {
     System.out.println("Bike Details:");
     super.showDetails();
 }
}

//Main class
public class Inheritance {
 public static void main(String[] args) {
     Car car = new Car("TATA", 100);
     Bike bike = new Bike("Hero Honda", 80);

     car.showDetails();
     System.out.println();
     bike.showDetails();
 }
}
