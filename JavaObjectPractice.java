public class JavaObjectPractice {
    public static void main(String[] args) {
        
        Student Sam = new Student(1, 55, "1323Anderson", "Sam");
        Student John = new Student(2, 65, "107Anderson", "John");

        System.out.println("Sam's role number is " + Sam.rollNumber + " Sams's phone number is " + Sam.phoneNum + " Sam's address is " + Sam.address);
        System.out.println("John's role number is " + John.rollNumber + " John phone number is " + John.phoneNum + " John address is " + John.address);
        
        

    }
}

class Student {

    //state variables of the student class
    int rollNumber = 0;
    double phoneNum = 0;
    String address = "none";
    String name = "none";

    //Empty constructor in case of no value
    Student() {

    }

    //Constructor to input values when instanitacted with values
    Student(int newRollNumber, double newPhoneNum, String newAddress, String newName){
        this.rollNumber = newRollNumber;
        this.phoneNum = newPhoneNum;
        this.address = newAddress;
        this.name = newName;
    }

    //Method for updating phone number of student
    public void updatePhone(double updatedPhone){
        this.phoneNum = updatedPhone;
    }
    //Method for updating addresses for students
    public void updateAddress(String updatedAddress){
        this.address = updatedAddress;
    }



}


