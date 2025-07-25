package Task1;
class Animal {
	 void sound() {
	       System.out.println("Animal sound like");
	 }
	}
	class Dog extends Animal {
	 void sound() {
	       System.out.println("Dog sound like bark");
	 }
	}
	class Cat extends Animal {
	 void sound() {
	       System.out.println("Cat sound like meow");
	 }
	}
	public class MethodOverriding {
	 public static void main(String[] args) {
	 Animal a1 = new Dog();
	 Animal a2 = new Cat();
	 a1.sound();
	 a2.sound();
	 }
	}
	