/*
programmer: Lloyd Napata
dtae: 09/02/117
A programme to demontrate a constructors in Java
*/
public class Example4b {
	
	public static void main(String[] args) {

		System.out.println("We are making a new PEZ Dispenser");
		PezDispenser4b dispenser4b = new PezDispenser4b("Megatron");
		System.out.printf("The dispenser is %s %n", 
												dispenser4b.getCharacterName()
												);
	}

	/*
	NOTES
 
   2-Using a method. Each class definition can contain various methods/functions that can be used on each instance of the class. The PezDispenser4 class has one called getCharacterName(). 
    This returns the charactername of the PezDispenser4 instance. In my example, it would return the string, "Megatron". So, calling the method on the instance (again, using my example) looks:dispenser4.getCharacterName();



    3That returns a string which we want to print to the screen using the console malarkey, System.out.printf. That printf is a method which takes (among other things) a string as a parameter. It prints that string to the screen. Our dispenser4.getCharacterName() code returns a string. So, putting that all together you get:-System.out.printf("The dispenser is %s %n", dispenser4.getCharacterName());


	*/

}