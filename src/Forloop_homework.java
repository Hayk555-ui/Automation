public class Forloop_homework {

    public static void main(String[] args) {

        //First task

        for (int i = 0; i <= 100; i++) {
            if (i%2 == 0 || i%3 == 0 || i%5 == 0){
                continue;
            }
            System.out.println(i);
        }

        //Second task

        for (int i = 0; i <=100 ; i++) {
            if (i>=15 && i<=25 || i>=45 && i<=55 || i>=75 && i<=85){
               continue;
            }
            System.out.println(i);
        }

        //Task related to binary numbers


        int n;
        int reminder;
        String binary = " ";
        for (int i = 0; i <= 999; i++) {
            if (i != 0) {
                reminder = i % 2;
                n = i / 2;
                binary = binary + reminder;

            }

            System.out.println(i + binary);
        }

    }
}


