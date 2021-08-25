/**
 * Employee
 */
public class Employee {

    int id;
    static int numOfEmployees = 0;
    int age;
    int serviceTime;
    boolean active;

    Employee () {
        id = 0;
        age = 35;
        active = false;
        numOfEmployees++;
    }

    Employee (int newId, int newAge, int newServiceTime, Boolean newActive) {
        id = newId;
        age = newAge;
        serviceTime = newServiceTime;
        active = newActive;
        numOfEmployees++;
    }

    static int getNumberOfEmployees() {
        return numOfEmployees;
    }

    int getYearsBeforeRetire(){

        return (67 - age);
    }

    boolean getActiveStatus() {
        if(active){
            return true;
        }else{
            return false;
        }
    }

    int yearsTillPartner(){
        return 25 - serviceTime;
    }

}

