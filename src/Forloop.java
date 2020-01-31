public class Forloop {

    public static void main(String[] args) {


        for (int i = 0; i <= 100; i+=2) {
            if (i!=0) {
                System.out.println(i);
            }
            if (i<=50)
                break;
        }

        for (int i = 0; i <= 100; i+=2) {
            if (i>40 && i<60 || i ==0){
                continue;
            }
            System.out.println(i);
        }
    }
}