package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {


//        int decimal = 2000000000;
//        int reminder;
//        String binary = " ";
//
//        do  {
//            reminder = decimal%2;
//            decimal = decimal/2;
//            binary = binary + reminder;
//        } while (decimal > 0);
//        System.out.println(binary);
//
//        int [] array = {5, 1457, 759, 25, 99658, -1, 0, 700, 47569};
//        System.out.println("Unsorted array ");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//        BubbleSort foo = new BubbleSort();
//        foo.bubbleSort(array);

        Random random = new Random();
        int number = 0;
        for (int i = 0; i < 3; i++) {
                number = random.nextInt(56);
            if (number>20 && number<55) {
                System.out.println(number);
            }

        }

        Random random1 = new Random();
        String [] main = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};

        String temp = "";
//        System.out.println(random1.nextInt(10));
        for (int i = 0; i < main.length; i++) {
            temp = temp + main[i];
            System.out.print(random1.nextInt(20) + " " );
        }

    }

}

