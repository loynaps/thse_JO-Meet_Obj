/*
//2-Now in the body of your constructor, set the private field color to the value of the color argument passed into the cons
*/

class GoKart32a {
  private String color = "red";

  //defining a public constructor
  public GoKart32a(String color) {
    this.color = color;
  }

  //a getter method that exposes the color field.
  public String getColor() {
    return color;
  }
	/*
		1.When you have a field variable and a parameter that share the same name you have to prepend the field variable with the this keyword in order help java distinguish between the two variables.

		2.The task is asking you to set the "color" value to whatever is passed into the constructor. To do that, you'll put this.color = color; inside of the constructor.

    3.It's important to note that when accessing private fields in a class, you refer to them using this.<fieldname>.
*/
}
