package Lesson7;

public class Employer {

    private String firstName;
    private String lastName;
    private String date;
    private String companyName;
    private double sallary;

    Employer(){
        firstName =  "Unknown";
       lastName = "Unknown";
       date = "00/00/0000";

    }

    public String getName(){
        return this.firstName;
    }

    public void setName(String firstName){
        if (firstName.length()>=3)
        this.firstName = firstName;
        else
            System.out.println("Error Name!");
    }

    public void setBonus(double percent){
        double raiseSallary = this.sallary * percent / 100;
        this.sallary+=raiseSallary;
    }

    public double getBonus(){
        return sallary;
    }

    Employer(String firstName, String lastName, String date, String companyName, double sallary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.companyName = companyName;
        this.sallary = sallary;
    }
    void printer(){
        System.out.println("Employer's name is " + firstName);
        System.out.println("Employer's surname is " + lastName);
        System.out.println("Employer's birthdate is " + date);
        System.out.println("Employer works at " + companyName);
        System.out.println("Employer's sallary is about " + sallary);



    }
    String getinfo(){

        return firstName + " " + lastName + " " + date + " " + companyName + " " + sallary;
    }


}
