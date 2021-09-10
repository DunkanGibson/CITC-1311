/**
 * BMI
 */
public class BMI {

  //Instance variables for the class to define metrics for calculating BMI
  private String name;
  private int age;
  private double weight;
  private double height;

  //Empty constructor for class
  BMI(){
    this("Jim", 26, 215, 60);
  }

  BMI(String newName, int newAge, double newWeight, double newHeight){
    this.name = newName;
    this.age = newAge;
    this.weight = newWeight;
    this.height = newHeight;
  }
}