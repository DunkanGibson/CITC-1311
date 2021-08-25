public class EmployeeTest {
    public static void main(String[] args) {
    
        Employee Ted = new Employee(1, 32, 3, true);
        Employee Jeff = new Employee(2, 22, 1, true);
        Employee Bill = new Employee(5, 56, 22, true);
        Employee Josh = new Employee(66, 19, 0, true);
    
        System.out.println( Employee.getNumberOfEmployees());
    
        System.out.println(Bill.getActiveStatus());
    
        System.out.println(Josh.yearsTillPartner());
    
    
    }
}
