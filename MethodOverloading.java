package Task1;

class Calculator {
	 int add(int a, int b) {
	 return a + b;
	 }
	 double add(double a, double b) {
	 return a + b;
	 }
	 String add(String a, String b) {
	 return a + b;
	 }
	}
	public class MethodOverloading {
	 public static void main(String[] args) {
	 Calculator obj = new Calculator();
	 System.out.println("Addition in Int: " + obj.add(6, 0));
	 System.out.println("Addition in Double: " + obj.add(5.2, 9.1));
	 System.out.println("Addition in String: " + obj.add("Hii", " There"));
	 }
	}