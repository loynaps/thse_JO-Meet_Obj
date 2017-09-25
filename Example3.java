/*
programmer: Lloyd Napata
dtae: 09/02/117
A programme to demontrate a methods in Java
*/
public class Example3 {
	
	public static void main(String[] args) {
		//code goes here
		System.out.println("We are making a new PEZ Dispenser");
		PezDispenser3 dispenser = new PezDispenser3();
		System.out.printf("The dispenser is %s %n", 
												dispenser.getCharacterName()
												);
	}


/*
NOTES
The reason for using getters and setters instead of making your members public is that it makes it possible to change the implementation without changing the interface. Also, many tools and toolkits that use reflection to examine objects only accept objects that have getters and setters. JavaBeans for example must have getters and setters as well as some other requirements.
*/


}