/*
1-Let's ensure that all GoKarts created have a color. We'll solve this over a few steps.

First, define a public constructor that expects a String argument named color. (Don't worry about adding any code inside the constructor just yet, we'll do that next. 
*/

class GoKart {
  private String color = "red";

  //a getter method that exposes the color field.
  public String getColor() {
    return color;
  }

}
