/*
programmer: Lloyd Napata
dtae: 09/02/117
A programme to demontrate a constructors in Java
*/
public class Example5b {
	
	public static void main(String[] args) {

		System.out.println("We are making a new PEZ Dispenser");
		PezDispenser5b dispenser5b = new PezDispenser5b("Yoda");
		System.out.printf("The dispenser is %s %n", 
												dispenser5b.getCharacterName()
												);
		String before = dispenser5b.swapHead("Darth Vader");
		System.out.printf("It was %s but Chris switched it to %s %n",
			                  before,
			                  dispenser5b.getCharacterName());
	}

	/*
	NOTES
 j

	*/

}