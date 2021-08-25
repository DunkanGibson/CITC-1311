package Testing;
public class Person {
    
    private boolean enoughSleep = false;
    private int age = 18;
    private String job = "none";
    private String gender = "N/A";
    public static int numberOfPeople = 0;

    public Person() {
        numberOfPeople++;
    }

    public Person(boolean newEnoughSleep, int newAge, String newJob, String newGender){
        this.age = newAge;
        this.enoughSleep = newEnoughSleep;
        this.job = newJob;
        this.gender = newGender;
    }

    
}
