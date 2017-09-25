/*
programmer: Lloyd Napata
dtae: 09/02/117
A programme to demontrate a constructors in Java
*/
public class Example4 {
	
	public static void main(String[] args) {

		System.out.println("We are making a new PEZ Dispenser");
		PezDispenser4 dispenser4 = new PezDispenser4("Megatron");
		System.out.printf("The dispenser is %s %n", 
												dispenser4.getCharacterName()
												);
	}

	/*
	NOTES

    1-we write PezDispenser4 dispenser4 because we are creating an instance of the PezDispenser4 class. 
    The first part of the line, before the equals sign, allocates enough space in memory to hold a PezDispenser4; it makes a PezDispenser4-sized hole ready to be filled with an actual PezDispenser4. 
    To the right of the equals signed actually creates the PezDispenser4 itself. 
    The equals sign puts that PezDispenser4 in the PezDispenser4-sized hole. This is the two-step process called declaration and initialization. 
    You declare a type of object then initialize it with an actual object. There are other names for this process that you'll come across. 
    The second PezDispenser4 word is called a constructor. 
    A constructor does what its name suggests! A constructor is always named the same as the class so, whilst we type the word PezDispenser4 twice, it is for very different reasons. One creates the room to put the object, the other makes the object.

    2-Using a method. Each class definition can contain various methods/functions that can be used on each instance of the class. The PezDispenser4 class has one called getCharacterName(). 
    This returns the charactername of the PezDispenser4 instance. In my example, it would return the string, "Megatron". So, calling the method on the instance (again, using my example) looks:dispenser4.getCharacterName();



    3That returns a string which we want to print to the screen using the console malarkey, System.out.printf. That printf is a method which takes (among other things) a string as a parameter. It prints that string to the screen. Our dispenser4.getCharacterName() code returns a string. So, putting that all together you get:-System.out.printf("The dispenser is %s %n", dispenser4.getCharacterName());


	*/

}