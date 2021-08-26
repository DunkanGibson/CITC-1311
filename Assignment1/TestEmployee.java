package Assignment1;

public class TestEmployee {

    public static void main(String[] args) {
        
        Name person = new Name("John", "H.", "Doe");
        Address addressOfPerson = new Address("123 Sunset Boulevard", "Beverly Hills", "CA", "99999");
        

        Employee johndoe = new Employee(person, addressOfPerson, "123-45-6789");

        johndoe.print();
    }
}