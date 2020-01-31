package Inheritance;

public class Main {

    public static void main(String[] args) {

        Employee obj = new Employee("Emilia", "Amiryan", 3514354);
        obj.getInfo();

        System.out.println();

        HR hr = new HR();
        hr.setFirstName("Aka");
        System.out.println(hr.getFirstName());
        hr.setLastName("Chikalidze");
        System.out.println(hr.getLastName());
        hr.setID(6542);
        System.out.println(hr.getID());
        hr.setSallary(154876);
        System.out.println(hr.getSallary());

        System.out.println();

        QAEngineers QA = new QAEngineers();
        QA.setFirstName("Bloj");
        System.out.println(QA.getFirstName());
        QA.setLastName("Blojyan");
        System.out.println(QA.getLastName());
        QA.setID(514614);
        System.out.println(QA.getID());
        QA.position = "Junior";
        QA.getInfo();

    }
}
