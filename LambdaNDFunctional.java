package Task1;


@FunctionalInterface
interface MathOperation {
 int op(int a, int b);
}
public class LambdaNDFunctional {
 public static void main(String[] args) {
 MathOperation add = (a, b) -> a + b;
 MathOperation sub = (a, b) -> a - b;
 MathOperation mul = (a, b) -> a * b;
 System.out.println("Addition: " + add.op(10, 12));
 System.out.println("Substraction: " + sub.op(25, 2));
 System.out.println("Multiplication: " + mul.op(4, 6));
 }
}

