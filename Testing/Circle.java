package Testing;
/**
 * CircleTest
 */
public class Circle {

    //This is a member variable that means that any circle created with this is going to have its very own copy of an unique radius in it.
   private double radius;

   public Circle(){
       radius = 0;
   }

//This is a contructor that takes in a radius and assings it to THIS specific radius.
   public Circle(double newRadius){
       this.radius = newRadius;
   }
//Method inside a class object to do something, in this case calcualte area
   double getArea () {
       return Math.PI * radius * radius;
   }
//Method inside a class object to do something, in this case calcualte perimeter
   double getPerimeter (){
      return 2 * Math.PI *radius;
   }

    void setRadius (double newRadius){
      this.radius = newRadius;
   
   }

}