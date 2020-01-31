package Inheritance;

public class Employee {

    private String firstName;
    private String lastName;
    private int ID;

    Employee(){

    }
    Employee(String firstName, String lastName, int ID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void getInfo(){
        System.out.println(firstName + " " + lastName + " " + ID);
    }
}
