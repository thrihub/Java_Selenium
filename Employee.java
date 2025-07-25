package Task1;

class EmployeeCount {
	
//static variable count to track number of employees created
	
    static int count = 0;
    String name;

//Each time a new Employee is instantiated, increase the count.
    
    EmployeeCount(String name) {
        this.name = name;
        count++;
    }
   

    static void Count() {
        System.out.println("Total Employee count: " + count);
    }
 void name() {
	 System.out.println("Name of the Employee: " + name);
    	
    }
}
//Create a class Employee  

public class Employee {
    public static void main(String[] args) {
        EmployeeCount obj1= new EmployeeCount("Manga");
        EmployeeCount obj2 = new EmployeeCount("Ganga Narayan");
        
//Print the total number of employees at the end.

        EmployeeCount.Count(); 
        obj1.name();
        obj2.name();
    }
}
