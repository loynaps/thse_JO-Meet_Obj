/*
//2-Now in the body of your constructor, set the private field color to the value of the color argument passed into the cons
*/

class GoKart3a {
  private String color = "red";

  //defining a public constructor
  public GoKart3a(String color) {

  }

  //a getter method that exposes the color field.
  public String getColor() {
    return color;
  }
	/*
		1.A constructor must have the same name as the class. In this case the class name is GoKart3a

		2.The constructor should be public

		3.The argument goes inside parenthesis next to GoKart3a. Start be defining what type of data will be in the argument, in this case it will be a String (with a capital 'S') and the argument will be named 'color'. 
*/
}
