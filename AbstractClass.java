abstract class PaymentMethod {
    abstract void pay();  // abstract method

    void displayPaymentType() {  // non-abstract method
        System.out.println("Processing payment...");
    }
}

class CreditCard extends PaymentMethod {
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI extends PaymentMethod {
    void pay() {
        System.out.println("Paid using UPI");
    }
}

class Cash extends PaymentMethod {
    void pay() {
        System.out.println("Paid using Cash");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        PaymentMethod method1 = new CreditCard();
        method1.displayPaymentType();
        method1.pay();

        PaymentMethod method2 = new UPI();
        method2.displayPaymentType();
        method2.pay();

        PaymentMethod method3 = new Cash();
        method3.displayPaymentType();
        method3.pay();
    }
}
