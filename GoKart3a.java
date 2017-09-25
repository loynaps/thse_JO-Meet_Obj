/*
1-Let's ensure that all GoKarts created have a color. We'll solve this over a few steps.

First, define a public constructor that expects a String argument named color. (Don't worry about adding any code inside the constructor just yet, we'll do that next. 
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
