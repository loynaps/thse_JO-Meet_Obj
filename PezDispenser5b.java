class PezDispenser5b {
	final private String characterName;

	public PezDispenser5b(String characterName) {
		this.characterName = characterName;
	}

	public String getCharacterName() {
		//include validation, logic, logging or whatever you like here
		return characterName;
	}

	public String swapHead(String characterName) {
		String originalCharactername = this.characterName;
		this.characterName = characterName;
		return originalCharactername;
	}

	/*NOTES

1-A constructor must have the same name as the class. In this case the class name is PezDispenser4b (look at the very first line of code on the example you provided) so the name of the constructor should be PezDispenser4b.

2-The constructor should be public. So the constructor should look like this

3-A constructor does what its name suggests! A constructor is always named the same as the class so, whilst we type the word PezDispenser4 twice, it is for very different reasons. One creates the room to put the object, the other makes the object.
	*/
}

