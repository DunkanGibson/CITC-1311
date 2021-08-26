package Assignment1;


public class Employee {

    private Name name;
    private Address address;
    private String social = "";

    public Employee(Name theName, Address theAddress, String theSocial) {
        this.name = theName;
        this.address = theAddress;
        social = theSocial;
    }

    private Name getName() {
        return name;
    }

    private Address getAddress() {
        return address;
    }

    private String getSocial() {
        return social;
    }

    public void print() {
        name.print();
        address.print();
        System.out.println(social);
    }
}
