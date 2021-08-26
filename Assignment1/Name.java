package Assignment1;


public class Name {


    // The purpose of this is to store a person's full name (first, middle, and last) as three individual String instance variables.
    private String first = "";
    private String middle = "";
    private String last = "";

    public Name(String theFirst, String theMiddle, String theLast) {
        this.first = theFirst;
        this.middle = theMiddle;  
        this.last = theLast;
    }

    private String getFirst() {
        return first;
    }

    private String getMiddle() {
        return middle;
    }

    private String getLast() {
        return last;
    }

    public void print() {
        System.out.print(first + " ");
        System.out.print(middle + " ");
        System.out.println(last);
    }

}
