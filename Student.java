
public class Student { // Sets the class of the script
	String name; // Sets up a string variable for the name
	int age; // Sets up an integer variable for the age
	
	public Student(String n) { // Sets up a constructor that requires a string input to work
		this.name = n; // Sets the variable name to the string input
	}
	
	public String NameChange(String n) { // Sets up a function that will return a string output but requires a string input
		name = n; // Sets the variable name to the string input
		return name; // Outputs the variable name as a string back to0 the variable that called the function
	}
	
	public String toString() { // Overrides the toString() function that is from the class Object
		return name; // This just returns the name. Before the code would break as it would give the class name, an @ symbol and then a hex value.
	}
	
}
