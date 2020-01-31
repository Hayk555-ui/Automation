package Lesson7;

public class Mainmodifier {

    public static void main(String[] args) {

        Employer user = new Employer();
//        System.out.println(user.getName());
        user.setName("Albert");
        System.out.println(user.getName());
    }
}
