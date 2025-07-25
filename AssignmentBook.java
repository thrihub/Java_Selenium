package Task1;

class Book{
	
//	Fields: title, author, price
	
	 String title;
	 String author;
	 double price;
	 
//	 Method: displayDetails()
			 
	 void displayDetails() {
	 System.out.println("Title: " + title);
	 System.out.println("Author: " + author);
	 System.out.println("Price:₹"+price+"/-");
	 }
	}
	public class AssignmentBook {
	public static void main(String[] args) {
		
//In main(), create 2 book objects and print their details.
		
	  Book obj1= new Book();
	  obj1.title = "Olive Words";
	  obj1.author = "Gowda Veda";
	  obj1.price = 280.0;
	  Book obj2  = new Book();
	  obj2.title = "OOps concepts";
	  obj2.author = "Manoj Verma";
	  obj2.price = 370.0;
	  obj1.displayDetails();
	  obj2.displayDetails();
	 }
  }