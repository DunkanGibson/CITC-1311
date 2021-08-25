/**
 * Employee
 */
public class Employee {

    private int id;
    static int numOfEmployees = 0;
    private int age  = 35;
    private int serviceTime;
    private boolean active;

    Employee () {
        numOfEmployees++;
    }

    public Employee (int newId, int newAge, int newServiceTime, Boolean newActive) {
        this.id = newId;
        this.age = newAge;
        this.serviceTime = newServiceTime;
        this.active = newActive;
        numOfEmployees++;
    }

    public static int getNumberOfEmployees() {
        return numOfEmployees;
    }

    public int getYearsBeforeRetire(){
        return (67 - age);
    }

    public String getActiveStatus() {
      return active ? "Active" : "Not active";
        
    }

    public int yearsTillPartner(){
        return 25 - serviceTime;
    }

    public int getIdNumber() {
        return id;
    }

}

