package Inheritance;

public class HR extends Employee {

   private double sallary;

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }
    public void showSallary(){
        System.out.println("HR's sallary is " + sallary);
    }
}
