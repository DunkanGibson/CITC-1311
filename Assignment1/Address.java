package Assignment1;


public class Address {

    // The purpose of this class is to store a person's address (street, city,
    // state, and zip code) as four individual String instance variables.
    private String street = "";
    private String city = "";
    private String state = "";
    private String zip = "";

    public Address(String theStreet, String theCity, String theState, String theZip) {
        this.street = theStreet;
        this.city = theCity;
        this.city = theState;
        this.zip = theZip;
    }

    private String getStreet() {
        return street;
    }

    private String getCity() {
        return city;
    }

    private String getState() {
        return state;
    }

    private String getZip() {
        return zip;
    }

    public void print() {
        System.out.print(street + ", ");
        System.out.print(city + ", ");
        System.out.print(state);
        System.out.println(zip);
    }

}
