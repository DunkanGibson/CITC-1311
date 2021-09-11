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

  public BMI(String newName, int newAge, double newWeight, double newHeight){
    this.name = newName;
    this.age = newAge;
    this.weight = newWeight;
    this.height = newHeight;
  }
  public BMI(String newName, double newWeight, double newHeight){
    this.name = newName;
    this.age = 20;
    this.weight = newWeight;
    this.height = newHeight;
  }

  public String getName() {
    return name;
  }

  public void setName(String newName){
    this.name = newName;
  }

  public double getAge() {
    return age;
  }

  public void setAge(int newAge){
    this.age = newAge;
  }
  public double getHeight() {
    return height;
  }

  public void setHeight(double newHeight){
    this.height = newHeight;
  }
  public double getWeight() {
    return weight;
  }

  public void setWeight(double newWeight){
    this.height = newWeight;
  }

  public double getBMI(){
    return
  }

  public String getStatus() {
    return
  }

}