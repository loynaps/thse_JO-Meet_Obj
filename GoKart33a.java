/*
//3-Finally, since the color is being set in the constructor now, remove the initialization from the field definition...

*/

class GoKart33a {
  private String color;

  //defining a public constructor
  public GoKart33a(String color) {
    this.color = color;
  }

  //a getter method that exposes the color field.
  public String getColor() {
    return color;
  }
	/*
		the third question asked you to remove the initialization from the field definition so you just have to remove the "red" parameter from String color = "red";

This is because when you will create an object which type is GoKart33a you will already pass a color parameter so there is no point to declare it in object
*/
}
