/*
programmer: Lloyd Napata
dtae: 09/02/117
A programme to demontrate a constructors in Java
*/
public class Example5 {
	
	public static void main(String[] args) {

		System.out.println("We are making a new PEZ Dispenser");
		PezDispenser5 dispenser5 = new PezDispenser5("Yoda");
		System.out.printf("The dispenser is %s %n", 
												dispenser5.getCharacterName()
												);
		String before = dispenser5.swapHead("Darth Vader");
		System.out.printf("It was %s but Chris switched it to %s %n",
			                  before,
			                  dispenser5.getCharacterName());
	}

	/*
	NOTES
 j

	*/

}