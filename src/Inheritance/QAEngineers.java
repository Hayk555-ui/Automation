package Inheritance;

public class QAEngineers extends Employee {

    public String position;

    QAEngineers(){

    }

    @Override
    public void getInfo() {
        System.out.println(position + " " + getFirstName() + " " + getID());
    }
}
