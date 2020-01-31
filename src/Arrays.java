public class Arrays {
    public static void main(String[] args) {
//
        int [] array = {1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
//
//        String [] array1 = new String[10];
//        for (int i = 0; i < array1.length; i++) {
//            if (i == 0){
//                array1[i] = "?";
//            }
//            else if (i % 2 == 0){
//                array1[i] = "z";
//            }
//            else {
//                array1[i] = "k";
//
//            }
//            System.out.println("Array [" + i + "] " + array1[i]);
//        }
        for (int hour = 0; hour <= 12; hour++) {

         for (int minute = 0; minute <= 59; minute++) {
             if ( minute>25){
                 break;
             }
            for (int second = 0; second <= 60; second++) {

                System.out.println(hour + ":" + minute + ":" +second);
            }
        }
    }
    }

}
