package fundamentals;

public class GCExample {

	protected void finalize() {
		 System.out.println("Object collected!");
		 }
		 public static void main(String[] args) {
		 GCExample obj = new GCExample();
		 obj = null;
		 System.gc();
		 }
		}
